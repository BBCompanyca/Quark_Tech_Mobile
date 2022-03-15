package view;

import java.sql.*;
import clases.BD_Connection;
import clases.TextPrompt;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Register_Client extends javax.swing.JPanel {

    public Register_Client() {
        initComponents();

        TextPrompt name = new TextPrompt("Ingrese el nombre", jTextField_Name);
        TextPrompt telephone = new TextPrompt("Ingrese el N° de teléfono", jTextField_Telephone);
        TextPrompt ci = new TextPrompt("Ingrese el N° de cédula", jTextField_CI);

        validateType_Account();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField_Direction_Client = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel_Direction_Client = new javax.swing.JLabel();
        jTextField_Name = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel_Telephone = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField_Telephone = new javax.swing.JTextField();
        jTextField_CI = new javax.swing.JTextField();
        jLabel_CI = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel_Name = new javax.swing.JLabel();
        jLabel_Direction_Shop = new javax.swing.JLabel();
        jComboBox_Direction_Shop = new javax.swing.JComboBox<>();
        jButton_Register = new javax.swing.JButton();

        setBackground(new java.awt.Color(9, 53, 69));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField_Direction_Client.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Direction_Client.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextField_Direction_Client.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Direction_Client.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Direction_Client.setBorder(null);
        add(jTextField_Direction_Client, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 220, 30));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 220, -1));

        jLabel_Direction_Client.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Direction_Client.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Direction_Client.setText("Dirección:");
        add(jLabel_Direction_Client, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        jTextField_Name.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Name.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextField_Name.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Name.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Name.setBorder(null);
        add(jTextField_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 220, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 220, -1));

        jLabel_Telephone.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Telephone.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Telephone.setText("Teléfono:");
        add(jLabel_Telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 220, -1));

        jTextField_Telephone.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Telephone.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextField_Telephone.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Telephone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Telephone.setBorder(null);
        add(jTextField_Telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 220, 30));

        jTextField_CI.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_CI.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextField_CI.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_CI.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_CI.setBorder(null);
        add(jTextField_CI, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 220, 30));

        jLabel_CI.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_CI.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_CI.setText("C.I:");
        add(jLabel_CI, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 220, -1));

        jLabel_Name.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Name.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Name.setText("Nombre:");
        add(jLabel_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        jLabel_Direction_Shop.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Direction_Shop.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Direction_Shop.setText("Tienda:");
        add(jLabel_Direction_Shop, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, -1));

        jComboBox_Direction_Shop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Almacen", "Caricuao", "City Market" }));
        jComboBox_Direction_Shop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_Direction_ShopActionPerformed(evt);
            }
        });
        add(jComboBox_Direction_Shop, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, -1));

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
        add(jButton_Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 190, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_Direction_ShopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_Direction_ShopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_Direction_ShopActionPerformed

    private void jButton_RegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RegisterMousePressed

        int flag = 0, flag_two = 0;

        String name, telephone, ci, direction_client, direction_shop;

        if (Login.type_account.equals("Moderador")) {

            name = jTextField_Name.getText().trim();
            telephone = jTextField_Telephone.getText().trim();
            ci = jTextField_CI.getText().trim();
            direction_client = jTextField_Direction_Client.getText().trim();
            direction_shop = jComboBox_Direction_Shop.getSelectedItem().toString();

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

            if (direction_shop.equals("...")) {

                jLabel_Direction_Shop.setForeground(Color.red);
                flag_two++;

            } else {

                jLabel_Direction_Shop.setForeground(new Color(240, 240, 240));

            }

            if (flag == 0) {

                if (flag_two == 0) {

                    try {

                        Connection cn = BD_Connection.connection();
                        PreparedStatement pst = cn.prepareStatement(
                                "select cedula_client from client where cedula_client = '" + ci + "' "
                                + "and direction_tienda = '" + direction_shop + "'");

                        ResultSet rs = pst.executeQuery();

                        if (rs.next()) {

                            jLabel_CI.setForeground(Color.red);

                            JOptionPane.showMessageDialog(null, "¡Ya existe un cliente con este Número de Cédula!", "¡Acceso Denegado!",
                                    JOptionPane.OK_OPTION);

                            jTextField_CI.setText("");
                            jTextField_CI.requestFocus();

                            cn.close();

                        } else {

                            cn.close();

                            try {

                                Connection cn2 = BD_Connection.connection();
                                PreparedStatement pst2 = cn2.prepareStatement(
                                        "insert into client values(?, ?, ?, ?, ?, ?, ?, ?)");

                                pst2.setInt(1, 0);
                                pst2.setString(2, name);
                                pst2.setString(3, telephone);
                                pst2.setString(4, ci);
                                pst2.setString(5, direction_client);
                                pst2.setString(6, direction_shop);
                                pst2.setString(7, Login.user);
                                pst2.setString(8, "");

                                pst2.executeUpdate();

                                PintarDeVerdejTextField();
                                VaciarCamposDeTextos();

                                JOptionPane.showMessageDialog(null, "Registro exitoso.", "¡Exito!", JOptionPane.INFORMATION_MESSAGE);

                                resetColorjTextField();

                            } catch (SQLException e) {

                                System.err.println("¡Error al registrar cliente! " + e);
                                JOptionPane.showMessageDialog(null, "¡Error al registrar cliente!", "¡Acceso Denegado!",
                                        JOptionPane.OK_OPTION);

                            }

                        }

                    } catch (SQLException e) {

                        System.err.println("¡Error al consultar la C.I Del cliente! " + e);
                        JOptionPane.showMessageDialog(null, "¡Error al consultar la C.I Del cliente!", "¡Acceso Denegado!",
                                JOptionPane.OK_OPTION);
                    }

                } else {

                    JOptionPane.showMessageDialog(null, "¡Debes seleccionar una tienda!", "¡Acceso Denegado!",
                            JOptionPane.WARNING_MESSAGE);
                }

            } else {

                JOptionPane.showMessageDialog(null, "¡Debes llenar todos los campos!", "¡Acceso Denegado!",
                        JOptionPane.WARNING_MESSAGE);

            }

        } else {

            name = jTextField_Name.getText().trim();
            telephone = jTextField_Telephone.getText().trim();
            ci = jTextField_CI.getText().trim();
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
                                "select cedula_client from client where cedula_client = '" + ci + "' "
                                + "and direction_tienda = '" + Login.direction + "'");

                        ResultSet rs = pst.executeQuery();

                        if (rs.next()) {

                            jLabel_CI.setForeground(Color.red);

                            JOptionPane.showMessageDialog(null, "¡Ya existe un cliente con este Número de Cédula!", "¡Acceso Denegado!",
                                    JOptionPane.OK_OPTION);

                            jTextField_CI.setText("");
                            jTextField_CI.requestFocus();

                            cn.close();

                        } else {

                            cn.close();

                            try {

                                Connection cn2 = BD_Connection.connection();
                                PreparedStatement pst2 = cn2.prepareStatement(
                                        "insert into client values(?, ?, ?, ?, ?, ?, ?, ?)");

                                pst2.setInt(1, 0);
                                pst2.setString(2, name);
                                pst2.setString(3, telephone);
                                pst2.setString(4, ci);
                                pst2.setString(5, direction_client);
                                pst2.setString(6, Login.direction);
                                pst2.setString(7, Login.user);
                                pst2.setString(8, "");

                                pst2.executeUpdate();

                                PintarDeVerdejTextField();
                                VaciarCamposDeTextos();

                                JOptionPane.showMessageDialog(null, "Registro exitoso.", "¡Exito!", JOptionPane.INFORMATION_MESSAGE);

                                resetColorjTextField();

                            } catch (SQLException e) {

                                System.err.println("¡Error al registrar cliente! " + e);
                                JOptionPane.showMessageDialog(null, "¡Error al registrar cliente!", "¡Acceso Denegado!",
                                        JOptionPane.OK_OPTION);

                            }

                        }

                    } catch (SQLException e) {

                        System.err.println("¡Error al consultar la C.I Del cliente! " + e);
                        JOptionPane.showMessageDialog(null, "¡Error al consultar la C.I Del cliente!", "¡Acceso Denegado!",
                                JOptionPane.OK_OPTION);
                    }

            } else {

                JOptionPane.showMessageDialog(null, "¡Debes llenar todos los campos!", "¡Acceso Denegado!",
                        JOptionPane.WARNING_MESSAGE);

            }

        }

    }//GEN-LAST:event_jButton_RegisterMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Register;
    private javax.swing.JComboBox<String> jComboBox_Direction_Shop;
    private javax.swing.JLabel jLabel_CI;
    private javax.swing.JLabel jLabel_Direction_Client;
    private javax.swing.JLabel jLabel_Direction_Shop;
    private javax.swing.JLabel jLabel_Name;
    private javax.swing.JLabel jLabel_Telephone;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    public javax.swing.JTextField jTextField_CI;
    public javax.swing.JTextField jTextField_Direction_Client;
    public javax.swing.JTextField jTextField_Name;
    public javax.swing.JTextField jTextField_Telephone;
    // End of variables declaration//GEN-END:variables

    private void validateType_Account() {

        if (Login.type_account.equals("Moderador")) {

            jButton_Register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_register_dark.png"))); // NOI18N
            jButton_Register.setBorder(null);
            jButton_Register.setBorderPainted(false);
            jButton_Register.setContentAreaFilled(false);
            jButton_Register.setFocusPainted(false);
            jButton_Register.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jButton_Register.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_register_ligth.png"))); // NOI18N
            jButton_Register.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_register_ligth.png"))); // NOI18N
            add(jButton_Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 190, 60));

            jLabel_Direction_Shop.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
            jLabel_Direction_Shop.setForeground(new java.awt.Color(240, 240, 240));
            jLabel_Direction_Shop.setText("Dirección:");
            add(jLabel_Direction_Shop, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, -1, -1));

            jComboBox_Direction_Shop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"...", "Almacen", "Caricuao", "City Market"}));
            add(jComboBox_Direction_Shop, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, -1));

        } else {

            jButton_Register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_register_dark.png"))); // NOI18N
            jButton_Register.setBorder(null);
            jButton_Register.setBorderPainted(false);
            jButton_Register.setContentAreaFilled(false);
            jButton_Register.setFocusPainted(false);
            jButton_Register.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jButton_Register.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_register_ligth.png"))); // NOI18N
            jButton_Register.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_register_ligth.png"))); // NOI18N
            add(jButton_Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 190, 60));

            jLabel_Direction_Shop.setVisible(false);
            jComboBox_Direction_Shop.setVisible(false);

        }

    }

    private void PintarDeVerdejTextField() {

        jLabel_Name.setForeground(Color.GREEN);
        jLabel_Telephone.setForeground(Color.GREEN);
        jLabel_CI.setForeground(Color.GREEN);
        jLabel_Direction_Client.setForeground(Color.GREEN);
        jLabel_Direction_Shop.setForeground(Color.GREEN);

    }

    private void resetColorjTextField() {

        jLabel_Name.setForeground(new Color(240, 240, 240));
        jLabel_Telephone.setForeground(new Color(240, 240, 240));
        jLabel_CI.setForeground(new Color(240, 240, 240));
        jLabel_Direction_Client.setForeground(new Color(240, 240, 240));
        jLabel_Direction_Shop.setForeground(new Color(240, 240, 240));

    }

    private void VaciarCamposDeTextos() {

        jTextField_Name.setText("");
        jTextField_Telephone.setText("");
        jTextField_CI.setText("");
        jTextField_Direction_Client.setText("");
        jComboBox_Direction_Shop.setSelectedIndex(0);

        jTextField_Name.requestFocus();

    }

}
