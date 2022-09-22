package view;

import clases.BD_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import clases.Paneles;
import clases.Register_Notification;
import javax.swing.BorderFactory;

public class Review_Technical extends javax.swing.JPanel {

    Paneles paneles = new Paneles();

    int registeredID, equipoID;
    private String message;

    public Review_Technical() {
        initComponents();

        getInformation();

        jTextArea_Coment_Technical.setBorder(BorderFactory.createCompoundBorder(jTextArea_Coment_Technical.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Equipo = new javax.swing.JLabel();
        jTextField_Equipo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel_Serial = new javax.swing.JLabel();
        jTextField_Serial = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel_Falla = new javax.swing.JLabel();
        jTextField_Falla = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel_Title = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_Coment_Technical = new javax.swing.JTextArea();
        jLabel_Recibido1 = new javax.swing.JLabel();
        jButton_Sent = new javax.swing.JButton();
        jButton_Guardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox_Status = new javax.swing.JComboBox<>();
        jTextField_Tienda = new javax.swing.JTextField();
        jLabel_Falla2 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(9, 53, 69));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Equipo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Equipo.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Equipo.setText("Equipo:");
        add(jLabel_Equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jTextField_Equipo.setEditable(false);
        jTextField_Equipo.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Equipo.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Equipo.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Equipo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Equipo.setBorder(null);
        add(jTextField_Equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 250, 20));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 250, -1));

