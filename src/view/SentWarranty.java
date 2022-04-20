package view;

import clases.BD_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import clases.TextPrompt;
import clases.Date;

public class SentWarranty extends javax.swing.JPanel {

    Date date = new Date();
    
    public SentWarranty() {
        initComponents();
        
        getInformationWarranty();
        
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
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton_Register = new javax.swing.JButton();
        jLabel_Background = new javax.swing.JLabel();

        setBackground(new java.awt.Color(9, 53, 69));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Envío De Equipo A Servicio Ténico");
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

        jTextField3.setBackground(new java.awt.Color(78, 109, 121));
        jTextField3.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(240, 240, 240));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 190, 30));

        jButton1.setFocusPainted(false);
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 176, 35, 35));

        jButton_Register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_Sent_Dark.png"))); // NOI18N
        jButton_Register.setBorder(null);
        jButton_Register.setBorderPainted(false);
        jButton_Register.setContentAreaFilled(false);
        jButton_Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_RegisterMousePressed(evt);
            }
        });
        add(jButton_Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 150, 60));

        jLabel_Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rectangle 2.png"))); // NOI18N
        add(jLabel_Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 50, 630, 380));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_RegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RegisterMousePressed


    }//GEN-LAST:event_jButton_RegisterMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_Register;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Background;
    private javax.swing.JLabel jLabel_Color;
    private javax.swing.JLabel jLabel_Equipo;
    private javax.swing.JLabel jLabel_Falla;
    private javax.swing.JLabel jLabel_Serial;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField_Date;
    private javax.swing.JTextField jTextField_Sent;
    // End of variables declaration//GEN-END:variables

    private void getInformationWarranty() {

        try {

            Connection cn = BD_Connection.connection();
            PreparedStatement pst = cn.prepareStatement(
                    "select equipo, color, serial, falla from warranty where id_warranty = '" + Warranty.ID + "'");

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                jLabel_Equipo.setText("Equipo: " + rs.getString("equipo"));
                jLabel_Color.setText("Color: " + rs.getString("color"));
                jLabel_Serial.setText("Serial: " + rs.getString("serial"));
                jLabel_Falla.setText("Falla: " + rs.getString("falla"));
                jTextField_Date.setText("Fecha: " + date.DateToDay());

            }

            cn.close();

        } catch (SQLException e) {

            System.err.println("¡Error al consultar la información de la ganratía!");
            JOptionPane.showMessageDialog(null, "¡Error al consultar la información de la ganratía!", "¡Error!",
                    JOptionPane.OK_OPTION);

        }

    }

}
