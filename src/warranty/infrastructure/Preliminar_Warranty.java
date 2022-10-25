package warranty.infrastructure;

import warranty.infrastructure.Warranty;
import login.Login;
import java.sql.*;
import clases.BD_Connection;
import clases.ReportsPDF;
import java.awt.Color;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import clases.Paneles;
import javax.swing.BorderFactory;

public class Preliminar_Warranty extends javax.swing.JPanel {
    
    BD_Connection connection = new BD_Connection();

    String status = "", status_technical = "", brand = "", model = "", color = "", serial = "", falla = "", date_register = "",
            received = "", comments_technical = "";

    int id_registered_by;

    public static int flag = 0;

    Paneles paneles = new Paneles();

    public Preliminar_Warranty() {
        initComponents();

        getInformationWarranty();

        ValidateButton();

        UpdateInformation();

        ValidateCamp();

        jButton_Save.setVisible(false);

        jTextArea_Recibido.setBorder(BorderFactory.createCompoundBorder(jTextArea_Recibido.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        jTextArea_Comments_Technical.setBorder(BorderFactory.createCompoundBorder(jTextArea_Comments_Technical.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_Sent = new javax.swing.JButton();
        jLabel_Recibido2 = new javax.swing.JLabel();
        jLabel_Falla2 = new javax.swing.JLabel();
        jLabel_Serial2 = new javax.swing.JLabel();
        jLabel_Equipo = new javax.swing.JLabel();
        jTextField_Equipo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel_Serial = new javax.swing.JLabel();
        jTextField_Serial = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel_Falla = new javax.swing.JLabel();
        jTextField_Falla = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jTextField_Calendar = new javax.swing.JTextField();
        jLabel_DatePurchase = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jTextField_Code1 = new javax.swing.JTextField();
        jLabel_Title = new javax.swing.JLabel();
        jLabel_Warranty = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Recibido = new javax.swing.JTextArea();
        jLabel_Recibido = new javax.swing.JLabel();
        jButton_Cancelar = new javax.swing.JButton();
        jButton_Dowload_Report = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_Comments_Technical = new javax.swing.JTextArea();
        jLabel_Recibido1 = new javax.swing.JLabel();
        jLabel_Status = new javax.swing.JLabel();
        jButton_Entregar = new javax.swing.JButton();
        jButton_Update_Information = new javax.swing.JButton();
        jButton_Save = new javax.swing.JButton();

        setBackground(new java.awt.Color(9, 53, 69));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_Sent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_Sent_Dark.png"))); // NOI18N
        jButton_Sent.setBorder(null);
        jButton_Sent.setBorderPainted(false);
        jButton_Sent.setContentAreaFilled(false);
        jButton_Sent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Sent.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_Sent_Ligth.png"))); // NOI18N
        jButton_Sent.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_Sent_Ligth.png"))); // NOI18N
        jButton_Sent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_SentMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_SentMousePressed(evt);
            }
        });
        jButton_Sent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SentActionPerformed(evt);
            }
        });
        add(jButton_Sent, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 150, 60));

        jLabel_Recibido2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel_Recibido2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Recibido2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Recibido2.setText("CAMPO REQUERIDO *");
        jLabel_Recibido2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel_Recibido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, 150, 20));

        jLabel_Falla2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel_Falla2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Falla2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Falla2.setText("CAMPO REQUERIDO *");
        jLabel_Falla2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel_Falla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 275, 150, 20));

        jLabel_Serial2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel_Serial2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Serial2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Serial2.setText("CAMPO REQUERIDO *");
        jLabel_Serial2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel_Serial2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 195, 150, 20));

        jLabel_Equipo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Equipo.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Equipo.setText("Equipo:");
        add(jLabel_Equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jTextField_Equipo.setEditable(false);
        jTextField_Equipo.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Equipo.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Equipo.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Equipo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Equipo.setBorder(null);
        add(jTextField_Equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 250, 20));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 250, -1));

        jLabel_Serial.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Serial.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Serial.setText("Serial:");
        add(jLabel_Serial, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

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
        jTextField_Serial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_SerialKeyReleased(evt);
            }
        });
        add(jTextField_Serial, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 150, 20));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 150, -1));

        jLabel_Falla.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Falla.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Falla.setText("Falla:");
        add(jLabel_Falla, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

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
        jTextField_Falla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_FallaKeyReleased(evt);
            }
        });
        add(jTextField_Falla, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 250, 20));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 250, -1));

        jTextField_Calendar.setEditable(false);
        jTextField_Calendar.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Calendar.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Calendar.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Calendar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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
        add(jTextField_Calendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 130, 20));

        jLabel_DatePurchase.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_DatePurchase.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_DatePurchase.setText("Fecha de entrada:");
        add(jLabel_DatePurchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, -1, -1));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, 130, -1));

        jTextField_Code1.setEditable(false);
        jTextField_Code1.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Code1.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Code1.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Code1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Code1.setBorder(null);
        add(jTextField_Code1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 150, 20));

        jLabel_Title.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        jLabel_Title.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Title.setText("Garantía - Cliente: ");
        add(jLabel_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 890, 30));

        jLabel_Warranty.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel_Warranty.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Warranty.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        add(jLabel_Warranty, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 450, 30));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setAlignmentX(10.0F);
        jScrollPane1.setAlignmentY(10.0F);
        jScrollPane1.setFocusable(false);

        jTextArea_Recibido.setEditable(false);
        jTextArea_Recibido.setBackground(new java.awt.Color(9, 53, 69));
        jTextArea_Recibido.setColumns(5);
        jTextArea_Recibido.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextArea_Recibido.setForeground(new java.awt.Color(240, 240, 240));
        jTextArea_Recibido.setLineWrap(true);
        jTextArea_Recibido.setRows(5);
        jTextArea_Recibido.setText("\n");
        jTextArea_Recibido.setWrapStyleWord(true);
        jTextArea_Recibido.setAutoscrolls(false);
        jTextArea_Recibido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        jTextArea_Recibido.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jTextArea_Recibido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextArea_RecibidoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea_Recibido);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 330, 125));

        jLabel_Recibido.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Recibido.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Recibido.setText("Se recibe con:");
        add(jLabel_Recibido, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 120, -1));

        jButton_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar btn dark.png"))); // NOI18N
        jButton_Cancelar.setBorder(null);
        jButton_Cancelar.setBorderPainted(false);
        jButton_Cancelar.setContentAreaFilled(false);
        jButton_Cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Cancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar btn ligth.png"))); // NOI18N
        jButton_Cancelar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar btn ligth.png"))); // NOI18N
        jButton_Cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_CancelarMousePressed(evt);
            }
        });
        jButton_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CancelarActionPerformed(evt);
            }
        });
        add(jButton_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 150, 60));

        jButton_Dowload_Report.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pdf_80px.png"))); // NOI18N
        jButton_Dowload_Report.setBorder(null);
        jButton_Dowload_Report.setBorderPainted(false);
        jButton_Dowload_Report.setContentAreaFilled(false);
        jButton_Dowload_Report.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Dowload_Report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_Dowload_ReportMousePressed(evt);
            }
        });
        add(jButton_Dowload_Report, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 325, 60, 80));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setFocusable(false);

        jTextArea_Comments_Technical.setEditable(false);
        jTextArea_Comments_Technical.setBackground(new java.awt.Color(9, 53, 69));
        jTextArea_Comments_Technical.setColumns(5);
        jTextArea_Comments_Technical.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextArea_Comments_Technical.setForeground(new java.awt.Color(240, 240, 240));
        jTextArea_Comments_Technical.setLineWrap(true);
        jTextArea_Comments_Technical.setRows(5);
        jTextArea_Comments_Technical.setText("\n");
        jTextArea_Comments_Technical.setWrapStyleWord(true);
        jTextArea_Comments_Technical.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        jScrollPane2.setViewportView(jTextArea_Comments_Technical);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 330, 125));

        jLabel_Recibido1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Recibido1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Recibido1.setText("Comentarios Técnicos:");
        add(jLabel_Recibido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 200, -1));

        jLabel_Status.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel_Status.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(jLabel_Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 380, 30));

        jButton_Entregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/entregar btn dark.png"))); // NOI18N
        jButton_Entregar.setBorder(null);
        jButton_Entregar.setBorderPainted(false);
        jButton_Entregar.setContentAreaFilled(false);
        jButton_Entregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Entregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/entregar btn ligth.png"))); // NOI18N
        jButton_Entregar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/entregar btn ligth.png"))); // NOI18N
        jButton_Entregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_EntregarMousePressed(evt);
            }
        });
        add(jButton_Entregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 150, 60));

        jButton_Update_Information.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/updateInformation_Dark.png"))); // NOI18N
        jButton_Update_Information.setBorder(null);
        jButton_Update_Information.setBorderPainted(false);
        jButton_Update_Information.setContentAreaFilled(false);
        jButton_Update_Information.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Update_Information.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uodateInfomatopn_Ligth.png"))); // NOI18N
        jButton_Update_Information.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uodateInfomatopn_Ligth.png"))); // NOI18N
        jButton_Update_Information.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_Update_InformationMousePressed(evt);
            }
        });
        add(jButton_Update_Information, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 150, 60));

        jButton_Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/saveInformation_Dark.png"))); // NOI18N
        jButton_Save.setBorder(null);
        jButton_Save.setBorderPainted(false);
        jButton_Save.setContentAreaFilled(false);
        jButton_Save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Save.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/saveInformation_Ligth.png"))); // NOI18N
        jButton_Save.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/saveInformation_Ligth.png"))); // NOI18N
        jButton_Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_SaveMousePressed(evt);
            }
        });
        add(jButton_Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 150, 60));
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

    private void jButton_SentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_SentMousePressed

        flag = 1;

        paneles.Panel_SentWarranty();


    }//GEN-LAST:event_jButton_SentMousePressed

    private void jButton_Dowload_ReportMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Dowload_ReportMousePressed

        String time = jLabel_Warranty.getText();

        if (time.equals("Este equipo no cumple con el tiempo de garantía...")) {

            time = "NO CUMPLE CON EL TIEMPO DE GARANTÍA.";

        } else {

            time = "CUMPLE CON EL TIEMPO DE GARANTÍA.";

        }

        JFileChooser fc = new JFileChooser();

        int seleccion = fc.showSaveDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {

            File fichero = fc.getSelectedFile();
            
            ReportsPDF reports = new ReportsPDF(fichero, Warranty.ID, brand, model, serial, received, falla, time, comments_technical, status_technical);
            Thread hilo = new Thread(reports);
            hilo.start();
            
            JOptionPane.showMessageDialog(null, "¡Se está generando el reporte!", "Por favor espere", JOptionPane.WARNING_MESSAGE);
            
        }

    }//GEN-LAST:event_jButton_Dowload_ReportMousePressed

    private void jButton_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_CancelarActionPerformed

    private void jButton_CancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_CancelarMousePressed

        try {

            Connection cn = connection.connection();
            PreparedStatement pst = cn.prepareStatement("select status from warranty where id_warranty = '" + Warranty.ID + "'");

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                String status = rs.getString("status");

                if (status.equals("Solicitud Enviada - En Espera")) {

                    cn.close();

                    try {

                        Connection cn2 = connection.connection();
                        PreparedStatement pst2 = cn2.prepareStatement(
                                "update warranty set status = ? where id_warranty = '" + Warranty.ID + "'");

                        pst2.setString(1, "Nuevo Ingreso");

                        pst2.executeUpdate();

                        JOptionPane.showMessageDialog(null, "Solicitud Cancelada Con Exito.");

                        cn2.close();

                        paneles.Panel_PreliminarWarranty();

                    } catch (SQLException e) {

                        System.err.println("¡Error al cancelar la solicitud! " + e);
                        JOptionPane.showMessageDialog(null, "¡Error al cancelar la solicitud!", "¡Error!",
                                JOptionPane.OK_OPTION);

                    }

                } else {

                    JOptionPane.showMessageDialog(null, "El equipo fue aceptado, llama al técnico para que devuelva el equipo",
                            "¡Acceso Denegado!", JOptionPane.OK_OPTION);

                    paneles.Panel_PreliminarWarranty();

                }

            }

            cn.close();

        } catch (SQLException e) {

            System.err.println("¡Error al consultar el estatus del equipo! " + e);
            JOptionPane.showMessageDialog(null, "¡Error al consultar el estatus del equipo!", "¡Error!",
                    JOptionPane.OK_OPTION);

        }

    }//GEN-LAST:event_jButton_CancelarMousePressed

    private void jButton_SentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_SentMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_SentMouseExited

    private void jButton_EntregarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_EntregarMousePressed

        try {

            Connection cn2 = connection.connection();
            PreparedStatement pst2 = cn2.prepareStatement(
                    "update warranty set status = ? where id_warranty = '" + Warranty.ID + "'");

            pst2.setString(1, "Entregado");

            pst2.executeUpdate();

            JOptionPane.showMessageDialog(null, "Equipo Entregado Con Exito.");

            cn2.close();

            paneles.PanelWarranty();

        } catch (SQLException e) {

            System.err.println("¡Error al entregar el equipo! " + e);
            JOptionPane.showMessageDialog(null, "¡Error al entregar el equipo", "¡Error!",
                    JOptionPane.OK_OPTION);

        }

    }//GEN-LAST:event_jButton_EntregarMousePressed

    private void jButton_SentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_SentActionPerformed

    private void jButton_Update_InformationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Update_InformationMousePressed

        jButton_Sent.setVisible(false);
        jButton_Cancelar.setVisible(false);
        jButton_Entregar.setVisible(false);
        jButton_Dowload_Report.setVisible(false);

        jButton_Update_Information.setVisible(false);

        jButton_Save.setVisible(true);

        jTextField_Serial.setEditable(true);
        jTextField_Falla.setEditable(true);
        jTextArea_Recibido.setEditable(true);

    }//GEN-LAST:event_jButton_Update_InformationMousePressed

    private void jButton_SaveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_SaveMousePressed

        try {

            Connection cn = connection.connection();
            PreparedStatement pst = cn.prepareStatement("update warranty set serial = ?, falla = ?, received = ? "
                    + "where id_warranty = '" + Warranty.ID + "'");

            pst.setString(1, jTextField_Serial.getText().trim());
            pst.setString(2, jTextField_Falla.getText().trim());
            pst.setString(3, jTextArea_Recibido.getText().trim());

            pst.executeUpdate();

            jButton_Save.setVisible(false);

            jTextField_Serial.setEditable(false);
            jTextField_Falla.setEditable(false);
            jTextArea_Recibido.setEditable(false);

            JOptionPane.showMessageDialog(null, "Modificación exitosa.");

            ValidateButton();

            jButton_Dowload_Report.setVisible(true);
            jButton_Update_Information.setVisible(true);

            cn.close();

        } catch (SQLException e) {

            System.err.println("¡Error al modificar la información de la garantía! " + e);
            JOptionPane.showMessageDialog(null, "¡Error al modificar la información de la garantía!", "¡Error!",
                    JOptionPane.OK_OPTION);

        }

    }//GEN-LAST:event_jButton_SaveMousePressed

    private void jTextField_SerialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_SerialKeyReleased

        ValidateCamp();

    }//GEN-LAST:event_jTextField_SerialKeyReleased

    private void jTextField_FallaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_FallaKeyReleased

        ValidateCamp();

    }//GEN-LAST:event_jTextField_FallaKeyReleased

    private void jTextArea_RecibidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea_RecibidoKeyReleased

        ValidateCamp();

    }//GEN-LAST:event_jTextArea_RecibidoKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Cancelar;
    private javax.swing.JButton jButton_Dowload_Report;
    private javax.swing.JButton jButton_Entregar;
    private javax.swing.JButton jButton_Save;
    private javax.swing.JButton jButton_Sent;
    private javax.swing.JButton jButton_Update_Information;
    private javax.swing.JLabel jLabel_DatePurchase;
    private javax.swing.JLabel jLabel_Equipo;
    private javax.swing.JLabel jLabel_Falla;
    private javax.swing.JLabel jLabel_Falla2;
    private javax.swing.JLabel jLabel_Recibido;
    private javax.swing.JLabel jLabel_Recibido1;
    private javax.swing.JLabel jLabel_Recibido2;
    private javax.swing.JLabel jLabel_Serial;
    private javax.swing.JLabel jLabel_Serial2;
    public static javax.swing.JLabel jLabel_Status;
    private javax.swing.JLabel jLabel_Title;
    public static javax.swing.JLabel jLabel_Warranty;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextArea jTextArea_Comments_Technical;
    private javax.swing.JTextArea jTextArea_Recibido;
    private javax.swing.JTextField jTextField_Calendar;
    private javax.swing.JTextField jTextField_Code1;
    private javax.swing.JTextField jTextField_Equipo;
    private javax.swing.JTextField jTextField_Falla;
    private javax.swing.JTextField jTextField_Serial;
    // End of variables declaration//GEN-END:variables

    private void getInformationWarranty() {

        try {

            Connection cn = connection.connection();
            PreparedStatement pst = cn.prepareStatement("select c.name_client, e.brand, e.model, e.color, w.serial, w.falla, w.date_register, w.received, w.comments_technical, "
                    + "w.status, w.status_technical, w.day_warranty, w.date_purchase, w.id_registered_by from warranty w join client c on w.id_client = c.id_client and w.id_warranty = '" + Warranty.ID + "' "
                    + "join equipo e on w.id_equipo = e.id_equipo and w.id_warranty = '" + Warranty.ID + "'");

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                brand = rs.getString("e.brand");
                model = rs.getString("e.model");
                color = rs.getString("e.color");
                serial = rs.getString("w.serial");
                falla = rs.getString("w.falla");
                date_register = rs.getString("w.date_register");
                received = rs.getString("w.received");
                comments_technical = rs.getString("w.comments_technical");
                status = rs.getString("w.status");
                status_technical = rs.getString("w.status_technical");
                id_registered_by = rs.getInt("id_registered_by");

                jLabel_Title.setText("Garantía - Cliente: " + rs.getString("c.name_client"));

                jTextField_Equipo.setText(brand + " - " + model + " - " + color);
                jTextField_Serial.setText(serial);
                jTextField_Falla.setText(falla);
                jTextField_Calendar.setText(date_register);
                jTextArea_Recibido.setText(received);
                jTextArea_Comments_Technical.setText(comments_technical);

                if (status_technical.equals("") || status_technical.equals("...")) {

                    jLabel_Status.setText(status);

                } else {

                    jLabel_Status.setText(status + " - " + status_technical);

                }

                int validate_int = rs.getInt("w.day_warranty");

                if (validate_int > 0) {

                    jLabel_Warranty.setText("El equipo tiene " + validate_int + " días de garantía...");

                } else {

                    jLabel_Warranty.setForeground(Color.red);
                    jLabel_Warranty.setText("Este equipo no cumple con el tiempo de garantía...");

                }

            }

            cn.close();

        } catch (SQLException e) {

            System.err.println("¡Error al consultar la información de la ganratía! " + e);
            JOptionPane.showMessageDialog(null, "¡Error al consultar la información de la ganratía!", "¡Error!",
                    JOptionPane.OK_OPTION);

        }

    }

    private void ValidateButton() {

        if (status.equals("Nuevo Ingreso") && Login.type_account.equals("Moderador")
                || status.equals("Nuevo Ingreso") && Login.type_account.equals("Administrador")
                || status.equals("Nuevo Ingreso") && id_registered_by == Login.ID_User) {

            jButton_Sent.setVisible(true);
            jButton_Cancelar.setVisible(false);
            jButton_Entregar.setVisible(false);

        } else if (status.equals("Solicitud Enviada - En Espera") && Login.type_account.equals("Moderador")
                || status.equals("Solicitud Enviada - En Espera") && Login.type_account.equals("Administrador")
                || status.equals("Solicitud Enviada - En Espera") && id_registered_by == Login.ID_User) {

            jButton_Sent.setVisible(false);
            jButton_Cancelar.setVisible(true);
            jButton_Entregar.setVisible(false);

        } else if (status.equals("En Revisión")) {

            jButton_Sent.setVisible(false);
            jButton_Cancelar.setVisible(false);
            jButton_Entregar.setVisible(false);

        } else if (status.equals("En Tienda") && status_technical.equals("Reparado") && Login.type_account.equals("Moderador")
                || status.equals("En Tienda") && status_technical.equals("Reparado") && Login.type_account.equals("Administrador")
                || status.equals("En Tienda") && status_technical.equals("Reparado") && id_registered_by == Login.ID_User
                || status.equals("En Tienda") && status_technical.equals("No Reparado") && Login.type_account.equals("Moderador")
                || status.equals("En Tienda") && status_technical.equals("No Reparado") && Login.type_account.equals("Administrador")
                || status.equals("En Tienda") && status_technical.equals("No Reparado") && id_registered_by == Login.ID_User) {

            jButton_Sent.setVisible(false);
            jButton_Cancelar.setVisible(false);
            jButton_Entregar.setVisible(true);

        } else {

            jButton_Sent.setVisible(false);
            jButton_Cancelar.setVisible(false);
            jButton_Entregar.setVisible(false);

        }

    }

    private void UpdateInformation() {

        if (Login.type_account.equals("Moderador") || Login.type_account.equals("Administrador")
                || id_registered_by == Login.ID_User) {

            jButton_Update_Information.setVisible(true);
            jButton_Save.setVisible(false);

        } else {

            jButton_Update_Information.setVisible(false);
            jButton_Save.setVisible(false);

        }

    }

    private void ValidateCamp() {

        if (jTextField_Serial.getText().isEmpty()) {

            jLabel_Serial2.setText("CAMPO REQUERIDO *");

        } else {

            jLabel_Serial2.setText("");

        }

        if (jTextField_Falla.getText().isEmpty()) {

            jLabel_Falla2.setText("CAMPO REQUERIDO *");

        } else {

            jLabel_Falla2.setText("");

        }

        if (jTextArea_Recibido.getText().isEmpty()) {

            jLabel_Recibido2.setText("CAMPO REQUERIDO *");

        } else {

            jLabel_Recibido2.setText("");

        }

        if (jTextField_Serial.getText().isEmpty() || jTextField_Falla.getText().isEmpty()
                || jTextArea_Recibido.getText().isEmpty()) {

            jButton_Save.setVisible(false);

        } else {

            jButton_Save.setVisible(true);

        }

    }

}
