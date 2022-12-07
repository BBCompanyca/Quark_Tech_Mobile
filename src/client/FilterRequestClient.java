package client;

import OtherClass.BD_Connection;
import static client.ViewClients.jScrollPane_C;
import static client.ViewClients.jTable_Client;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class FilterRequestClient {
    
    BD_Connection connection = new BD_Connection();
    
    public void filterRequestClient(String search) {

        String query;

        if (search.equals("")) {

            query = "select c.id_client, c.name_client, c.telephone_client, c.identity_card_client, c.direction_client, "
                    + "u.name_user from client c join user u on c.registered_by = u.id_user";

        } else {

            query = "select c.id_client, c.name_client, c.telephone_client, c.identity_card_client, c.direction_client, u.name_user "
                    + "from client c join user u "
                    + "on c.id_client = '" + search + "' and c.registered_by = u.id_user or "
                    + "c.name_client = '" + search + "' and c.registered_by = u.id_user or "
                    + "c.unformat_telephone_client = '" + search + "' and c.registered_by = u.id_user or "
                    + "c.unformat_identity_card_client = '" + search + "' and c.registered_by = u.id_user or "
                    + "c.direction_client = '" + search + "' and c.registered_by = u.id_user or "
                    + "u.username = '" + search + "' and c.registered_by = u.id_user";

        }

        try {

            Connection cn = connection.connection();
            PreparedStatement pst = cn.prepareStatement(query);

            ResultSet rs = pst.executeQuery();

            jTable_Client = new JTable(ViewClients.getInstanceClient());
            jScrollPane_C.setViewportView(jTable_Client);

            ViewClients.getInstanceClient().setColumnCount(0);
            ViewClients.getInstanceClient().setRowCount(0);

            ViewClients.getInstanceClient().addColumn("ID");
            ViewClients.getInstanceClient().addColumn("Nombre");
            ViewClients.getInstanceClient().addColumn("Teléfono");
            ViewClients.getInstanceClient().addColumn("Cédula");
            ViewClients.getInstanceClient().addColumn("Dirección");
            ViewClients.getInstanceClient().addColumn("Registrado Por");

            while (rs.next()) {

                Object[] fila = new Object[6];
                for (int i = 0; i < 6; i++) {

                    fila[i] = rs.getObject(i + 1);

                }

                ViewClients.getInstanceClient().addRow(fila);

            }

            cn.close();

        } catch (SQLException e) {

            System.err.println("¡Error al consultar la lista de clientes! " + e);
            JOptionPane.showMessageDialog(null, "¡Error al consultar la lista de clientes!", "¡Error!",
                    JOptionPane.OK_OPTION);

        }

    }
    
}
