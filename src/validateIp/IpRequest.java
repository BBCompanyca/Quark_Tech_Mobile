package validateIp;

import OtherClass.BD_Connection;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class IpRequest implements Runnable {

    BD_Connection connection = new BD_Connection();
    private ArrayList<Ip> ipList = new ArrayList<>();

    @Override
    public void run() {

        requestSerial();

    }

    private void requestSerial() {
        try {

            Connection cn = connection.connection();
            PreparedStatement pst = cn.prepareStatement("select ip, status from ip");

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Ip ip = new Ip(rs.getString(1), rs.getString(2));
                ipList.add(ip);
            }

            validateSerial();

            cn.close();

        } catch (SQLException e) {

            System.err.println("Error en consultar lista de seriales! " + e);

        } catch (UnknownHostException ex) {
            Logger.getLogger(IpRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String getLocalIp() throws UnknownHostException {

        String localIpAddress = null;
        localIpAddress = InetAddress.getLocalHost().getHostAddress();
        return localIpAddress;

    }

    public void validateSerial() throws UnknownHostException {

        for (int i = 0; i < ipList.size(); i++) {
           
            if (ipList.get(i).getIp().equals(getLocalIp()) && ipList.get(i).getStatus().equals("Activa")) {
                return;
            }
            
        }

        JOptionPane.showMessageDialog(null, "¡Este ordenador no tiene acceso al sistema!", "¡Acceso Denegado!",
                JOptionPane.ERROR_MESSAGE);
        System.exit(0);

    }
}
