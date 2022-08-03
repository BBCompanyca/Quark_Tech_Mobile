package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static view.Warranty.jScrollPane_W;
import view.Login;
import static view.Clients.jTable_Client;
import static view.Clients.jScrollPane_C;
import static view.History.jScrollPane_H;
import static view.History.jTable_History_H;
import static view.Movimientos.jScrollPane_M;
import static view.Movimientos.jTable_Movimientos;

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
            jScrollPane_C.setViewportView(jTable_Client);

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

    public void SearchHistory(String search, String desde, String hasta) {

        String query = "";

        if (Login.type_account.equals("Moderador") || Login.type_account.equals("Tecnico")) {

            if (search.isEmpty()) {

                query = "select w.id_warranty, e.brand, e.model, w.serial, c.name_client, c.identity_card_client, w.status_technical "
                        + "from warranty w "
                        + "join equipo e on e.id_equipo = w.id_equipo "
                        + "join client c on c.id_client = w.id_client "
                        + "and w.id_client = c.id_client and w.date_register between '" + desde + "' and '" + hasta + "'";

            } else {

                query = "select w.id_warranty, e.brand, e.model, w.serial, c.name_client, c.identity_card_client, w.status_technical "
                        + "from warranty w "
                        + "join equipo e on e.id_equipo = w.id_equipo "
                        + "join client c on c.id_client = w.id_client "
                        + "and w.serial = '" + search + "' and w.id_client = c.id_client and w.date_register between '" + desde + "' and '" + hasta + "'";

            }

        } else if (Login.type_account.equals("Administrador") || Login.type_account.equals("Vendedor")) {

            if (search.isEmpty()) {
                
                query = "select w.id_warranty, e.brand, e.model, w.serial, c.name_client, c.identity_card_client, w.status_technical "
                    + "from warranty w "
                    + "join equipo e on e.id_equipo = w.id_equipo "
                    + "join client c on c.id_client = w.id_client "
                    + "join user u on u.id_user = w.id_registered_by "
                    + "and u.direction = '" + Login.direction + "' and w.id_client = c.id_client and "
                    + "w.date_register between '" + desde + "' and '" + hasta + "'";
                
            } else {
                
                query = "select w.id_warranty, e.brand, e.model, w.serial, c.name_client, c.identity_card_client, w.status_technical "
                    + "from warranty w "
                    + "join equipo e on e.id_equipo = w.id_equipo "
                    + "join client c on c.id_client = w.id_client "
                    + "join user u on u.id_user = w.id_registered_by "
                    + "and w.serial = '" + search + "' and u.direction = '" + Login.direction + "' and w.id_client = c.id_client and "
                    + "w.date_register between '" + desde + "' and '" + hasta + "'";
                
            }

        }

        try {

            Connection cn = BD_Connection.connection();
            PreparedStatement pst = cn.prepareStatement(query);

            ResultSet rs = pst.executeQuery();

            jTable_History_H = new JTable(model);
            jScrollPane_H.setViewportView(jTable_History_H);

            model.setColumnCount(0);
            model.setRowCount(0);

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

            cn.close();

        } catch (SQLException e) {

            System.err.println("¡Error al vaciar la tabla del historico! " + e);
            JOptionPane.showMessageDialog(null, "¡Error al vaciar la tabla! ", "¡Error!", JOptionPane.OK_OPTION);

        }

    }

    public void SearchMovimiento(String search, String shop, String desde, String hasta) {

        String query = "";

        if (Login.type_account.equals("Moderador")) {

            if (shop.equals("Todos") && search.equals("")) {

                query = "select m.id_movimiento, m.operation, m.fecha, u.username, m.referencia, m.shop from movimientos m "
                        + "join user u on u.id_user = m.id_user and m.fecha between '" + desde + "' and '" + hasta + "'";

            } else if (shop.equals("Todos") && !search.equals("")) {

                query = "select m.id_movimiento, m.operation, m.fecha, u.username, m.referencia, m.shop from movimientos m "
                        + "join user u on u.id_user = m.id_user and u.username = '" + search + "' and m.fecha between '" + desde + "' and '" + hasta + "'";

            } else if (!shop.equals("Todos") && search.equals("")) {

                query = "select m.id_movimiento, m.operation, m.fecha, u.username, m.referencia, m.shop from movimientos m "
                        + "join user u on u.id_user = m.id_user and shop = '" + shop + "' and m.fecha between '" + desde + "' and '" + hasta + "'";

            } else {

                query = "select m.id_movimiento, m.operation, m.fecha, u.username, m.referencia, m.shop from movimientos m "
                        + "join user u on u.id_user = m.id_user and shop = '" + shop + "' and u.username = '" + search + "' "
                        + "and m.fecha between '" + desde + "' and '" + hasta + "'";

            }

        } else {

            if (search.isEmpty()) {

                query = "select m.id_movimiento, m.operation, m.fecha, u.username, m.referencia from movimientos m "
                        + "join user u on u.id_user = m.id_user and shop = '" + Login.direction + "' "
                        + "and m.id_movimiento between '" + desde + "' and '" + hasta + "'";

            } else {

                query = "select m.id_movimiento, m.operation, m.fecha, u.username, m.referencia from movimientos m "
                        + "join user u on u.id_user = m.id_user and shop = '" + Login.direction + "' and u.username = '" + search + "' "
                        + "and m.id_movimiento between '" + desde + "' and '" + hasta + "'";

            }

        }

        if (Login.type_account.equals("Moderador")) {

            try {

                Connection cn = BD_Connection.connection();
                PreparedStatement pst = cn.prepareStatement(query);

                ResultSet rs = pst.executeQuery();

                jTable_Movimientos = new JTable(model);
                jScrollPane_M.setViewportView(jTable_Movimientos);

                model.setColumnCount(0);
                model.setRowCount(0);

                model.addColumn("ID");
                model.addColumn("Operación");
                model.addColumn("Fecha");
                model.addColumn("Usuario");
                model.addColumn("Referencia");
                model.addColumn("Tienda");

                while (rs.next()) {

                    Object[] fila = new Object[6];
                    for (int i = 0; i < 6; i++) {

                        fila[i] = rs.getObject(i + 1);

                    }

                    model.addRow(fila);

                }

                cn.close();

            } catch (SQLException e) {

                System.err.println("¡Error al vaciar la tabla del historico! " + e);
                JOptionPane.showMessageDialog(null, "¡Error al vaciar la tabla! ", "¡Error!", JOptionPane.OK_OPTION);

            }

        } else {

            try {

                Connection cn = BD_Connection.connection();
                PreparedStatement pst = cn.prepareStatement(query);

                ResultSet rs = pst.executeQuery();

                jTable_Movimientos = new JTable(model);
                jScrollPane_M.setViewportView(jTable_Movimientos);

                model.setColumnCount(0);
                model.setRowCount(0);

                model.addColumn("ID");
                model.addColumn("Operación");
                model.addColumn("Fecha");
                model.addColumn("Usuario");
                model.addColumn("Referencia");

                while (rs.next()) {

                    Object[] fila = new Object[5];
                    for (int i = 0; i < 5; i++) {

                        fila[i] = rs.getObject(i + 1);

                    }

                    model.addRow(fila);

                }

                cn.close();

            } catch (SQLException e) {

                System.err.println("¡Error al vaciar la tabla del historico! " + e);
                JOptionPane.showMessageDialog(null, "¡Error al vaciar la tabla! ", "¡Error!", JOptionPane.OK_OPTION);

            }

        }

    }

}
