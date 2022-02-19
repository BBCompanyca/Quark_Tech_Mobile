package view;

import java.sql.*;
import clases.BD_Connection;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
    public static String user;
    public String pass;

    public Login() {
        initComponents();
        
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(700, 500);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Background = new javax.swing.JPanel();
        jLabel_Sing_In = new javax.swing.JLabel();
        jLabel_Information = new javax.swing.JLabel();
        jTextField_Username = new jtextfieldround.JTextFieldRound();
        jPasswordField_Password = new jtextfieldround.JPasswordFieldRound();
        jLabel_Footer = new javax.swing.JLabel();
        jLabel_Anwser = new javax.swing.JLabel();
        jButton_Acceder = new javax.swing.JButton();
        jLabel_Backgound_Down = new javax.swing.JLabel();
        jPanel_Exit = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel_Password = new javax.swing.JLabel();
        jLabel_Username = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_Background.setBackground(new java.awt.Color(9, 53, 69));
        jPanel_Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Sing_In.setFont(new java.awt.Font("Roboto", 0, 48)); // NOI18N
        jLabel_Sing_In.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Sing_In.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Sing_In.setText("INICIAR SESION");
        jPanel_Background.add(jLabel_Sing_In, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 700, 60));

        jLabel_Information.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Information.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Information.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Information.setText("Sistema de gestion de información de Quark Tech Mobile");
        jPanel_Background.add(jLabel_Information, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 700, 30));

        jTextField_Username.setBackground(new java.awt.Color(34, 73, 87));
        jTextField_Username.setCaretColor(new java.awt.Color(240, 240, 240));
        jTextField_Username.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextField_Username.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextField_Username.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Username.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        jTextField_Username.setSelectionColor(new java.awt.Color(0, 153, 153));
        jPanel_Background.add(jTextField_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        jPasswordField_Password.setBackground(new java.awt.Color(34, 73, 87));
        jPasswordField_Password.setCaretColor(new java.awt.Color(240, 240, 240));
        jPasswordField_Password.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jPasswordField_Password.setForeground(new java.awt.Color(240, 240, 240));
        jPasswordField_Password.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        jPasswordField_Password.setSelectionColor(new java.awt.Color(0, 153, 153));
        jPanel_Background.add(jPasswordField_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));

        jLabel_Footer.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel_Footer.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Footer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Footer.setText("Creado Por @BBCompany.ca");
        jPanel_Background.add(jLabel_Footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 700, -1));

        jLabel_Anwser.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Anwser.setForeground(new java.awt.Color(250, 250, 250));
        jLabel_Anwser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel_Background.add(jLabel_Anwser, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 410, 50));

        jButton_Acceder.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Acceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Login btn dark.png"))); // NOI18N
        jButton_Acceder.setBorder(null);
        jButton_Acceder.setBorderPainted(false);
        jButton_Acceder.setContentAreaFilled(false);
        jButton_Acceder.setFocusPainted(false);
        jButton_Acceder.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_Acceder.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Login btn ligth.png"))); // NOI18N
        jButton_Acceder.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Login btn ligth.png"))); // NOI18N
        jButton_Acceder.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Login btn ligth.png"))); // NOI18N
        jButton_Acceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_AccederMousePressed(evt);
            }
        });
        jPanel_Background.add(jButton_Acceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 220, 60));

        jLabel_Backgound_Down.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Backgound_Down.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Vectors .png"))); // NOI18N
        jPanel_Background.add(jLabel_Backgound_Down, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 700, 90));

        jPanel_Exit.setBackground(new java.awt.Color(9, 53, 69));
        jPanel_Exit.setForeground(new java.awt.Color(255, 255, 255));
        jPanel_Exit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("X");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        jPanel_Exit.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jPanel_Background.add(jPanel_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 2, 30, 30));

        jLabel_Password.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_Password.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Password.setText("Contraseña:");
        jPanel_Background.add(jLabel_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 220, -1));

        jLabel_Username.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_Username.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Username.setText("Nombre de usuario:");
        jPanel_Background.add(jLabel_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 220, -1));

        getContentPane().add(jPanel_Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        
        jPanel_Exit.setBackground(Color.red);
        
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        
        jPanel_Exit.setBackground(new java.awt.Color(9, 53, 69));
        
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        
        System.exit(0);
        
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton_AccederMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_AccederMousePressed
        
        //Obtención de los datos ingresados por el usuario...
        user = jTextField_Username.getText().trim();
        pass = jPasswordField_Password.getText().trim();
        
        //Validación de que todos los campos estén llenos.
        if (!user.equals("") && !pass.equals("")) {
            
            try {
                
                //Conexión a la base de datos para consultar los datos del usuario...
                Connection cn = BD_Connection.connection();
                PreparedStatement pst = cn.prepareStatement(
                        "select username, password from user where username = '" + user + "' and password = '" + pass + "'");
                
                ResultSet rs = pst.executeQuery();
                
                if (rs.next()) {
                    
                    //Si encuentra los valores cierra la ventana de login y abre la ventanta principal...
                    this.dispose();
                    Dashboard window = new Dashboard();
                    window.setVisible(true);
                    
                } else {
                    
                    //Si no encuentra los valores dejará un mensaje y limpiará los campos...
                    jLabel_Anwser.setText("¡Datos de acceso incorrectos!");
                    
                    jTextField_Username.setText("");
                    jTextField_Username.requestFocus();
                    jPasswordField_Password.setText("");
                    
                }
                
                cn.close();
                
            } catch (SQLException e) {
                
                //Mensaje de error para alertar que algo no funciona en el Login...
                System.err.println("¡Error en el botón de acceder! " + e);
                JOptionPane.showMessageDialog(null, "¡Error en el boton acceder!");
                
            } 
            
        } else {
            
            //Mensaje en dado caso que alguno de los campos esté vacio...
            jLabel_Anwser.setText("¡Debes llenar todos los campos!");
            
        }
        
    }//GEN-LAST:event_jButton_AccederMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton_Acceder;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel_Anwser;
    private javax.swing.JLabel jLabel_Backgound_Down;
    private javax.swing.JLabel jLabel_Footer;
    private javax.swing.JLabel jLabel_Information;
    private javax.swing.JLabel jLabel_Password;
    private javax.swing.JLabel jLabel_Sing_In;
    private javax.swing.JLabel jLabel_Username;
    private javax.swing.JPanel jPanel_Background;
    private javax.swing.JPanel jPanel_Exit;
    public jtextfieldround.JPasswordFieldRound jPasswordField_Password;
    public jtextfieldround.JTextFieldRound jTextField_Username;
    // End of variables declaration//GEN-END:variables
}
