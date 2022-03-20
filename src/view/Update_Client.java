package view;

import java.sql.*;
import clases.BD_Connection;
import clases.FormatText;
import clases.Paneles;
import clases.TextPrompt;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Update_Client extends javax.swing.JPanel {

    Paneles paneles = new Paneles();

    FormatText formattext = new FormatText();

    public Update_Client() {
        initComponents();

        //Objetos para el PlayHolders de los campos de textos...
        TextPrompt name = new TextPrompt("Ingrese el nombre", jTextField_Name);
        TextPrompt telephone = new TextPrompt("Ingrese el número de teléfono", jTextField_Telephone);
        TextPrompt ci = new TextPrompt("Ingrese el número de C.I", jTextField_Ci);
        TextPrompt direction__client = new TextPrompt("Ingrese la dirección del cliente", jTextField_Direction_Client);

        //Método para consultar la información del cliente...
        getInformation_Client();

        formattext.ValidateName(jTextField_Name);
        formattext.ValidateName(jTextField_Direction_Client);
        formattext.ValidateNumber(jTextField_Telephone);
        formattext.ValidateCI(jTextField_Ci);

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
        jTextField_Ci = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel_Direction_Client = new javax.swing.JLabel();
        jTextField_Direction_Client = new javax.swing.JTextField();
        jTextField_Last_Modification = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jButton_Update = new javax.swing.JButton();

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

        jLabel_Title.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel_Title.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Title.setText("jLabel1");
        add(jLabel_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 790, 30));

        jLabel_Name.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Name.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Name.setText("Nombre:");
        add(jLabel_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 220, -1));

        jTextField_Name.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Name.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextField_Name.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Name.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Name.setBorder(null);
        add(jTextField_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 220, 30));

        jLabel_Telephone.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Telephone.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Telephone.setText("Teléfono:");
        add(jLabel_Telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jTextField_Telephone.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Telephone.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextField_Telephone.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Telephone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Telephone.setBorder(null);
        add(jTextField_Telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 220, 30));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 220, -1));

        jLabel_CI.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_CI.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_CI.setText("C.I:");
        add(jLabel_CI, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jTextField_Ci.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Ci.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextField_Ci.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Ci.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Ci.setBorder(null);
        add(jTextField_Ci, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 220, 30));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 220, -1));

        jLabel_Direction_Client.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Direction_Client.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Direction_Client.setText("Dirección:");
        add(jLabel_Direction_Client, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, -1, -1));

        jTextField_Direction_Client.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Direction_Client.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextField_Direction_Client.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Direction_Client.setBorder(null);
        jTextField_Direction_Client.setCaretColor(new java.awt.Color(240, 240, 240));
        add(jTextField_Direction_Client, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 240, 30));

        jTextField_Last_Modification.setEditable(false);
        jTextField_Last_Modification.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Last_Modification.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextField_Last_Modification.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Last_Modification.setBorder(null);
        jTextField_Last_Modification.setCaretColor(new java.awt.Color(240, 240, 240));
        add(jTextField_Last_Modification, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 240, 30));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Modificado Por:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, -1, -1));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 240, -1));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 240, -1));

        jButton_Update.setText("Modificar");
        jButton_Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_UpdateMousePressed(evt);
            }
        });
        add(jButton_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 140, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_UpdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_UpdateMousePressed

        int flag = 0, flag_two = 0;
        String name, telephone, ci, direction_client;

        //Algoritmo por si no es moderador...
        name = jTextField_Name.getText().trim();
        telephone = jTextField_Telephone.getText().trim();
        ci = jTextField_Ci.getText().trim();
        direction_client = jTextField_Direction_Client.getText().trim();

        if (name.equals("")) {

            jLabel_Name.setForeground(Color.red);
            flag++;

        } else {

            jLabel_Name.setForeground(new Color(240, 240, 240));

        }

        if (telephone.equals("")) {

            jLabel_Telephone.setForeground(Color.red);
            flag++;

        } else {

            jLabel_Telephone.setForeground(new Color(240, 240, 240));

        }

        if (ci.equals("")) {

            jLabel_CI.setForeground(Color.red);
            flag++;

        } else {

            jLabel_CI.setForeground(new Color(240, 240, 240));

        }

        if (direction_client.equals("")) {

            jLabel_Direction_Client.setForeground(Color.red);
            flag++;

        } else {

            jLabel_Direction_Client.setForeground(new Color(240, 240, 240));

        }

        if (flag == 0) {

            try {

                Connection cn = BD_Connection.connection();
                PreparedStatement pst = cn.prepareStatement(
                        "select cedula_client from client where cedula_client = '" + ci + "' and not id_client = '"
                        + Clients.ID + "'");

                ResultSet rs = pst.executeQuery();

                if (rs.next()) {

                    jLabel_CI.setForeground(Color.red);

                    JOptionPane.showMessageDialog(null, "¡Ya existe un cliente registrado con este número de C.I!",
                            "¡Acceso Denegado", JOptionPane.WARNING_MESSAGE);

                    jTextField_Ci.setText("");
                    jTextField_Ci.requestFocus();

                    cn.close();

                } else {

                    cn.close();

                    try {

                        String unformat_telephone = formattext.unFormatText(telephone);
                        String unformat_ci = formattext.unFormatText(ci);

                        Connection cn2 = BD_Connection.connection();
                        PreparedStatement pst2 = cn2.prepareStatement(
                                "update client set name_client = ?, telephone_client = ?, unformat_telephone_client = ?, "
                                + "cedula_client = ?, unformat_cedula_client = ?,"
                                + "direction_client = ?, direction_tienda = ?, last_modification = ? "
                                + "where id_client = '" + Clients.ID + "'");

                        pst2.setString(1, name);
                        pst2.setString(2, telephone);
                        pst2.setString(3, unformat_telephone);
                        pst2.setString(4, ci);
                        pst2.setString(5, unformat_ci);
                        pst2.setString(6, direction_client);
                        pst2.setString(7, Login.direction);
                        pst2.setString(8, Login.user);

                        pst2.executeUpdate();

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

        } else {

            JOptionPane.showMessageDialog(null, "¡Debes llenar todos los campos!", "¡Acceso Denegado!",
                    JOptionPane.WARNING_MESSAGE);

        }


    }//GEN-LAST:event_jButton_UpdateMousePressed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed

        paneles.PanelClients();

    }//GEN-LAST:event_jButton1MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_Update;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_CI;
    private javax.swing.JLabel jLabel_Direction_Client;
    private javax.swing.JLabel jLabel_Name;
    private javax.swing.JLabel jLabel_Telephone;
    private javax.swing.JLabel jLabel_Title;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    public javax.swing.JTextField jTextField_Ci;
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
        jTextField_Ci.setText("");
        jTextField_Direction_Client.setText("");
        jTextField_Last_Modification.setText(Login.user);

    }

    //Método para consultar la información del cliente...
    private void getInformation_Client() {

        try {

            Connection cn = BD_Connection.connection();
            PreparedStatement pst = cn.prepareStatement("select * from client where id_client = '" + Clients.ID + "'");

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                jLabel_Title.setText("Modificar la información del cliente - " + rs.getString("name_client"));
                jTextField_Name.setText(rs.getString("name_client"));
                jTextField_Telephone.setText(rs.getString("telephone_client"));
                jTextField_Ci.setText(rs.getString("cedula_client"));
                jTextField_Direction_Client.setText(rs.getString("direction_client"));
                jTextField_Last_Modification.setText(rs.getString("last_modification"));

            }

            cn.close();

        } catch (SQLException e) {

            System.err.println("¡Error al consultar la información del cliente! " + e);
            JOptionPane.showMessageDialog(null, "¡Error al consultar la información del cliente!", "¡Error!",
                    JOptionPane.OK_OPTION);

        }

    }

}
