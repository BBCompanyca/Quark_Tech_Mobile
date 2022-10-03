package view;

import login.Login;
import java.sql.*;
import clases.BD_Connection;
import clases.TextPrompt;
import java.awt.Color;
import javax.swing.JOptionPane;
import clases.FormatText;
import clases.EncryptPassword;
import clases.Register_Movimiento;

public class Register_User extends javax.swing.JPanel {
    
    BD_Connection connection = new BD_Connection();

    String username_user, type_Account, direction_login;

    FormatText formatText = new FormatText();
    EncryptPassword encryptPassword = new EncryptPassword();

    public Register_User() {
        initComponents();

        username_user = Login.user;
        type_Account = Login.type_account;
        direction_login = Login.direction;

        //Objetos para el PlayHolder de los jTextField... 
        TextPrompt name = new TextPrompt("Ej. Carlos Perez", jTextField_Name);
        TextPrompt telephone = new TextPrompt("Ej. 0414 - 589.56.41", jTextField_Telephone);
        TextPrompt username = new TextPrompt("Ej. ADMIN", jTextField_Username);
        TextPrompt password = new TextPrompt("Ej. *********", jPasswordField_Password);

        formatText.ValidateName(jTextField_Name);
        formatText.ValidateUsername(jTextField_Username);
        formatText.ValidateNumber(jTextField_Telephone);

        validatePermission();

        ValidateCamp();

        jButton_Register.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Name = new javax.swing.JLabel();
        jTextField_Name = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField_Telephone = new javax.swing.JTextField();
        jLabel_Telephone = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel_Username = new javax.swing.JLabel();
        jTextField_Username = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel_Password = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jPasswordField_Password = new javax.swing.JPasswordField();
        jComboBox_Direction = new javax.swing.JComboBox<>();
        jLabel_Direction = new javax.swing.JLabel();
        jLabel_Permission = new javax.swing.JLabel();
        jComboBox_Permission = new javax.swing.JComboBox<>();
        jButton_Register = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel_Password2 = new javax.swing.JLabel();
        jLabel_Username2 = new javax.swing.JLabel();
        jLabel_Telefono2 = new javax.swing.JLabel();
        jLabel_Nombre2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(9, 53, 69));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Name.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Name.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Name.setText("Nombre:");
        add(jLabel_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        jTextField_Name.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Name.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Name.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Name.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Name.setBorder(null);
        jTextField_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_NameKeyReleased(evt);
            }
        });
        add(jTextField_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 220, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 220, -1));

        jTextField_Telephone.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Telephone.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Telephone.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Telephone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Telephone.setBorder(null);
        jTextField_Telephone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_TelephoneKeyReleased(evt);
            }
        });
        add(jTextField_Telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 220, 30));

        jLabel_Telephone.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Telephone.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Telephone.setText("Teléfono:");
        add(jLabel_Telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 220, -1));

        jLabel_Username.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Username.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Username.setText("Nombre de usuario:");
        add(jLabel_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, -1, -1));

        jTextField_Username.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Username.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Username.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Username.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Username.setBorder(null);
        jTextField_Username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_UsernameKeyReleased(evt);
            }
        });
        add(jTextField_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 220, 30));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 220, -1));

        jLabel_Password.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Password.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Password.setText("Contraseña:");
        add(jLabel_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, -1, -1));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 220, -1));

        jPasswordField_Password.setBackground(new java.awt.Color(9, 53, 69));
        jPasswordField_Password.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jPasswordField_Password.setForeground(new java.awt.Color(240, 240, 240));
        jPasswordField_Password.setBorder(null);
        jPasswordField_Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField_PasswordKeyReleased(evt);
            }
        });
        add(jPasswordField_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 220, 30));

        jComboBox_Direction.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Almacen", "Caricuao", "City Market" }));
        jComboBox_Direction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_DirectionActionPerformed(evt);
            }
        });
        add(jComboBox_Direction, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, -1));

        jLabel_Direction.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Direction.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Direction.setText("Dirección:");
        add(jLabel_Direction, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, -1, -1));

        jLabel_Permission.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Permission.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Permission.setText("Permisos De:");
        add(jLabel_Permission, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        jComboBox_Permission.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Moderador", "Administrador", "Vendedor", "Tecnico" }));
        jComboBox_Permission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_PermissionActionPerformed(evt);
            }
        });
        add(jComboBox_Permission, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));

        jButton_Register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_register_dark.png"))); // NOI18N
        jButton_Register.setBorder(null);
        jButton_Register.setBorderPainted(false);
        jButton_Register.setContentAreaFilled(false);
        jButton_Register.setFocusPainted(false);
        jButton_Register.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_Register.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_register_ligth.png"))); // NOI18N
        jButton_Register.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_register_ligth.png"))); // NOI18N
        jButton_Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_RegisterMousePressed(evt);
            }
        });
        add(jButton_Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 190, 60));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar Nuevo Usuario");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 890, 40));

        jLabel_Password2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel_Password2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Password2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Password2.setText("CAMPO REQUERIDO *");
        jLabel_Password2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel_Password2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 275, 220, 20));

        jLabel_Username2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel_Username2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Username2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Username2.setText("CAMPO REQUERIDO *");
        jLabel_Username2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel_Username2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 175, 220, 20));

        jLabel_Telefono2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel_Telefono2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Telefono2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Telefono2.setText("CAMPO REQUERIDO *");
        jLabel_Telefono2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel_Telefono2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 275, 220, 20));

        jLabel_Nombre2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel_Nombre2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Nombre2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Nombre2.setText("CAMPO REQUERIDO *");
        jLabel_Nombre2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel_Nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 175, 220, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_DirectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_DirectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_DirectionActionPerformed

    private void jComboBox_PermissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_PermissionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_PermissionActionPerformed

    private void jButton_RegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RegisterMousePressed

        String name, telephone, unformat_telphone, username, password, permission, direction;

        if (type_Account.equals("Moderador")) {

            //Variables para validar que los campos de textos no esten vacios...
            int flag_two = 0, flag_tree = 0;

            name = jTextField_Name.getText().trim();
            telephone = jTextField_Telephone.getText().trim();
            username = jTextField_Username.getText().trim();
            password = jPasswordField_Password.getText().trim();
            permission = jComboBox_Permission.getSelectedItem().toString();
            direction = jComboBox_Direction.getSelectedItem().toString();

            if (permission.equals("...")) {

                jLabel_Permission.setForeground(Color.red);
                flag_two++;

            } else {

                jLabel_Permission.setForeground(new java.awt.Color(240, 240, 240));

            }

            if (direction.equals("...")) {

                jLabel_Direction.setForeground(Color.red);
                flag_tree++;

            } else {

                jLabel_Direction.setForeground(new java.awt.Color(240, 240, 240));

            }

            //Condicion para validar que se haya seleccionado algún permiso...
            if (flag_two == 0) {
                //Condición para validar que se haya seleccionado alguna dirección...
                if (flag_tree == 0) {

                    //Algoritmo para validar que el nombre usuario sea valido...
                    try {

                        Connection cn = connection.connection();
                        PreparedStatement pst = cn.prepareStatement(
                                "select username from user where username = '" + username + "'");

                        ResultSet rs = pst.executeQuery();

                        if (rs.next()) {

                            jLabel_Username.setForeground(Color.red);

                            JOptionPane.showMessageDialog(null, "¡Nombre de usuario no disponible!", "!Acceso Denegado!",
                                    JOptionPane.OK_OPTION);

                            jTextField_Username.setText("");
                            jTextField_Username.requestFocus();

                            cn.close();

                        } else {

                            cn.close();

                            //Algoritmo para registrar el usario...
                            try {

                                unformat_telphone = formatText.unFormatText(telephone);

                                Connection cn2 = connection.connection();
                                PreparedStatement pst2 = cn2.prepareStatement(
                                        "insert into user values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

                                pst2.setInt(1, 0);
                                pst2.setString(2, name);
                                pst2.setString(3, username);
                                pst2.setString(4, encryptPassword.ecnode("@BBCompany.ca", password));
                                pst2.setString(5, telephone);
                                pst2.setString(6, unformat_telphone);
                                pst2.setString(7, direction);
                                pst2.setString(8, permission);
                                pst2.setString(9, username_user);
                                pst2.setString(10, "");
                                pst2.setString(11, "Activo");
                                pst2.executeUpdate();

                                Register_Movimiento movimiento = new Register_Movimiento(Login.ID_User, "R/U", username, Login.direction);
                                Thread register = new Thread(movimiento);
                                register.start();

                                PintarDeVerdejTextField();
                                VaciarCamposDeTextos();

                                JOptionPane.showMessageDialog(null, "Registro Exitoso.", "Exito",
                                        JOptionPane.INFORMATION_MESSAGE);

                                resetColorjTextField();

                                cn2.close();

                            } catch (SQLException e) {

                                System.err.println("¡Error al registrar usuario! " + e);

                                JOptionPane.showMessageDialog(null, "¡Error al registrar usuario!", "!Error!",
                                        JOptionPane.OK_OPTION);

                            }
                        }

                    } catch (SQLException e) {

                        System.err.println("¡Error al validar el nombre de usuario! " + e);

                        JOptionPane.showMessageDialog(null, "¡Error al validar el nombre de usuario!", "!Error!",
                                JOptionPane.OK_OPTION);

                    }

                } else {

                    JOptionPane.showMessageDialog(null, "¡Debes seleccionar alguna dirección!", "!Acceso Denegado!",
                            JOptionPane.WARNING_MESSAGE);

                }

            } else {

                JOptionPane.showMessageDialog(null, "¡Debes seleccionar algún permiso!", "!Acceso Denegado!",
                        JOptionPane.WARNING_MESSAGE);

            }

        } else {

            //Variables para validar que los campos de textos no esten vacios...
            int flag = 0, flag_two = 0, flag_tree = 0;

            name = jTextField_Name.getText().trim();
            telephone = jTextField_Telephone.getText().trim();
            username = jTextField_Username.getText().trim();
            password = jPasswordField_Password.getText().trim();
            permission = jComboBox_Permission.getSelectedItem().toString();

            if (permission.equals("...")) {

                jLabel_Permission.setForeground(Color.red);
                flag_two++;

            } else {

                jLabel_Permission.setForeground(new java.awt.Color(240, 240, 240));

            }

            //Condicion para validar que se haya seleccionado algún permiso...
            if (flag_two == 0) {

                //Algoritmo para validar que el nombre usuario sea valido...
                try {

                    Connection cn = connection.connection();
                    PreparedStatement pst = cn.prepareStatement(
                            "select username from user where username = '" + username + "'");

                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {

                        jLabel_Username.setForeground(Color.red);

                        JOptionPane.showMessageDialog(null, "¡Nombre de usuario no disponible!", "!Acceso Denegado!",
                                JOptionPane.OK_OPTION);

                        jTextField_Username.setText("");
                        jTextField_Username.requestFocus();

                        cn.close();

                    } else {

                        cn.close();

                        //Algoritmo para registrar el usario...
                        try {

                            unformat_telphone = formatText.unFormatText(telephone);
                            System.out.println(unformat_telphone);

                            Connection cn2 = connection.connection();
                            PreparedStatement pst2 = cn2.prepareStatement(
                                    "insert into user values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

                            pst2.setInt(1, 0);
                            pst2.setString(2, name);
                            pst2.setString(3, username);
                            pst2.setString(4, password);
                            pst2.setString(5, telephone);
                            pst2.setString(6, unformat_telphone);
                            pst2.setString(7, direction_login);
                            pst2.setString(8, permission);
                            pst2.setString(9, username_user);
                            pst2.setString(10, "");
                            pst2.setString(11, "Activo");
                            pst2.executeUpdate();

                            PintarDeVerdejTextField();
                            VaciarCamposDeTextos();

                            JOptionPane.showMessageDialog(null, "Registro Exitoso.", "Exito",
                                    JOptionPane.INFORMATION_MESSAGE);

                            resetColorjTextField();

                            cn2.close();

                        } catch (SQLException e) {

                            System.err.println("¡Error al registrar usuario! " + e);

                            JOptionPane.showMessageDialog(null, "¡Error al registrar usuario!", "!Error!",
                                    JOptionPane.OK_OPTION);

                        }
                    }

                    cn.close();

                } catch (SQLException e) {

                    System.err.println("¡Error al validar el nombre de usuario! " + e);

                    JOptionPane.showMessageDialog(null, "¡Error al validar el nombre de usuario!", "!Error!",
                            JOptionPane.OK_OPTION);

                }

            } else {

                JOptionPane.showMessageDialog(null, "¡Debes seleccionar algún permiso!", "!Acceso Denegado!",
                        JOptionPane.WARNING_MESSAGE);

            }

        }

    }//GEN-LAST:event_jButton_RegisterMousePressed

    private void jTextField_NameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_NameKeyReleased

        ValidateCamp();

    }//GEN-LAST:event_jTextField_NameKeyReleased

    private void jTextField_UsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_UsernameKeyReleased

        ValidateCamp();


    }//GEN-LAST:event_jTextField_UsernameKeyReleased

    private void jTextField_TelephoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_TelephoneKeyReleased

        ValidateCamp();

    }//GEN-LAST:event_jTextField_TelephoneKeyReleased

    private void jPasswordField_PasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_PasswordKeyReleased

        ValidateCamp();

    }//GEN-LAST:event_jPasswordField_PasswordKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Register;
    private javax.swing.JComboBox<String> jComboBox_Direction;
    private javax.swing.JComboBox<String> jComboBox_Permission;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Direction;
    private javax.swing.JLabel jLabel_Name;
    private javax.swing.JLabel jLabel_Nombre2;
    private javax.swing.JLabel jLabel_Password;
    private javax.swing.JLabel jLabel_Password2;
    private javax.swing.JLabel jLabel_Permission;
    private javax.swing.JLabel jLabel_Telefono2;
    private javax.swing.JLabel jLabel_Telephone;
    private javax.swing.JLabel jLabel_Username;
    private javax.swing.JLabel jLabel_Username2;
    private javax.swing.JPasswordField jPasswordField_Password;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    public javax.swing.JTextField jTextField_Name;
    public javax.swing.JTextField jTextField_Telephone;
    public javax.swing.JTextField jTextField_Username;
    // End of variables declaration//GEN-END:variables

    private void validatePermission() {

        if (type_Account.equals("Administrador")) {

            jComboBox_Permission.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"...", "Vendedor", "Tecnico"}));
            add(jComboBox_Permission, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, -1));

            jLabel_Permission.setFont(new java.awt.Font("Roboto", 0, 18));
            jLabel_Permission.setForeground(new java.awt.Color(240, 240, 240));
            jLabel_Permission.setText("Permisos De:");
            add(jLabel_Permission, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, -1));

            jComboBox_Direction.setVisible(false);
            jLabel_Direction.setVisible(false);

        }

    }

    private void PintarDeVerdejTextField() {

        jLabel_Name.setForeground(Color.GREEN);
        jLabel_Telephone.setForeground(Color.GREEN);
        jLabel_Username.setForeground(Color.GREEN);
        jLabel_Password.setForeground(Color.GREEN);
        jLabel_Permission.setForeground(Color.GREEN);
        jLabel_Direction.setForeground(Color.GREEN);

    }

    private void resetColorjTextField() {

        jLabel_Name.setForeground(new Color(240, 240, 240));
        jLabel_Telephone.setForeground(new Color(240, 240, 240));
        jLabel_Username.setForeground(new Color(240, 240, 240));
        jLabel_Password.setForeground(new Color(240, 240, 240));
        jLabel_Permission.setForeground(new Color(240, 240, 240));
        jLabel_Direction.setForeground(new Color(240, 240, 240));

    }

    private void VaciarCamposDeTextos() {

        jTextField_Name.setText("");
        jTextField_Username.setText("");
        jTextField_Telephone.setText("");
        jPasswordField_Password.setText("");
        jComboBox_Permission.setSelectedIndex(0);
        jComboBox_Direction.setSelectedIndex(0);

        jTextField_Name.requestFocus();

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

        if (jTextField_Username.getText().isEmpty()) {

            jLabel_Username2.setText("*CAMPO REQUERIDO*");

        } else {

            jLabel_Username2.setText("");

        }

        if (jPasswordField_Password.getText().isEmpty()) {

            jLabel_Password2.setText("*CAMPO REQUERIDO*");

        } else {

            jLabel_Password2.setText("");

        }

        if (jTextField_Name.getText().isEmpty() || jTextField_Telephone.getText().isEmpty()
                || jTextField_Username.getText().isEmpty() || jPasswordField_Password.getText().isEmpty()
                || jTextField_Telephone.getText().length() < 16 || !jTextField_Name.getText().contains(" ")
                || !jTextField_Telephone.getText().contains("0412") && !jTextField_Telephone.getText().contains("0414")
                && !jTextField_Telephone.getText().contains("0424") && !jTextField_Telephone.getText().contains("0416")
                && !jTextField_Telephone.getText().contains("0426")) {

            jButton_Register.setVisible(false);

        } else {

            jButton_Register.setVisible(true);

        }

    }

}
