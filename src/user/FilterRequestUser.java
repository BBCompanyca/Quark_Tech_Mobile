package user;

import OtherClass.BD_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import login.Login;
import static user.Users.jScrollPane;
import static user.Users.jTable_User;

public class FilterRequestUser {

    BD_Connection connection = new BD_Connection();

    public void filterRequestUser(String search) {

        int flag = 0;

        String query;

        if (Login.type_account.equals("Moderador")) {

            if (search.equals("")) {

                query = "select id_user, name_user, username, direction, type_account, status from user";

            } else {

                query = "select id_user, name_user, username, direction, type_account, status from user "
                        + "where id_user = '" + search + "' or name_user = '" + search + "' or "
                        + "username = '" + search + "' or direction = '" + search + "' or type_account = '"
                        + search + "' or status = '" + search + "'";

            }

        } else {

            flag++;

            if (search.equals("")) {

                query = "select id_user, name_user, username, type_account, status from user "
                        + "where direction = '" + Login.direction + "'";

            } else {

                query = "select id_user, name_user, username, type_account, status from user "
                        + "where id_user = '" + search + "' and direction = '" + Login.direction + "' or "
                        + "name_user = '" + search + "' and direction = '" + Login.direction + "' or "
                        + "username = '" + search + "' and direction = '" + Login.direction + "' or "
                        + "type_account = '" + search + "' and direction = '" + Login.direction + "' or "
                        + "status = '" + search + "' and direction = '" + Login.direction + "'";

            }

        }

        try {

            Connection cn = connection.connection();
            PreparedStatement pst = cn.prepareStatement(query);

            ResultSet rs = pst.executeQuery();

            //Diseño de la tabla...
            jTable_User = new JTable(Users.getInstanceUser());
            jScrollPane.setViewportView(jTable_User);

            Users.getInstanceUser().setColumnCount(0);
            Users.getInstanceUser().setRowCount(0);

            if (flag == 0) {

                Users.getInstanceUser().addColumn("ID");
                Users.getInstanceUser().addColumn("Nombre");
                Users.getInstanceUser().addColumn("Nombre De Usuario");
                Users.getInstanceUser().addColumn("Dirección");
                Users.getInstanceUser().addColumn("Permisos De");
                Users.getInstanceUser().addColumn("Estatus");

                while (rs.next()) {

                    Object[] fila = new Object[6];
                    for (int i = 0; i < 6; i++) {

                        fila[i] = rs.getObject(i + 1);

                    }

                    Users.getInstanceUser().addRow(fila);

                }

            } else {

                Users.getInstanceUser().addColumn("ID");
                Users.getInstanceUser().addColumn("Nombre");
                Users.getInstanceUser().addColumn("Nombre De Usuario");
                Users.getInstanceUser().addColumn("Permisos De");
                Users.getInstanceUser().addColumn("Estatus");

                while (rs.next()) {

                    Object[] fila = new Object[5];
                    for (int i = 0; i < 5; i++) {

                        fila[i] = rs.getObject(i + 1);

                    }

                    Users.getInstanceUser().addRow(fila);

                }

            }

            cn.close();

        } catch (SQLException e) {

            System.err.println("¡Error al filtrar el usuario! " + e);
            JOptionPane.showMessageDialog(null, "¡Error al filtrar el usuario!", "¡Error!",
                    JOptionPane.OK_CANCEL_OPTION);

        }

    }

}
