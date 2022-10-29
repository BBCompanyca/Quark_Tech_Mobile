package menu;

import OtherClass.Paneles;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import login.Login;
import static view.Dashboard.jPanel_Content;
import request.application.Request_Solicitudes;
import view.Dashboard;
import view.Principal;

public class Menu_Tecnico extends javax.swing.JPanel {

    Paneles paneles = new Paneles();

    Request_Solicitudes consutlBD = new Request_Solicitudes();

    int index = 0;

    public Menu_Tecnico() {
        initComponents();

        consutlBD.start();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Btn_Main = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Btn_Warranty = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Btn_Notification = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel_Index = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Btn_History = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Btn_About_Me = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Btn_Close_Session = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

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

        add(Btn_Main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 210, 50));

        Btn_Warranty.setBackground(new java.awt.Color(78, 120, 121));
        Btn_Warranty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_WarrantyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_WarrantyMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Btn_WarrantyMousePressed(evt);
            }
        });
        Btn_Warranty.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cell_phone_24px.png"))); // NOI18N
        Btn_Warranty.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Garantías");
        Btn_Warranty.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        add(Btn_Warranty, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 210, 50));

        Btn_Notification.setBackground(new java.awt.Color(78, 120, 121));
        Btn_Notification.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_NotificationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_NotificationMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Btn_NotificationMousePressed(evt);
            }
        });
        Btn_Notification.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/notification_24px.png"))); // NOI18N
        Btn_Notification.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel_Index.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_Index.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Index.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Btn_Notification.add(jLabel_Index, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 30, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Solicitudes");
        Btn_Notification.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 80, 30));

        add(Btn_Notification, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 210, 50));

        Btn_History.setBackground(new java.awt.Color(78, 120, 121));
        Btn_History.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_HistoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_HistoryMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Btn_HistoryMousePressed(evt);
            }
        });
        Btn_History.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Historial");
        Btn_History.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/statistc_24px.png"))); // NOI18N
        Btn_History.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        add(Btn_History, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 210, 50));

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

        add(Btn_About_Me, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 210, 50));

        Btn_Close_Session.setBackground(new java.awt.Color(78, 120, 121));
        Btn_Close_Session.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_Close_SessionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_Close_SessionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Btn_Close_SessionMousePressed(evt);
            }
        });
        Btn_Close_Session.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Cerrar Sesión");
        Btn_Close_Session.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close_session_white_24px.png"))); // NOI18N
        Btn_Close_Session.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        add(Btn_Close_Session, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 210, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_WarrantyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_WarrantyMouseEntered

        if (Btn_Warranty.getBackground().getRGB() == -11634567) {

            setColor(Btn_Warranty);

        }
    }//GEN-LAST:event_Btn_WarrantyMouseEntered

    private void Btn_WarrantyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_WarrantyMouseExited

        if (Btn_Main.getBackground().getRGB() != -11634567
                || Btn_Notification.getBackground().getRGB() != -11634567 || Btn_About_Me.getBackground().getRGB() != -11634567) {

            resetColor(Btn_Warranty);

        }
    }//GEN-LAST:event_Btn_WarrantyMouseExited

    private void Btn_WarrantyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_WarrantyMousePressed

        resetColor(Btn_Main);
        setColor(Btn_Warranty);
        resetColor(Btn_About_Me);
        resetColor(Btn_Notification);

        paneles.PanelWarrantyTechnical();

    }//GEN-LAST:event_Btn_WarrantyMousePressed

    private void Btn_About_MeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_About_MeMouseEntered

        if (Btn_About_Me.getBackground().getRGB() == -11634567) {

            setColor(Btn_About_Me);

        }
    }//GEN-LAST:event_Btn_About_MeMouseEntered

    private void Btn_About_MeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_About_MeMouseExited

        if (Btn_Main.getBackground().getRGB() != -11634567
                || Btn_Notification.getBackground().getRGB() != -11634567 || Btn_Warranty.getBackground().getRGB() != -11634567) {

            resetColor(Btn_About_Me);

        }
    }//GEN-LAST:event_Btn_About_MeMouseExited

    private void Btn_About_MeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_About_MeMousePressed

        resetColor(Btn_Main);
        resetColor(Btn_Warranty);
        setColor(Btn_About_Me);
        resetColor(Btn_Notification);

        paneles.Panel_Acerca_De();

    }//GEN-LAST:event_Btn_About_MeMousePressed

    private void Btn_MainMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_MainMouseEntered

        if (Btn_Main.getBackground().getRGB() == -11634567) {

            setColor(Btn_Main);

        }
    }//GEN-LAST:event_Btn_MainMouseEntered

    private void Btn_MainMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_MainMouseExited

        if (Btn_Notification.getBackground().getRGB() != -11634567
                || Btn_Warranty.getBackground().getRGB() != -11634567 || Btn_About_Me.getBackground().getRGB() != -11634567) {

            resetColor(Btn_Main);

        }
    }//GEN-LAST:event_Btn_MainMouseExited

    private void Btn_MainMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_MainMousePressed

        //Método para llamar a la interfaz principal...
        Principal p1 = new Principal();
        p1.setSize(790, 370);
        p1.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(p1, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();

        setColor(Btn_Main);
        resetColor(Btn_Warranty);
        resetColor(Btn_About_Me);
        resetColor(Btn_Notification);

    }//GEN-LAST:event_Btn_MainMousePressed

    private void Btn_NotificationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_NotificationMouseEntered

        if (Btn_Notification.getBackground().getRGB() == -11634567) {

            setColor(Btn_Notification);

        }

    }//GEN-LAST:event_Btn_NotificationMouseEntered

    private void Btn_NotificationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_NotificationMouseExited

        if (Btn_Main.getBackground().getRGB() != -11634567
                || Btn_Warranty.getBackground().getRGB() != -11634567 || Btn_About_Me.getBackground().getRGB() != -11634567) {

            resetColor(Btn_Notification);

        }

    }//GEN-LAST:event_Btn_NotificationMouseExited

    private void Btn_NotificationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_NotificationMousePressed

        resetColor(Btn_Main);
        resetColor(Btn_Warranty);
        resetColor(Btn_About_Me);
        setColor(Btn_Notification);

        paneles.Panel_Solicitudes();

    }//GEN-LAST:event_Btn_NotificationMousePressed

    private void Btn_HistoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_HistoryMouseEntered

        if (Btn_History.getBackground().getRGB() == -11634567) {

            setColor(Btn_History);

        }

    }//GEN-LAST:event_Btn_HistoryMouseEntered

    private void Btn_HistoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_HistoryMouseExited

        if (Btn_Main.getBackground().getRGB() != -11634567
                || Btn_Warranty.getBackground().getRGB() != -11634567 || Btn_About_Me.getBackground().getRGB() != -11634567
                || Btn_Notification.getBackground().getRGB() != -11634567) {

            resetColor(Btn_History);

        }

    }//GEN-LAST:event_Btn_HistoryMouseExited

    private void Btn_HistoryMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_HistoryMousePressed

        resetColor(Btn_Main);
        resetColor(Btn_Warranty);
        resetColor(Btn_About_Me);
        resetColor(Btn_Notification);
        setColor(Btn_History);

        paneles.Panel_History();

    }//GEN-LAST:event_Btn_HistoryMousePressed

    private void Btn_Close_SessionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Close_SessionMouseEntered

        if (Btn_Close_Session.getBackground().getRGB() == -11634567) {

            setColor(Btn_Close_Session);

        }
    }//GEN-LAST:event_Btn_Close_SessionMouseEntered

    private void Btn_Close_SessionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Close_SessionMouseExited

        if (Btn_Main.getBackground().getRGB() != -11634567
                || Btn_Warranty.getBackground().getRGB() != -11634567 || Btn_About_Me.getBackground().getRGB() != -11634567
                || Btn_Notification.getBackground().getRGB() != -11634567) {

            resetColor(Btn_Close_Session);

        }
    }//GEN-LAST:event_Btn_Close_SessionMouseExited

    private void Btn_Close_SessionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Close_SessionMousePressed

        int closeSession = JOptionPane.showConfirmDialog(null, "¿Desea cerrar sesión?", "¡Cerrar Sesión!",
                JOptionPane.YES_NO_OPTION);

        if (closeSession == 0) {

            Dashboard dashboard = null;

            Dashboard.getInstance().dispose();
            Dashboard.setDashboard(dashboard);

            Login login = new Login();
            login.setVisible(true);

        }

    }//GEN-LAST:event_Btn_Close_SessionMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Btn_About_Me;
    private javax.swing.JPanel Btn_Close_Session;
    private javax.swing.JPanel Btn_History;
    public static javax.swing.JPanel Btn_Main;
    private javax.swing.JPanel Btn_Notification;
    private javax.swing.JPanel Btn_Warranty;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JLabel jLabel_Index;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private void setColor(JPanel panel) {

        panel.setBackground(new Color(78, 140, 121));

    }

    private void resetColor(JPanel panel) {

        panel.setBackground(new Color(78, 120, 121));

    }

}
