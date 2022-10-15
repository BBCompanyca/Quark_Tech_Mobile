package view;

import clases.BD_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import clases.Paneles;
import clases.Date;
import clases.Register_Notification;
import static view.Menu_Tecnico.jLabel_Index;

public class Information_Solicitudes extends javax.swing.JPanel {
    
    BD_Connection connection = new BD_Connection();

    String message;
    int id_warranty_consult, id_warranty, id_registered_by, id_equipo;

    Paneles paneles = new Paneles();

    Date date = new Date();

    public Information_Solicitudes(int id_warranty_consult) {
        initComponents();

        this.id_warranty_consult = id_warranty_consult;

        getInformationWarranty();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Received = new javax.swing.JLabel();
        jLabel_Model = new javax.swing.JLabel();
        jLabel_Equipo = new javax.swing.JLabel();
        jLabel_Color = new javax.swing.JLabel();
        jLabel_Serial = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel_Falla = new javax.swing.JLabel();
        jButton_Rechazar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jButton_Accept = new javax.swing.JButton();

        setBackground(new java.awt.Color(9, 53, 69));
        setPreferredSize(new java.awt.Dimension(890, 235));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Received.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Received.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Received.setText("Se Recibe Con:");
        add(jLabel_Received, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 185, 120, -1));

