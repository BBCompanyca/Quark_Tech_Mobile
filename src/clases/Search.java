package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static view.Clients.jTable_Client;
import static view.Clients.jScrollPane;
import static view.Warranty.jTable_Warranty;
import static view.Warranty.jScrollPane_W;
import view.Login;

public class Search {

    DefaultTableModel model = new DefaultTableModel();

    public void SearchClient(String search) {

        String query = "";

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

    public void SearchWarranty(String search) {

        String query = "";

        if (Login.type_account.equals("Moderador")) {

            if (search.equals("")) {

                query = "select w.id_warranty, e.brand, e.model, w.serial, c.name_client, c.identity_card_client, w.shop "
                        + "from warranty w "
                        + "join equipo e on e.id_equipo = w.id_equipo "
                        + "join client c on c.id_client = w.id_client "
                        + "and not w.status = '" + "Entregado" + "'";

            } else {

                query = "select w.id_warranty, e.brand, e.model, w.serial, c.name_client, c.identity_card_client, w.shop "
                        + "from warranty w "
                        + "join equipo e on e.id_equipo = w.id_equipo "
                        + "join client c on c.id_client = w.id_client "
                        + "and w.id_warranty = '" + search + "' and not w.status = '" + "Entregado" + "' or "
                        + "e.brand = '" + search + "' and not w.status = '" + "Entregado" + "' and w.id_client = c.id_client or "
                        + "e.model = '" + search + "' and not w.status = '" + "Entregado" + "' and w.id_client = c.id_client or "
                        + "w.serial = '" + search + "' and not w.status = '" + "Entregado" + "' and w.id_client = c.id_client or "
                        + "c.name_client = '" + search + "' and not w.status = '" + "Entregado" + "' and w.id_client = c.id_client or "
                        + "c.unformat_identity_card_client = '" + search + "' and not w.status = '" + "Entregado" + "' and w.id_client = c.id_client or "
                        + "w.shop = '" + search + "' and not w.status = '" + "Entregado" + "' and w.id_client = c.id_client";
            }

        } else {

            if (search.equals("")) {

                query = "select w.id_warranty, e.brand, e.model, w.serial, c.name_client, c.identity_card_client, w.status "
                        + "from warranty w "
                        + "join equipo e on e.id_equipo = w.id_equipo "
                        + "join client c on c.id_client = w.id_client "
                        + "and not w.status = '" + "Entregado" + "' and w.shop = '" + Login.direction + "'";

            } else {

                query = "select w.id_warranty, e.brand, e.model, w.serial, c.name_client, c.identity_card_client, w.status "
                        + "from warranty w "
                        + "join equipo e on e.id_equipo = w.id_equipo "
                        + "join client c on c.id_client = w.id_client "
                        + "and w.id_warranty = '" + search + "' and not w.status = '" + "Entregado" + "' and w.shop = '" + Login.direction + "' or "
                        + "e.brand = '" + search + "' and not w.status = '" + "Entregado" + "' and w.shop = '" + Login.direction + "' and w.id_client = c.id_client or "
                        + "e.model = '" + search + "' and not w.status = '" + "Entregado" + "' and w.shop = '" + Login.direction + "' and w.id_client = c.id_client or "
                        + "w.serial = '" + search + "' and not w.status = '" + "Entregado" + "' and w.shop = '" + Login.direction + "' and w.id_client = c.id_client or "
                        + "c.name_client = '" + search + "' and not w.status = '" + "Entregado" + "' and w.shop = '" + Login.direction + "' and w.id_client = c.id_client or "
                        + "c.unformat_identity_card_client = '" + search + "' and not w.status = '" + "Entregado" + "' and w.shop = '" + Login.direction + "' and w.id_client = c.id_client or "
                        + "w.status = '" + search + "' and not w.status = '" + "Entregado" + "' and w.shop = '" + Login.direction + "' and w.id_client = c.id_client";

            }

        }

        try {

            Connection cn = BD_Connection.connection();
            PreparedStatement pst = cn.prepareStatement(query);

            ResultSet rs = pst.executeQuery();

            jTable_Client = new JTable(model);
            jScrollPane_W.setViewportView(jTable_Client);

            model.setColumnCount(0);
            model.setRowCount(0);

            if (Login.type_account.equals("Moderador")) {

                model.addColumn("ID");
                model.addColumn("Marca");
                model.addColumn("Módelo");
                model.addColumn("Serial");
                model.addColumn("Cliente");
                model.addColumn("Rif");
                model.addColumn("Tienda");

                while (rs.next()) {

                    Object[] fila = new Object[7];
                    for (int i = 0; i < 7; i++) {

                        fila[i] = rs.getObject(i + 1);

                    }

                    model.addRow(fila);

                }

            } else {

                model.addColumn("ID");
                model.addColumn("Marca");
                model.addColumn("Módelo");
                model.addColumn("Serial");
                model.addColumn("Cliente");
                model.addColumn("Rif");
                model.addColumn("Estatus");

                while (rs.next()) {

                    Object[] fila = new Object[7];
                    for (int i = 0; i < 7; i++) {

                        fila[i] = rs.getObject(i + 1);

                    }

                    model.addRow(fila);

                }

            }

            cn.close();

        } catch (SQLException e) {

            System.err.println("¡Error al vaciar la tabla de garantías! " + e);
            JOptionPane.showMessageDialog(null, "¡Error al vaciar la tabla de garantías!", "¡Error!",
                    JOptionPane.OK_CANCEL_OPTION);

        }

    }

}
