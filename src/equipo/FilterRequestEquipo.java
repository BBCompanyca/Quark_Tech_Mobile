package equipo;

import OtherClass.BD_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JTable;
import static equipo.TableEquipos.jTable_Equipo;
import static equipo.TableEquipos.jScrollPane;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FilterRequestEquipo {

    BD_Connection connection = new BD_Connection();

    public void RequestEquipo(String search) {
        String query;

        try {

            if (search.equals("")) {

                query = "select code, brand, model, color, day_warranty from equipo";
            } else {

                query = "select code, brand, model, color, day_warranty from equipo where code = '" + search + "' "
                        + "or brand = '" + search + "' or model = '" + search + "' or color = '" + search + "' "
                        + "or day_warranty = '" + search + "'";

            }

            Connection cn = connection.connection();
            PreparedStatement pst = cn.prepareStatement(query);

            ResultSet rs = pst.executeQuery();
            
            jTable_Equipo = new JTable(TableEquipos.getInstace());
            jScrollPane.setViewportView(jTable_Equipo);
            
            TableEquipos.getInstace().setColumnCount(0);
            TableEquipos.getInstace().setRowCount(0);

            TableEquipos.getInstace().addColumn("Código");
            TableEquipos.getInstace().addColumn("Marca");
            TableEquipos.getInstace().addColumn("Modelo");
            TableEquipos.getInstace().addColumn("Color");
            TableEquipos.getInstace().addColumn("Días de garantía");

            while (rs.next()) {

                Object[] fila = new Object[5];
                for (int i = 0; i < 5; i++) {

                    fila[i] = rs.getObject(i + 1);

                }

                TableEquipos.getInstace().addRow(fila);

            }

            cn.close();

        } catch (SQLException e) {

            System.err.println("¡Error al vaciar la tabla de los equipos! " + e);
            JOptionPane.showMessageDialog(null, "¡Error al vaciar la tabla! ", "¡Error!", JOptionPane.OK_OPTION);

        }

    }

}
