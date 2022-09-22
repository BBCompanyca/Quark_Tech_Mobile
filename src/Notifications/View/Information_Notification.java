package Notifications.View;

import clases.BD_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import static view.Dashboard.jLabel_NumberNotification;

public class Information_Notification extends javax.swing.JPanel {

    private int ID;
    private String username_technical, brand, model, color, serial, falla, status_notification, message;

    public Information_Notification(int ID, String username_technical, String message, String brand, String model, String color, String serial, String falla, String status_notification) {

        initComponents();

        this.ID = ID;
        this.username_technical = username_technical;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.serial = serial;
        this.falla = falla;
        this.status_notification = status_notification;
        this.message = message;

        DataNotification();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Falla = new javax.swing.JLabel();
        jLabel_Title = new javax.swing.JLabel();
        jLabel_Equipo = new javax.swing.JLabel();
        jLabel_Serial = new javax.swing.JLabel();
        jLabel_Read = new javax.swing.JLabel();

        setBackground(new java.awt.Color(9, 53, 69));
        setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.lightGray));
        setPreferredSize(new java.awt.Dimension(400, 200));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Falla.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Falla.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Falla.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        add(jLabel_Falla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 380, 30));

        jLabel_Title.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        jLabel_Title.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        add(jLabel_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 40));

        jLabel_Equipo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Equipo.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Equipo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        add(jLabel_Equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 380, 30));

        jLabel_Serial.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Serial.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Serial.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        add(jLabel_Serial, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 380, 30));

        jLabel_Read.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel_Read.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Read.setText("Marcar como leído");
        jLabel_Read.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Read.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_ReadMousePressed(evt);
            }
        });
        add(jLabel_Read, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_ReadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ReadMousePressed

        //Si está marcada como no vista, la marca en vista.
        if (status_notification.equals("unread")) {

            jLabel_Title.setFont(new java.awt.Font("Roboto", 0, 15));
            jLabel_Read.setFont(new java.awt.Font("Roboto", 0, 12));

            int numNotification = Integer.parseInt(jLabel_NumberNotification.getText());

            numNotification = numNotification - 1;

            if (numNotification == 0) {

                jLabel_NumberNotification.setText("");

            } else {

                jLabel_NumberNotification.setText(String.valueOf(numNotification));

            }

            //Envia el ID de la notificación para ser marcada como vista.
            UpdateViewNotifications updateViewNotifications = new UpdateViewNotifications(ID);
            Thread thread = new Thread(updateViewNotifications);
            thread.start();

        }

    }//GEN-LAST:event_jLabel_ReadMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_Equipo;
    private javax.swing.JLabel jLabel_Falla;
    private javax.swing.JLabel jLabel_Read;
    private javax.swing.JLabel jLabel_Serial;
    private javax.swing.JLabel jLabel_Title;
    // End of variables declaration//GEN-END:variables

    private void DataNotification() {

        jLabel_Title.setText(username_technical + " " + message);
        jLabel_Equipo.setText(brand + " " + model + " " + color);
        jLabel_Serial.setText("Serial: " + serial);
        jLabel_Falla.setText("Falla: " + falla);

        if (!status_notification.equals("unread")) {

            jLabel_Title.setFont(new java.awt.Font("Roboto", 0, 15));
            jLabel_Read.setFont(new java.awt.Font("Roboto", 0, 12));

        }
    }

    //Modifica en la base de datos que una notificación fue marcada como leia...
    class UpdateViewNotifications implements Runnable {

        private int id_Notification;

        public UpdateViewNotifications(int id_Notification) {

            this.id_Notification = id_Notification;

        }

        @Override
        public void run() {

            RequestUpdateViewNotification();

        }

        private void RequestUpdateViewNotification() {

            try {

                Connection cn = BD_Connection.connection();
                PreparedStatement pst = cn.prepareStatement(
                        "update notifications set status = ? where id_notification = '" + id_Notification + "'");

                pst.setString(1, "read");
                pst.executeUpdate();

                cn.close();

            } catch (SQLException e) {

                System.err.println("¡Error en la modificacion de la notificación! " + e);

            }

        }

    }

}
