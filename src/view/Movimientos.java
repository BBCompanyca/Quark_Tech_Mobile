package view;

import java.awt.event.KeyEvent;
import clases.Search;
import clases.TextPrompt;
import javax.swing.JTextField;

public class Movimientos extends javax.swing.JPanel {

    Search searchMovimientos = new Search();

    public Movimientos() {
        initComponents();

        validateTypeAccount();

        TextPrompt search = new TextPrompt("Ingrese algún nombre de usuario...", jTextField_Search_Movimiento);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField_Search_Movimiento = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jDateChooser_Hasta = new com.toedter.calendar.JDateChooser();
        jDateChooser_Desde = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane_M = new javax.swing.JScrollPane();
        jTable_Movimientos = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(9, 53, 69));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Hasta:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, 90, -1));

        jTextField_Search_Movimiento.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Search_Movimiento.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextField_Search_Movimiento.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Search_Movimiento.setBorder(null);
        jTextField_Search_Movimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField_Search_MovimientoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextField_Search_MovimientoMouseReleased(evt);
            }
        });
        jTextField_Search_Movimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Search_MovimientoActionPerformed(evt);
            }
        });
        jTextField_Search_Movimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_Search_MovimientoKeyPressed(evt);
            }
        });
        add(jTextField_Search_Movimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 520, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 520, 10));

        jDateChooser_Hasta.setDateFormatString("yyyy-MM-dd");
        add(jDateChooser_Hasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 50, 140, -1));

        jDateChooser_Desde.setDateFormatString("yyyy-MM-dd");
        add(jDateChooser_Desde, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 140, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Movimientos");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 140, 30));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Desde:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 90, -1));

        jTable_Movimientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Operación", "Fecha", "Usuario", "Referencia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane_M.setViewportView(jTable_Movimientos);

        add(jScrollPane_M, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 810, 240));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Caricuao", "Almacen", "City Market" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, 110, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("[Eliminación De Cliente | \"E/C\"]");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 430, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("[Registo De Cliente | \"R/C\"]");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 390, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("[Eliminación De Usuario | \"E/U\"]");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 430, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("[Registo De Usuario | \"R/U\"]");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 390, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("[Registo De Equipo | \"R/E\"]");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 390, 160, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("[Eliminación De Equipo | \"E/E\"]");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 430, -1, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("[Registo De Garantía | \"R/G\"]");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText("[Modificación De Usuario | \"M/U\"]");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 410, -1, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("[Modificación De Cliente | \"M/C\"]");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 410, -1, -1));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setText("[Modificación De Equipo | \"M/E\"]");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 410, -1, -1));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setText("[Modificación De Garantía | \"M/G\"]");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, -1, -1));

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("[Eliminación De Garantía | \"E/G\"]");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(240, 240, 240));
        jSeparator2.setForeground(new java.awt.Color(240, 240, 240));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 380, 10, 80));

        jSeparator3.setBackground(new java.awt.Color(240, 240, 240));
        jSeparator3.setForeground(new java.awt.Color(240, 240, 240));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 380, 10, 80));

        jSeparator4.setBackground(new java.awt.Color(240, 240, 240));
        jSeparator4.setForeground(new java.awt.Color(240, 240, 240));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 380, 10, 80));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_Search_MovimientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_Search_MovimientoMousePressed

    }//GEN-LAST:event_jTextField_Search_MovimientoMousePressed

    private void jTextField_Search_MovimientoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_Search_MovimientoMouseReleased
        //nothing
    }//GEN-LAST:event_jTextField_Search_MovimientoMouseReleased

    private void jTextField_Search_MovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Search_MovimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Search_MovimientoActionPerformed

    private void jTextField_Search_MovimientoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Search_MovimientoKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            String desde = ((JTextField) jDateChooser_Desde.getDateEditor().getUiComponent()).getText();
            String hasta = ((JTextField) jDateChooser_Hasta.getDateEditor().getUiComponent()).getText();

            String search = jTextField_Search_Movimiento.getText().trim();
            String shop = jComboBox1.getSelectedItem().toString();

            searchMovimientos.SearchMovimiento(search, shop, desde, hasta);
            jTextField_Search_Movimiento.setText("");

            jTextField_Search_Movimiento.requestFocus();

        }

    }//GEN-LAST:event_jTextField_Search_MovimientoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser_Desde;
    private com.toedter.calendar.JDateChooser jDateChooser_Hasta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JScrollPane jScrollPane_M;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    public static javax.swing.JTable jTable_Movimientos;
    private javax.swing.JTextField jTextField_Search_Movimiento;
    // End of variables declaration//GEN-END:variables

    private void validateTypeAccount() {

        if (!Login.type_account.equals("Moderador")) {

            jComboBox1.setVisible(false);

        }

    }

}