        jLabel_Model.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Model.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Model.setText("Modelo:");
        add(jLabel_Model, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 45, 500, -1));

        jLabel_Equipo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Equipo.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Equipo.setText("Equipo:");
        add(jLabel_Equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 500, -1));

        jLabel_Color.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Color.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Color.setText("Color:");
        add(jLabel_Color, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 500, -1));

        jLabel_Serial.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Serial.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Serial.setText("Serial:");
        add(jLabel_Serial, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 115, 500, -1));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setOpaque(false);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(9, 53, 69));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(240, 240, 240));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(null);
        jTextArea1.setFocusable(false);
        jTextArea1.setOpaque(false);
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 185, 450, 45));

        jLabel_Falla.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Falla.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Falla.setText("Falla:");
        add(jLabel_Falla, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 500, -1));

        jButton_Rechazar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rechazar btn dark.png"))); // NOI18N
        jButton_Rechazar.setBorder(null);
        jButton_Rechazar.setBorderPainted(false);
        jButton_Rechazar.setContentAreaFilled(false);
        jButton_Rechazar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Rechazar.setFocusPainted(false);
        jButton_Rechazar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rechazar btn ligth.png"))); // NOI18N
        jButton_Rechazar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rechazar btn ligth.png"))); // NOI18N
        jButton_Rechazar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_RechazarMousePressed(evt);
            }
        });
        add(jButton_Rechazar, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 180, 100, -1));

        jSeparator1.setBackground(new java.awt.Color(9, 53, 69));
        jSeparator1.setForeground(new java.awt.Color(9, 53, 69));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 233, 888, -1));

        jSeparator2.setBackground(new java.awt.Color(9, 53, 69));
        jSeparator2.setForeground(new java.awt.Color(9, 53, 69));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, 888, -1));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(887, 0, -1, 235));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, -1, 233));

        jButton_Accept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aceptar btn dark.png"))); // NOI18N
        jButton_Accept.setBorder(null);
        jButton_Accept.setBorderPainted(false);
        jButton_Accept.setContentAreaFilled(false);
        jButton_Accept.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Accept.setFocusPainted(false);
        jButton_Accept.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aceptar btn ligth.png"))); // NOI18N
        jButton_Accept.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aceptar btn ligth.png"))); // NOI18N
        jButton_Accept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_AcceptMousePressed(evt);
            }
        });
        add(jButton_Accept, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 180, 100, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_AcceptMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_AcceptMousePressed

        try {

            Connection cn = connection.connection();
            PreparedStatement pst = cn.prepareStatement(
                    "select status from warranty where id_warranty = '" + id_warranty + "'");

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                if (rs.getString("status").equals("Solicitud Enviada - En Espera")) {

                    cn.close();

                    try {

                        Connection cn2 = connection.connection();
                        PreparedStatement pst2 = cn2.prepareStatement(
                                "update warranty set status = ?, date_received_technical = ?, date_format_acepted = ?"
                                + " where id_warranty = '" + id_warranty + "'");

                        pst2.setString(1, "En Revisión");
                        pst2.setString(2, date.DateToDay());
                        pst2.setString(3, DateFormat());

                        pst2.executeUpdate();

                        int index = Integer.parseInt(jLabel_Index.getText());
                        index--;

                        if (index != 0) {

                            jLabel_Index.setText(String.valueOf(index));

                        } else {

                            jLabel_Index.setText("");

                        }

                        //Registra una notificación de que el equipo fue aceptado...
                        message = "ha aceptado tu solicitud del equipo:";
                        Register_Notification notification = new Register_Notification(id_registered_by, id_warranty, id_equipo, message);
                        Thread t = new Thread(notification);
                        t.start();
                        
                        JOptionPane.showMessageDialog(null, "Equipo aceptado con exito...");

                        paneles.Panel_Solicitudes();

                        cn2.close();

                    } catch (SQLException e) {

                        System.err.println("¡Error al aceptar el equipo! " + e);
                        JOptionPane.showMessageDialog(null, "¡Error al aceptar el equipo!",
                                "¡Error!", JOptionPane.OK_OPTION);

                    }

                } else {

                    JOptionPane.showMessageDialog(null, "¡Lo siento! esta solicitud fue cancelada...",
                            "¡Error!", JOptionPane.OK_OPTION);

                    paneles.Panel_Solicitudes();

                }

            }

            cn.close();

        } catch (SQLException e) {

            System.err.println("¡Error al consultar el status del equipo! " + e);
            JOptionPane.showMessageDialog(null, "¡Error al consultar el status del equipo!",
                    "¡Error!", JOptionPane.OK_OPTION);

        }

    }//GEN-LAST:event_jButton_AcceptMousePressed

    private void jButton_RechazarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RechazarMousePressed

        try {

            Connection cn = connection.connection();
            PreparedStatement pst = cn.prepareStatement(
                    "select status from warranty where id_warranty = '" + id_warranty + "'");

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                if (rs.getString("status").equals("Solicitud Enviada - En Espera")) {

                    cn.close();

                    try {

                        Connection cn2 = connection.connection();
                        PreparedStatement pst2 = cn2.prepareStatement(
                                "update warranty set status = ?, date_received_technical = ? where id_warranty = '" + id_warranty + "'");

                        pst2.setString(1, "Nuevo Ingreso");
                        pst2.setString(2, " ");

                        pst2.executeUpdate();

                        int index = Integer.parseInt(jLabel_Index.getText());
                        index--;

                        if (index != 0) {

                            jLabel_Index.setText(String.valueOf(index));

                        } else {

                            jLabel_Index.setText("");

                        }

                        JOptionPane.showMessageDialog(null, "Equipo rechazado con exito...");
                        
                        //Registra una notificación de que el equipo fue rechazado...
                        message = "ha rechazado tu solicitud del equipo:";
                        Register_Notification notification = new Register_Notification(id_registered_by, id_warranty, id_equipo, message);
                        Thread t = new Thread(notification);
                        t.start();

                        paneles.Panel_Solicitudes();

                        cn2.close();

                    } catch (SQLException e) {

                        System.err.println("¡Error al rechazar el equipo! " + e);
                        JOptionPane.showMessageDialog(null, "¡Error al rechazar el equipo!",
                                "¡Error!", JOptionPane.OK_OPTION);

                    }

                } else {

                    JOptionPane.showMessageDialog(null, "¡Lo siento! esta solicitud fue cancelada...",
                            "¡Error!", JOptionPane.OK_OPTION);

                    paneles.Panel_Solicitudes();

                }

            }

            cn.close();

        } catch (SQLException e) {

            System.err.println("¡Error al consultar el status del equipo! " + e);
            JOptionPane.showMessageDialog(null, "¡Error al consultar el status del equipo!",
                    "¡Error!", JOptionPane.OK_OPTION);

        }

    }//GEN-LAST:event_jButton_RechazarMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Accept;
    private javax.swing.JButton jButton_Rechazar;
    private javax.swing.JLabel jLabel_Color;
    private javax.swing.JLabel jLabel_Equipo;
    private javax.swing.JLabel jLabel_Falla;
    private javax.swing.JLabel jLabel_Model;
    private javax.swing.JLabel jLabel_Received;
    private javax.swing.JLabel jLabel_Serial;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    private void getInformationWarranty() {

        try {

            Connection cn = connection.connection();
            PreparedStatement pst = cn.prepareStatement(
                    "select w.id_warranty, e.brand, e.model, e.color, w.serial, w.falla, w.received, "
                    + "w.id_registered_by, w.id_equipo "
                    + "from warranty w join equipo e "
                    + "on w.id_warranty = '" + id_warranty_consult + "' and e.id_equipo = w.id_equipo");

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                id_warranty = rs.getInt(1);
                jLabel_Equipo.setText("Equipo: " + rs.getString(2));
                jLabel_Model.setText("Módelo: " + rs.getString(3));
                jLabel_Color.setText("Color: " + rs.getString(4));
                jLabel_Serial.setText("Serial: " + rs.getString(5));
                jLabel_Falla.setText("Falla: " + rs.getString(6));
                jTextArea1.setText(rs.getString(7));
                id_registered_by = rs.getInt(8);
                id_equipo = rs.getInt(9);

            }

        } catch (SQLException e) {

            System.err.println("¡Error al consultar la información de la garantía! " + e);

        }

    }

    private String DateFormat() {

        String dateFormat = date.DateToDay().substring(6, 10) + "-" + date.DateToDay().substring(3, 5) + "-" + date.DateToDay().substring(0, 2);

        return dateFormat;

    }

}
