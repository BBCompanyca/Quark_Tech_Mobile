package notifications;

import clases.BD_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static view.Dashboard.jLabel_NumberNotification;
import login.Login;

public class Request_Notifications implements Runnable {

    int numberNotification = 0;

    public static ArrayList<Notification> noficationList = new ArrayList<>();
    
    BD_Connection connection = new BD_Connection();

    @Override
    public void run() {

        while (true) {

            Consult_Notifications();

        }

    }

    private void Consult_Notifications() {

        try {

            Connection cn = connection.connection();
            PreparedStatement pst = cn.prepareStatement(
                    "select n.id_notification, us.username, n.notification, e.brand, e.model, e.color, "
                    + "w.serial, w.falla, n.status "
                    + "from notifications n "
                    + "join user us on us.id_user = n.id_userSent "
                    + "join equipo e on e.id_equipo = n.id_equipo "
                    + "join warranty w on w.id_warranty = n.id_warranty "
                    + "and n.id_userReceived = '" + Login.ID_User + "' ORDER BY n.id_notification DESC LIMIT 20");

            ResultSet rs = pst.executeQuery();

            if (!noficationList.isEmpty()) {

                noficationList.clear();

            }

            while (rs.next()) {

                if (rs.getString("n.status").equals("unread")) {

                    numberNotification++;

                }

                Notification notification = new Notification(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));

                noficationList.add(notification);

            }

            if (ValidateRequest(numberNotification)) {

                jLabel_NumberNotification.setText(String.valueOf(numberNotification));

                numberNotification = 0;

            } else {

                if (numberNotification == 0) {

                    jLabel_NumberNotification.setText("");

                }

            }

            cn.close();

        } catch (SQLException e) {

            System.err.println("¡Error al consultar notificaciones! " + e);

        }

    }

    public boolean ValidateRequest(int numberNotification) {

        boolean flag = false;
        int aux = 0;

        if (aux != numberNotification) {

            aux = numberNotification;

            flag = true;
        }

        return flag;

    }

}
