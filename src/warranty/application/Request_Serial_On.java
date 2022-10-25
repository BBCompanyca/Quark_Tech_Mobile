package warranty.application;

import clases.BD_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Request_Serial_On implements Runnable {

    BD_Connection connection = new BD_Connection();

    @Override
    public void run() {

        getSerialList();

    }

    protected static ArrayList<String> serial_List = new ArrayList<>();

    private void getSerialList() {

        try {

            Connection cn = connection.connection();
            PreparedStatement pst = cn.prepareStatement("select serial from warranty where not status = '" + "Entregado" + "'");

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                serial_List.add(rs.getString(1));

            }

            cn.close();

        } catch (SQLException e) {

            System.out.println("¡Error al consultar la lista de seriales! " + e);

        }

    }

    public boolean validateSerial(String serial) {

        boolean isAvailable = true;

        for (int i = 0; i < serial_List.size(); i++) {
            
            if (serial_List.get(i).equalsIgnoreCase(serial)) {
                
                isAvailable = false;
                break;
                
            }
            
        }

        return isAvailable;
    }

}
