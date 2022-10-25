package equipo.infrastructure;

import warranty.Register_Warranty;
import clases.BD_Connection;
import clases.Paneles;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class CodeEquipos extends javax.swing.JPanel {

    DefaultTableModel model = new DefaultTableModel();
    
    BD_Connection connection = new BD_Connection();

    Paneles paneles = new Paneles();
    
    public static int id_equipo = 0;

    public CodeEquipos() {
        initComponents();

        getEquipos();

        EventTable();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        jTable_Equipo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField_Search = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(9, 53, 69));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane.setBackground(new java.awt.Color(9, 53, 69));
        jScrollPane.setBorder(null);
        jScrollPane.setForeground(new java.awt.Color(240, 240, 240));

        jTable_Equipo.setBackground(new java.awt.Color(9, 53, 69));
        jTable_Equipo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jTable_Equipo.setForeground(new java.awt.Color(240, 240, 240));
        jTable_Equipo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Marca", "Modelo", "Color", "Dias De Garantías"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Equipo.setGridColor(new java.awt.Color(240, 240, 240));
        jTable_Equipo.setSelectionBackground(new java.awt.Color(9, 53, 69));
        jScrollPane.setViewportView(jTable_Equipo);

        add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 893, 380));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Buscar:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        jTextField_Search.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Search.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Search.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Search.setBorder(null);
        jTextField_Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_SearchKeyPressed(evt);
            }
        });
        add(jTextField_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 170, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 170, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_SearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_SearchKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            String search = jTextField_Search.getText().trim();
            String query = "";

            if (search.equals("")) {

                query = "select id_equipo, code, brand, model, color, day_warranty from equipo";

            } else {

                query = "select id_equipo, code, brand, model, color, day_warranty from equipo where code = '" + search + "' or "
                        + "brand = '" + search + "' or model = '" + search + "' or color = '" + search + "' or "
                        + "day_warranty = '" + search + "'";

            }

            try {

                Connection cn = connection.connection();
                PreparedStatement pst = cn.prepareStatement(query);

                ResultSet rs = pst.executeQuery();

                jTable_Equipo = new JTable(model);
                jScrollPane.setViewportView(jTable_Equipo);

                model.setColumnCount(0);
                model.setRowCount(0);

                model.addColumn("ID");
                model.addColumn("Código");
                model.addColumn("Marca");
                model.addColumn("Modelo");
                model.addColumn("Color");
                model.addColumn("Días de garantías");

                while (rs.next()) {
                    Object[] fila = new Object[6];

                    for (int i = 0; i < 6; i++) {

                        fila[i] = rs.getObject(i + 1);

                    }

                    model.addRow(fila);

                }

                jTextField_Search.setText("");

                cn.close();

            } catch (SQLException e) {

                System.err.println("¡Error al consultar la lista de equipos! " + e);
                JOptionPane.showMessageDialog(null, "¡Error al consultar la lista de equipos!", "¡Error!",
                        JOptionPane.OK_OPTION);

            }

            EventTable();

        }


    }//GEN-LAST:event_jTextField_SearchKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable_Equipo;
    private javax.swing.JTextField jTextField_Search;
    // End of variables declaration//GEN-END:variables

    private void EventTable() {

        jTable_Equipo.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {

                int fila_point = jTable_Equipo.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point >= -1) {

                    id_equipo = (int) jTable_Equipo.getValueAt(fila_point, columna_point);
                    Register_Warranty.flag_AddressRegisterAndConsult = 2;

                    paneles.PanelRegisterWarranty();

                }

            }

        });

    }

    private void getEquipos() {

        try {

            Connection cn = connection.connection();
            PreparedStatement pst = cn.prepareStatement(
                    "select id_equipo, code, brand, model, color, day_warranty from equipo");

            ResultSet rs = pst.executeQuery();

            jTable_Equipo = new JTable(model);
            jScrollPane.setViewportView(jTable_Equipo);

            model.addColumn("ID");
            model.addColumn("Código");
            model.addColumn("Marca");
            model.addColumn("Modelo");
            model.addColumn("Color");
            model.addColumn("Días de garantías");

            while (rs.next()) {
                Object[] fila = new Object[6];

                for (int i = 0; i < 6; i++) {

                    fila[i] = rs.getObject(i + 1);

                }

                model.addRow(fila);

            }

            cn.close();

        } catch (SQLException e) {

            System.err.println("¡Error al consultar la lista de equipos! " + e);
            JOptionPane.showMessageDialog(null, "¡Error al consultar la lista de equipos!", "¡Error!",
                    JOptionPane.OK_OPTION);

        }

    }

}
