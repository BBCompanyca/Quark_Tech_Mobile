package request.application;

import OtherClass.BD_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import login.Login;
import request.domain.Request;
import static menu.Menu_Tecnico.jLabel_Index;

public class Request_Solicitudes extends Thread {

    static BD_Connection connection = new BD_Connection();
    public static ArrayList<Request> requestList = new ArrayList<>();

    @Override
    public void run() {

        while (true) {

            getSolicitudes();

            try {

                sleep(30000);

            } catch (InterruptedException e) {

                System.out.println("¡Error en hilo para la consulta! " + e);

            }

        }

    }

    private void getSolicitudes() {

        int indexSolicitudes = 0;

        try {

            Connection cn = connection.connection();
            PreparedStatement pst = cn.prepareStatement(
                    "select w.id_warranty, w.id_equipo, w.id_registered_by, e.brand, e.model, e.color, w.serial, "
                    + "w.falla, w.received "
                    + "from warranty w "
                    + "join equipo e on e.id_equipo = w.id_equipo "
                    + "and id_technical = '" + Login.ID_User + "' "
                    + "and status = '" + "Solicitud Enviada - En Espera" + "' order by w.id_warranty desc");

            ResultSet rs = pst.executeQuery();

            requestList.clear();

            while (rs.next()) {

                Request solicitudes = new Request(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));

                requestList.add(solicitudes);

                indexSolicitudes++;

            }

            if (indexSolicitudes != 0) {

                jLabel_Index.setText(String.valueOf(indexSolicitudes));

            } else {

                jLabel_Index.setText("");

            }

            cn.close();

        } catch (SQLException e) {

            System.err.println("¡Error al consultar la información de la garantía! " + e);

        }
    }

}
