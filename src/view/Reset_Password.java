package view;

import java.sql.*;
import clases.BD_Connection;
import clases.TextPrompt;

public class Reset_Password extends javax.swing.JPanel {

    int ID;
    String name_user;
    
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

        jLabel1 = new javax.swing.JLabel();
        jPasswordField_ConfirmPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel_Title = new javax.swing.JLabel();
        jPasswordField_Password = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(9, 53, 69));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Contraseña:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, -1));

        jPasswordField_ConfirmPassword.setBackground(new java.awt.Color(9, 53, 69));
        jPasswordField_ConfirmPassword.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jPasswordField_ConfirmPassword.setForeground(new java.awt.Color(240, 240, 240));
        jPasswordField_ConfirmPassword.setBorder(null);
        jPasswordField_ConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_ConfirmPasswordActionPerformed(evt);
            }
        });
        add(jPasswordField_ConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 250, 30));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Confirmar contraseña:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 250, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 250, 10));

        jButton1.setText("Restaurar");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 190, 40));

        jLabel_Title.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel_Title.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Title.setText("Restaurar contraseña usuario - Neifer Reveron");
        add(jLabel_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 790, 50));

        jPasswordField_Password.setBackground(new java.awt.Color(9, 53, 69));
        jPasswordField_Password.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jPasswordField_Password.setForeground(new java.awt.Color(240, 240, 240));
        jPasswordField_Password.setBorder(null);
        jPasswordField_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_PasswordActionPerformed(evt);
            }
        });
        add(jPasswordField_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 250, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField_ConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_ConfirmPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_ConfirmPasswordActionPerformed

    private void jPasswordField_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_PasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Title;
    private javax.swing.JPasswordField jPasswordField_ConfirmPassword;
    private javax.swing.JPasswordField jPasswordField_Password;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
