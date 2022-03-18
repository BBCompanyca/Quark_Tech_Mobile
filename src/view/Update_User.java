package view;

import clases.TextPrompt;
import java.sql.*;
import clases.BD_Connection;
import clases.FormatText;
import clases.Paneles;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Update_User extends javax.swing.JPanel {

    //Objeto para llamar los paneles...
    Paneles paneles = new Paneles();
    
    //Objeto para darle formato a los campos de texto.
    FormatText formattext = new FormatText();

    public static String name_user;
    String username_login, username_this, type_Account, type_Account_this, status_this;
    int ID;

    public Update_User() {
        initComponents();

        //Variables para consultar la información del usuario...
        ID = Users.ID;
        username_login = Login.user;
        type_Account = Login.type_account;

        TextPrompt name = new TextPrompt("Ingrese el nombre", jTextField_Name);
        TextPrompt username = new TextPrompt("Ingrese el nombre de usuario", jTextField_Username);
        TextPrompt telephone = new TextPrompt("Ingrese el número de teléfono", jTextField_Telephone);

        //Método para consultar la información del usuario...
        getInformationUser();

        //Método para validar los permisos de modificar la información...
        ValidateUpdate();
        
        //Intancia para darle formato a los campos de texto...
        formattext.ValidateName(jTextField_Name);
        formattext.ValidateNumber(jTextField_Telephone);
        formattext.ValidateUsername(jTextField_Username);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Name = new javax.swing.JLabel();
        jTextField_Name = new javax.swing.JTextField();
        jTextField_Telephone = new javax.swing.JTextField();
        jLabel_Status = new javax.swing.JLabel();
        jTextField_Username = new javax.swing.JTextField();
        jLabel_Username = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Last_Modification = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jComboBox_Type_Account = new javax.swing.JComboBox<>();
        jComboBox_Direction = new javax.swing.JComboBox<>();
        jComboBox_Status = new javax.swing.JComboBox<>();
        jLabel_Telephono = new javax.swing.JLabel();
        jLabel_Type_Account = new javax.swing.JLabel();
        jLabel_Direction = new javax.swing.JLabel();
        jButton_Update = new javax.swing.JButton();
        jButton_RestartPassword = new javax.swing.JButton();
        jLabel_Title = new javax.swing.JLabel();

        setBackground(new java.awt.Color(9, 53, 69));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Name.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Name.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Name.setText("Nombre:");
        add(jLabel_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jTextField_Name.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Name.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Name.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Name.setBorder(null);
        jTextField_Name.setCaretColor(new java.awt.Color(240, 240, 240));
        add(jTextField_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 240, 30));

        jTextField_Telephone.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Telephone.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Telephone.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Telephone.setBorder(null);
        jTextField_Telephone.setCaretColor(new java.awt.Color(240, 240, 240));
        add(jTextField_Telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 240, 30));

        jLabel_Status.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Status.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Status.setText("Estatus:");
        add(jLabel_Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, -1));

        jTextField_Username.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Username.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Username.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Username.setBorder(null);
        jTextField_Username.setCaretColor(new java.awt.Color(240, 240, 240));
        add(jTextField_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 240, 30));

        jLabel_Username.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Username.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Username.setText("Nombre De Usuario:");
        add(jLabel_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Modificado Por:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, -1, -1));

        jTextField_Last_Modification.setEditable(false);
        jTextField_Last_Modification.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Last_Modification.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Last_Modification.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Last_Modification.setBorder(null);
        jTextField_Last_Modification.setCaretColor(new java.awt.Color(240, 240, 240));
        add(jTextField_Last_Modification, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 240, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 240, -1));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 240, -1));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 240, -1));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 240, -1));

        jComboBox_Type_Account.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Moderador", "Administrador", "Vendedor", "Tecnico" }));
        add(jComboBox_Type_Account, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 110, -1));

        jComboBox_Direction.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Almacen", "Caricuao", "City Market" }));
        jComboBox_Direction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_DirectionActionPerformed(evt);
            }
        });
        add(jComboBox_Direction, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 100, -1));

        jComboBox_Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        add(jComboBox_Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, -1));

        jLabel_Telephono.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Telephono.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Telephono.setText("Teléfono:");
        add(jLabel_Telephono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel_Type_Account.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Type_Account.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Type_Account.setText("Permisos De:");
        add(jLabel_Type_Account, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel_Direction.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Direction.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Direction.setText("Dirección:");
        add(jLabel_Direction, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        jButton_Update.setText("Modificar");
        jButton_Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_UpdateMousePressed(evt);
            }
        });
        add(jButton_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 140, 40));

        jButton_RestartPassword.setText("Contraseña");
        jButton_RestartPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_RestartPasswordMousePressed(evt);
            }
        });
        add(jButton_RestartPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 140, 40));

        jLabel_Title.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel_Title.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Title.setText("jLabel1");
        add(jLabel_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 790, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_DirectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_DirectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_DirectionActionPerformed

    private void jButton_UpdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_UpdateMousePressed

        int flag = 0, flag_two = 0, flag_tree = 0;

        String name, username, telephone, direction, type_account, status;

        name = jTextField_Name.getText().trim();
        telephone = jTextField_Telephone.getText().trim();
        username = jTextField_Username.getText().trim();
        direction = jComboBox_Direction.getSelectedItem().toString();
        status = jComboBox_Status.getSelectedItem().toString();
        type_account = jComboBox_Type_Account.getSelectedItem().toString();

        if (name.equals("")) {

            flag++;
            jLabel_Name.setForeground(Color.red);

        } else {

            jLabel_Name.setForeground(new java.awt.Color(240, 240, 240));

        }

        if (telephone.equals("")) {

            flag++;
            jLabel_Telephono.setForeground(Color.red);

        } else {

            jLabel_Telephono.setForeground(new java.awt.Color(240, 240, 240));

        }

        if (username.equals("")) {

            flag++;
            jLabel_Username.setForeground(Color.red);

        } else {

            jLabel_Username.setForeground(new java.awt.Color(240, 240, 240));

        }

        if (type_account.equals("...")) {

            flag_two++;
            jLabel_Type_Account.setForeground(Color.red);

        } else {

            jLabel_Type_Account.setForeground(new java.awt.Color(240, 240, 240));

        }

        if (direction.equals("...")) {

            flag_tree++;
            jLabel_Direction.setForeground(Color.red);

        } else {

            jLabel_Direction.setForeground(new java.awt.Color(240, 240, 240));

        }

        //Condición para validar que todos los campos esten llenos...
        if (flag == 0) {

            //Condición para validar que esté seleccionado algún permiso...
            if (flag_two == 0) {

                //Condición para validar que esté seleccionada alguna dirección...
                if (flag_tree == 0) {

                    try {

                        Connection cn = BD_Connection.connection();
                        PreparedStatement pst = cn.prepareStatement(
                                "select username from user where username = '" + username + "' "
                                + "and not id_user = '" + ID + "'");

                        ResultSet rs = pst.executeQuery();

                        if (rs.next()) {

                            jTextField_Username.setText("");
                            jTextField_Username.requestFocus();
                            jLabel_Username.setForeground(Color.red);

                            JOptionPane.showMessageDialog(null, "¡Nombre de usuario no disponible!", "¡Acceso Denegado!",
                                    JOptionPane.OK_CANCEL_OPTION);

                            cn.close();

                        } else {

                            cn.close();

                            try {
                                
                                String unformat_telephone_user = formattext.unFormatText(telephone);

                                Connection cn2 = BD_Connection.connection();
                                PreparedStatement pst2 = cn2.prepareStatement(
                                        "update user set name_user = ?, telephone = ?, unformat_telephone_user = ?, "
                                        + "username = ?, last_modification = ?, direction = ?, type_account = ?, status = ? "
                                        + "where id_user = '" + ID + "'");

                                pst2.setString(1, name);
                                pst2.setString(2, telephone);
                                pst2.setString(3, unformat_telephone_user);
                                pst2.setString(4, username);
                                pst2.setString(5, username_login);
                                pst2.setString(6, direction);
                                pst2.setString(7, type_account);
                                pst2.setString(8, status);
                                pst2.executeUpdate();

                                ClearCamps();

                                JOptionPane.showMessageDialog(null, "Modificación exitosa.");

                                cn2.close();

                                paneles.PanelUsers();

                            } catch (SQLException e) {

                                System.err.println("¡Error al modificar la información del usuario! " + e);
                                JOptionPane.showMessageDialog(null, "¡Error al modificar la información del usuario!", "¡Acceso Denegado!",
                                        JOptionPane.OK_CANCEL_OPTION);

                            }

                        }

                    } catch (SQLException e) {

                        System.err.println("¡Error al consultar el nombre de usuario! " + e);
                        JOptionPane.showMessageDialog(null, "¡Error al consultar el nombre de usuario!", "¡Acceso Denegado!",
                                JOptionPane.OK_CANCEL_OPTION);

                    }

                } else {

                    JOptionPane.showMessageDialog(null, "¡Debes seleccionar alguna dirección!", "¡Acceso Denegado!",
                            JOptionPane.OK_OPTION);

                }

            } else {

                JOptionPane.showMessageDialog(null, "¡Debes seleccionar algún tipo de permiso!", "¡Acceso Denegado!",
                        JOptionPane.OK_OPTION);

            }

        } else {

            JOptionPane.showMessageDialog(null, "¡Debes llenar todos los campos!", "¡Acceso Denegado!",
                    JOptionPane.OK_OPTION);

        }

    }//GEN-LAST:event_jButton_UpdateMousePressed

    private void jButton_RestartPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RestartPasswordMousePressed

        paneles.PanelResetPassword();

    }//GEN-LAST:event_jButton_RestartPasswordMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_RestartPassword;
    private javax.swing.JButton jButton_Update;
    private javax.swing.JComboBox<String> jComboBox_Direction;
    private javax.swing.JComboBox<String> jComboBox_Status;
    private javax.swing.JComboBox<String> jComboBox_Type_Account;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_Direction;
    private javax.swing.JLabel jLabel_Name;
    private javax.swing.JLabel jLabel_Status;
    private javax.swing.JLabel jLabel_Telephono;
    private javax.swing.JLabel jLabel_Title;
    private javax.swing.JLabel jLabel_Type_Account;
    private javax.swing.JLabel jLabel_Username;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField_Last_Modification;
    private javax.swing.JTextField jTextField_Name;
    private javax.swing.JTextField jTextField_Telephone;
    private javax.swing.JTextField jTextField_Username;
    // End of variables declaration//GEN-END:variables

    //Método para consultar la información del cliente...
    private void getInformationUser() {

        try {

            Connection cn = BD_Connection.connection();
            PreparedStatement pst = cn.prepareStatement(
                    "select name_user, telephone, username, direction, status, type_account, "
                    + "last_modification from user where id_user = '" + ID + "'");

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                name_user = rs.getString("name_user");
                type_Account_this = rs.getString("type_account");

                jLabel_Title.setText("Modificar La Información Del Usuario - " + rs.getString("name_user"));
                jTextField_Name.setText(rs.getString("name_user"));
                jTextField_Telephone.setText(rs.getString("telephone"));
                jTextField_Username.setText(rs.getString("username"));
                jTextField_Last_Modification.setText(rs.getString("last_modification"));
                jComboBox_Direction.setSelectedItem(rs.getString("direction"));
                jComboBox_Status.setSelectedItem(rs.getString("status"));
                jComboBox_Type_Account.setSelectedItem(rs.getString("type_account"));

                type_Account_this = rs.getString("type_account");
                status_this = rs.getString("status");
                username_this = rs.getString("username");

            }

            cn.close();

        } catch (SQLException e) {

            System.err.println("¡Error al consultar la información de usuario! " + e);
            JOptionPane.showMessageDialog(null, "¡Error al consultar la información del cliente!", "¡Error!",
                    JOptionPane.OK_OPTION);

        }

    }

    private void ValidateUpdate() {

        //El usuario seleccionado es el que inició sesión y su cuenta es Moderador...
        if (Login.type_account.equals(type_Account_this) && Login.ID_User == Users.ID && Login.type_account.equals("Moderador")) {

            jComboBox_Direction.setEnabled(false);
            jComboBox_Status.setEnabled(false);
            jComboBox_Type_Account.setEnabled(false);
            
            jLabel_Title.setText("Información Del Usuario - " + name_user);

            //El usuario seleccionado es el que inició sesión y su cuenta es Administrador...    
        } else if (Login.type_account.equals(type_Account_this) && Login.ID_User == Users.ID && Login.type_account.equals("Administrador")) {

            jLabel_Title.setText("Información Del Usuario - " + name_user);
            
            jComboBox_Direction.setEnabled(false);
            jComboBox_Status.setEnabled(false);
            jComboBox_Type_Account.setEnabled(false);

            jLabel_Direction.setVisible(false);
            jComboBox_Direction.setVisible(false);

            add(jLabel_Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, -1));

            add(jComboBox_Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, -1));

            add(jLabel_Type_Account, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

            add(jComboBox_Type_Account, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 110, -1));

            //Mismos permisos y diferente ID... Es la cuenta de otro usuario.
        } else if (Login.type_account.equals(type_Account_this) && Login.ID_User != Users.ID) {
            
            jLabel_Title.setText("Información Del Usuario - " + name_user);

            jComboBox_Direction.setEnabled(false);
            jComboBox_Status.setEnabled(false);
            jComboBox_Type_Account.setEnabled(false);

            jTextField_Name.setEditable(false);
            jTextField_Telephone.setEditable(false);
            jTextField_Username.setEditable(false);

            jButton_Update.setVisible(false);
            jButton_RestartPassword.setVisible(false);

            //Permisos diferentes, el usuario que inició sesión es adminsitrador y el usuario seleccionado es moderador...    
        } else if (Login.type_account.equals("Administrador") && type_Account_this.equals("Moderador")) {
            
            jLabel_Title.setText("Información Del Usuario - " + name_user);

            jTextField_Name.setEditable(false);
            jTextField_Telephone.setEditable(false);
            jTextField_Username.setEditable(false);

            jButton_Update.setVisible(false);
            jButton_RestartPassword.setVisible(false);;

            jLabel_Direction.setVisible(false);
            jComboBox_Direction.setVisible(false);

            add(jLabel_Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, -1));

            add(jComboBox_Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, -1));

            add(jLabel_Type_Account, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

            add(jComboBox_Type_Account, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 110, -1));

            jComboBox_Status.setEnabled(false);
            jComboBox_Type_Account.setEnabled(false);

            //Permisos diferentes, el usuario que inició sesión es adminsitrador y el usuario seleccionado es vendedor o técnico...
        } else if (Login.type_account.equals("Administrador") && type_Account_this.equals("Vendedor") || type_Account_this.equals("Tecnico")) {

            jLabel_Title.setText("Modificar La Información Del Usuario - " + name_user);
            
            jLabel_Direction.setVisible(false);
            jComboBox_Direction.setVisible(false);

            add(jLabel_Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, -1));

            add(jComboBox_Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, -1));

            add(jLabel_Type_Account, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

            jComboBox_Type_Account.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Vendedor", "Tecnico" }));
            add(jComboBox_Type_Account, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 110, -1));

            jComboBox_Type_Account.setSelectedItem(type_Account_this);
            
        }

    }

    //Método para limpar los campos de texto...
    private void ClearCamps() {

        jLabel_Direction.setForeground(Color.GREEN);
        jLabel_Name.setForeground(Color.GREEN);
        jLabel_Status.setForeground(Color.GREEN);
        jLabel_Telephono.setForeground(Color.GREEN);
        jLabel_Type_Account.setForeground(Color.GREEN);
        jLabel_Username.setForeground(Color.GREEN);
        jLabel4.setForeground(Color.GREEN);

        jLabel_Title.setText("");
        jTextField_Name.setText("");
        jTextField_Telephone.setText("");
        jTextField_Username.setText("");
        jTextField_Last_Modification.setText("");
        jComboBox_Status.setSelectedIndex(0);
        jComboBox_Direction.setSelectedIndex(0);
        jComboBox_Type_Account.setSelectedIndex(0);

    }

}
