package login;

import java.awt.Color;
import OtherClass.EncryptPassword;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.net.InetAddress;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import validateIp.IpRequest;
import view.Dashboard;

public class Login extends javax.swing.JFrame {

    public static int ID_User;
    public static String user, type_account, direction, name;
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

        Request_User_Login request_User_Login = new Request_User_Login();
        Thread hilo = new Thread(request_User_Login);
        hilo.start();

        IpRequest serialRequest = new IpRequest();
        Thread thread = new Thread(serialRequest);
        thread.start();

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
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        jPanel_Background.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 400, 45));

        jPasswordField1.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(240, 240, 240));
        jPasswordField1.setBorder(null);
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });
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

        User_Login user_Login = new User_Login();

        //Validación de que todos los campos estén llenos.
        if (!user2.equals("") && !pass2.equals("")) {

            //Instancia para encriptar la contraseña...
            pass2 = encryptPassword.ecnode("@BBCompany.ca", pass2);

            try {

                user_Login = user_Login.Compare_Login(user2, pass2);

            } catch (InterruptedException ex) {

                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);

            }

            if (user_Login != null) {

                if (user_Login.getStatus().equals("Activo")) {

                    ID_User = user_Login.getID();
                    user = user_Login.getUsername();
                    type_account = user_Login.getPermission();
                    direction = user_Login.getDirection();
                    name = user_Login.getName();

                    this.dispose();
                    Dashboard.getInstance().setVisible(true);

                } else {

                    jLabel_Anwser.setFont(new java.awt.Font("Roboto", 0, 22));
                    jLabel_Anwser.setForeground(Color.red);
                    jLabel_Anwser.setText("¡Usuario inactivo! contacte a un Administrador...");

                    jTextField1.setText("");
                    jTextField1.requestFocus();
                    jPasswordField1.setText("");

                }

            } else {

                jLabel_Anwser.setFont(new java.awt.Font("Roboto", 0, 24));
                jLabel_Anwser.setForeground(new Color(240, 240, 240));
                jLabel_Anwser.setText("¡Datos de acceso incorrectos!");

                jTextField1.setText("");
                jTextField1.requestFocus();
                jPasswordField1.setText("");

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

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            //Obtención de los datos ingresados por el usuario...
            String user2 = jTextField1.getText().trim();
            String pass2 = jPasswordField1.getText().trim();

            User_Login user_Login = new User_Login();

            //Validación de que todos los campos estén llenos.
            if (!user2.equals("") && !pass2.equals("")) {

                //Instancia para encriptar la contraseña...
                pass2 = encryptPassword.ecnode("@BBCompany.ca", pass2);

                try {

                    user_Login = user_Login.Compare_Login(user2, pass2);

                } catch (InterruptedException ex) {

                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);

                }

                if (user_Login != null) {

                    if (user_Login.getStatus().equals("Activo")) {

                        ID_User = user_Login.getID();
                        user = user_Login.getUsername();
                        type_account = user_Login.getPermission();
                        direction = user_Login.getDirection();
                        name = user_Login.getName();

                        this.dispose();
                        Dashboard.getInstance().setVisible(true);

                    } else {

                        jLabel_Anwser.setFont(new java.awt.Font("Roboto", 0, 22));
                        jLabel_Anwser.setForeground(Color.red);
                        jLabel_Anwser.setText("¡Usuario inactivo! contacte a un Administrador...");

                        jTextField1.setText("");
                        jTextField1.requestFocus();
                        jPasswordField1.setText("");

                    }

                } else {

                    jLabel_Anwser.setFont(new java.awt.Font("Roboto", 0, 24));
                    jLabel_Anwser.setForeground(new Color(240, 240, 240));
                    jLabel_Anwser.setText("¡Datos de acceso incorrectos!");

                    jTextField1.setText("");
                    jTextField1.requestFocus();
                    jPasswordField1.setText("");

                }

            } else {

                //Mensaje en dado caso que alguno de los campos esté vacio...
                jLabel_Anwser.setText("¡Debes llenar todos los campos!");

            }

        }

    }//GEN-LAST:event_jTextField1KeyPressed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            //Obtención de los datos ingresados por el usuario...
            String user2 = jTextField1.getText().trim();
            String pass2 = jPasswordField1.getText().trim();

            User_Login user_Login = new User_Login();

            //Validación de que todos los campos estén llenos.
            if (!user2.equals("") && !pass2.equals("")) {

                //Instancia para encriptar la contraseña...
                pass2 = encryptPassword.ecnode("@BBCompany.ca", pass2);

                try {

                    user_Login = user_Login.Compare_Login(user2, pass2);

                } catch (InterruptedException ex) {

                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);

                }

                if (user_Login != null) {

                    if (user_Login.getStatus().equals("Activo")) {

                        ID_User = user_Login.getID();
                        user = user_Login.getUsername();
                        type_account = user_Login.getPermission();
                        direction = user_Login.getDirection();
                        name = user_Login.getName();

                        this.dispose();
                        Dashboard.getInstance().setVisible(true);

                    } else {

                        jLabel_Anwser.setFont(new java.awt.Font("Roboto", 0, 22));
                        jLabel_Anwser.setForeground(Color.red);
                        jLabel_Anwser.setText("¡Usuario inactivo! contacte a un Administrador...");

                        jTextField1.setText("");
                        jTextField1.requestFocus();
                        jPasswordField1.setText("");

                    }

                } else {

                    jLabel_Anwser.setFont(new java.awt.Font("Roboto", 0, 24));
                    jLabel_Anwser.setForeground(new Color(240, 240, 240));
                    jLabel_Anwser.setText("¡Datos de acceso incorrectos!");

                    jTextField1.setText("");
                    jTextField1.requestFocus();
                    jPasswordField1.setText("");

                }

            } else {

                //Mensaje en dado caso que alguno de los campos esté vacio...
                jLabel_Anwser.setText("¡Debes llenar todos los campos!");

            }

        }

    }//GEN-LAST:event_jPasswordField1KeyPressed

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
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
