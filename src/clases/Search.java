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
import static view.Warranty.jTextField_Search_Warranty;
import static view.Warranty.jTable_Warranty;
import view.Login;

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

    public void SearchWarranty(String search) {

        String query;

        if (Login.type_account.equals("Moderador")) {

            if (search.equals("")) {

                query = "select w.id_warranty, e.brand, w.serial, c.name_client, c.identity_card_client, w.shop, w.status "
                        + "from warranty w "
                        + "join equipo e on e.id_equipo = w.id_equipo "
                        + "join client c on c.id_client = w.id_client "
                        + "and not w.status = '" + "Entregado" + "'";

            } else {

                query = "select w.id_warranty, e.brand, w.serial, c.name_client, c.identity_card_client, w.shop, w.status "
                        + "from warranty w "
                        + "join equipo e on e.id_equipo = w.id_equipo "
                        + "join client c on c.id_client = w.id_client "
                        + "and not w.status = '" + "Entregado" + "' and w.id_warranty = '" + search + "' "
                        + "and c.id_client = w.id_client";

            }

        } else {

            if (search.equals("")) {

                query = "select w.id_warranty, e.brand, w.serial, c.name_client, c.identity_card_client, w.status "
                        + "from warranty w "
                        + "join equipo e on e.id_equipo = w.id_equipo "
                        + "join client c on c.id_client = w.id_client "
                        + "and not w.status = '" + "Entregado" + "' and w.shop = '" + Login.direction + "'";

            } else {

                query = "select id_warranty, equipo, color, serial, name_client, identity_card_client, "
                        + "status from warranty where "
                        + "id_warranty = '" + search + "' and direction_shop = '" + Login.direction + "' and not status = '" + "Entregado" + "' or "
                        + "equipo = '" + search + "' and direction_shop = '" + Login.direction + "' and not status = '" + "Entregado" + "' or "
                        + "color = '" + search + "' and direction_shop = '" + Login.direction + "' and not status = '" + "Entregado" + "' or "
                        + "serial = '" + search + "' and direction_shop = '" + Login.direction + "' and not status = '" + "Entregado" + "' or "
                        + "name_client = '" + search + "' and direction_shop = '" + Login.direction + "' and not status = '" + "Entregado" + "' or "
                        + "unformat_identity_card_client = '" + search + "' and direction_shop = '" + Login.direction + "' and not status = '" + "Entregado" + "' or "
                        + "status = '" + search + "' and direction_shop = '" + Login.direction + "' and not status = '" + "Entregado" + "'";

            }

        }

        try {

            Connection cn = BD_Connection.connection();
            PreparedStatement pst = cn.prepareStatement(query);

            ResultSet rs = pst.executeQuery();

            jTable_Warranty = new JTable(model);
            jScrollPane.setViewportView(jTable_Warranty);

            model.setColumnCount(0);
            model.setRowCount(0);

            if (Login.type_account.equals("Moderador")) {

                model.addColumn("ID");
                model.addColumn("Equipo");
                model.addColumn("Serial");
                model.addColumn("Cliente");
                model.addColumn("Cédula");
                model.addColumn("Tienda");
                model.addColumn("Estatus");

                while (rs.next()) {

                    Object[] fila = new Object[7];
                    for (int i = 0; i < 7; i++) {

                        fila[i] = rs.getObject(i + 1);

                    }

                    model.addRow(fila);

                }

            } else {

                model.addColumn("ID");
                model.addColumn("Equipo");
                model.addColumn("Color");
                model.addColumn("Serial");
                model.addColumn("Cliente");
                model.addColumn("Cédula");
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

            jTextField_Search_Warranty.setText("");
            jTextField_Search_Warranty.requestFocus();

        } catch (SQLException e) {

            System.err.println("¡Error al vaciar la tabla de garantías! " + e);
            JOptionPane.showMessageDialog(null, "¡Error al vaciar la tabla de garantías!", "¡Error!",
                    JOptionPane.OK_CANCEL_OPTION);

        }

    }

}
