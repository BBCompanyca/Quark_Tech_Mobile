package clases;

import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static view.Dashboard.jLabel_NumberNotification;
import view.Login;


public class Consult_Notifications implements Runnable{
    
    public static int indexNotification = 0;
    
    @Override
    public void run() {

        while (true) {

            getNotifications();

            try {

                sleep(10000);

            } catch (InterruptedException e) {

                System.out.println("¡Error en hilo para la consulta! " + e);

            }

        }

    }
    
    
    public void getNotifications() {

        try {

            Connection cn = BD_Connection.connection();
            PreparedStatement pst = cn.prepareStatement(
                    "select id_notification from notifications where id_userReceived = '" + Login.ID_User + "' "
                    + "and status = '" + "unread" + "'");

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                indexNotification++;

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
