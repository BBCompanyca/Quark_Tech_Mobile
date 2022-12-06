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

    DefaultTableModel model = new DefaultTableModel();

    private String search;

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public void RequestEquipo() {

        String query;

        try {

            if (getSearch().equals("")) {
                query = "select code, brand, model, color, day_warranty from equipo";
            } else {

                query = "select code, brand, model, color, day_warranty from equipo where code = '" + search + "' "
                        + "or brand = '" + search + "' or model = '" + search + "' or color = '" + search + "' "
                        + "or day_warranty = '" + search + "'";

            }

            Connection cn = connection.connection();
            PreparedStatement pst = cn.prepareStatement(query);

            ResultSet rs = pst.executeQuery();

            jTable_Equipo = new JTable(model);
            jScrollPane.setViewportView(jTable_Equipo);

            model.setColumnCount(0);
            model.setRowCount(0);

            model.addColumn("Código");
            model.addColumn("Marca");
            model.addColumn("Modelo");
            model.addColumn("Color");
            model.addColumn("Días de garantía");

            while (rs.next()) {

                Object[] fila = new Object[5];
                for (int i = 0; i < 5; i++) {

                    fila[i] = rs.getObject(i + 1);

                }

                model.addRow(fila);

            }

            cn.close();

        } catch (SQLException e) {

            System.err.println("¡Error al vaciar la tabla de los equipos! " + e);
            JOptionPane.showMessageDialog(null, "¡Error al vaciar la tabla! ", "¡Error!", JOptionPane.OK_OPTION);

        }

    }

}
