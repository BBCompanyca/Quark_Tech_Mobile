package validateIp;

import OtherClass.BD_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ComputerRequest implements Runnable {

    BD_Connection connection = new BD_Connection();
    private ArrayList<Computer> computerList = new ArrayList<>();

    @Override
    public void run() {
        requestNameComputer();
    }

    private void requestNameComputer() {

        try {

            Connection cn = connection.connection();
            PreparedStatement pst = cn.prepareStatement("select computer, status from computer");

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Computer computer = new Computer(rs.getString(1), rs.getString(2));
                computerList.add(computer);
            }

            validateComputerName();

            cn.close();

        } catch (SQLException e) {
            System.err.println("Error en consultar lista de nombre de las computadoras! " + e);
        }

    }

    private String getNameComputer() {
        String nameComputer = System.getProperty("user.name");
        return nameComputer;
    }

    private void validateComputerName() {

        for (int i = 0; i < computerList.size(); i++) {
            if (computerList.get(i).getComputer().equals(getNameComputer()) && computerList.get(i).getStatus().equals("Activa")) {
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "¡Este ordenador no tiene acceso al sistema!", "¡Acceso Denegado!",
                JOptionPane.ERROR_MESSAGE);
        System.exit(0);

    }
}
