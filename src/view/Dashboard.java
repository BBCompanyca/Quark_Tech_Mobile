package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;
import java.sql.*;
import clases.BD_Connection;
import javax.swing.JOptionPane;

public class Dashboard extends javax.swing.JFrame {

    String user;
    
    public Dashboard() {
        initComponents();

        //Diseño de la insterfaz...
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(1000, 600);
        
        //Nombre de usuario que ha iniciado sesión...
        user = Login.user; 

        //Los siguientes metodos están al final de está clase...
        
        //Método para obtener la fecha actual...
        Date();
        
        //Método para llamar al panel con que se va a iniciar la aplicación...
        PanelStart();
        
        //Método para consultar la información del usuario que ha iniciado sesión...
        BD_Consult();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Background = new javax.swing.JPanel();
        jLabel_Footer = new javax.swing.JLabel();
        jLabel_background_Down = new javax.swing.JLabel();
        jPanel_Menu = new javax.swing.JPanel();
        Btn_Main = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Btn_Users = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Btn_Clients = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Btn_Equipos = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Btn_About_Me = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel_Head = new javax.swing.JPanel();
        jLabel_Name = new javax.swing.JLabel();
        jLabel_Type_Account = new javax.swing.JLabel();
        jLabel_Fecha = new javax.swing.JLabel();
        jLabel_ID = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel_Exit = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel_Content = new javax.swing.JPanel();
        jLabel_Username = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel_Background.setBackground(new java.awt.Color(9, 53, 69));
        jPanel_Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Footer.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel_Footer.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Footer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Footer.setText("Creado Por @BBCompany.ca");
        jPanel_Background.add(jLabel_Footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 1000, -1));

