package view;

import java.sql.*;
import clases.BD_Connection;
import clases.TextPrompt;
import java.awt.Color;
import javax.swing.JOptionPane;
import clases.EncryptPassword;
import clases.Paneles;

public class Reset_Password extends javax.swing.JPanel {

    int ID;
    String name_user;
    
    Paneles paneles = new Paneles();
    EncryptPassword encryptPassword = new EncryptPassword();

    public Reset_Password() {
        initComponents();

        ID = Users.ID;
        name_user = Update_User.name_user;

        //Titulo del panel...
        jLabel_Title.setText("Restaurar La Contraseña Del Usuario - " + name_user);

        //Objetos para el PlayHolders de los campos de texto...
        TextPrompt password = new TextPrompt("Ingrese la contraseña", jPasswordField_Password);
        TextPrompt PasswordConfirm = new TextPrompt("Confirme la contraseña", jPasswordField_ConfirmPassword);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_newPass = new javax.swing.JLabel();
        jPasswordField_ConfirmPassword = new javax.swing.JPasswordField();
        jLabel_confirmPass = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton_Restart = new javax.swing.JButton();
        jLabel_Title = new javax.swing.JLabel();
        jPasswordField_Password = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(9, 53, 69));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_newPass.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel_newPass.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_newPass.setText("Contraseña:");
        add(jLabel_newPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        jPasswordField_ConfirmPassword.setBackground(new java.awt.Color(9, 53, 69));
        jPasswordField_ConfirmPassword.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jPasswordField_ConfirmPassword.setForeground(new java.awt.Color(240, 240, 240));
        jPasswordField_ConfirmPassword.setBorder(null);
        jPasswordField_ConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_ConfirmPasswordActionPerformed(evt);
            }
        });
        add(jPasswordField_ConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 250, 30));

        jLabel_confirmPass.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel_confirmPass.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_confirmPass.setText("Confirmar contraseña:");
        add(jLabel_confirmPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 250, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 250, 10));

        jButton_Restart.setText("Restaurar");
        jButton_Restart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_RestartMousePressed(evt);
            }
        });
        add(jButton_Restart, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 190, 40));

        jLabel_Title.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        jLabel_Title.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Title.setText("Restaurar contraseña usuario - Name");
        add(jLabel_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 890, 50));

        jPasswordField_Password.setBackground(new java.awt.Color(9, 53, 69));
        jPasswordField_Password.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jPasswordField_Password.setForeground(new java.awt.Color(240, 240, 240));
        jPasswordField_Password.setBorder(null);
        jPasswordField_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_PasswordActionPerformed(evt);
            }
        });
        add(jPasswordField_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 250, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField_ConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_ConfirmPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_ConfirmPasswordActionPerformed

    private void jPasswordField_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_PasswordActionPerformed

    private void jButton_RestartMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RestartMousePressed

        int flag = 0;

        //Get values of password...
        String newPass = jPasswordField_Password.getText().trim();
        String confirmPass = jPasswordField_ConfirmPassword.getText().trim();

        //Validate the camp not is null...
        if (newPass.equals("")) {

            flag++;
            jLabel_newPass.setForeground(Color.red);

        } else {

            jLabel_newPass.setForeground(new java.awt.Color(240, 240, 240));

        }

        //Validate the camp not is null...
        if (confirmPass.equals("")) {

            flag++;
            jLabel_confirmPass.setForeground(Color.red);

        } else {

            jLabel_confirmPass.setForeground(new java.awt.Color(240, 240, 240));

        }

        if (flag == 0) {

            newPass = encryptPassword.ecnode("@BBCompany.ca", newPass);

            try {

                Connection cn = BD_Connection.connection();
                PreparedStatement pst = cn.prepareStatement("update user set password = ? where id_user = '" + ID + "'");

                pst.setString(1, newPass);
                pst.executeUpdate();

                jPasswordField_Password.setText("");
                jPasswordField_ConfirmPassword.setText("");

                jLabel_newPass.setForeground(Color.GREEN);
                jLabel_confirmPass.setForeground(Color.GREEN);

                JOptionPane.showMessageDialog(null, "Contraseña restaurada.", "¡Exito!", JOptionPane.INFORMATION_MESSAGE);

                cn.close();

                paneles.PanelUsers();

            } catch (SQLException e) {

                System.err.println("¡Error al modificar la contraseña! " + e);
                JOptionPane.showMessageDialog(null, "Error al modificar la contraseña", "¡Error!", JOptionPane.OK_OPTION);
            }

        } else {

            JOptionPane.showMessageDialog(null, "¡Debes llenar todos los campos!", "!Acceso Denegado!", JOptionPane.WARNING_MESSAGE);

        }

    }//GEN-LAST:event_jButton_RestartMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Restart;
    private javax.swing.JLabel jLabel_Title;
    private javax.swing.JLabel jLabel_confirmPass;
    private javax.swing.JLabel jLabel_newPass;
    private javax.swing.JPasswordField jPasswordField_ConfirmPassword;
    private javax.swing.JPasswordField jPasswordField_Password;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

}
