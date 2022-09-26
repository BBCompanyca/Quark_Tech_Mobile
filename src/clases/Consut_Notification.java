package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import login.Login;
import static view.Menu_Tecnico.jLabel_Index;

public class Consut_Notification extends Thread {

    public static int indexSolicitudes = 0;

    @Override
    public void run() {

        while (true) {

            getSolicitudes();

            try {

                sleep(10000);

            } catch (InterruptedException e) {

                System.out.println("¡Error en hilo para la consulta! " + e);

            }

        }

    }

    public void getSolicitudes() {

        try {

            Connection cn = BD_Connection.connection();
            PreparedStatement pst = cn.prepareStatement(
                    "select id_warranty from warranty where id_technical = '" + Login.ID_User + "' "
                    + "and status = '" + "Solicitud Enviada - En Espera" + "'");

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                indexSolicitudes++;

            }

            if (indexSolicitudes != 0) {

                jLabel_Index.setText(String.valueOf(indexSolicitudes));

                indexSolicitudes = 0;

            } else {

                jLabel_Index.setText("");
                indexSolicitudes = 0;

            }

            cn.close();

        } catch (SQLException e) {

            System.err.println("¡Error al consultar el indice de solicitudes! " + e);
            JOptionPane.showMessageDialog(null, "¡Error al consultar el indice de solicitudes!", "¡Error!",
                    JOptionPane.OK_OPTION);

        }

    }
    
    

}
