package view;

import java.sql.*;
import clases.BD_Connection;
import java.awt.Color;
import javax.swing.JOptionPane;
import clases.EncryptPassword;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Login extends javax.swing.JFrame {

    public static int ID_User;
    public static String user;
    public static String type_account;
    public static String direction;
    public String pass;

    EncryptPassword encryptPassword = new EncryptPassword();

    public Login() {
        initComponents();

        setLocationRelativeTo(null);
        setResizable(false);
        setSize(1040, 630);

        jTextField1.setBackground(new java.awt.Color(0, 0, 0, 0));
        jPasswordField1.setBackground(new java.awt.Color(0, 0, 0, 0));

        ImageIcon wallpaper = new ImageIcon(System.getProperty("user.home") + "\\Desktop\\quark_tech_mobile\\images\\LOGO BBC.png");
        Icon fondo = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(),
                jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(fondo);
        this.repaint();

        Frase();

    }

    @Override
    public Image getIconImage() {

        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/LOGO BBC64.png"));

        return retValue;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Exit = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel_Background = new javax.swing.JPanel();
        jLabel_Footer = new javax.swing.JLabel();
        jLabel_Anwser = new javax.swing.JLabel();
        jButton_Acceder = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel_Frase = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_Backgound_Down = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        getContentPane().add(jPanel_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1008, 2, 30, 30));

        jPanel_Background.setBackground(new java.awt.Color(9, 53, 69));
        jPanel_Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Footer.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel_Footer.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Footer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Footer.setText("Creado Por @BBCompany.ca");
        jPanel_Background.add(jLabel_Footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 1040, -1));

        jLabel_Anwser.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel_Anwser.setForeground(new java.awt.Color(250, 250, 250));
        jLabel_Anwser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel_Background.add(jLabel_Anwser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 500, 50));

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
        jPanel_Background.add(jButton_Acceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 430, 220, 60));

        jTextField1.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(240, 240, 240));
        jTextField1.setBorder(null);
        jPanel_Background.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 400, 45));

        jPasswordField1.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(240, 240, 240));
        jPasswordField1.setBorder(null);
        jPanel_Background.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 333, 400, 45));

        jLabel_Frase.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel_Frase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Frase.setAutoscrolls(true);
        jPanel_Background.add(jLabel_Frase, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 490, 460, 50));

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_Background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 390, 160, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Login.png"))); // NOI18N
        jPanel_Background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 480, 500));

        jLabel_Backgound_Down.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Backgound_Down.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Vectors .png"))); // NOI18N
        jPanel_Background.add(jLabel_Backgound_Down, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 1160, 90));

        jLabel_Wallpaper.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LOGO BBC.png"))); // NOI18N
        jPanel_Background.add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 80, 470, 380));

        getContentPane().add(jPanel_Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_AccederMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_AccederMousePressed

        //Obtención de los datos ingresados por el usuario...
        String user2 = jTextField1.getText().trim();
        String pass2 = jPasswordField1.getText().trim();
        String status;

        //Validación de que todos los campos estén llenos.
        if (!user2.equals("") && !pass2.equals("")) {

            //Instancia para encriptar la contraseña...
            pass2 = encryptPassword.ecnode("@BBCompany.ca", pass2);

            try {

                //Conexión a la base de datos para consultar los datos del usuario...
                Connection cn = BD_Connection.connection();
                PreparedStatement pst = cn.prepareStatement(
                        "select id_user, username, password, direction, type_account, status from user where "
                        + "username = '" + user2 + "' and password = '" + pass2 + "'");

                ResultSet rs = pst.executeQuery();

                if (rs.next()) {

                    ID_User = rs.getInt("id_user");
                    status = rs.getString("status");
                    type_account = rs.getString("type_account");
                    user = rs.getString("username");
                    pass = rs.getString("password");
                    direction = rs.getString("direction");

                    if (user.equals(user2) && pass.equals(pass2)) {

                        //Condicional para validar que el usuario esté activo...
                        if (status.equals("Activo")) {

                            this.dispose();
                            Dashboard window = new Dashboard();
                            window.setVisible(true);

                        } else {

                            //Si el usuario está inactivo dejará un mensaje y limpiará los campos...
                            jLabel_Anwser.setFont(new java.awt.Font("Roboto", 0, 22));
                            jLabel_Anwser.setForeground(Color.red);
                            jLabel_Anwser.setText("¡Usuario inactivo! contacte a un Administrador...");

                            jTextField1.setText("");
                            jTextField1.requestFocus();
                            jPasswordField1.setText("");

                        }

                    } else {

                        //Si los valores no son exactamente iguales...
                        jLabel_Anwser.setText("¡Datos de acceso incorrectos!");

                        jTextField1.setText("");
                        jTextField1.requestFocus();
                        jPasswordField1.setText("");

                        jLabel_Anwser.setForeground(Color.WHITE);
                        jLabel_Anwser.setFont(new java.awt.Font("Roboto", 0, 24));

                    }

                } else {

                    //Si no encuentra los valores dejará un mensaje y limpiará los campos...
                    jLabel_Anwser.setText("¡Datos de acceso incorrectos!");

                    jTextField1.setText("");
                    jTextField1.requestFocus();
                    jPasswordField1.setText("");

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

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered

        jPanel_Exit.setBackground(Color.red);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited

        jPanel_Exit.setBackground(new java.awt.Color(9, 53, 69));
    }//GEN-LAST:event_jLabel4MouseExited

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel_Anwser;
    private javax.swing.JLabel jLabel_Backgound_Down;
    private javax.swing.JLabel jLabel_Footer;
    private javax.swing.JLabel jLabel_Frase;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JPanel jPanel_Background;
    private javax.swing.JPanel jPanel_Exit;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void Frase() {

        int numero = (int) (Math.random() * 10);

        switch (numero) {

            case 0:

                jLabel_Frase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/0.png")));
                break;

            case 1:

                jLabel_Frase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1.png")));
                break;

            case 2:

                jLabel_Frase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2.png")));
                break;

            case 3:

                jLabel_Frase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3.png")));
                break;

            case 4:

                jLabel_Frase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4.png")));
                break;

            case 5:

                jLabel_Frase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/5.png")));
                break;

            case 6:

                jLabel_Frase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/6.png")));
                break;

            case 7:

                jLabel_Frase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/7.png")));
                break;

            case 8:

                jLabel_Frase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/8.png")));
                break;

            case 9:

                jLabel_Frase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/9.png")));
                break;

            default:
                System.out.println("El numero que salio fue: " + numero);
                break;
        }

    }

}
