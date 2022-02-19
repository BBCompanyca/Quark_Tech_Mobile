package view;

import java.sql.*;
import clases.BD_Connection;
import clases.TextPrompt;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Register_User extends javax.swing.JPanel {

    public Register_User() {
        initComponents();

        //Objetos para el PlayHolder de los jTextField... 
        TextPrompt name = new TextPrompt("Ingrese el nombre de usuario", jTextField_Name);
        TextPrompt telephone = new TextPrompt("Ingrese el N° de télefono", jTextField_Telephone);
        TextPrompt username = new TextPrompt("Ingrese el nombre de usuario", jTextField_Username);
        TextPrompt password = new TextPrompt("Ingrese la contraseña", jPasswordField_Password);
        
        Dashboard value = new Dashboard();
        
        JOptionPane.showMessageDialog(null, "El ID es: " + value.jLabel_Username.getText());

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

        setBackground(new java.awt.Color(9, 53, 69));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Name.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Name.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Name.setText("Nombre:");
        add(jLabel_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        jTextField_Name.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Name.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jTextField_Name.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Name.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Name.setBorder(null);
        add(jTextField_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 220, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 220, -1));

        jTextField_Telephone.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Telephone.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jTextField_Telephone.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Telephone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Telephone.setBorder(null);
        add(jTextField_Telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 220, 30));

        jLabel_Telephone.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Telephone.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Telephone.setText("Teléfono:");
        add(jLabel_Telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 220, -1));

        jLabel_Username.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Username.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Username.setText("Nombre de usuario:");
        add(jLabel_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, -1, -1));

        jTextField_Username.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Username.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jTextField_Username.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Username.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Username.setBorder(null);
        add(jTextField_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 220, 30));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 220, -1));

        jLabel_Password.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Password.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Password.setText("Contraseña:");
        add(jLabel_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, -1, -1));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 220, -1));

        jPasswordField_Password.setBackground(new java.awt.Color(9, 53, 69));
        jPasswordField_Password.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jPasswordField_Password.setForeground(new java.awt.Color(240, 240, 240));
        jPasswordField_Password.setBorder(null);
        add(jPasswordField_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 220, 30));

        jComboBox_Direction.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Almacen", "Caricuao", "City Market" }));
        jComboBox_Direction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_DirectionActionPerformed(evt);
            }
        });
        add(jComboBox_Direction, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        jLabel_Direction.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Direction.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Direction.setText("Dirección:");
        add(jLabel_Direction, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));

        jLabel_Permission.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Permission.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Permission.setText("Permisos De:");
        add(jLabel_Permission, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        jComboBox_Permission.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Administrador", "Tecnico" }));
        jComboBox_Permission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_PermissionActionPerformed(evt);
            }
        });
        add(jComboBox_Permission, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

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
        add(jButton_Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 255, 190, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_DirectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_DirectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_DirectionActionPerformed

    private void jComboBox_PermissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_PermissionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_PermissionActionPerformed

    private void jButton_RegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RegisterMousePressed

        //Variables para validar que los campos de textos no esten vacios...
        int flag = 0, flag_two = 0, flag_tree = 0;

        Dashboard value = new Dashboard();
        
        String name, telephone, username, password, permission, direction, username_user;

        name = jTextField_Name.getText().trim();
        telephone = jTextField_Telephone.getText().trim();
        username = jTextField_Username.getText().trim();
        password = jPasswordField_Password.getText().trim();
        username_user = value.jLabel_Username.getText().trim();
        permission = jComboBox_Permission.getSelectedItem().toString();
        direction = jComboBox_Direction.getSelectedItem().toString();
        
        jLabel_Name.setText(username_user);

        if (name.equals("")) {

            jLabel_Name.setForeground(Color.red);
            flag++;

        } else {

            jLabel_Name.setForeground(new java.awt.Color(240, 240, 240));

        }

        if (telephone.equals("")) {

            jLabel_Telephone.setForeground(Color.red);
            flag++;

        } else {

            jLabel_Telephone.setForeground(new java.awt.Color(240, 240, 240));

        }

        if (username.equals("")) {

            jLabel_Username.setForeground(Color.red);
            flag++;

        } else {

            jLabel_Username.setForeground(new java.awt.Color(240, 240, 240));

        }

        if (password.equals("")) {

            jLabel_Password.setForeground(Color.red);
            flag++;

        } else {

            jLabel_Password.setForeground(new java.awt.Color(240, 240, 240));

        }

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

        //Condición para validar que los campos esten llenos...
        if (flag == 0) {
            //Condicion para validar que se haya seleccionado algún permiso...
            if (flag_two == 0) {
                //Condición para validar que se haya seleccionado alguna dirección...
                if (flag_tree == 0) {

                    //Algoritmo para validar que el nombre usuario sea valido...
                    try {

                        Connection cn = BD_Connection.connection();
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

                                Connection cn2 = BD_Connection.connection();
                                PreparedStatement pst2 = cn2.prepareStatement(
                                        "insert into user values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

                                pst2.setInt(1, 0);
                                pst2.setString(2, name);
                                pst2.setString(3, username);
                                pst2.setString(4, password);
                                pst2.setString(5, telephone);
                                pst2.setString(6, direction);
                                pst2.setString(7, permission);
                                pst2.setString(8, username_user);
                                pst2.setString(9, "");
                                pst2.setString(10, "Activo");
                                pst2.executeUpdate();

                                //Pintar();
                                //Limpiar();
                                
                                JOptionPane.showMessageDialog(null, "Registro Exitoso.", "Exito", 
                                        JOptionPane.INFORMATION_MESSAGE);

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

            JOptionPane.showMessageDialog(null, "¡Debes llenar todos los campos!", "!Acceso Denegado!",
                    JOptionPane.WARNING_MESSAGE);

        }

    }//GEN-LAST:event_jButton_RegisterMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Register;
    private javax.swing.JComboBox<String> jComboBox_Direction;
    private javax.swing.JComboBox<String> jComboBox_Permission;
    private javax.swing.JLabel jLabel_Direction;
    private javax.swing.JLabel jLabel_Name;
    private javax.swing.JLabel jLabel_Password;
    private javax.swing.JLabel jLabel_Permission;
    private javax.swing.JLabel jLabel_Telephone;
    private javax.swing.JLabel jLabel_Username;
    private javax.swing.JPasswordField jPasswordField_Password;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    public javax.swing.JTextField jTextField_Name;
    public javax.swing.JTextField jTextField_Telephone;
    public javax.swing.JTextField jTextField_Username;
    // End of variables declaration//GEN-END:variables
}