        jLabel_Serial.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Serial.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Serial.setText("Serial:");
        add(jLabel_Serial, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

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
        add(jTextField_Serial, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 150, 20));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 150, -1));

        jLabel_Falla.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Falla.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Falla.setText("Falla:");
        add(jLabel_Falla, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

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
        add(jTextField_Falla, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 210, 20));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 210, -1));

        jLabel_Title.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        jLabel_Title.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Title.setText("Revisión De Equipo");
        add(jLabel_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 890, 30));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setFocusable(false);

        jTextArea_Coment_Technical.setBackground(new java.awt.Color(9, 53, 69));
        jTextArea_Coment_Technical.setColumns(5);
        jTextArea_Coment_Technical.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextArea_Coment_Technical.setForeground(new java.awt.Color(240, 240, 240));
        jTextArea_Coment_Technical.setLineWrap(true);
        jTextArea_Coment_Technical.setRows(5);
        jTextArea_Coment_Technical.setText("\n");
        jTextArea_Coment_Technical.setWrapStyleWord(true);
        jTextArea_Coment_Technical.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        jScrollPane2.setViewportView(jTextArea_Coment_Technical);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 330, 125));

        jLabel_Recibido1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Recibido1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Recibido1.setText("Comentarios Técnicos:");
        add(jLabel_Recibido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 200, -1));

        jButton_Sent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_Sent_Dark.png"))); // NOI18N
        jButton_Sent.setBorder(null);
        jButton_Sent.setBorderPainted(false);
        jButton_Sent.setContentAreaFilled(false);
        jButton_Sent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Sent.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_Sent_Ligth.png"))); // NOI18N
        jButton_Sent.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_Sent_Ligth.png"))); // NOI18N
        jButton_Sent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_SentMousePressed(evt);
            }
        });
        add(jButton_Sent, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 340, 150, 60));

        jButton_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save btn dark.png"))); // NOI18N
        jButton_Guardar.setBorder(null);
        jButton_Guardar.setBorderPainted(false);
        jButton_Guardar.setContentAreaFilled(false);
        jButton_Guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Guardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save btn ligth.png"))); // NOI18N
        jButton_Guardar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save btn ligth.png"))); // NOI18N
        jButton_Guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_GuardarMousePressed(evt);
            }
        });
        add(jButton_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 340, 150, 60));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Estatus:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, -1, -1));

        jComboBox_Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Reparado", "No Reparado" }));
        add(jComboBox_Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, -1, -1));

        jTextField_Tienda.setEditable(false);
        jTextField_Tienda.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Tienda.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Tienda.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Tienda.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Tienda.setBorder(null);
        jTextField_Tienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_TiendaActionPerformed(evt);
            }
        });
        add(jTextField_Tienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 210, 20));

        jLabel_Falla2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Falla2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Falla2.setText("Tienda:");
        add(jLabel_Falla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 210, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_SerialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SerialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_SerialActionPerformed

    private void jTextField_FallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_FallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_FallaActionPerformed

    private void jTextField_TiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_TiendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_TiendaActionPerformed

    private void jButton_GuardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_GuardarMousePressed

        UpdateInformation("Guardar");

        message = "ha agregado nuevos comentarios a tu equipo:";
        Register_Notification notification = new Register_Notification(registeredID, Warranty_Technical.ID_Warranty, equipoID, message);
        Thread hilo = new Thread(notification);
        hilo.start();

    }//GEN-LAST:event_jButton_GuardarMousePressed

    private void jButton_SentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_SentMousePressed

        String comments_technical, status_technical;

        comments_technical = jTextArea_Coment_Technical.getText();
        status_technical = jComboBox_Status.getSelectedItem().toString();

        if (comments_technical.equals("") || status_technical.equals("...")) {

            JOptionPane.showMessageDialog(null, "¡Debes llenar todos los campos!", "¡Acceso Denegado!", JOptionPane.OK_OPTION);

        } else {

            UpdateInformation("Enviar");

            message = "te ha enviado tu equipo:";
            Register_Notification notification = new Register_Notification(registeredID, Warranty_Technical.ID_Warranty, equipoID, message);
            Thread hilo = new Thread(notification);
            hilo.start();

        }

    }//GEN-LAST:event_jButton_SentMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Guardar;
    private javax.swing.JButton jButton_Sent;
    private javax.swing.JComboBox<String> jComboBox_Status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Equipo;
    private javax.swing.JLabel jLabel_Falla;
    private javax.swing.JLabel jLabel_Falla2;
    private javax.swing.JLabel jLabel_Recibido1;
    private javax.swing.JLabel jLabel_Serial;
    private javax.swing.JLabel jLabel_Title;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextArea jTextArea_Coment_Technical;
    private javax.swing.JTextField jTextField_Equipo;
    private javax.swing.JTextField jTextField_Falla;
    private javax.swing.JTextField jTextField_Serial;
    private javax.swing.JTextField jTextField_Tienda;
    // End of variables declaration//GEN-END:variables

    private void getInformation() {

        try {

            Connection cn = BD_Connection.connection();
            PreparedStatement pst = cn.prepareStatement(
                    "select w.id_warranty, e.brand, e.model, e.color, w.serial, w.falla, w.shop, w.comments_technical, "
                    + "w.status_technical, w.id_equipo, w.id_registered_by from warranty w join equipo e on w.id_warranty = '"
                    + Warranty_Technical.ID_Warranty + "' and w.id_equipo = e.id_equipo");

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                jTextField_Equipo.setText(rs.getString("e.brand") + " - " + rs.getString("e.model") + " - " + rs.getString("e.color"));
                jTextField_Serial.setText(rs.getString("w.serial"));
                jTextField_Falla.setText(rs.getString("w.falla"));
                jTextField_Tienda.setText(rs.getString("w.shop"));
                jTextArea_Coment_Technical.setText(rs.getString("w.comments_technical"));
                jComboBox_Status.setSelectedItem(rs.getString("w.status_technical"));

                equipoID = rs.getInt(10);
                registeredID = rs.getInt(11);

            }

            cn.close();

        } catch (SQLException e) {

            System.err.println("¡Error al consultar la infomración de la garantía! " + e);
            JOptionPane.showMessageDialog(null, "¡Error al consultar la infomración de la garantía!", "¡Error!",
                    JOptionPane.OK_OPTION);

        }

    }

    private void UpdateInformation(String Address) {

        if (Address.equals("Guardar")) {

            String comments_technical, status_technical;

            comments_technical = jTextArea_Coment_Technical.getText();
            status_technical = jComboBox_Status.getSelectedItem().toString();

            if (!comments_technical.equals("")) {

                try {

                    Connection cn = BD_Connection.connection();
                    PreparedStatement pst = cn.prepareStatement(
                            "update warranty set comments_technical = ?, status_technical = ? where "
                            + "id_warranty = '" + Warranty_Technical.ID_Warranty + "'");

                    pst.setString(1, comments_technical);
                    pst.setString(2, status_technical);

                    pst.executeUpdate();

                    cn.close();

                    JOptionPane.showMessageDialog(null, "¡Se a guardado la información con exito!", "¡Exito!", JOptionPane.INFORMATION_MESSAGE);

                    paneles.PanelWarrantyTechnical();

                } catch (SQLException e) {

                    System.err.println("¡Error al guardar la infomración de la garantía! " + e);
                    JOptionPane.showMessageDialog(null, "¡Error al guardar la infomración de la garantía!", "¡Error!",
                            JOptionPane.OK_OPTION);

                }

            } else {

                JOptionPane.showMessageDialog(null, "¡Debes llenar todos los campos!", "¡Acceso Denegado!",
                        JOptionPane.OK_OPTION);

            }

        } else {

            String comments_technical, status_technical;

            comments_technical = jTextArea_Coment_Technical.getText();
            status_technical = jComboBox_Status.getSelectedItem().toString();

            if (!comments_technical.equals("") || !status_technical.equals("...")) {

                try {

                    Connection cn = BD_Connection.connection();
                    PreparedStatement pst = cn.prepareStatement(
                            "update warranty set comments_technical = ?, status_technical = ? where "
                            + "id_warranty = '" + Warranty_Technical.ID_Warranty + "'");

                    pst.setString(1, comments_technical);
                    pst.setString(2, status_technical);

                    pst.executeUpdate();

                    cn.close();

                    paneles.Panel_SentWarranty_Technical();

                } catch (SQLException e) {

                    System.err.println("¡Error al guardar la información de la garantía! " + e);
                    JOptionPane.showMessageDialog(null, "¡Error al guardar la infomración de la garantía!", "¡Error!",
                            JOptionPane.OK_OPTION);

                }

            } else {

                JOptionPane.showMessageDialog(null, "¡Debes llenar todos los campos!", "¡Acceso Denegado!",
                        JOptionPane.OK_OPTION);

            }

        }

    }

}
