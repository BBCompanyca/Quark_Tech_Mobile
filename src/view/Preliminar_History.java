package view;

import clases.BD_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Preliminar_History extends javax.swing.JPanel {

    public Preliminar_History() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_Serial = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel_Equipo = new javax.swing.JLabel();
        jLabel_Color = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(9, 53, 69));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Recibido En Servicio Técnico: ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 380, 380, -1));

        jLabel_Serial.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel_Serial.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Serial.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Serial.setText("Equipo:");
        add(jLabel_Serial, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 440, 40));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Falla:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 100, 380, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Tienda:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 140, 380, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Fecha De Compra:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 180, 380, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Fecha De Registro: ");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 220, 380, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Registrado Por:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 260, 380, -1));

        jLabel_Equipo.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel_Equipo.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Equipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Equipo.setText("Equipo:");
        add(jLabel_Equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 40));

        jLabel_Color.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel_Color.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Color.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_Color.setText("Equipo:");
        add(jLabel_Color, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 440, 40));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Enviado A Servicio Técnico: ");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 300, 380, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText("Llevado Por:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 340, 380, -1));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setText("Entregado O Archivado: ");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 380, -1));

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("Llevado Por:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 380, -1));

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(240, 240, 240));
        jLabel16.setText("Enviado A Tienda:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 380, -1));

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(240, 240, 240));
        jLabel17.setText("Estatus Técnico:");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 380, -1));

        jSeparator1.setBackground(new java.awt.Color(240, 240, 240));
        jSeparator1.setForeground(new java.awt.Color(240, 240, 240));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 92, 3, 320));

        jPanel2.setBackground(new java.awt.Color(9, 53, 69));
        jPanel2.setForeground(new java.awt.Color(240, 240, 240));
        jPanel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 380, 60));

        jLabel19.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(240, 240, 240));
        jLabel19.setText("Técnico:");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 380, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_Color;
    private javax.swing.JLabel jLabel_Equipo;
    private javax.swing.JLabel jLabel_Serial;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private void getInformation(){
        
        try {
            
            Connection cn = BD_Connection.connection();
            PreparedStatement pst = cn.prepareStatement("select e.brand, e.model, e.capacity, e.color, w.serial, w.falla, w.shop, "
                    + "w.date_purchase, w.date_register, u.username, w.date_sent_technical, w.delivery_technical, w.date_received_technical, "
                    + "u.username, w.comments_technical, status_technical, w.date_sent_shop, w.delivery_shop, w.status "
                    + "from warranty w "
                    + "join equipo e on e.id_equipo = w.id_equipo"
                    + "join user u on u.id_user = w.id_registered_by and u.id_user = w.id_technical "
                    + "and w.id_warranty = '" + History.ID + "'");
            
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                
                jLabel_Equipo.setText("Equipo: " + rs.getString(1) + " - " + rs.getString(2) + " - " + rs.getString(3));
                
            }
            
            cn.close();
            
        } catch (SQLException e) {
            
            System.err.println("¡Error al consultar la información! " + e);
            JOptionPane.showMessageDialog(null, "¡Error al consultar la información!", "¡Error!",
                    JOptionPane.OK_OPTION);
            
        }
        
    }
    
}
