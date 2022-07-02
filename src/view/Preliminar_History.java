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
        
         getInformation();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_DateReceivedTechnical = new javax.swing.JLabel();
        jLabel_Serial = new javax.swing.JLabel();
        jLabel_Falla = new javax.swing.JLabel();
        jLabel_Shop = new javax.swing.JLabel();
        jLabel_DatePurchase = new javax.swing.JLabel();
        jLabel_DateRegister = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel_Equipo = new javax.swing.JLabel();
        jLabel_Color = new javax.swing.JLabel();
        jLabel_DateSentTechnical = new javax.swing.JLabel();
        jLabel_Delivery_Technical = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel_Status_Technical = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Comment_Technical = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_Received = new javax.swing.JTextArea();

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

        jLabel_DateReceivedTechnical.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_DateReceivedTechnical.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_DateReceivedTechnical.setText("Recibido En Servicio Técnico: ");
        add(jLabel_DateReceivedTechnical, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 380, 380, -1));

        jLabel_Serial.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel_Serial.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Serial.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Serial.setText("Equipo:");
        add(jLabel_Serial, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 440, 40));

        jLabel_Falla.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Falla.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Falla.setText("Falla:");
        add(jLabel_Falla, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 100, 380, -1));

        jLabel_Shop.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Shop.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Shop.setText("Tienda:");
        add(jLabel_Shop, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 140, 380, -1));

        jLabel_DatePurchase.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_DatePurchase.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_DatePurchase.setText("Fecha De Compra:");
        add(jLabel_DatePurchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 180, 380, -1));

        jLabel_DateRegister.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_DateRegister.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_DateRegister.setText("Fecha De Registro: ");
        add(jLabel_DateRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 220, 380, -1));

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

        jLabel_DateSentTechnical.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_DateSentTechnical.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_DateSentTechnical.setText("Enviado A Servicio Técnico: ");
        add(jLabel_DateSentTechnical, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 300, 380, -1));

        jLabel_Delivery_Technical.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Delivery_Technical.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Delivery_Technical.setText("Llevado Por:");
        add(jLabel_Delivery_Technical, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 340, 380, -1));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setText("Entregado O Archivado: ");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 380, -1));

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("Llevado Por:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 380, -1));

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(240, 240, 240));
        jLabel16.setText("Enviado A Tienda:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 380, -1));

        jLabel_Status_Technical.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Status_Technical.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Status_Technical.setText("Estatus Técnico:");
        add(jLabel_Status_Technical, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 380, -1));

        jSeparator1.setBackground(new java.awt.Color(240, 240, 240));
        jSeparator1.setForeground(new java.awt.Color(240, 240, 240));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 92, 3, 320));

        jLabel19.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(240, 240, 240));
        jLabel19.setText("Técnico:");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 380, -1));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea_Comment_Technical.setEditable(false);
        jTextArea_Comment_Technical.setBackground(new java.awt.Color(9, 53, 69));
        jTextArea_Comment_Technical.setColumns(20);
        jTextArea_Comment_Technical.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextArea_Comment_Technical.setForeground(new java.awt.Color(240, 240, 240));
        jTextArea_Comment_Technical.setLineWrap(true);
        jTextArea_Comment_Technical.setRows(5);
        jTextArea_Comment_Technical.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea_Comment_Technical);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 380, 60));

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea_Received.setEditable(false);
        jTextArea_Received.setBackground(new java.awt.Color(9, 53, 69));
        jTextArea_Received.setColumns(20);
        jTextArea_Received.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextArea_Received.setForeground(new java.awt.Color(240, 240, 240));
        jTextArea_Received.setLineWrap(true);
        jTextArea_Received.setRows(5);
        jTextArea_Received.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextArea_Received);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 380, 60));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_Color;
    private javax.swing.JLabel jLabel_DatePurchase;
    private javax.swing.JLabel jLabel_DateReceivedTechnical;
    private javax.swing.JLabel jLabel_DateRegister;
    private javax.swing.JLabel jLabel_DateSentTechnical;
    private javax.swing.JLabel jLabel_Delivery_Technical;
    private javax.swing.JLabel jLabel_Equipo;
    private javax.swing.JLabel jLabel_Falla;
    private javax.swing.JLabel jLabel_Serial;
    private javax.swing.JLabel jLabel_Shop;
    private javax.swing.JLabel jLabel_Status_Technical;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea_Comment_Technical;
    private javax.swing.JTextArea jTextArea_Received;
    // End of variables declaration//GEN-END:variables

    private void getInformation(){
        
        try {
            
            Connection cn = BD_Connection.connection();
            PreparedStatement pst = cn.prepareStatement("select * from warranty where id_warranty = '" + History.ID + "'");
            
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                
                jLabel_Falla.setText("Falla: " + rs.getString("falla"));
                jLabel_Shop.setText("Tienda: " + rs.getString("shop"));
                jLabel_DatePurchase.setText("Fecha De Compra: " + rs.getString("date_purchase"));
                jLabel_DateRegister.setText("Fecha De Registro: " + rs.getString("date_register"));
                jLabel_DateSentTechnical.setText("Envaido A Servicio Técnico: " + rs.getString("date_sent_technical"));
                jLabel_Delivery_Technical.setText("Llevado Por: " + rs.getString("delivery_technical"));
                jLabel_DateReceivedTechnical.setText("Recibido En Servicio Técnico: " + rs.getString("date_received_technical"));
                jTextArea_Comment_Technical.setText("Recibido Con: " + rs.getString("received"));
                jLabel_Status_Technical.setText("Estatus Técnico: " + rs.getString("status_technical"));
                jTextArea_Comment_Technical.setText("Comentarios Técnico: " + rs.getString("comments_technical"));
                
            }
            
            cn.close();
            
        } catch (SQLException e) {
            
            System.err.println("¡Error al consultar la información! " + e);
            JOptionPane.showMessageDialog(null, "¡Error al consultar la información!", "¡Error!",
                    JOptionPane.OK_OPTION);
            
        }
        
    }
    
}
