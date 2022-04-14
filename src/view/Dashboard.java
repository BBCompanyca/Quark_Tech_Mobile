package view;

import java.awt.Color;
import java.time.LocalDate;
import java.sql.*;
import clases.BD_Connection;
import javax.swing.JOptionPane;
import clases.Paneles;

public class Dashboard extends javax.swing.JFrame {

    //Objeto para llamar a la clase que tiene todo los paneles...
    Paneles paneles = new Paneles();

    String user, type_Account;
    int xMouse, yMouse;

    public Dashboard() {
        initComponents();

        //Diseño de la insterfaz...
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(1100, 700);

        //Nombre de usuario y tipo de cuenta del usuario que ha iniciado sesión...
        user = Login.user;
        type_Account = Login.type_account;

        //Los siguientes metodos están al final de está clase...
        //Método para obtener la fecha actual...
        Date();

        //Instancia para llamar al panel con que se va a iniciar la aplicación...
        paneles.PanelMain();

        //Método para llamar al menu correspondiente a quien inició sesión...
        PanelMenuStart();

        //Método para consultar la información del usuario que ha iniciado sesión...
        BD_Consult();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Background = new javax.swing.JPanel();
        jLabel_Footer = new javax.swing.JLabel();
        jLabel_background_Down = new javax.swing.JLabel();
        jPanel_Content_Menu = new javax.swing.JPanel();
        jPanel_Head = new javax.swing.JPanel();
        jLabel_Name = new javax.swing.JLabel();
        jLabel_Type_Account = new javax.swing.JLabel();
        jLabel_Fecha = new javax.swing.JLabel();
        jLabel_ID = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel_Exit = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel_Content = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_Username = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel_Background.setBackground(new java.awt.Color(9, 53, 69));
        jPanel_Background.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel_BackgroundMouseDragged(evt);
            }
        });
        jPanel_Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Footer.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel_Footer.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Footer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Footer.setText("Creado Por @BBCompany.ca");
        jPanel_Background.add(jLabel_Footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 1110, -1));

        jLabel_background_Down.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_background_Down.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Vectors .png"))); // NOI18N
        jPanel_Background.add(jLabel_background_Down, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 1110, 90));

        jPanel_Content_Menu.setBackground(new java.awt.Color(42, 104, 100));
        jPanel_Content_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel_Content_MenuMousePressed(evt);
            }
        });
        jPanel_Content_Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel_Background.add(jPanel_Content_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 700));

        jPanel_Head.setBackground(new java.awt.Color(78, 109, 121));
        jPanel_Head.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Name.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel_Name.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Name.setText("name");
        jPanel_Head.add(jLabel_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 55, -1, -1));

        jLabel_Type_Account.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel_Type_Account.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Type_Account.setText("Type Account");
        jPanel_Head.add(jLabel_Type_Account, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel_Fecha.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel_Fecha.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Fecha.setText("Fecha:");
        jPanel_Head.add(jLabel_Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 340, 40));

        jLabel_ID.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel_ID.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_ID.setText("N°");
        jPanel_Head.add(jLabel_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 55, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("ID User:");
        jPanel_Head.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 55, -1, -1));

        jPanel_Background.add(jPanel_Head, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 35, 890, 100));

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

        jPanel_Background.add(jPanel_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1068, 2, 30, 30));
        jPanel_Exit.getAccessibleContext().setAccessibleName("");

        jPanel_Content.setBackground(new java.awt.Color(9, 53, 69));

        javax.swing.GroupLayout jPanel_ContentLayout = new javax.swing.GroupLayout(jPanel_Content);
        jPanel_Content.setLayout(jPanel_ContentLayout);
        jPanel_ContentLayout.setHorizontalGroup(
            jPanel_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        jPanel_ContentLayout.setVerticalGroup(
            jPanel_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        jPanel_Background.add(jPanel_Content, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 135, 890, 470));

        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        jPanel_Background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 30));

        jLabel_Username.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Username.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Username.setText("Username");
        jLabel_Username.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel_UsernameMouseDragged(evt);
            }
        });
        jLabel_Username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_UsernameMousePressed(evt);
            }
        });
        jPanel_Background.add(jLabel_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 2, 850, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

        System.exit(0);

    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered

        jPanel_Exit.setBackground(Color.red);

    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited

        jPanel_Exit.setBackground(new java.awt.Color(9, 53, 69));

    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel_UsernameMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_UsernameMouseDragged


    }//GEN-LAST:event_jLabel_UsernameMouseDragged

    private void jLabel_UsernameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_UsernameMousePressed


    }//GEN-LAST:event_jLabel_UsernameMousePressed

    private void jPanel_Content_MenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_Content_MenuMousePressed


    }//GEN-LAST:event_jPanel_Content_MenuMousePressed

    private void jPanel_BackgroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_BackgroundMouseDragged


    }//GEN-LAST:event_jPanel_BackgroundMouseDragged

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);

    }//GEN-LAST:event_jLabel1MouseDragged

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed

        xMouse = evt.getX();
        yMouse = evt.getY();

    }//GEN-LAST:event_jLabel1MousePressed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_Fecha;
    private javax.swing.JLabel jLabel_Footer;
    public javax.swing.JLabel jLabel_ID;
    public javax.swing.JLabel jLabel_Name;
    public javax.swing.JLabel jLabel_Type_Account;
    public javax.swing.JLabel jLabel_Username;
    private javax.swing.JLabel jLabel_background_Down;
    private javax.swing.JPanel jPanel_Background;
    public static javax.swing.JPanel jPanel_Content;
    public static javax.swing.JPanel jPanel_Content_Menu;
    private javax.swing.JPanel jPanel_Exit;
    private javax.swing.JPanel jPanel_Head;
    // End of variables declaration//GEN-END:variables

    //Método para obtener la fecha actual...
    public void Date() {

        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", " ;Septiembre",
            "Octubre", "Noviembre", "Diciemrbre"};
        jLabel_Fecha.setText("Fecha: " + dia + " de " + meses[month - 1] + " de " + year);

    }

    //Método para llamar el menu correspondiente a la cuenta...
    private void PanelMenuStart() {

        try {

            if (type_Account.equals("Moderador") || type_Account.equals("Administrador")) {

                paneles.PanelMenu_Mod_Admin();

            }

        } catch (Exception e) {

            System.out.println(e);

        }

        try {

            if (type_Account.equals("Vendedor")) {

                paneles.PanelMenu_Seller();

            }

        } catch (Exception e) {

            System.out.println(e);

        }

        try {

            if (type_Account.equals("Tecnico")) {

                paneles.PanelMenu_Tecnico();

            }

        } catch (Exception e) {

            System.out.println(e);

        }

    }

    //Método para consultar la información del usuario que inició sesión...
    private void BD_Consult() {

        try {

            //Conexión y consulta a la BD...
            Connection cn = BD_Connection.connection();
            PreparedStatement pst = cn.prepareStatement(
                    "select id_user, name_user, type_account from user where username = '" + user + "'");

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                //Llenado de los campos con la información del usuario...
                jLabel_Username.setText(user);
                jLabel_Type_Account.setText(rs.getString("type_account"));
                jLabel_Name.setText(rs.getString("name_user"));
                jLabel_ID.setText(rs.getString("id_user"));

            }

            cn.close();

        } catch (SQLException e) {

            //Alerta de que algo no funciona en la consulta de la información del usuario...
            System.err.println("¡Error al consultar la información del usuario! " + e);
            JOptionPane.showMessageDialog(null, "¡Error al consultar la información del usuario!", "¡Error!",
                    JOptionPane.OK_CANCEL_OPTION);

        }
    }
}
