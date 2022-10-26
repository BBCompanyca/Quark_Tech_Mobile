package warranty.infrastructure;

import warranty.infrastructure.Warranty;
import OtherClass.BD_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import OtherClass.TextPrompt;
import OtherClass.Date;
import OtherClass.Paneles;
import view.Table_Technical;

public class SentWarranty extends javax.swing.JPanel {
    
    BD_Connection connection = new BD_Connection();

    Paneles paneles = new Paneles();

    Date date = new Date();

    public static String sent = "";

    public SentWarranty() {
        initComponents();

        getInformationWarranty();

        ValidateAddress();

        TextPrompt sent = new TextPrompt("Delivery", jTextField_Sent);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel_Color = new javax.swing.JLabel();
        jLabel_Equipo = new javax.swing.JLabel();
        jLabel_Falla = new javax.swing.JLabel();
        jLabel_Serial = new javax.swing.JLabel();
        jTextField_Sent = new javax.swing.JTextField();
        jTextField_Date = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jTextField_Technical = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton_Register = new javax.swing.JButton();
        jLabel_Background = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(9, 53, 69));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Envío De Equipo A Servicio Técnico");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 15, 600, 30));

        jSeparator1.setForeground(new java.awt.Color(240, 240, 240));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 220, 10));

        jLabel_Color.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel_Color.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Color.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Color.setText("Color: ");
        add(jLabel_Color, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 250, -1));

        jLabel_Equipo.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel_Equipo.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Equipo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Equipo.setText("Equipo:");
        add(jLabel_Equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 250, -1));

        jLabel_Falla.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel_Falla.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Falla.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Falla.setText("Falla: ");
        add(jLabel_Falla, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 250, -1));

        jLabel_Serial.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel_Serial.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Serial.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Serial.setText("Serial: ");
        add(jLabel_Serial, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 250, -1));

        jTextField_Sent.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Sent.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jTextField_Sent.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Sent.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Sent.setBorder(null);
        add(jTextField_Sent, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 220, 30));

        jTextField_Date.setEditable(false);
        jTextField_Date.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Date.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jTextField_Date.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Date.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Date.setBorder(null);
        add(jTextField_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 200, 30));

        jSeparator3.setForeground(new java.awt.Color(240, 240, 240));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 200, 10));

        jTextField_Technical.setBackground(new java.awt.Color(78, 109, 121));
        jTextField_Technical.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jTextField_Technical.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Technical.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Technical.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(jTextField_Technical, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 190, 30));

        jButton1.setFocusPainted(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 176, 35, 35));

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

        jLabel_Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rectangle 2.png"))); // NOI18N
        add(jLabel_Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 50, 630, 380));

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
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_RegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RegisterMousePressed

        int flag = 0;

        sent = jTextField_Sent.getText().trim();
        String technical = jTextField_Technical.getText().trim();

        if (sent.equals("")) {

            flag = 1;

        }

        if (technical.equals("")) {

            flag = 2;

        }

        if (flag == 0) {

            try {

                Connection cn = connection.connection();
                PreparedStatement pst = cn.prepareStatement(
                        "update warranty set id_technical = ?, date_sent_technical = ?, delivery_technical = ?, status = ? where id_warranty = '" + Warranty.ID + "'");

                pst.setInt(1, Table_Technical.ID_Technical);
                pst.setString(2, date.DateToDay());
                pst.setString(3, sent);
                pst.setString(4, "Solicitud Enviada - En Espera");

                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Envío Exitoso.");

                paneles.Panel_PreliminarWarranty();

            } catch (SQLException e) {

                System.err.println("¡Error al enviar a equipo! " + e);
                JOptionPane.showMessageDialog(null, "¡Error al enviar a equipo!", "¡Error!",
                        JOptionPane.OK_OPTION);

            }

        } else if (flag == 1) {

            JOptionPane.showMessageDialog(null, "¡Debes describir a quien lleva el equipo!", "¡Acceso Denegado!",
                    JOptionPane.OK_OPTION);

        } else if (flag == 2) {

            JOptionPane.showMessageDialog(null, "¡Debes seleccionar un técnico", "¡Acceso Denegado!",
                    JOptionPane.OK_OPTION);

        }


    }//GEN-LAST:event_jButton_RegisterMousePressed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed

        Preliminar_Warranty.flag = 2;
        
        sent = jTextField_Sent.getText().trim();
        
        paneles.Panel_Table_Technical();

    }//GEN-LAST:event_jButton1MousePressed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed

        Preliminar_Warranty.flag = 0;

        paneles.Panel_PreliminarWarranty();

    }//GEN-LAST:event_jButton2MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
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
    private javax.swing.JTextField jTextField_Technical;
    // End of variables declaration//GEN-END:variables

    private void getInformationWarranty() {

        try {

            Connection cn = connection.connection();
            PreparedStatement pst = cn.prepareStatement(
                    "select e.brand, e.model, e.color, w.serial, w.falla from warranty w join equipo e on w.id_equipo = e.id_equipo and "
                            + "w.id_warranty = '" + Warranty.ID + "'");

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                jLabel_Equipo.setText("Equipo: " + rs.getString("e.brand") + " - " + rs.getString("e.model"));
                jLabel_Color.setText("Color: " + rs.getString("e.color"));
                jLabel_Serial.setText("Serial: " + rs.getString("w.serial"));
                jLabel_Falla.setText("Falla: " + rs.getString("w.falla"));
                jTextField_Date.setText("Fecha: " + date.DateToDay());

            }

            cn.close();

        } catch (SQLException e) {

            System.err.println("¡Error al consultar la información de la ganratía!");
            JOptionPane.showMessageDialog(null, "¡Error al consultar la información de la ganratía!", "¡Error!",
                    JOptionPane.OK_OPTION);

        }

    }

    private void ValidateAddress() {

        if (Preliminar_Warranty.flag == 1) {

            jTextField_Technical.setText("");
            jTextField_Sent.setText("");

        } else if (Preliminar_Warranty.flag == 2) {

            try {

                Connection cn = connection.connection();
                PreparedStatement pst = cn.prepareStatement("select username from user "
                        + "where id_user = '" + Table_Technical.ID_Technical + "'");

                ResultSet rs = pst.executeQuery();

                if (rs.next()) {

                    jTextField_Technical.setText(rs.getString("username"));

                }

                cn.close();

            } catch (SQLException e) {

                System.err.println("¡Error al consultar la información del técnico! " + e);
                JOptionPane.showMessageDialog(null, "¡Error al consultar la información del tecnico!", "¡Error!",
                        JOptionPane.OK_OPTION);

            }

            jTextField_Sent.setText(sent);

        }

    }

}
