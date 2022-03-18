package view;

import java.sql.*;
import clases.BD_Connection;
import clases.FormatText;
import clases.Paneles;
import clases.TextPrompt;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Consult_Cl_Client extends javax.swing.JPanel {

    FormatText formattext = new FormatText();

    Paneles paneles = new Paneles();

    public static int flag = 0;
    public static String name_client, ci_client;

    public Consult_Cl_Client() {
        initComponents();

        TextPrompt text = new TextPrompt("Ingrese el N° de C.I del Cliente", jTextField_CI_Client);

        formattext.ValidateCI(jTextField_CI_Client);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_CI_Client = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton_Consult = new javax.swing.JButton();
        jLabel_Title = new javax.swing.JLabel();
        jTextField_CI_Client = new javax.swing.JTextField();

        setBackground(new java.awt.Color(9, 53, 69));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_CI_Client.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel_CI_Client.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_CI_Client.setText("Número C.I:");
        add(jLabel_CI_Client, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 250, 10));

        jButton_Consult.setText("Consultar");
        jButton_Consult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_ConsultMousePressed(evt);
            }
        });
        jButton_Consult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ConsultActionPerformed(evt);
            }
        });
        add(jButton_Consult, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 190, 40));

        jLabel_Title.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel_Title.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Title.setText("Consultar Cliente Para Registro De Equipo");
        add(jLabel_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 790, 50));

        jTextField_CI_Client.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_CI_Client.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_CI_Client.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_CI_Client.setBorder(null);
        jTextField_CI_Client.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_CI_ClientKeyPressed(evt);
            }
        });
        add(jTextField_CI_Client, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 250, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ConsultMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_ConsultMousePressed

        ci_client = jTextField_CI_Client.getText().trim();

        if (!ci_client.equals("")) {

            if (jTextField_CI_Client.getText().length() == 10) {

                if (Login.type_account.equals("Moderador")) {

                    try {

                        Connection cn = BD_Connection.connection();
                        PreparedStatement pst = cn.prepareStatement(
                                "select cedula_client from client where cedula_client = '" + ci_client + "'");

                        ResultSet rs = pst.executeQuery();

                        if (rs.next()) {

                            paneles.TabletConsultClient();

                        } else {

                            int question = JOptionPane.showConfirmDialog(null, "El cliente no está registrado, ¿Desea Registrar?",
                                    "Selección", JOptionPane.OK_CANCEL_OPTION);

                            if (question == 0) {

                                flag = 1;

                                paneles.PanelRegisterClient();

                            } else {

                                paneles.PanelConsulCient();

                            }

                        }

                    } catch (SQLException e) {

                        System.err.println("¡Error al consultar la C.I del cliente! " + e);
                        JOptionPane.showMessageDialog(null, "¡Error al consultar la C.I del cliente!", "¡Error!", JOptionPane.OK_OPTION);

                    }

                } else {

                    try {

                        Connection cn = BD_Connection.connection();
                        PreparedStatement pst = cn.prepareStatement(
                                "select cedula_client from client where cedula_client = '" + ci_client + "' and direction_tienda = '"
                                + Login.direction + "'");

                        ResultSet rs = pst.executeQuery();

                        if (rs.next()) {

                            cn.close();

                            paneles.TabletConsultClient();

                        } else {

                            cn.close();

                            int question = JOptionPane.showConfirmDialog(null, "El cliente no está registrado, ¿Desea Registrar?",
                                    "Selección", JOptionPane.OK_CANCEL_OPTION);

                            if (question == 0) {

                                flag = 1;

                                paneles.PanelRegisterClient();

                            } else {

                                paneles.PanelConsulCient();

                            }

                        }

                    } catch (SQLException e) {

                        System.err.println("¡Error al consultar la C.I del cliente! " + e);
                        JOptionPane.showMessageDialog(null, "¡Error al consultar la C.I del cliente!", "¡Error!", JOptionPane.OK_OPTION);

                    }

                }

            } else {

                jLabel_CI_Client.setForeground(Color.red);

                JOptionPane.showMessageDialog(null, "¡Error de formato!", "¡Error!", JOptionPane.WARNING_MESSAGE);

                jTextField_CI_Client.setText("");
                jTextField_CI_Client.requestFocus();

            }

        } else {

            jLabel_CI_Client.setForeground(Color.red);

            JOptionPane.showMessageDialog(null, "¡Debes llenar el campo!", "¡Acceso Denegado!", JOptionPane.WARNING_MESSAGE);

            jTextField_CI_Client.setText("");
            jTextField_CI_Client.requestFocus();

        }

    }//GEN-LAST:event_jButton_ConsultMousePressed

    private void jButton_ConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ConsultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_ConsultActionPerformed

    private void jTextField_CI_ClientKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_CI_ClientKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            ci_client = jTextField_CI_Client.getText().trim();

            if (!ci_client.equals("")) {

                if (jTextField_CI_Client.getText().length() == 10) {

                    try {

                        Connection cn = BD_Connection.connection();
                        PreparedStatement pst = cn.prepareStatement(
                                "select cedula_client from client where cedula_client = '" + ci_client + "'");

                        ResultSet rs = pst.executeQuery();

                        if (rs.next()) {

                            paneles.TabletConsultClient();

                        } else {

                            int question = JOptionPane.showConfirmDialog(null, "El cliente no está registrado, ¿Desea Registrar?",
                                    "Selección", JOptionPane.OK_CANCEL_OPTION);

                            if (question == 0) {

                                flag = 1;

                                paneles.PanelRegisterClient();

                            } else {

                                paneles.PanelConsulCient();

                            }

                        }

                    } catch (SQLException e) {

                        System.err.println("¡Error al consultar la C.I del cliente! " + e);
                        JOptionPane.showMessageDialog(null, "¡Error al consultar la C.I del cliente!", "¡Error!", JOptionPane.OK_OPTION);

                    }

                } else {

                    jLabel_CI_Client.setForeground(Color.red);

                    JOptionPane.showMessageDialog(null, "¡Error de formato!", "¡Error!", JOptionPane.WARNING_MESSAGE);

                    jTextField_CI_Client.setText("");
                    jTextField_CI_Client.requestFocus();

                }

            } else {

                jLabel_CI_Client.setForeground(Color.red);

                JOptionPane.showMessageDialog(null, "¡Debes llenar el campo!", "¡Acceso Denegado!", JOptionPane.WARNING_MESSAGE);

                jTextField_CI_Client.setText("");
                jTextField_CI_Client.requestFocus();

            }

        }

    }//GEN-LAST:event_jTextField_CI_ClientKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Consult;
    private javax.swing.JLabel jLabel_CI_Client;
    private javax.swing.JLabel jLabel_Title;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField_CI_Client;
    // End of variables declaration//GEN-END:variables

}
