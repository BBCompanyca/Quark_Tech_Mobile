package history;

import OtherClass.BD_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import login.Login;
import static history.History.jScrollPane_H;
import static history.History.jTable_History_H;

public class FilterRequestHistory {

    DefaultTableModel model = new DefaultTableModel();

    BD_Connection connection = new BD_Connection();

    public void filterRequestHistory(String search, String desde, String hasta) {

        String query = "";

        if (Login.type_account.equals("Moderador")) {

            if (search.isEmpty()) {

                query = "select w.id_warranty, e.brand, e.model, w.serial, c.name_client, c.identity_card_client, w.status_technical "
                        + "from warranty w "
                        + "join equipo e on e.id_equipo = w.id_equipo "
                        + "join client c on c.id_client = w.id_client "
                        + "and w.id_client = c.id_client and w.date_format_register between '" + desde + "' and '" + hasta + "'";

            } else {

                query = "select w.id_warranty, e.brand, e.model, w.serial, c.name_client, c.identity_card_client, w.status_technical "
                        + "from warranty w "
                        + "join equipo e on e.id_equipo = w.id_equipo "
                        + "join client c on c.id_client = w.id_client "
                        + "and w.serial = '" + search + "' and w.id_client = c.id_client and w.date_format_register between '" + desde + "' and '" + hasta + "'";

            }

        } else if (Login.type_account.equals("Administrador") || Login.type_account.equals("Vendedor")) {

            if (search.isEmpty()) {

                query = "select w.id_warranty, e.brand, e.model, w.serial, c.name_client, c.identity_card_client, w.status_technical "
                        + "from warranty w "
                        + "join equipo e on e.id_equipo = w.id_equipo "
                        + "join client c on c.id_client = w.id_client "
                        + "join user u on u.id_user = w.id_registered_by "
                        + "and u.direction = '" + Login.direction + "' and w.id_client = c.id_client and "
                        + "w.date_format_register between '" + desde + "' and '" + hasta + "'";

            } else {

                query = "select w.id_warranty, e.brand, e.model, w.serial, c.name_client, c.identity_card_client, w.status_technical "
                        + "from warranty w "
                        + "join equipo e on e.id_equipo = w.id_equipo "
                        + "join client c on c.id_client = w.id_client "
                        + "join user u on u.id_user = w.id_registered_by "
                        + "and w.serial = '" + search + "' and u.direction = '" + Login.direction + "' and w.id_client = c.id_client and "
                        + "w.date_format_register between '" + desde + "' and '" + hasta + "'";

            }

        } else {

            if (search.isEmpty()) {

                query = "select w.id_warranty, e.brand, e.model, w.serial, c.name_client, c.identity_card_client, w.status_technical "
                        + "from warranty w "
                        + "join equipo e on e.id_equipo = w.id_equipo "
                        + "join client c on c.id_client = w.id_client "
                        + "and w.id_client = c.id_client and w.date_format_acepted between '" + desde + "' and '" + hasta + "' "
                        + "and w.id_technical = '" + Login.ID_User + "'";

            } else {

                query = "select w.id_warranty, e.brand, e.model, w.serial, c.name_client, c.identity_card_client, w.status_technical "
                        + "from warranty w "
                        + "join equipo e on e.id_equipo = w.id_equipo "
                        + "join client c on c.id_client = w.id_client "
                        + "and w.serial = '" + search + "' and w.id_client = c.id_client and w.date_format_acepted between '" + desde + "' and '" + hasta + "' "
                        + "and w.id_technical = '" + Login.ID_User + "'";

            }

        }

        try {

            Connection cn = connection.connection();
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

}
