package view;

import java.sql.*;
import clases.BD_Connection;
import clases.FormatText;
import clases.Paneles;
import clases.TextPrompt;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Register_Client extends javax.swing.JPanel {
    
    public static String name_client, identity_card_client;

    //Objeto para darle formato a los campos de texto.
    FormatText formattext = new FormatText();

    Paneles paneles = new Paneles();

    public Register_Client() {
        initComponents();

        TextPrompt name = new TextPrompt("Ej. Carlos Perez", jTextField_Name);
        TextPrompt telephone = new TextPrompt("Ej. 0414 - 589.56.41", jTextField_Telephone);
        TextPrompt ci = new TextPrompt("Ej. 24.458.526", jTextField_CI);
        TextPrompt direction = new TextPrompt("Ej. Las Mercedes", jTextField_Direction_Client);

        validateAddressRegister();

        //Instacia para darle formato a los campos de texto...
        formattext.ValidateName(jTextField_Name);
        formattext.ValidateNumber(jTextField_Telephone);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField_Direction_Client = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel_Direction_Client = new javax.swing.JLabel();
        jTextField_Name = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel_Telephone = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField_Telephone = new javax.swing.JTextField();
        jTextField_CI = new javax.swing.JTextField();
        jLabel_CI = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel_Name = new javax.swing.JLabel();
        jButton_Register = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(9, 53, 69));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField_Direction_Client.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Direction_Client.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Direction_Client.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Direction_Client.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Direction_Client.setBorder(null);
        add(jTextField_Direction_Client, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 220, 30));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 220, -1));

        jLabel_Direction_Client.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Direction_Client.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Direction_Client.setText("Dirección:");
        add(jLabel_Direction_Client, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, -1, -1));

        jTextField_Name.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Name.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Name.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Name.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Name.setBorder(null);
        add(jTextField_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 220, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 220, -1));

        jLabel_Telephone.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Telephone.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Telephone.setText("Teléfono:");
        add(jLabel_Telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 220, -1));

        jTextField_Telephone.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Telephone.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Telephone.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Telephone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Telephone.setBorder(null);
        add(jTextField_Telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 220, 30));

        jTextField_CI.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_CI.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_CI.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_CI.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_CI.setBorder(null);
        add(jTextField_CI, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 220, 30));

        jLabel_CI.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_CI.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_CI.setText("C.I:");
        add(jLabel_CI, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 220, -1));

        jLabel_Name.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Name.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Name.setText("Nombre:");
        add(jLabel_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        jButton_Register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_register_dark.png"))); // NOI18N
        jButton_Register.setBorder(null);
        jButton_Register.setBorderPainted(false);
        jButton_Register.setContentAreaFilled(false);
        jButton_Register.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_register_ligth.png"))); // NOI18N
        jButton_Register.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_register_ligth.png"))); // NOI18N
        jButton_Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_RegisterMousePressed(evt);
            }
        });
        add(jButton_Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 210, 190, 60));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar Nuevo Cliente");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 890, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_RegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RegisterMousePressed

        int flag = 0;

        String telephone, direction_client;

        name_client = jTextField_Name.getText().trim();
        telephone = jTextField_Telephone.getText().trim();
        identity_card_client = jTextField_CI.getText().trim();
        direction_client = jTextField_Direction_Client.getText().trim();

        if (name_client.equals("")) {

            jLabel_Name.setForeground(Color.red);
            flag++;

        } else {

            jLabel_Name.setForeground(new Color(240, 240, 240));

        }

        if (telephone.equals("")) {

            jLabel_Telephone.setForeground(Color.red);
            flag++;

        } else {

            jLabel_Telephone.setForeground(new Color(240, 240, 240));

        }

        if (identity_card_client.equals("")) {

            jLabel_CI.setForeground(Color.red);
            flag++;

        } else {

            jLabel_CI.setForeground(new Color(240, 240, 240));

        }

        if (direction_client.equals("")) {

            jLabel_Direction_Client.setForeground(Color.red);
            flag++;

        } else {

            jLabel_Direction_Client.setForeground(new Color(240, 240, 240));

        }

        if (flag == 0) {

            try {

                Connection cn = BD_Connection.connection();
                PreparedStatement pst = cn.prepareStatement(
                        "select cedula_client from client where cedula_client = '" + identity_card_client + "'");

                ResultSet rs = pst.executeQuery();

                if (rs.next()) {

                    jLabel_CI.setForeground(Color.red);

                    JOptionPane.showMessageDialog(null, "¡Ya existe un cliente con este Número de Cédula!", "¡Acceso Denegado!",
                            JOptionPane.OK_OPTION);

                    jTextField_CI.setText("");
                    jTextField_CI.requestFocus();

                    cn.close();

                } else {

                    cn.close();

                    try {

                        String unformat_telphone = formattext.unFormatText(telephone);

                        Connection cn2 = BD_Connection.connection();
                        PreparedStatement pst2 = cn2.prepareStatement(
                                "insert into client values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

                        pst2.setInt(1, 0);
                        pst2.setString(2, name_client);
                        pst2.setString(3, telephone);
                        pst2.setString(4, unformat_telphone);
                        pst2.setString(5, formattext.ValidateCI2(identity_card_client));
                        pst2.setString(6, identity_card_client);
                        pst2.setString(7, direction_client);
                        pst2.setString(8, Login.direction);
                        pst2.setString(9, Login.user);
                        pst2.setString(10, "");

                        pst2.executeUpdate();

                        PintarDeVerdejTextField();
                        VaciarCamposDeTextos();

                        JOptionPane.showMessageDialog(null, "Registro exitoso.", "¡Exito!", JOptionPane.INFORMATION_MESSAGE);

                        resetColorjTextField();

                        if (Consult_Cl_Client.flag == 1) {

                            Register_Warranty.flag_AddressRegisterAndConsult = 1;
                            paneles.PanelRegisterWarranty();

                        } else {

                            paneles.PanelClients();

                        }

                    } catch (SQLException e) {

                        System.err.println("¡Error al registrar cliente! " + e);
                        JOptionPane.showMessageDialog(null, "¡Error al registrar cliente!", "¡Acceso Denegado!",
                                JOptionPane.OK_OPTION);

                    }

                }

            } catch (SQLException e) {

                System.err.println("¡Error al consultar la C.I Del cliente! " + e);
                JOptionPane.showMessageDialog(null, "¡Error al consultar la C.I Del cliente!", "¡Acceso Denegado!",
                        JOptionPane.OK_OPTION);
            }

        } else {

            JOptionPane.showMessageDialog(null, "¡Debes llenar todos los campos!", "¡Acceso Denegado!",
                    JOptionPane.WARNING_MESSAGE);

        }

    }//GEN-LAST:event_jButton_RegisterMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Register;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_CI;
    private javax.swing.JLabel jLabel_Direction_Client;
    private javax.swing.JLabel jLabel_Name;
    private javax.swing.JLabel jLabel_Telephone;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    public javax.swing.JTextField jTextField_CI;
    public javax.swing.JTextField jTextField_Direction_Client;
    public javax.swing.JTextField jTextField_Name;
    public javax.swing.JTextField jTextField_Telephone;
    // End of variables declaration//GEN-END:variables

    private void validateAddressRegister() {

        if (Consult_Cl_Client.flag == 1) {

            jTextField_Name.requestFocus();

            jTextField_CI.setText(Consult_Cl_Client.ci_client);
            jTextField_CI.setEditable(false);

        }

    }

    private void PintarDeVerdejTextField() {

        jLabel_Name.setForeground(Color.GREEN);
        jLabel_Telephone.setForeground(Color.GREEN);
        jLabel_CI.setForeground(Color.GREEN);
        jLabel_Direction_Client.setForeground(Color.GREEN);

    }

    private void resetColorjTextField() {

        jLabel_Name.setForeground(new Color(240, 240, 240));
        jLabel_Telephone.setForeground(new Color(240, 240, 240));
        jLabel_CI.setForeground(new Color(240, 240, 240));
        jLabel_Direction_Client.setForeground(new Color(240, 240, 240));

    }

    private void VaciarCamposDeTextos() {

        jTextField_Name.setText("");
        jTextField_Telephone.setText("");
        jTextField_CI.setText("");
        jTextField_Direction_Client.setText("");

        jTextField_Name.requestFocus();

    }

}
