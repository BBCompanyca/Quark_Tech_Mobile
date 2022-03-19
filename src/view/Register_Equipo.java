package view;

import clases.DateWarranty;
import clases.FormatText;


public class Register_Equipo extends javax.swing.JPanel {

    //Instancia para darle formato a los campos de texto.
    FormatText formattext = new FormatText();

    //Instancia para calcular los días de garantía de cada equipo...
    DateWarranty dateWarranty = new DateWarranty();

    public Register_Equipo() {
        initComponents();
        
        dateWarranty.ValidateDate(jTextField_DatePurchase);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel_Marca = new javax.swing.JLabel();
        jTextField_Marca = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField_Modelo = new javax.swing.JTextField();
        jLabel_Modelo = new javax.swing.JLabel();
        jTextField_Color = new javax.swing.JTextField();
        jLabel_Recibido = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jTextField_Serial = new javax.swing.JTextField();
        jLabel_DatePurchase = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jTextField_Falla = new javax.swing.JTextField();
        jLabel_Falla = new javax.swing.JLabel();
        jTextField_NumOrden = new javax.swing.JTextField();
        jLabel_NumeroDeOrden = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel_Color = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Recibido = new javax.swing.JTextArea();
        jLabel_garantia = new javax.swing.JLabel();
        jButton_Register = new javax.swing.JButton();
        jLabel_Serial = new javax.swing.JLabel();
        jTextField_DatePurchase = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(9, 53, 69));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Marca.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Marca.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Marca.setText("Marca:");
        add(jLabel_Marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 40, -1, -1));

        jTextField_Marca.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Marca.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Marca.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Marca.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Marca.setBorder(null);
        add(jTextField_Marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 70, 90, 20));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 90, 90, -1));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 90, -1));

        jTextField_Modelo.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Modelo.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Modelo.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Modelo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Modelo.setBorder(null);
        add(jTextField_Modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 90, 20));

        jLabel_Modelo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Modelo.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Modelo.setText("Modelo:");
        add(jLabel_Modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        jTextField_Color.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Color.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Color.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Color.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Color.setBorder(null);
        add(jTextField_Color, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 70, 90, 20));

        jLabel_Recibido.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Recibido.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Recibido.setText("Se recibe con:");
        add(jLabel_Recibido, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 120, 30));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 90, 90, -1));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 170, 150, -1));

        jTextField_Serial.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Serial.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Serial.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Serial.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Serial.setBorder(null);
        jTextField_Serial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_SerialActionPerformed(evt);
            }
        });
        add(jTextField_Serial, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 150, 150, 20));

        jLabel_DatePurchase.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_DatePurchase.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_DatePurchase.setText("Fecha de compra:");
        add(jLabel_DatePurchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, -1));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 330, 210, -1));

        jTextField_Falla.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Falla.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Falla.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Falla.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Falla.setBorder(null);
        jTextField_Falla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_FallaActionPerformed(evt);
            }
        });
        add(jTextField_Falla, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 310, 210, 20));

        jLabel_Falla.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Falla.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Falla.setText("Falla:");
        add(jLabel_Falla, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 280, -1, -1));

        jTextField_NumOrden.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_NumOrden.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_NumOrden.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_NumOrden.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_NumOrden.setBorder(null);
        add(jTextField_NumOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 120, 20));

        jLabel_NumeroDeOrden.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_NumeroDeOrden.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_NumeroDeOrden.setText("N° ORDEN:");
        add(jLabel_NumeroDeOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 120, -1));

        jLabel_Color.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Color.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Color.setText("Color:");
        add(jLabel_Color, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 40, -1, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea_Recibido.setBackground(new java.awt.Color(9, 53, 69));
        jTextArea_Recibido.setColumns(5);
        jTextArea_Recibido.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextArea_Recibido.setForeground(new java.awt.Color(240, 240, 240));
        jTextArea_Recibido.setRows(5);
        jTextArea_Recibido.setText("\n");
        jScrollPane1.setViewportView(jTextArea_Recibido);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 330, 130));

        jLabel_garantia.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel_garantia.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_garantia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(jLabel_garantia, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 332, 540, 30));

        jButton_Register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_register_dark.png"))); // NOI18N
        jButton_Register.setBorder(null);
        jButton_Register.setBorderPainted(false);
        jButton_Register.setContentAreaFilled(false);
        jButton_Register.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_register_ligth.png"))); // NOI18N
        jButton_Register.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_register_ligth.png"))); // NOI18N
        jButton_Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_RegisterMousePressed(evt);
            }
        });
        add(jButton_Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 190, 60));

        jLabel_Serial.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Serial.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Serial.setText("Serial:");
        add(jLabel_Serial, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 120, -1, -1));

        jTextField_DatePurchase.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_DatePurchase.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_DatePurchase.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_DatePurchase.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_DatePurchase.setBorder(null);
        jTextField_DatePurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_DatePurchaseActionPerformed(evt);
            }
        });
        add(jTextField_DatePurchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 150, 20));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 150, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_SerialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SerialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_SerialActionPerformed

    private void jTextField_FallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_FallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_FallaActionPerformed

    private void jButton_RegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RegisterMousePressed

    }//GEN-LAST:event_jButton_RegisterMousePressed

    private void jTextField_DatePurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_DatePurchaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_DatePurchaseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Register;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel_Color;
    private javax.swing.JLabel jLabel_DatePurchase;
    private javax.swing.JLabel jLabel_Falla;
    private javax.swing.JLabel jLabel_Marca;
    private javax.swing.JLabel jLabel_Modelo;
    private javax.swing.JLabel jLabel_NumeroDeOrden;
    private javax.swing.JLabel jLabel_Recibido;
    private javax.swing.JLabel jLabel_Serial;
    public static javax.swing.JLabel jLabel_garantia;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextArea jTextArea_Recibido;
    private javax.swing.JTextField jTextField_Color;
    private javax.swing.JTextField jTextField_DatePurchase;
    private javax.swing.JTextField jTextField_Falla;
    private javax.swing.JTextField jTextField_Marca;
    private javax.swing.JTextField jTextField_Modelo;
    private javax.swing.JTextField jTextField_NumOrden;
    private javax.swing.JTextField jTextField_Serial;
    // End of variables declaration//GEN-END:variables
}
