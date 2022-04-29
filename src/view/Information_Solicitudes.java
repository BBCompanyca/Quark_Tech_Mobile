package view;

import clases.BD_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import clases.Paneles;
import clases.Date;
import static view.Menu_Tecnico.jLabel_Index;

public class Information_Solicitudes extends javax.swing.JPanel {

    int id_warranty_consult;
    int id_warranty;

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
        jLabel_Equipo = new javax.swing.JLabel();
        jLabel_Color = new javax.swing.JLabel();
        jLabel_Serial = new javax.swing.JLabel();
        jLabel_Falla = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
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
        add(jLabel_Received, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 120, -1));

        jLabel_Equipo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Equipo.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Equipo.setText("Equipo:");
        add(jLabel_Equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 500, -1));

        jLabel_Color.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Color.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Color.setText("Color:");
        add(jLabel_Color, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 490, -1));

        jLabel_Serial.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Serial.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Serial.setText("Serial:");
        add(jLabel_Serial, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 500, -1));

        jLabel_Falla.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Falla.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Falla.setText("Falla:");
        add(jLabel_Falla, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 490, -1));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 450, 50));

        jButton_Rechazar.setText("Rechazar");
        jButton_Rechazar.setFocusPainted(false);
        jButton_Rechazar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_RechazarMousePressed(evt);
            }
        });
        add(jButton_Rechazar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, 100, 40));

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

        jButton_Accept.setText("Aceptar");
        jButton_Accept.setFocusPainted(false);
        jButton_Accept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_AcceptMousePressed(evt);
            }
        });
        add(jButton_Accept, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 180, 100, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_AcceptMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_AcceptMousePressed

        try {

            Connection cn = BD_Connection.connection();
            PreparedStatement pst = cn.prepareStatement(
                    "select status from warranty where id_warranty = '" + id_warranty + "'");

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                String status = rs.getString("status");

                cn.close();

                if (status.equals("Solicitud Enviada - En Espera")) {

                    try {

                        Connection cn2 = BD_Connection.connection();
                        PreparedStatement pst2 = cn2.prepareStatement(
                                "update warranty set status = ?, date_accepted = ? where id_warranty = '" + id_warranty + "'");

                        pst2.setString(1, "En Revisión");
                        pst2.setString(2, date.DateToDay());

                        pst2.executeUpdate();

                        int index = Integer.parseInt(jLabel_Index.getText());
                        index--;

                        if (index != 0) {

                            jLabel_Index.setText(String.valueOf(index));

                        } else {

                            jLabel_Index.setText("");

                        }

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

            Connection cn = BD_Connection.connection();
            PreparedStatement pst = cn.prepareStatement(
                    "select status from warranty where id_warranty = '" + id_warranty + "'");

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                String status = rs.getString("status");

                cn.close();

                if (status.equals("Solicitud Enviada - En Espera")) {

                    try {

                        Connection cn2 = BD_Connection.connection();
                        PreparedStatement pst2 = cn2.prepareStatement(
                                "update warranty set status = ?, date_accepted = ? where id_warranty = '" + id_warranty + "'");

                        pst2.setString(1, "En Tienda");
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

    }//GEN-LAST:event_jButton_RechazarMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Accept;
    private javax.swing.JButton jButton_Rechazar;
    private javax.swing.JLabel jLabel_Color;
    private javax.swing.JLabel jLabel_Equipo;
    private javax.swing.JLabel jLabel_Falla;
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

            Connection cn = BD_Connection.connection();
            PreparedStatement pst = cn.prepareStatement("select id_warranty, equipo, color, serial, falla, received from warranty where "
                    + "id_warranty = '" + id_warranty_consult + "'");

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                id_warranty = rs.getInt("id_warranty");
                jLabel_Equipo.setText("Equipo: " + rs.getString("equipo"));
                jLabel_Color.setText("Color: " + rs.getString("color"));
                jLabel_Serial.setText("Serial: " + rs.getString("serial"));
                jLabel_Falla.setText("Falla: " + rs.getString("falla"));
                jTextArea1.setText(rs.getString("received"));

            }

        } catch (SQLException e) {

            System.err.println("¡Error al consultar la información de la garantía! " + e);

        }

    }

}