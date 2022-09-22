package Notifications.model;

import clases.BD_Connection;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static view.Dashboard.jLabel_NumberNotification;
import view.Login;

public class Consult_Notifications implements Runnable {

    public static int indexNotification = 0;

    @Override
    public void run() {

        //Se ejecuta n veces mintras la app esté abierta...
        while (true) {

            getIndexNotification();

            try {

                //Tiempo de espera para volver a consultar (30s)...
                sleep(30000);

            } catch (InterruptedException e) {

                System.out.println("¡Error en hilo para la consulta! " + e);

            }

        }

    }

    //Obtiene el numero de notificaciones no leídas...
    public void getIndexNotification() {

        try {

            Connection cn = BD_Connection.connection();
            PreparedStatement pst = cn.prepareStatement(
                    "select status from notifications where id_userReceived = '" + Login.ID_User + "' "
                    + "ORDER BY id_notification DESC LIMIT 10");

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                
                if (rs.getString(1).equals("unread")) {
                    
                    indexNotification++;
                    
                }

            }


            if (indexNotification != 0) {

                jLabel_NumberNotification.setText(String.valueOf(indexNotification));

                indexNotification = 0;

            } else {

                jLabel_NumberNotification.setText("");
                indexNotification = 0;

            }

            cn.close();

        } catch (SQLException e) {

            System.err.println("¡Error al consultar el indice de solicitudes! " + e);
            JOptionPane.showMessageDialog(null, "¡Error al consultar el indice de solicitudes!", "¡Error!",
                    JOptionPane.OK_OPTION);

        }

    }

}
