package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import view.Login;
import static view.Clients.jTextField_Search_Client;
import static view.Clients.jTable_Client;
import static view.Clients.jScrollPane;

public class Search {

    DefaultTableModel model = new DefaultTableModel();

    public void SearchClient(String search) {

        String query = "";

        if (search.equals("")) {

            query = "select c.id_client, c.name_client, c.telephone_client, c.identity_card_client, c.direction_client, "
                    + "u.name_user from client c join user u on c.registered_by = u.id_user";

        } else {

            query = "select c.id_client, c.name_client, c.telephone_client, c.identity_card_client, c.direction_client, u.name_user from client c join user u "
                    + "on c.id_client = '" + search + "' and c.registered_by = u.id_user or "
                    + "c.name_client = '" + search + "' and c.registered_by = u.id_user or "
                    + "c.unformat_telephone_client = '" + search + "' and c.registered_by = u.id_user or "
                    + "c.unformat_identity_card_client = '" + search + "' and c.registered_by = u.id_user or "
                    + "c.direction_client = '" + search + "' and c.registered_by = u.id_user or "
                    + "u.username = '" + search + "' and c.registered_by = u.id_user";

        }

        try {

            Connection cn = BD_Connection.connection();
            PreparedStatement pst = cn.prepareStatement(query);

            ResultSet rs = pst.executeQuery();

            jTable_Client = new JTable(model);
            jScrollPane.setViewportView(jTable_Client);

            model.setColumnCount(0);
            model.setRowCount(0);

            model.addColumn("ID");
            model.addColumn("Nombre");
            model.addColumn("Teléfono");
            model.addColumn("Cédula");
            model.addColumn("Dirección");
            model.addColumn("Registrado Por");

            while (rs.next()) {

                Object[] fila = new Object[6];
                for (int i = 0; i < 6; i++) {

                    fila[i] = rs.getObject(i + 1);

                }

                model.addRow(fila);

            }

            cn.close();

        } catch (SQLException e) {

            System.err.println("¡Error al consultar la lista de clientes! " + e);
            JOptionPane.showMessageDialog(null, "¡Error al consultar la lista de clientes!", "¡Error!",
                    JOptionPane.OK_OPTION);

        }

    }

}
