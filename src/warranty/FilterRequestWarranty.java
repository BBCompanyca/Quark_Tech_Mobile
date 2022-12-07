package warranty;

import OtherClass.BD_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import login.Login;
import static warranty.Warranty.jScrollPane_W;
import static warranty.Warranty.jTable_Warranty;

public class FilterRequestWarranty {
    
    BD_Connection connection = new BD_Connection();

    public void filterRequestWarranty(String search){
        
        String query;

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

            Connection cn = connection.connection();
            PreparedStatement pst = cn.prepareStatement(query);

            ResultSet rs = pst.executeQuery();

            jTable_Warranty = new JTable(Warranty.getInstanceWarranty());
            jScrollPane_W.setViewportView(jTable_Warranty);

            Warranty.getInstanceWarranty().setColumnCount(0);
            Warranty.getInstanceWarranty().setRowCount(0);

            if (Login.type_account.equals("Moderador")) {

                Warranty.getInstanceWarranty().addColumn("ID");
                Warranty.getInstanceWarranty().addColumn("Marca");
                Warranty.getInstanceWarranty().addColumn("Módelo");
                Warranty.getInstanceWarranty().addColumn("Serial");
                Warranty.getInstanceWarranty().addColumn("Cliente");
                Warranty.getInstanceWarranty().addColumn("Rif");
                Warranty.getInstanceWarranty().addColumn("Tienda");

                while (rs.next()) {

                    Object[] fila = new Object[7];
                    for (int i = 0; i < 7; i++) {

                        fila[i] = rs.getObject(i + 1);

                    }

                    Warranty.getInstanceWarranty().addRow(fila);

                }

            } else {

                Warranty.getInstanceWarranty().addColumn("ID");
                Warranty.getInstanceWarranty().addColumn("Marca");
                Warranty.getInstanceWarranty().addColumn("Módelo");
                Warranty.getInstanceWarranty().addColumn("Serial");
                Warranty.getInstanceWarranty().addColumn("Cliente");
                Warranty.getInstanceWarranty().addColumn("Rif");
                Warranty.getInstanceWarranty().addColumn("Estatus");

                while (rs.next()) {

                    Object[] fila = new Object[7];
                    for (int i = 0; i < 7; i++) {

                        fila[i] = rs.getObject(i + 1);

                    }

                    Warranty.getInstanceWarranty().addRow(fila);

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
