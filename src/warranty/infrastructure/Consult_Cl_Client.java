package warranty.infrastructure;

import warranty.application.Request_Client_List;
import warranty.infrastructure.Register_Warranty;
import clases.BD_Connection;
import clases.FormatText;
import clases.Paneles;
import clases.TextPrompt;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import warranty.domain.Client;

public class Consult_Cl_Client extends javax.swing.JPanel {

    FormatText formattext = new FormatText();

    Paneles paneles = new Paneles();
    Client client = new Client();

    BD_Connection connection = new BD_Connection();

    public static int flag = 0, id_client = 0;
    public static String name_client, ci_client;
    String direction, telephone;

    public Consult_Cl_Client() {
        initComponents();

        TextPrompt text = new TextPrompt("Ingrese el N° de C.I del Cliente", jTextField_CI_Client);
        formattext.ValidateChar_Rif(jTextField_CI_Client);

        Request_Client_List.client_List.clear();

        Request_Client_List client_List = new Request_Client_List();
        Thread hilo = new Thread(client_List);
        hilo.start();

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
        add(jLabel_CI_Client, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 150, -1, -1));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 210, 250, 10));

        jButton_Consult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/consult btn dark.png"))); // NOI18N
        jButton_Consult.setBorder(null);
        jButton_Consult.setBorderPainted(false);
        jButton_Consult.setContentAreaFilled(false);
        jButton_Consult.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Consult.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/consutl btn ligth.png"))); // NOI18N
        jButton_Consult.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/consutl btn ligth.png"))); // NOI18N
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
        add(jButton_Consult, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 250, 190, 50));

        jLabel_Title.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        jLabel_Title.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Title.setText("Consultar Cliente Para Registro De Equipo");
        add(jLabel_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 890, 50));

        jTextField_CI_Client.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_CI_Client.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_CI_Client.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_CI_Client.setBorder(null);
        jTextField_CI_Client.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_CI_ClientKeyPressed(evt);
            }
        });
        add(jTextField_CI_Client, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 180, 250, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ConsultMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_ConsultMousePressed

        Client clienteEncontrado = null;

        ci_client = jTextField_CI_Client.getText().trim();

        if (!ci_client.equals("")) {

            try {
                if (client.searchClient(ci_client) != null) {

                    clienteEncontrado = client.searchClient(ci_client);

                    id_client = clienteEncontrado.getID();
                    name_client = clienteEncontrado.getName();
                    ci_client = clienteEncontrado.getIndentity();
                    telephone = clienteEncontrado.getTelephone();
                    direction = clienteEncontrado.getDirection_client();

                    int question = JOptionPane.showConfirmDialog(null,
                            "Nombre: " + name_client + "\n\n"
                            + "Teléfono: " + telephone + "\n\n"
                            + "Dirección: " + direction + "\n",
                            "Selección", JOptionPane.OK_CANCEL_OPTION);

                    if (question == 0) {

                        Register_Warranty.flag = 0;
                        Register_Warranty.flag_AddressRegisterAndConsult = 0;

                        paneles.PanelRegisterWarranty();

                    } else {

                        paneles.PanelConsulCient();

                    }

                } else {

                    int question = JOptionPane.showConfirmDialog(null, "El cliente no está registrado, ¿Desea Registrar?",
                            "Selección", JOptionPane.OK_CANCEL_OPTION);

                    if (question == 0) {

                        flag = 1;

                        ci_client = jTextField_CI_Client.getText().trim();
                        paneles.PanelRegisterClient();

                    } else {

                        paneles.PanelConsulCient();

                    }

                }

            } catch (InterruptedException ex) {
                Logger.getLogger(Consult_Cl_Client.class.getName()).log(Level.SEVERE, null, ex);
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

            Client clienteEncontrado = null;

            ci_client = jTextField_CI_Client.getText().trim();

            if (!ci_client.equals("")) {

                try {
                    if (client.searchClient(ci_client) != null) {

                        clienteEncontrado = client.searchClient(ci_client);

                        id_client = clienteEncontrado.getID();
                        name_client = clienteEncontrado.getName();
                        ci_client = clienteEncontrado.getIndentity();
                        telephone = clienteEncontrado.getTelephone();
                        direction = clienteEncontrado.getDirection_client();

                        int question = JOptionPane.showConfirmDialog(null,
                                "Nombre: " + name_client + "\n\n"
                                + "Teléfono: " + telephone + "\n\n"
                                + "Dirección: " + direction + "\n",
                                "Selección", JOptionPane.OK_CANCEL_OPTION);

                        if (question == 0) {

                            Register_Warranty.flag = 0;
                            Register_Warranty.flag_AddressRegisterAndConsult = 0;

                            paneles.PanelRegisterWarranty();

                        } else {

                            paneles.PanelConsulCient();

                        }

                    } else {

                        int question = JOptionPane.showConfirmDialog(null, "El cliente no está registrado, ¿Desea Registrar?",
                                "Selección", JOptionPane.OK_CANCEL_OPTION);

                        if (question == 0) {

                            flag = 1;

                            ci_client = jTextField_CI_Client.getText().trim();
                            paneles.PanelRegisterClient();

                        } else {

                            paneles.PanelConsulCient();

                        }

                    }

                } catch (InterruptedException ex) {
                    Logger.getLogger(Consult_Cl_Client.class.getName()).log(Level.SEVERE, null, ex);
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
