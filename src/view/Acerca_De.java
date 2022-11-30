package view;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import validatelicense.License;
import validatelicense.LicenseRequest;

public class Acerca_De extends javax.swing.JPanel {
    
    public Acerca_De() {
        initComponents();
        
        ImageIcon wallpaper = new ImageIcon(System.getProperty("user.home") + "\\Desktop\\quark_tech_mobile\\images\\LOGO BBC.png");
        Icon fondo = new ImageIcon(wallpaper.getImage().getScaledInstance(470, 380, Image.SCALE_DEFAULT));
        jLabel_Wallpaper2.setIcon(fondo);
        this.repaint();
        
        InformationLicense();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel_License = new javax.swing.JLabel();
        jLabel_daysLicense = new javax.swing.JLabel();
        jLabel_dateExpiration = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel_Wallpaper2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(9, 53, 69));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Acerca De");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 186, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 79, 320, 10));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-twitter-30.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, 30));

        jLabel_License.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        jLabel_License.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_License.setText("Null");
        add(jLabel_License, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 340, 20));

        jLabel_daysLicense.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel_daysLicense.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_daysLicense.setText("Null");
        add(jLabel_daysLicense, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 340, -1));

        jLabel_dateExpiration.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel_dateExpiration.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_dateExpiration.setText("Null");
        add(jLabel_dateExpiration, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 360, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Quark Tech Mobile");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Versión: 1.2.3");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Derechos Reservados 2022 © ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("@BBCompany, C.A");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("@BBCOMPANY12");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, 30));

        jLabel_Wallpaper2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Wallpaper2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LOGO BBC.png"))); // NOI18N
        add(jLabel_Wallpaper2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 45, 470, 380));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_License;
    private javax.swing.JLabel jLabel_Wallpaper2;
    private javax.swing.JLabel jLabel_dateExpiration;
    private javax.swing.JLabel jLabel_daysLicense;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private void InformationLicense() {
        
        jLabel_License.setText(License.getInstance().getLicense());
        jLabel_dateExpiration.setText(dateOfExpiration());
        jLabel_daysLicense.setText("Expira en (" + License.getInstance().getDaysFromExpirate() + ") días" 
                + " (" + License.getInstance().getTypeLicense() + ")");
        
    }
    
    private String dateOfExpiration() {
        
        String[] months = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
            "Octubre", "Noviembre", "Diciembre"};
        
        int year = Integer.parseInt(License.getInstance().getDateExpiration().substring(0, 4));
        int month = Integer.parseInt(License.getInstance().getDateExpiration().substring(5, 7));
        int day = Integer.parseInt(License.getInstance().getDateExpiration().substring(8, 10));
        
        return "Fecha de expiración: " + day + " de " + months[month - 1] + " del " + year;
        
    }
    
}
