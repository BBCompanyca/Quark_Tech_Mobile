package view;

import java.sql.*;
import clases.BD_Connection;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Preliminar_Warranty extends javax.swing.JPanel {

    public Preliminar_Warranty() {
        initComponents();

        getInformationWarranty();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Code = new javax.swing.JLabel();
        jTextField_Code = new javax.swing.JTextField();
        jLabel_Equipo = new javax.swing.JLabel();
        jTextField_Equipo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel_Serial = new javax.swing.JLabel();
        jTextField_Serial = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel_Falla = new javax.swing.JLabel();
        jTextField_Falla = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel_NumeroDeOrden = new javax.swing.JLabel();
        jTextField_NumOrden = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jTextField_Calendar = new javax.swing.JTextField();
        jLabel_DatePurchase = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jTextField_Code1 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel_Title = new javax.swing.JLabel();
        jLabel_Status = new javax.swing.JLabel();
        jLabel_Warranty = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Recibido = new javax.swing.JTextArea();
        jLabel_Recibido = new javax.swing.JLabel();
        jButton_Register = new javax.swing.JButton();
        jButton_Register1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(9, 53, 69));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Code.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Code.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Code.setText("Código:");
        add(jLabel_Code, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jTextField_Code.setEditable(false);
        jTextField_Code.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Code.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Code.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Code.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Code.setBorder(null);
        add(jTextField_Code, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 150, 20));

        jLabel_Equipo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Equipo.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Equipo.setText("Equipo:");
        add(jLabel_Equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jTextField_Equipo.setEditable(false);
        jTextField_Equipo.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Equipo.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Equipo.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Equipo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Equipo.setBorder(null);
        add(jTextField_Equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 250, 20));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 250, -1));

        jLabel_Serial.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Serial.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Serial.setText("Serial:");
        add(jLabel_Serial, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jTextField_Serial.setEditable(false);
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
        add(jTextField_Serial, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 150, 20));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 150, -1));

        jLabel_Falla.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Falla.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Falla.setText("Falla:");
        add(jLabel_Falla, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jTextField_Falla.setEditable(false);
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
        add(jTextField_Falla, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 210, 20));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 210, -1));

        jLabel_NumeroDeOrden.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_NumeroDeOrden.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_NumeroDeOrden.setText("N° ORDEN:");
        add(jLabel_NumeroDeOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));

        jTextField_NumOrden.setEditable(false);
        jTextField_NumOrden.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_NumOrden.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_NumOrden.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_NumOrden.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_NumOrden.setBorder(null);
        add(jTextField_NumOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 120, 20));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 120, -1));

        jTextField_Calendar.setEditable(false);
        jTextField_Calendar.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Calendar.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Calendar.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Calendar.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Calendar.setBorder(null);
        jTextField_Calendar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_CalendarFocusGained(evt);
            }
        });
        jTextField_Calendar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_CalendarKeyTyped(evt);
            }
        });
        add(jTextField_Calendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 130, 20));

        jLabel_DatePurchase.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_DatePurchase.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_DatePurchase.setText("Fecha de entrada:");
        add(jLabel_DatePurchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, -1, -1));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 130, -1));

        jTextField_Code1.setEditable(false);
        jTextField_Code1.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Code1.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Code1.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Code1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Code1.setBorder(null);
        add(jTextField_Code1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 150, 20));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 150, -1));

        jLabel_Title.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel_Title.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Title.setText("Garantía - Cliente: ");
        add(jLabel_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 790, 30));

        jLabel_Status.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel_Status.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Status.setText("Nuevo Ingreso");
        add(jLabel_Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 335, 300, 30));

        jLabel_Warranty.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel_Warranty.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Warranty.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Warranty.setText("Este equipo no cumple con el tiempo de garantía.");
        add(jLabel_Warranty, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 335, 450, 30));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea_Recibido.setEditable(false);
        jTextArea_Recibido.setBackground(new java.awt.Color(9, 53, 69));
        jTextArea_Recibido.setColumns(5);
        jTextArea_Recibido.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextArea_Recibido.setForeground(new java.awt.Color(240, 240, 240));
        jTextArea_Recibido.setRows(5);
        jTextArea_Recibido.setText("\n");
        jScrollPane1.setViewportView(jTextArea_Recibido);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 330, 100));

        jLabel_Recibido.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Recibido.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Recibido.setText("Se recibe con:");
        add(jLabel_Recibido, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 120, 30));

        jButton_Register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_Sent_Dark.png"))); // NOI18N
        jButton_Register.setBorder(null);
        jButton_Register.setBorderPainted(false);
        jButton_Register.setContentAreaFilled(false);
        jButton_Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_RegisterMousePressed(evt);
            }
        });
        add(jButton_Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 150, 60));

        jButton_Register1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_Report_Dark.png"))); // NOI18N
        jButton_Register1.setBorder(null);
        jButton_Register1.setBorderPainted(false);
        jButton_Register1.setContentAreaFilled(false);
        jButton_Register1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_Register1MousePressed(evt);
            }
        });
        add(jButton_Register1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 150, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_SerialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SerialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_SerialActionPerformed

    private void jTextField_FallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_FallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_FallaActionPerformed

    private void jTextField_CalendarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_CalendarFocusGained

    }//GEN-LAST:event_jTextField_CalendarFocusGained

    private void jTextField_CalendarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_CalendarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CalendarKeyTyped

    private void jButton_RegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RegisterMousePressed

    }//GEN-LAST:event_jButton_RegisterMousePressed

    private void jButton_Register1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Register1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Register1MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Register;
    private javax.swing.JButton jButton_Register1;
    private javax.swing.JLabel jLabel_Code;
    private javax.swing.JLabel jLabel_DatePurchase;
    private javax.swing.JLabel jLabel_Equipo;
    private javax.swing.JLabel jLabel_Falla;
    private javax.swing.JLabel jLabel_NumeroDeOrden;
    private javax.swing.JLabel jLabel_Recibido;
    private javax.swing.JLabel jLabel_Serial;
    public static javax.swing.JLabel jLabel_Status;
    private javax.swing.JLabel jLabel_Title;
    public static javax.swing.JLabel jLabel_Warranty;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextArea jTextArea_Recibido;
    private javax.swing.JTextField jTextField_Calendar;
    private javax.swing.JTextField jTextField_Code;
    private javax.swing.JTextField jTextField_Code1;
    private javax.swing.JTextField jTextField_Equipo;
    private javax.swing.JTextField jTextField_Falla;
    private javax.swing.JTextField jTextField_NumOrden;
    private javax.swing.JTextField jTextField_Serial;
    // End of variables declaration//GEN-END:variables

    private void getInformationWarranty() {

        try {

            Connection cn = BD_Connection.connection();
            PreparedStatement pst = cn.prepareStatement(
                    "select code, equipo, serial, falla, num_order, name_client, received, date_register, "
                    + "day_warranty, status from warranty where id_warranty = '" + Warranty.ID + "'");

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                jLabel_Title.setText("Garantía - Cliente: " + rs.getString("name_client"));

                jTextField_Code.setText(rs.getString("code"));
                jTextField_Equipo.setText(rs.getString("equipo"));
                jTextField_Serial.setText(rs.getString("serial"));
                jTextField_Falla.setText(rs.getString("falla"));
                jTextField_NumOrden.setText(rs.getString("num_order"));
                jTextField_Calendar.setText(rs.getString("date_register"));
                jTextArea_Recibido.setText(rs.getString("received"));
                jLabel_Status.setText(rs.getString("status"));
                
                int validate_int = rs.getInt("day_warranty");

                if (validate_int > 0) {

                    jLabel_Warranty.setText("El equipo tiene " + validate_int + " días de ganratía...");

                } else {

                    jLabel_Warranty.setForeground(Color.red);
                    jLabel_Warranty.setText("Este equipo no cumple con el tiempo de garantía...");

                }

            }

            cn.close();

        } catch (SQLException e) {

            System.err.println("¡Error al consultar la información de la ganratía!");
            JOptionPane.showMessageDialog(null, "¡Error al consultar la información de la ganratía!", "¡Error!",
                    JOptionPane.OK_OPTION);

        }

    }

}
