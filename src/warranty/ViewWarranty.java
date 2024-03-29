package warranty;

import login.Login;
import java.sql.*;
import OtherClass.BD_Connection;
import OtherClass.TextPrompt;
import OtherClass.Paneles;
import moviments.Register_Movimiento;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import history.FilterRequestHistory;

public final class ViewWarranty extends javax.swing.JPanel {

    BD_Connection connection = new BD_Connection();

    public static int ID;
    private static DefaultTableModel model;
    String direction, type_Account, permission;
    Paneles paneles = new Paneles();

    public ViewWarranty() {
        initComponents();

        direction = Login.direction;
        type_Account = Login.type_account;

        //Objeto para el PlayHolders del jTextField buscar usuarios...
        TextPrompt search_user = new TextPrompt("Ingrese algún parametro", jTextField_Search_Warranty);

        getWarranty();
        validateButton();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField_Search_Warranty = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton_Delete_User = new javax.swing.JButton();
        jScrollPane_W = new javax.swing.JScrollPane();
        jTable_Warranty = new javax.swing.JTable();
        jButton_Search_User = new javax.swing.JButton();
        jButton_New_User = new javax.swing.JButton();
        jButton_Preliminar_Warranty = new javax.swing.JButton();

        setBackground(new java.awt.Color(9, 53, 69));
        setPreferredSize(new java.awt.Dimension(790, 370));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 700, 10));

        jButton_Delete_User.setText("BORRAR");
        jButton_Delete_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_Delete_UserMousePressed(evt);
            }
        });
        add(jButton_Delete_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 380, 100, 35));

        jScrollPane_W.setBackground(new java.awt.Color(9, 53, 69));
        jScrollPane_W.setBorder(null);
        jScrollPane_W.setForeground(new java.awt.Color(240, 240, 240));

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
                "ID", "Nombre", "Nombre De Usuario", "Dirección", "Permisos De", "Estatus"
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
        jScrollPane_W.setViewportView(jTable_Warranty);
        if (jTable_Warranty.getColumnModel().getColumnCount() > 0) {
            jTable_Warranty.getColumnModel().getColumn(0).setResizable(false);
            jTable_Warranty.getColumnModel().getColumn(1).setResizable(false);
            jTable_Warranty.getColumnModel().getColumn(2).setResizable(false);
            jTable_Warranty.getColumnModel().getColumn(3).setResizable(false);
            jTable_Warranty.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane_W, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 890, 270));

        jButton_Search_User.setText("Buscar");
        jButton_Search_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_Search_UserMousePressed(evt);
            }
        });
        add(jButton_Search_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, 80, 30));

        jButton_New_User.setText("NUEVO");
        jButton_New_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_New_UserMousePressed(evt);
            }
        });
        jButton_New_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_New_UserActionPerformed(evt);
            }
        });
        add(jButton_New_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 100, 35));

        jButton_Preliminar_Warranty.setText("PRELIMINAR");
        jButton_Preliminar_Warranty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_Preliminar_WarrantyMousePressed(evt);
            }
        });
        jButton_Preliminar_Warranty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Preliminar_WarrantyActionPerformed(evt);
            }
        });
        add(jButton_Preliminar_Warranty, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, 100, 35));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_Search_WarrantyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_Search_WarrantyMousePressed

    }//GEN-LAST:event_jTextField_Search_WarrantyMousePressed

    private void jTextField_Search_WarrantyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_Search_WarrantyMouseReleased
        //nothing
    }//GEN-LAST:event_jTextField_Search_WarrantyMouseReleased

    private void jTextField_Search_WarrantyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Search_WarrantyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Search_WarrantyActionPerformed

    private void jButton_Search_UserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Search_UserMousePressed

        String search = jTextField_Search_Warranty.getText().trim();
        FilterRequestWarranty filterRequestWarranty = new FilterRequestWarranty();
        filterRequestWarranty.filterRequestWarranty(search);
        jTextField_Search_Warranty.setText("");

    }//GEN-LAST:event_jButton_Search_UserMousePressed

    private void jTextField_Search_WarrantyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Search_WarrantyKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            String search = jTextField_Search_Warranty.getText().trim();
            FilterRequestWarranty filterRequestWarranty = new FilterRequestWarranty();
            filterRequestWarranty.filterRequestWarranty(search);
            jTextField_Search_Warranty.setText("");

        }

    }//GEN-LAST:event_jTextField_Search_WarrantyKeyPressed

    private void jButton_New_UserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_New_UserMousePressed

        paneles.PanelConsulCient();

    }//GEN-LAST:event_jButton_New_UserMousePressed

    private void jButton_New_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_New_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_New_UserActionPerformed

    private void jButton_Preliminar_WarrantyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Preliminar_WarrantyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Preliminar_WarrantyActionPerformed

    private void jButton_Preliminar_WarrantyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Preliminar_WarrantyMousePressed

        int fila_point = jTable_Warranty.getSelectedRow();
        int columna_punt = 0;

        if (fila_point > -1) {

            ID = (int) model.getValueAt(fila_point, columna_punt);

            paneles.Panel_PreliminarWarranty();

        } else {

            JOptionPane.showMessageDialog(null, "¡Debes seleccionar un registro!", "¡Acceso Denegado!",
                    JOptionPane.OK_OPTION);

        }

    }//GEN-LAST:event_jButton_Preliminar_WarrantyMousePressed

    private void jButton_Delete_UserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Delete_UserMousePressed

        int fila_point = jTable_Warranty.getSelectedRow();
        int columna_point = 0;
        String serial;

        if (fila_point > -1) {

            ID = (int) getInstanceWarranty().getValueAt(fila_point, columna_point);
            serial = (String) getInstanceWarranty().getValueAt(fila_point, 3);

            int value = JOptionPane.showConfirmDialog(null, "¿Desea eliminar esta Garantía?", "¡Selección!",
                    JOptionPane.YES_NO_OPTION);

            if (value == 0) {

                try {

                    Connection cn = connection.connection();
                    PreparedStatement pst = cn.prepareStatement(
                            "delete from warranty where id_warranty = '" + ID + "'");

                    pst.executeUpdate();

                    Register_Movimiento register_Movimiento = new Register_Movimiento(Login.ID_User, "E/G", serial, Login.direction);
                    Thread hilo = new Thread(register_Movimiento);
                    hilo.start();

                    getInstanceWarranty().removeRow(fila_point);

                    JOptionPane.showMessageDialog(null, "Garantía eliminada.");

                    cn.close();

                } catch (SQLException e) {

                    System.err.println("¡Error al eliminar el cliente! " + e);
                    JOptionPane.showMessageDialog(null, "¡Error al eliminar el cliente!", "¡Error!",
                            JOptionPane.OK_OPTION);

                }

            }

        } else {

            JOptionPane.showMessageDialog(null, "¡Debes seleccionar una garantía!", "¡Acceso Denegado!",
                    JOptionPane.OK_OPTION);

        }

    }//GEN-LAST:event_jButton_Delete_UserMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Delete_User;
    private javax.swing.JButton jButton_New_User;
    private javax.swing.JButton jButton_Preliminar_Warranty;
    private javax.swing.JButton jButton_Search_User;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JScrollPane jScrollPane_W;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTable jTable_Warranty;
    public static javax.swing.JTextField jTextField_Search_Warranty;
    // End of variables declaration//GEN-END:variables

    private void getWarranty() {

        String query;

        if (Login.type_account.equals("Moderador")) {

            query = "select w.id_warranty, e.brand, e.model, w.serial, c.name_client, c.identity_card_client, w.shop "
                    + "from warranty w "
                    + "join equipo e on e.id_equipo = w.id_equipo "
                    + "join client c on c.id_client = w.id_client "
                    + "and not w.status = '" + "Entregado" + "' and not w.status_technical = '" + "Reemplazado" + "'";

        } else {

            query = "select w.id_warranty, e.brand, e.model, w.serial, c.name_client, c.identity_card_client, w.status "
                    + "from warranty w "
                    + "join equipo e on e.id_equipo = w.id_equipo "
                    + "join client c on c.id_client = w.id_client "
                    + "and not w.status = '" + "Entregado" + "' and not w.status_technical = '" + "Reemplazado"
                    + "' and w.shop = '" + Login.direction + "'";

        }

        try {

            Connection cn = connection.connection();
            PreparedStatement pst = cn.prepareStatement(query);

            ResultSet rs = pst.executeQuery();

            jTable_Warranty = new JTable(getInstanceWarranty());
            jScrollPane_W.setViewportView(jTable_Warranty);
            
            getInstanceWarranty().setColumnCount(0);
            getInstanceWarranty().setRowCount(0);

            if (Login.type_account.equals("Moderador")) {

                getInstanceWarranty().addColumn("ID");
                getInstanceWarranty().addColumn("Marca");
                getInstanceWarranty().addColumn("Módelo");
                getInstanceWarranty().addColumn("Serial");
                getInstanceWarranty().addColumn("Cliente");
                getInstanceWarranty().addColumn("Rif");
                getInstanceWarranty().addColumn("Tienda");

                while (rs.next()) {

                    Object[] fila = new Object[7];
                    for (int i = 0; i < 7; i++) {

                        fila[i] = rs.getObject(i + 1);

                    }

                    getInstanceWarranty().addRow(fila);

                }

            } else {

                getInstanceWarranty().addColumn("ID");
                getInstanceWarranty().addColumn("Marca");
                getInstanceWarranty().addColumn("Módelo");
                getInstanceWarranty().addColumn("Serial");
                getInstanceWarranty().addColumn("Cliente");
                getInstanceWarranty().addColumn("Rif");
                getInstanceWarranty().addColumn("Estatus");

                while (rs.next()) {

                    Object[] fila = new Object[7];
                    for (int i = 0; i < 7; i++) {

                        fila[i] = rs.getObject(i + 1);

                    }

                    getInstanceWarranty().addRow(fila);

                }

            }

            cn.close();

        } catch (SQLException e) {

            System.err.println("¡Error al vaciar la tabla de garantías! " + e);
            JOptionPane.showMessageDialog(null, "¡Error al vaciar la tabla de garantías!", "¡Error!",
                    JOptionPane.OK_CANCEL_OPTION);

        }

    }

    private void validateButton() {

        if (!Login.type_account.equals("Moderador") && !Login.type_account.equals("Administrador")) {

            jButton_Delete_User.setVisible(false);
            add(jButton_Preliminar_Warranty, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 380, 100, 35));
            add(jButton_New_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, 100, 35));

        }

    }

    public static DefaultTableModel getInstanceWarranty() {

        if (model == null) {
            model = new DefaultTableModel();
        }

        return model;

    }
}