        jLabel_background_Down.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_background_Down.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Vectors .png"))); // NOI18N
        jPanel_Background.add(jLabel_background_Down, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 1000, 90));

        jPanel_Menu.setBackground(new java.awt.Color(42, 104, 100));
        jPanel_Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_Main.setBackground(new java.awt.Color(78, 120, 121));
        Btn_Main.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_MainMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_MainMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Btn_MainMousePressed(evt);
            }
        });
        Btn_Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Principal");
        Btn_Main.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home-outline.png"))); // NOI18N
        Btn_Main.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jPanel_Menu.add(Btn_Main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 210, 50));

        Btn_Users.setBackground(new java.awt.Color(78, 120, 121));
        Btn_Users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_UsersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_UsersMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Btn_UsersMousePressed(evt);
            }
        });
        Btn_Users.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Usuarios");
        Btn_Users.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_24px.png"))); // NOI18N
        Btn_Users.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jPanel7.setBackground(new java.awt.Color(78, 120, 121));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Registrar Usuario");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_24px.png"))); // NOI18N
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        Btn_Users.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 210, 50));

        jPanel_Menu.add(Btn_Users, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 210, 50));

        Btn_Clients.setBackground(new java.awt.Color(78, 120, 121));
        Btn_Clients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_ClientsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_ClientsMouseExited(evt);
            }
        });
        Btn_Clients.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Clientes");
        Btn_Clients.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/account-multiple.png"))); // NOI18N
        Btn_Clients.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jPanel_Menu.add(Btn_Clients, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 210, 50));

        Btn_Equipos.setBackground(new java.awt.Color(78, 120, 121));
        Btn_Equipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_EquiposMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_EquiposMouseExited(evt);
            }
        });
        Btn_Equipos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cell_phone_24px.png"))); // NOI18N
        Btn_Equipos.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Equipos");
        Btn_Equipos.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jPanel_Menu.add(Btn_Equipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 210, 50));

        Btn_About_Me.setBackground(new java.awt.Color(78, 120, 121));
        Btn_About_Me.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_About_MeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_About_MeMouseExited(evt);
            }
        });
        Btn_About_Me.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Acerca De");
        Btn_About_Me.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/management_client_24px.png"))); // NOI18N
        Btn_About_Me.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jPanel_Menu.add(Btn_About_Me, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 210, 50));

        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 5));
        jPanel_Menu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 190, 20));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quark Tech Mobile");
        jPanel_Menu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 190, 30));

        jPanel_Background.add(jPanel_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 600));

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
        jPanel_Head.add(jLabel_Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 340, 40));

        jLabel_ID.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel_ID.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_ID.setText("N°");
        jPanel_Head.add(jLabel_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 55, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("ID User:");
        jPanel_Head.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 55, -1, -1));

        jPanel_Background.add(jPanel_Head, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 35, 790, 100));

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

        jPanel_Background.add(jPanel_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(968, 2, 30, 30));
        jPanel_Exit.getAccessibleContext().setAccessibleName("");

        jPanel_Content.setBackground(new java.awt.Color(9, 53, 69));

        javax.swing.GroupLayout jPanel_ContentLayout = new javax.swing.GroupLayout(jPanel_Content);
        jPanel_Content.setLayout(jPanel_ContentLayout);
        jPanel_ContentLayout.setHorizontalGroup(
            jPanel_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        jPanel_ContentLayout.setVerticalGroup(
            jPanel_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        jPanel_Background.add(jPanel_Content, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 135, 790, 370));

        jLabel_Username.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Username.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Username.setText("Username");
        jPanel_Background.add(jLabel_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 2, 755, 30));

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

    private void Btn_MainMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_MainMouseEntered

        Btn_Main.setBackground(new java.awt.Color(78, 140, 121));

    }//GEN-LAST:event_Btn_MainMouseEntered

    private void Btn_MainMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_MainMouseExited

        Btn_Main.setBackground(new java.awt.Color(78, 120, 121));

    }//GEN-LAST:event_Btn_MainMouseExited

    private void Btn_UsersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_UsersMouseEntered

        Btn_Users.setBackground(new java.awt.Color(78, 140, 121));

    }//GEN-LAST:event_Btn_UsersMouseEntered

    private void Btn_UsersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_UsersMouseExited

        Btn_Users.setBackground(new java.awt.Color(78, 120, 121));

    }//GEN-LAST:event_Btn_UsersMouseExited

    private void Btn_ClientsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_ClientsMouseEntered

        Btn_Clients.setBackground(new java.awt.Color(78, 140, 121));

    }//GEN-LAST:event_Btn_ClientsMouseEntered

    private void Btn_ClientsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_ClientsMouseExited

        Btn_Clients.setBackground(new java.awt.Color(78, 120, 121));

    }//GEN-LAST:event_Btn_ClientsMouseExited

    private void Btn_EquiposMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_EquiposMouseEntered

        Btn_Equipos.setBackground(new java.awt.Color(78, 140, 121));

    }//GEN-LAST:event_Btn_EquiposMouseEntered

    private void Btn_EquiposMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_EquiposMouseExited

        Btn_Equipos.setBackground(new java.awt.Color(78, 120, 121));

    }//GEN-LAST:event_Btn_EquiposMouseExited

    private void Btn_About_MeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_About_MeMouseEntered

        Btn_About_Me.setBackground(new java.awt.Color(78, 140, 121));

    }//GEN-LAST:event_Btn_About_MeMouseEntered

    private void Btn_About_MeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_About_MeMouseExited

        Btn_About_Me.setBackground(new java.awt.Color(78, 120, 121));

    }//GEN-LAST:event_Btn_About_MeMouseExited

    private void Btn_MainMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_MainMousePressed

    }//GEN-LAST:event_Btn_MainMousePressed

    private void Btn_UsersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_UsersMousePressed

        //Método para llamar a la interfaz de usuarios...
        Users p1 = new Users();
        p1.setSize(790, 370);
        p1.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(p1, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();

    }//GEN-LAST:event_Btn_UsersMousePressed

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
    private javax.swing.JPanel Btn_About_Me;
    private javax.swing.JPanel Btn_Clients;
    private javax.swing.JPanel Btn_Equipos;
    private javax.swing.JPanel Btn_Main;
    private javax.swing.JPanel Btn_Users;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Fecha;
    private javax.swing.JLabel jLabel_Footer;
    public javax.swing.JLabel jLabel_ID;
    public javax.swing.JLabel jLabel_Name;
    public javax.swing.JLabel jLabel_Type_Account;
    public javax.swing.JLabel jLabel_Username;
    private javax.swing.JLabel jLabel_background_Down;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel_Background;
    public static javax.swing.JPanel jPanel_Content;
    private javax.swing.JPanel jPanel_Exit;
    private javax.swing.JPanel jPanel_Head;
    private javax.swing.JPanel jPanel_Menu;
    private javax.swing.JSeparator jSeparator1;
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

    //Método para llamar al panel con que se va a iniciar la aplicación...
    public void PanelStart() {

        Principal p1 = new Principal();
        p1.setSize(790, 470);
        p1.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(p1, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();

        Btn_Main.setBackground(new java.awt.Color(78, 140, 121));

    }
    
    //Método para consultar la información del usuario que inició sesión...
    public void BD_Consult(){
        
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
