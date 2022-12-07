package moviments;

import OtherClass.BD_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import login.Login;
import static moviments.Movimientos.jScrollPane_M;
import static moviments.Movimientos.jTable_Movimientos;

public class FilterRequestMovimients {
    
    BD_Connection connection = new BD_Connection();
    DefaultTableModel model = new DefaultTableModel();
    
    public void filterRequestMovimients(String search, String shop, String desde, String hasta) {

        String query = "";

        if (Login.type_account.equals("Moderador")) {

            if (shop.equals("Todos") && search.equals("")) {

                query = "select m.id_movimiento, m.operation, m.fecha_format, u.username, m.referencia, m.shop from movimientos m "
                        + "join user u on u.id_user = m.id_user and m.fecha between '" + desde + "' and '" + hasta + "'";

            } else if (shop.equals("Todos") && !search.equals("")) {

                query = "select m.id_movimiento, m.operation, m.fecha_format, u.username, m.referencia, m.shop from movimientos m "
                        + "join user u on u.id_user = m.id_user and u.username = '" + search + "' and m.fecha between '" + desde + "' and '" + hasta + "'";

            } else if (!shop.equals("Todos") && search.equals("")) {

                query = "select m.id_movimiento, m.operation, m.fecha_format, u.username, m.referencia, m.shop from movimientos m "
                        + "join user u on u.id_user = m.id_user and shop = '" + shop + "' and m.fecha between '" + desde + "' and '" + hasta + "'";

            } else {

                query = "select m.id_movimiento, m.operation, m.fecha_format, u.username, m.referencia, m.shop from movimientos m "
                        + "join user u on u.id_user = m.id_user and shop = '" + shop + "' and u.username = '" + search + "' "
                        + "and m.fecha between '" + desde + "' and '" + hasta + "'";

            }

        } else {

            if (search.isEmpty()) {

                query = "select m.id_movimiento, m.operation, m.fecha_format, u.username, m.referencia from movimientos m "
                        + "join user u on u.id_user = m.id_user and shop = '" + Login.direction + "' "
                        + "and m.fecha between '" + desde + "' and '" + hasta + "'";

            } else {

                query = "select m.id_movimiento, m.operation, m.fecha_format, u.username, m.referencia from movimientos m "
                        + "join user u on u.id_user = m.id_user and shop = '" + Login.direction + "' and u.username = '" + search + "' "
                        + "and m.fecha between '" + desde + "' and '" + hasta + "'";

            }

        }

        if (Login.type_account.equals("Moderador")) {

            try {

                Connection cn = connection.connection();
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

                Connection cn = connection.connection();
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
        
        Movimientos.flag = 1;

    }
    
}
