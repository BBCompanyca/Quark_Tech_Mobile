package view;

import login.Login;
import OtherClass.BD_Connection;
import OtherClass.Paneles;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Warranty_Technical extends javax.swing.JPanel {
    
    BD_Connection connection = new BD_Connection();

    DefaultTableModel model = new DefaultTableModel();
    
    Paneles paneles = new Paneles();

    public static int ID_Warranty;

    public Warranty_Technical() {
        initComponents();

        getInformationWarranty();
        
        EventTable();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        jTable_Warranty = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField_Search_Warranty = new javax.swing.JTextField();
        jButton_Search_User = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(9, 53, 69));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane.setBackground(new java.awt.Color(9, 53, 69));
        jScrollPane.setBorder(null);
        jScrollPane.setForeground(new java.awt.Color(240, 240, 240));

        jTable_Warranty.setBackground(new java.awt.Color(9, 53, 69));
        jTable_Warranty.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jTable_Warranty.setForeground(new java.awt.Color(240, 240, 240));
        jTable_Warranty.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Equipo", "Color", "Serial", "Falla", "Tienda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Warranty.setGridColor(new java.awt.Color(240, 240, 240));
        jTable_Warranty.setSelectionBackground(new java.awt.Color(9, 53, 69));
        jScrollPane.setViewportView(jTable_Warranty);

        add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 850, 270));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Garantías");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 110, 30));

        jTextField_Search_Warranty.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Search_Warranty.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextField_Search_Warranty.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Search_Warranty.setBorder(null);
        jTextField_Search_Warranty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField_Search_WarrantyMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextField_Search_WarrantyMouseReleased(evt);
            }
        });
        jTextField_Search_Warranty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Search_WarrantyActionPerformed(evt);
            }
        });
        jTextField_Search_Warranty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_Search_WarrantyKeyPressed(evt);
            }
        });
        add(jTextField_Search_Warranty, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 700, 30));

        jButton_Search_User.setText("Buscar");
        jButton_Search_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_Search_UserMousePressed(evt);
            }
        });
        add(jButton_Search_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, 80, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 700, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_Search_WarrantyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_Search_WarrantyMousePressed

    }//GEN-LAST:event_jTextField_Search_WarrantyMousePressed

    private void jTextField_Search_WarrantyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_Search_WarrantyMouseReleased
        //nothing
    }//GEN-LAST:event_jTextField_Search_WarrantyMouseReleased

    private void jTextField_Search_WarrantyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Search_WarrantyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Search_WarrantyActionPerformed

    private void jTextField_Search_WarrantyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Search_WarrantyKeyPressed

        /*if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            String search = jTextField_Search_Warranty.getText().trim();

            String query = "";

            if (Login.type_account.equals("Moderador")) {

                if (search.equals("")) {

                    query = "select id_warranty, equipo, serial, name_client, identity_card_client, "
                    + "direction_shop, status from warranty where not status = '" + "Entregado" + "'";

                } else {

                    query = "select id_warranty, equipo, serial, name_client, identity_card_client, "
                    + "direction_shop, status from warranty where id_warranty = '" + search + "' and not status = '" + "Entregado" + "' or "
                    + "equipo = '" + search + "' and not status = '" + "Entregado" + "' or "
                    + "serial = '" + search + "' and not status = '" + "Entregado" + "' or "
                    + "name_client = '" + search + "' and not status = '" + "Entregado" + "' or "
                    + "unformat_identity_card_client = '" + search + "' and not status = '" + "Entregado" + "' or "
                    + "direction_shop = '" + search + "' and not status = '" + "Entregado" + "' or "
                    + "status = '" + search + "' and not status = '" + "Entregado" + "'";

                }

            } else {

                if (search.equals("")) {

                    query = "select id_warranty, equipo, color, serial, name_client, identity_card_client, "
                    + "status from warranty where direction_shop = '" + Login.direction + "' and not status = '" + "Entregado" + "'";

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

        } */
    }//GEN-LAST:event_jTextField_Search_WarrantyKeyPressed

    private void jButton_Search_UserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Search_UserMousePressed

        /* String search = jTextField_Search_Warranty.getText().trim();

        String query = "";

        if (Login.type_account.equals("Moderador")) {

            if (search.equals("")) {

                query = "select id_warranty, equipo, serial, name_client, identity_card_client, "
                + "direction_shop, status from warranty where not status = '" + "Entregado" + "'";

            } else {

                query = "select id_warranty, equipo, serial, name_client, identity_card_client, "
                + "direction_shop, status from warranty where id_warranty = '" + search + "' and not status = '" + "Entregado" + "' or "
                + "equipo = '" + search + "' and not status = '" + "Entregado" + "' or "
                + "serial = '" + search + "' and not status = '" + "Entregado" + "' or "
                + "name_client = '" + search + "' and not status = '" + "Entregado" + "' or "
                + "unformat_identity_card_client = '" + search + "' and not status = '" + "Entregado" + "' or "
                + "direction_shop = '" + search + "' and not status = '" + "Entregado" + "' or "
                + "status = '" + search + "' and not status = '" + "Entregado" + "'";

            }

        } else {

            if (search.equals("")) {

                query = "select id_warranty, equipo, color, serial, name_client, identity_card_client, "
                + "status from warranty where direction_shop = '" + Login.direction + "' and not status = '" + "Entregado" + "'";

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

        } */
    }//GEN-LAST:event_jButton_Search_UserMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Search_User;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable_Warranty;
    private javax.swing.JTextField jTextField_Search_Warranty;
    // End of variables declaration//GEN-END:variables

    private void getInformationWarranty() {

        try {

            Connection cn = connection.connection();
            PreparedStatement pst = cn.prepareStatement(
                    "select w.id_warranty, e.brand, e.model, e.color, w.serial, w.falla, w.shop from warranty w join equipo e on "
                            + "w.id_equipo = e.id_equipo and w.id_technical = '" + Login.ID_User + "' and w.status = '" + 
                                    "En Revision" + "'");

            ResultSet rs = pst.executeQuery();

            jTable_Warranty = new JTable(model);
            jScrollPane.setViewportView(jTable_Warranty);

            model.addColumn("ID");
            model.addColumn("Equipo");
            model.addColumn("Módelo");
            model.addColumn("Color");
            model.addColumn("Serial");
            model.addColumn("Falla");
            model.addColumn("Tienda");

            while (rs.next()) {
                Object[] fila = new Object[7];
                for (int i = 0; i < 7; i++) {

                    fila[i] = rs.getObject(i + 1);

                }

                model.addRow(fila);
            }

            cn.close();

        } catch (SQLException e) {

            System.err.println("¡Error al vaciar la tabla de garantías! " + e);
            JOptionPane.showMessageDialog(null, "¡Error al vaciar la tabla de garantías!", "¡Error!", JOptionPane.OK_OPTION);

        }

    }

    private void EventTable() {

        jTable_Warranty.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {

                int fila_point = jTable_Warranty.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point >= -1) {

                    ID_Warranty = (int) jTable_Warranty.getValueAt(fila_point, columna_point);
                    
                    paneles.Panel_Review_Technical();

                }

            }
        }
        );

    }

}
