package view;

import clases.BD_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Information_Notification extends javax.swing.JPanel {

    private int id_notification_consutl;

    public Information_Notification(int id_notification_consutl) {

        initComponents();

        this.id_notification_consutl = id_notification_consutl;

        getNotifications();

        this.setSize(400, 200);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Falla = new javax.swing.JLabel();
        jLabel_Title22 = new javax.swing.JLabel();
        jLabel_Equipo = new javax.swing.JLabel();
        jLabel_Serial = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(9, 53, 69));
        setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.lightGray));
        setPreferredSize(new java.awt.Dimension(400, 200));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Falla.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Falla.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Falla.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Falla.setText("Falla: Pantalla Dañada");
        add(jLabel_Falla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 380, 30));

        jLabel_Title22.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel_Title22.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Title22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Title22.setText("Alex ha aceptado tu solicitud del equipo:");
        add(jLabel_Title22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 40));

        jLabel_Equipo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Equipo.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Equipo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Equipo.setText("REDMI 9A VERDE ");
        add(jLabel_Equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 380, 30));

        jLabel_Serial.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Serial.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Serial.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Serial.setText("Serial: 1525555555548");
        add(jLabel_Serial, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 380, 30));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Marcar como leído");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Equipo;
    private javax.swing.JLabel jLabel_Falla;
    private javax.swing.JLabel jLabel_Serial;
    private javax.swing.JLabel jLabel_Title22;
    // End of variables declaration//GEN-END:variables

    private void getNotifications() {

        try {

            Connection cn = BD_Connection.connection();
            PreparedStatement pst = cn.prepareStatement(
                    "select n.id_notification, u.username, n.notification, e.brand, e.model, e.color, w.serial, "
                    + "w.falla, n.status "
                    + "from notifications n "
                    + "join user u on u.id_user = n.id_userSent and n.id_notification = '" + id_notification_consutl + "' "
                    + "join equipo e on e.id_equipo = n.id_equipo and n.id_notification = '" + id_notification_consutl + "'"
                    + "join warranty w on w.id_warranty = n.id_warranty and n.id_notification = '" + id_notification_consutl + "' "
                    + "order by id_notification ASC");

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                if (!rs.getString(9).equals("unread")) {
                    
                    jLabel_Title22.setFont(new java.awt.Font("Roboto", 0, 18));
                    
                }
                
                jLabel_Title22.setText(rs.getString(2) + " ha " + rs.getString(3) + " tu solicitud del equipo:");
                jLabel_Equipo.setText(rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6));
                jLabel_Serial.setText("Serial: " + rs.getString(7));
                jLabel_Falla.setText("Falla: " + rs.getString(8));

            }

            cn.close();

        } catch (SQLException e) {

            System.err.println("¡Error al consultar la información de las notificaciones! " + e);

        }

    }

}
