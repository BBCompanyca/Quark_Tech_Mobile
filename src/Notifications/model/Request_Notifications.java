package Notifications.model;

import clases.BD_Connection;
import java.awt.List;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import view.Login;

public class Request_Notifications implements Runnable {

    int index_notification = 0;

    public static ArrayList<Notification> ejemploLista = new ArrayList<>();

    @Override
    public void run() {

        while (true) {

            Consult_Notifications();

            try {

                sleep(30000);

            } catch (Exception e) {

                System.err.println("¡Error en el Sleep del Request_Notifications! " + e);

            }

        }

    }

    private void Consult_Notifications() {

        try {

            Connection cn = BD_Connection.connection();
            PreparedStatement pst = cn.prepareStatement(
                    "select n.id_notification, us.username, n.notification, e.brand, e.model, e.color, "
                    + "w.serial, w.falla, n.status "
                    + "from notifications n "
                    + "join user us on us.id_user = n.id_userSent "
                    + "join equipo e on e.id_equipo = n.id_equipo "
                    + "join warranty w on w.id_warranty = n.id_warranty "
                    + "and n.id_userReceived = '" + Login.ID_User + "' ORDER BY n.id_notification DESC LIMIT 10");

            ResultSet rs = pst.executeQuery();

            if (!ejemploLista.isEmpty()) {

                ejemploLista.clear();

            }

            while (rs.next()) {

                Notification notification = new Notification(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));

                ejemploLista.add(notification);

            }

            cn.close();

        } catch (SQLException e) {

            System.err.println("¡Error al consultar notificaciones! " + e);

        }

    }

}
