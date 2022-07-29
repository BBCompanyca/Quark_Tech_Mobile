package view;

import java.sql.*;
import clases.BD_Connection;
import clases.FormatText;
import clases.Paneles;
import clases.Register_Movimiento;
import clases.TextPrompt;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Update_Client extends javax.swing.JPanel {

    Paneles paneles = new Paneles();

    FormatText formattext = new FormatText();

    public Update_Client() {
        initComponents();

        //Objetos para el PlayHolders de los campos de textos...
        TextPrompt name = new TextPrompt("Ej. Carlos Perez", jTextField_Name);
        TextPrompt telephone = new TextPrompt("Ej. 0414 - 589.56.41", jTextField_Telephone);
        TextPrompt ci = new TextPrompt("Ej. 24.458.526", jTextField_CI);
        TextPrompt direction__client = new TextPrompt("Ej. Las Mercedes", jTextField_Direction_Client);

        //Método para consultar la información del cliente...
        getInformation_Client();

        formattext.ValidateName(jTextField_Name);
        formattext.ValidateName(jTextField_Direction_Client);
        formattext.ValidateNumber(jTextField_Telephone);
        formattext.ValidateChar_Rif(jTextField_CI);

        ValidateCamp();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel_Title = new javax.swing.JLabel();
        jLabel_Name = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField_Name = new javax.swing.JTextField();
        jLabel_Telephone = new javax.swing.JLabel();
        jTextField_Telephone = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel_CI = new javax.swing.JLabel();
        jTextField_CI = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel_Direction_Client = new javax.swing.JLabel();
        jTextField_Direction_Client = new javax.swing.JTextField();
        jTextField_Last_Modification = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jButton_Update = new javax.swing.JButton();
        jLabel_Nombre2 = new javax.swing.JLabel();
        jLabel_Telefono2 = new javax.swing.JLabel();
        jLabel_Rif2 = new javax.swing.JLabel();
        jLabel_Direction2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(9, 53, 69));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back_arrow_24px.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/go_back_24px.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel_Title.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        jLabel_Title.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Title.setText("jLabel1");
        add(jLabel_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 890, 40));

        jLabel_Name.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Name.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Name.setText("Nombre:");
        add(jLabel_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 220, -1));

        jTextField_Name.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Name.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextField_Name.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Name.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Name.setBorder(null);
        jTextField_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_NameKeyReleased(evt);
            }
        });
        add(jTextField_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 220, 30));

        jLabel_Telephone.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Telephone.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Telephone.setText("Teléfono:");
        add(jLabel_Telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        jTextField_Telephone.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Telephone.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextField_Telephone.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Telephone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Telephone.setBorder(null);
        jTextField_Telephone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_TelephoneKeyReleased(evt);
            }
        });
        add(jTextField_Telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 220, 30));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 220, -1));

        jLabel_CI.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_CI.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_CI.setText("C.I O RIF:");
        add(jLabel_CI, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        jTextField_CI.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_CI.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextField_CI.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_CI.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_CI.setBorder(null);
        jTextField_CI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_CIKeyReleased(evt);
            }
        });
        add(jTextField_CI, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 220, 30));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 220, -1));

        jLabel_Direction_Client.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Direction_Client.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Direction_Client.setText("Dirección:");
        add(jLabel_Direction_Client, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, -1, -1));

        jTextField_Direction_Client.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Direction_Client.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextField_Direction_Client.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Direction_Client.setBorder(null);
        jTextField_Direction_Client.setCaretColor(new java.awt.Color(240, 240, 240));
        jTextField_Direction_Client.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_Direction_ClientKeyReleased(evt);
            }
        });
        add(jTextField_Direction_Client, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 240, 30));

        jTextField_Last_Modification.setEditable(false);
        jTextField_Last_Modification.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Last_Modification.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextField_Last_Modification.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Last_Modification.setBorder(null);
        jTextField_Last_Modification.setCaretColor(new java.awt.Color(240, 240, 240));
        add(jTextField_Last_Modification, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 240, 30));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Modificado Por:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, -1, -1));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 240, -1));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 240, -1));

        jButton_Update.setText("Modificar");
        jButton_Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_UpdateMousePressed(evt);
            }
        });
        add(jButton_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 140, 40));

        jLabel_Nombre2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel_Nombre2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Nombre2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Nombre2.setText("CAMPO REQUERIDO *");
        jLabel_Nombre2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel_Nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 165, 220, 20));

        jLabel_Telefono2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel_Telefono2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Telefono2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Telefono2.setText("CAMPO REQUERIDO *");
        jLabel_Telefono2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel_Telefono2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 255, 220, 20));

        jLabel_Rif2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel_Rif2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Rif2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Rif2.setText("CAMPO REQUERIDO *");
        jLabel_Rif2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel_Rif2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 345, 220, 20));

        jLabel_Direction2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel_Direction2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Direction2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Direction2.setText("CAMPO REQUERIDO *");
        jLabel_Direction2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel_Direction2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 165, 220, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_UpdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_UpdateMousePressed

        String name, telephone, ci, direction_client;

        //Algoritmo por si no es moderador...
        name = jTextField_Name.getText().trim();
        telephone = jTextField_Telephone.getText().trim();
        ci = jTextField_CI.getText().trim();
        direction_client = jTextField_Direction_Client.getText().trim();

        try {

            Connection cn = BD_Connection.connection();
            PreparedStatement pst = cn.prepareStatement(
                    "select unformat_identity_card_client from client where unformat_identity_card_client = '" + ci + "' and not id_client = '"
                    + Clients.ID + "'");

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                jLabel_CI.setForeground(Color.red);

                JOptionPane.showMessageDialog(null, "¡Ya existe un cliente registrado con este número de C.I!",
                        "¡Acceso Denegado", JOptionPane.WARNING_MESSAGE);

                jTextField_CI.setText("");
                jTextField_CI.requestFocus();

                cn.close();

            } else {

                cn.close();

                try {

                    String unformat_telephone = formattext.unFormatText(telephone);
                    ci = ci.toUpperCase();

                    Connection cn2 = BD_Connection.connection();
                    PreparedStatement pst2 = cn2.prepareStatement(
                            "update client set name_client = ?, telephone_client = ?, unformat_telephone_client = ?, "
                            + "identity_card_client = ?, unformat_identity_card_client = ?,"
                            + "direction_client = ?, direction_tienda = ?, last_modification = ? "
                            + "where id_client = '" + Clients.ID + "'");

                    pst2.setString(1, name);
                    pst2.setString(2, telephone);
                    pst2.setString(3, unformat_telephone);
                    pst2.setString(4, formattext.Identity_Card_Client(ci));
                    pst2.setString(5, ci);
                    pst2.setString(6, direction_client);
                    pst2.setString(7, Login.direction);
                    pst2.setString(8, String.valueOf(Login.ID_User));

                    pst2.executeUpdate();
                    
                    Register_Movimiento movimiento = new Register_Movimiento(Login.ID_User, "M/C");
                    Thread register = new Thread(movimiento);
                    register.start();

                    paintCampTextGreen();

                    cleanCampText();

                    JOptionPane.showMessageDialog(null, "Modificación exitosa.", "¡Exito!",
                            JOptionPane.INFORMATION_MESSAGE);

                    cn2.close();

                    paneles.PanelClients();

                } catch (SQLException e) {

                    System.err.println("¡Error al modificar la información del cliente! " + e);
                    JOptionPane.showMessageDialog(null, "¡Error al modificar la información del cliente!", "¡Error!",
                            JOptionPane.OK_OPTION);

                }

            }

        } catch (SQLException e) {

            System.err.println("¡Error al consultar la cédula del cliente! " + e);
            JOptionPane.showMessageDialog(null, "¡Error al consultar la cédula del cliente!", "¡Error!",
                    JOptionPane.OK_OPTION);

        }


    }//GEN-LAST:event_jButton_UpdateMousePressed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed

        paneles.PanelClients();

    }//GEN-LAST:event_jButton1MousePressed

    private void jTextField_NameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_NameKeyReleased

        ValidateCamp();

    }//GEN-LAST:event_jTextField_NameKeyReleased

    private void jTextField_TelephoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_TelephoneKeyReleased

        ValidateCamp();

    }//GEN-LAST:event_jTextField_TelephoneKeyReleased

    private void jTextField_CIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_CIKeyReleased

        ValidateCamp();

    }//GEN-LAST:event_jTextField_CIKeyReleased

    private void jTextField_Direction_ClientKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Direction_ClientKeyReleased

        ValidateCamp();

    }//GEN-LAST:event_jTextField_Direction_ClientKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_Update;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_CI;
    private javax.swing.JLabel jLabel_Direction2;
    private javax.swing.JLabel jLabel_Direction_Client;
    private javax.swing.JLabel jLabel_Name;
    private javax.swing.JLabel jLabel_Nombre2;
    private javax.swing.JLabel jLabel_Rif2;
    private javax.swing.JLabel jLabel_Telefono2;
    private javax.swing.JLabel jLabel_Telephone;
    private javax.swing.JLabel jLabel_Title;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    public javax.swing.JTextField jTextField_CI;
    private javax.swing.JTextField jTextField_Direction_Client;
    private javax.swing.JTextField jTextField_Last_Modification;
    public javax.swing.JTextField jTextField_Name;
    public javax.swing.JTextField jTextField_Telephone;
    // End of variables declaration//GEN-END:variables

    //Método para pintar de verde los campos de Texto...
    private void paintCampTextGreen() {

        jLabel_Name.setForeground(Color.GREEN);
        jLabel_Telephone.setForeground(Color.GREEN);
        jLabel_CI.setForeground(Color.GREEN);
        jLabel_Direction_Client.setForeground(Color.GREEN);
        jLabel4.setForeground(Color.GREEN);

    }

    //Método para limpiar los campos de Texto...
    private void cleanCampText() {

        jTextField_Name.setText("");
        jTextField_Telephone.setText("");
        jTextField_CI.setText("");
        jTextField_Direction_Client.setText("");
        jTextField_Last_Modification.setText(Login.user);

    }

    //Método para consultar la información del cliente...
    private void getInformation_Client() {

        try {

            Connection cn = BD_Connection.connection();
            PreparedStatement pst = cn.prepareStatement("select c.name_client, c.telephone_client, "
                    + "c.direction_client, c.unformat_identity_card_client, u.username from client c join "
                    + "user u on id_client = '" + Clients.ID + "'");

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                jLabel_Title.setText("Modificar La Información Del Cliente - " + rs.getString("c.name_client"));
                jTextField_Name.setText(rs.getString("c.name_client"));
                jTextField_Telephone.setText(rs.getString("c.telephone_client"));
                jTextField_Direction_Client.setText(rs.getString("direction_client"));
                jTextField_CI.setText(rs.getString("c.unformat_identity_card_client"));
                jTextField_Last_Modification.setText(rs.getString("u.username"));

            }

            cn.close();

        } catch (SQLException e) {

            System.err.println("¡Error al consultar la información del cliente! " + e);
            JOptionPane.showMessageDialog(null, "¡Error al consultar la información del cliente!", "¡Error!",
                    JOptionPane.OK_OPTION);

        }

    }

    private void ValidateCamp() {

        if (jTextField_Name.getText().isEmpty()) {

            jLabel_Nombre2.setText("*CAMPO REQUERIDO*");

        } else if (!jTextField_Name.getText().contains(" ")) {

            jLabel_Nombre2.setText("*FORMATO INVALIDO*");

        } else {

            jLabel_Nombre2.setText("");

        }

        if (jTextField_Telephone.getText().isEmpty()) {

            jLabel_Telefono2.setText("*CAMPO REQUERIDO*");

        } else if (jTextField_Telephone.getText().length() < 16) {

            jLabel_Telefono2.setText("*FORMATO INVALIDO*");

        } else if (!jTextField_Telephone.getText().contains("0412") && !jTextField_Telephone.getText().contains("0414")
                && !jTextField_Telephone.getText().contains("0424") && !jTextField_Telephone.getText().contains("0416")
                && !jTextField_Telephone.getText().contains("0426")) {

            jLabel_Telefono2.setText("*FORMATO INVALIDO*");

        } else {

            jLabel_Telefono2.setText("");

        }

        if (jTextField_CI.getText().isEmpty()) {

            jLabel_Rif2.setText("*CAMPO REQUERIDO*");

        } else if (jTextField_CI.getText().contains("v") && jTextField_CI.getText().length() > 9 || jTextField_CI.getText().length() < 8
                || jTextField_CI.getText().contains("V") && jTextField_CI.getText().length() > 9 || jTextField_CI.getText().length() < 8
                || jTextField_CI.getText().contains("j") && jTextField_CI.getText().length() != 10
                || jTextField_CI.getText().contains("J") && jTextField_CI.getText().length() != 10
                || jTextField_CI.getText().contains("g") && jTextField_CI.getText().length() != 10
                || jTextField_CI.getText().contains("G") && jTextField_CI.getText().length() != 10) {

            jLabel_Rif2.setText("*FORMATO INVALIDO*");

        } else {

            jLabel_Rif2.setText("");

        }

        if (jTextField_Direction_Client.getText().isEmpty()) {

            jLabel_Direction2.setText("*CAMPO REQUERIDO*");

        } else {

            jLabel_Direction2.setText("");

        }

        if (jTextField_Name.getText().isEmpty() || jTextField_Telephone.getText().isEmpty()
                || jTextField_Telephone.getText().length() < 16
                || jTextField_Direction_Client.getText().isEmpty()
                || jTextField_CI.getText().contains("v") && jTextField_CI.getText().length() > 9 || jTextField_CI.getText().length() < 8
                || jTextField_CI.getText().contains("V") && jTextField_CI.getText().length() > 9 || jTextField_CI.getText().length() < 8
                || jTextField_CI.getText().contains("j") && jTextField_CI.getText().length() != 10
                || jTextField_CI.getText().contains("J") && jTextField_CI.getText().length() != 10
                || jTextField_CI.getText().contains("g") && jTextField_CI.getText().length() != 10
                || jTextField_CI.getText().contains("G") && jTextField_CI.getText().length() != 10) {

            jButton_Update.setVisible(false);

        } else {

            jButton_Update.setVisible(true);

        }

    }

}
