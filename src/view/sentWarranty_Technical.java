package view;

import clases.BD_Connection;
import clases.TextPrompt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import clases.Date;
import clases.Paneles;

public class sentWarranty_Technical extends javax.swing.JPanel {
    
    BD_Connection connection = new BD_Connection();

    Date date = new Date();

    Paneles paneles = new Paneles();

    public sentWarranty_Technical() {

        initComponents();

        TextPrompt delivery = new TextPrompt("Delivery", jTextField_Sent);

        getInformation();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Equipo = new javax.swing.JLabel();
        jLabel_Color = new javax.swing.JLabel();
        jLabel_Serial = new javax.swing.JLabel();
        jLabel_Falla = new javax.swing.JLabel();
        jTextField_Sent = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField_Date = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jTextField_Shop = new javax.swing.JTextField();
        jButton_Register = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel_Background = new javax.swing.JLabel();

        setBackground(new java.awt.Color(9, 53, 69));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Equipo.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel_Equipo.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Equipo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Equipo.setText("Equipo:");
        add(jLabel_Equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 250, -1));

        jLabel_Color.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel_Color.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Color.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Color.setText("Color: ");
        add(jLabel_Color, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 250, -1));

        jLabel_Serial.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel_Serial.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Serial.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Serial.setText("Serial: ");
        add(jLabel_Serial, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 250, -1));

        jLabel_Falla.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel_Falla.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Falla.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Falla.setText("Falla: ");
        add(jLabel_Falla, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 250, -1));

        jTextField_Sent.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Sent.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jTextField_Sent.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Sent.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Sent.setBorder(null);
        add(jTextField_Sent, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 220, 30));

        jSeparator1.setForeground(new java.awt.Color(240, 240, 240));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 220, 10));

        jTextField_Date.setEditable(false);
        jTextField_Date.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Date.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jTextField_Date.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Date.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Date.setBorder(null);
        add(jTextField_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 200, 30));

        jSeparator3.setForeground(new java.awt.Color(240, 240, 240));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 200, 10));

        jTextField_Shop.setEditable(false);
        jTextField_Shop.setBackground(new java.awt.Color(78, 109, 121));
        jTextField_Shop.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jTextField_Shop.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Shop.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Shop.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(jTextField_Shop, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 180, 190, 30));

        jButton_Register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_Sent_Dark.png"))); // NOI18N
        jButton_Register.setBorder(null);
        jButton_Register.setBorderPainted(false);
        jButton_Register.setContentAreaFilled(false);
        jButton_Register.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_Sent_Ligth.png"))); // NOI18N
        jButton_Register.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_Sent_Ligth.png"))); // NOI18N
        jButton_Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_RegisterMousePressed(evt);
            }
        });
        add(jButton_Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 150, 60));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back_arrow_24px.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/go_back_24px.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Envío De Equipo A Tienda");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 15, 600, 30));

        jLabel_Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rectangle 2.png"))); // NOI18N
        add(jLabel_Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 50, 630, 380));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_RegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RegisterMousePressed

        String delivery = jTextField_Sent.getText().trim();
        String shop = jTextField_Shop.getText().trim();

        if (!delivery.equals("")) {

            try {

                Connection cn = connection.connection();
                PreparedStatement pst = cn.prepareStatement(
                        "update warranty set delivery_shop = ?, date_sent_shop = ?, date_received_shop = ?, status = ? where id_warranty = '"
                        + Warranty_Technical.ID_Warranty + "'");

                pst.setString(1, delivery);
                pst.setString(2, date.DateToDay());
                pst.setString(3, date.DateToDay());
                pst.setString(4, "En Tienda");

                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Envio Exitoso.", "¡Exito!", JOptionPane.INFORMATION_MESSAGE);
                
                cn.close();
                
                paneles.PanelWarrantyTechnical();

            } catch (SQLException e) {

                System.err.println("¡Error al realizar envio! " + e);
                JOptionPane.showMessageDialog(null, "¡Error al realizar envío!", "¡Error!", JOptionPane.INFORMATION_MESSAGE);

            }

        } else {

            JOptionPane.showMessageDialog(null, "¡Debes registrar quien llevará el equipo!", "¡Acceso Denegado!",
                    JOptionPane.OK_OPTION);

        }

    }//GEN-LAST:event_jButton_RegisterMousePressed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed

        paneles.Panel_Review_Technical();

    }//GEN-LAST:event_jButton2MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_Register;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Background;
    private javax.swing.JLabel jLabel_Color;
    private javax.swing.JLabel jLabel_Equipo;
    private javax.swing.JLabel jLabel_Falla;
    private javax.swing.JLabel jLabel_Serial;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField_Date;
    private javax.swing.JTextField jTextField_Sent;
    private javax.swing.JTextField jTextField_Shop;
    // End of variables declaration//GEN-END:variables

    private void getInformation() {

        try {

            Connection cn = connection.connection();
            PreparedStatement pst = cn.prepareStatement(
                    "select w.id_warranty, e.brand, e.model, e.color, w.serial, w.falla, w.shop from warranty w join equipo e "
                    + "on w.id_warranty = '" + Warranty_Technical.ID_Warranty + "' and w.id_equipo = e.id_equipo");

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                jLabel_Equipo.setText("Equipo: " + rs.getString("e.brand") + " - " + rs.getString("e.model"));
                jLabel_Color.setText("Color: " + rs.getString("e.color"));
                jLabel_Serial.setText("Serial: " + rs.getString("w.serial"));
                jLabel_Falla.setText("Falla: " + rs.getString("w.falla"));
                jTextField_Shop.setText(rs.getString("w.shop"));
                jTextField_Date.setText(date.DateToDay());

            }

            cn.close();

        } catch (SQLException e) {

            System.err.println("¡Error al consultar la información de la garantía! " + e);
            JOptionPane.showMessageDialog(null, "¡Error al consultar la infomración de la garantía!", "¡Error!",
                    JOptionPane.OK_OPTION);

        }

    }

}
