package view;

import java.awt.Color;
import javax.swing.JPanel;
import clases.Paneles;

public class Menu_Mod_Adm extends javax.swing.JPanel {

    Paneles paneles = new Paneles();
    
    public Menu_Mod_Adm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
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
        Btn_Reportes = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Btn_Estadisticas = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Btn_About_Me = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(42, 104, 100));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quark Tech Mobile");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 190, 30));

        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 5));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 190, 20));

        Btn_Main.setBackground(new java.awt.Color(78, 140, 121));
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

        add(Btn_Main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 210, 50));

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

        add(Btn_Users, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 210, 50));

        Btn_Clients.setBackground(new java.awt.Color(78, 120, 121));
        Btn_Clients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_ClientsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_ClientsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Btn_ClientsMousePressed(evt);
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

        add(Btn_Clients, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 210, 50));

        Btn_Equipos.setBackground(new java.awt.Color(78, 120, 121));
        Btn_Equipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_EquiposMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_EquiposMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Btn_EquiposMousePressed(evt);
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

        add(Btn_Equipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 210, 50));

        Btn_Reportes.setBackground(new java.awt.Color(78, 120, 121));
        Btn_Reportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_ReportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_ReportesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Btn_ReportesMousePressed(evt);
            }
        });
        Btn_Reportes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Reportes");
        Btn_Reportes.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report_24px.png"))); // NOI18N
        Btn_Reportes.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        add(Btn_Reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 210, 50));

        Btn_Estadisticas.setBackground(new java.awt.Color(78, 120, 121));
        Btn_Estadisticas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_EstadisticasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_EstadisticasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Btn_EstadisticasMousePressed(evt);
            }
        });
        Btn_Estadisticas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Estadisticas");
        Btn_Estadisticas.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/statistc_24px.png"))); // NOI18N
        Btn_Estadisticas.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        add(Btn_Estadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 210, 50));

        Btn_About_Me.setBackground(new java.awt.Color(78, 120, 121));
        Btn_About_Me.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_About_MeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_About_MeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Btn_About_MeMousePressed(evt);
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

        add(Btn_About_Me, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 210, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_MainMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_MainMouseEntered

        if (Btn_Main.getBackground().getRGB() == -11634567) {

            setColor(Btn_Main);

        }

    }//GEN-LAST:event_Btn_MainMouseEntered

    private void Btn_MainMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_MainMouseExited

        if (Btn_Users.getBackground().getRGB() != -11634567 || Btn_Clients.getBackground().getRGB() != -11634567
                || Btn_Equipos.getBackground().getRGB() != -11634567 || Btn_About_Me.getBackground().getRGB() != -11634567
                || Btn_Reportes.getBackground().getRGB() != -11634567 || Btn_Estadisticas.getBackground().getRGB() != -11634567) {

            resetColor(Btn_Main);

        }
    }//GEN-LAST:event_Btn_MainMouseExited

    private void Btn_MainMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_MainMousePressed

        //Instancia para llamar a la interfaz principal...
        paneles.PanelMain();

        setColor(Btn_Main);
        resetColor(Btn_Users);
        resetColor(Btn_Clients);
        resetColor(Btn_Equipos);
        resetColor(Btn_Reportes);
        resetColor(Btn_Estadisticas);
        resetColor(Btn_About_Me);

    }//GEN-LAST:event_Btn_MainMousePressed

    private void Btn_UsersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_UsersMouseEntered

        if (Btn_Users.getBackground().getRGB() == -11634567) {

            setColor(Btn_Users);

        }
    }//GEN-LAST:event_Btn_UsersMouseEntered

    private void Btn_UsersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_UsersMouseExited

        if (Btn_Main.getBackground().getRGB() != -11634567 || Btn_Clients.getBackground().getRGB() != -11634567
                || Btn_Equipos.getBackground().getRGB() != -11634567 || Btn_About_Me.getBackground().getRGB() != -11634567
                || Btn_Reportes.getBackground().getRGB() != -11634567 || Btn_Estadisticas.getBackground().getRGB() != -11634567) {

            resetColor(Btn_Users);

        }
    }//GEN-LAST:event_Btn_UsersMouseExited

    private void Btn_UsersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_UsersMousePressed

        //Método para llamar a la interfaz de usuarios...
        paneles.PanelUsers();

        resetColor(Btn_Main);
        setColor(Btn_Users);
        resetColor(Btn_Clients);
        resetColor(Btn_Equipos);
        resetColor(Btn_Reportes);
        resetColor(Btn_Estadisticas);
        resetColor(Btn_About_Me);

    }//GEN-LAST:event_Btn_UsersMousePressed

    private void Btn_ClientsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_ClientsMouseEntered

        if (Btn_Clients.getBackground().getRGB() == -11634567) {

            setColor(Btn_Clients);

        }
    }//GEN-LAST:event_Btn_ClientsMouseEntered

    private void Btn_ClientsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_ClientsMouseExited

        if (Btn_Users.getBackground().getRGB() != -11634567 || Btn_Main.getBackground().getRGB() != -11634567
                || Btn_Equipos.getBackground().getRGB() != -11634567 || Btn_About_Me.getBackground().getRGB() != -11634567
                || Btn_Reportes.getBackground().getRGB() != -11634567 || Btn_Estadisticas.getBackground().getRGB() != -11634567) {

            resetColor(Btn_Clients);

        }
    }//GEN-LAST:event_Btn_ClientsMouseExited

    private void Btn_ClientsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_ClientsMousePressed

        paneles.PanelClients();
        
        resetColor(Btn_Main);
        resetColor(Btn_Users);
        setColor(Btn_Clients);
        resetColor(Btn_Equipos);
        resetColor(Btn_Reportes);
        resetColor(Btn_Estadisticas);
        resetColor(Btn_About_Me);
        
        Consult_Cl_Client.flag = 0;
        
    }//GEN-LAST:event_Btn_ClientsMousePressed

    private void Btn_EquiposMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_EquiposMouseEntered

        if (Btn_Equipos.getBackground().getRGB() == -11634567) {

            setColor(Btn_Equipos);

        }
    }//GEN-LAST:event_Btn_EquiposMouseEntered

    private void Btn_EquiposMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_EquiposMouseExited

        if (Btn_Users.getBackground().getRGB() != -11634567 || Btn_Main.getBackground().getRGB() != -11634567
                || Btn_Clients.getBackground().getRGB() != -11634567 || Btn_About_Me.getBackground().getRGB() != -11634567
                || Btn_Reportes.getBackground().getRGB() != -11634567 || Btn_Estadisticas.getBackground().getRGB() != -11634567) {

            resetColor(Btn_Equipos);

        }
    }//GEN-LAST:event_Btn_EquiposMouseExited

    private void Btn_EquiposMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_EquiposMousePressed

        resetColor(Btn_Main);
        resetColor(Btn_Users);
        resetColor(Btn_Clients);
        setColor(Btn_Equipos);
        resetColor(Btn_Reportes);
        resetColor(Btn_Estadisticas);
        resetColor(Btn_About_Me);
        
        paneles.PanelEquipos();
        
    }//GEN-LAST:event_Btn_EquiposMousePressed

    private void Btn_About_MeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_About_MeMouseEntered

        if (Btn_About_Me.getBackground().getRGB() == -11634567) {

            setColor(Btn_About_Me);

        }
    }//GEN-LAST:event_Btn_About_MeMouseEntered

    private void Btn_About_MeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_About_MeMouseExited

        if (Btn_Users.getBackground().getRGB() != -11634567 || Btn_Main.getBackground().getRGB() != -11634567
                || Btn_Clients.getBackground().getRGB() != -11634567 || Btn_Equipos.getBackground().getRGB() != -11634567
                || Btn_Reportes.getBackground().getRGB() != -11634567 || Btn_Estadisticas.getBackground().getRGB() != -11634567) {

            resetColor(Btn_About_Me);

        }
    }//GEN-LAST:event_Btn_About_MeMouseExited

    private void Btn_About_MeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_About_MeMousePressed

        resetColor(Btn_Main);
        resetColor(Btn_Users);
        resetColor(Btn_Clients);
        resetColor(Btn_Equipos);
        resetColor(Btn_Reportes);
        resetColor(Btn_Estadisticas);
        setColor(Btn_About_Me);
    }//GEN-LAST:event_Btn_About_MeMousePressed

    private void Btn_ReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_ReportesMouseEntered

        if (Btn_Reportes.getBackground().getRGB() == -11634567) {

            setColor(Btn_Reportes);

        }

    }//GEN-LAST:event_Btn_ReportesMouseEntered

    private void Btn_ReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_ReportesMouseExited

        if (Btn_Users.getBackground().getRGB() != -11634567 || Btn_Main.getBackground().getRGB() != -11634567
                || Btn_Clients.getBackground().getRGB() != -11634567 || Btn_Equipos.getBackground().getRGB() != -11634567
                || Btn_About_Me.getBackground().getRGB() != -11634567 || Btn_Estadisticas.getBackground().getRGB() != -11634567) {

            resetColor(Btn_Reportes);

        }

    }//GEN-LAST:event_Btn_ReportesMouseExited

    private void Btn_ReportesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_ReportesMousePressed
        
        resetColor(Btn_Main);
        resetColor(Btn_Users);
        resetColor(Btn_Clients);
        resetColor(Btn_Equipos);
        setColor(Btn_Reportes);
        resetColor(Btn_Estadisticas);
        resetColor(Btn_About_Me);
        
    }//GEN-LAST:event_Btn_ReportesMousePressed

    private void Btn_EstadisticasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_EstadisticasMouseEntered

        if (Btn_Estadisticas.getBackground().getRGB() == -11634567) {

            setColor(Btn_Estadisticas);

        }

    }//GEN-LAST:event_Btn_EstadisticasMouseEntered

    private void Btn_EstadisticasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_EstadisticasMouseExited

        if (Btn_Users.getBackground().getRGB() != -11634567 || Btn_Main.getBackground().getRGB() != -11634567
                || Btn_Clients.getBackground().getRGB() != -11634567 || Btn_Equipos.getBackground().getRGB() != -11634567
                || Btn_Reportes.getBackground().getRGB() != -11634567 || Btn_About_Me.getBackground().getRGB() != -11634567) {

            resetColor(Btn_Estadisticas);

        }

    }//GEN-LAST:event_Btn_EstadisticasMouseExited

    private void Btn_EstadisticasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_EstadisticasMousePressed
        
        resetColor(Btn_Main);
        resetColor(Btn_Users);
        resetColor(Btn_Clients);
        resetColor(Btn_Equipos);
        resetColor(Btn_Reportes);
        setColor(Btn_Estadisticas);
        resetColor(Btn_About_Me);
        
    }//GEN-LAST:event_Btn_EstadisticasMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Btn_About_Me;
    private javax.swing.JPanel Btn_Clients;
    private javax.swing.JPanel Btn_Equipos;
    private javax.swing.JPanel Btn_Estadisticas;
    public static javax.swing.JPanel Btn_Main;
    private javax.swing.JPanel Btn_Reportes;
    private javax.swing.JPanel Btn_Users;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private void setColor(JPanel panel) {

        panel.setBackground(new Color(78, 140, 121));

    }

    private void resetColor(JPanel panel) {

        panel.setBackground(new Color(78, 120, 121));

    }

}
