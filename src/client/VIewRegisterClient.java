package client;

import warranty.Consult_Cl_Client;
import OtherClass.BD_Connection;
import OtherClass.FormatText;
import OtherClass.Paneles;
import OtherClass.TextPrompt;

public class VIewRegisterClient extends javax.swing.JPanel {

    BD_Connection connection = new BD_Connection();

    public static String name_client, identity_card_client;

    //Objeto para darle formato a los campos de texto.
    FormatText formattext = new FormatText();

    Paneles paneles = new Paneles();

    public VIewRegisterClient() {
        initComponents();

        TextPrompt name = new TextPrompt("Ej. Carlos Perez", jTextField_Name);
        TextPrompt telephone = new TextPrompt("Ej. 0414 - 589.56.41", jTextField_Telephone);
        TextPrompt ci = new TextPrompt("Ej. V24.458.526", jTextField_CI);
        TextPrompt direction = new TextPrompt("Ej. Las Mercedes", jTextField_Direction_Client);

        validateAddressRegister();

        //Instacia para darle formato a los campos de texto...
        formattext.ValidateNumber(jTextField_Telephone);
        formattext.ValidateChar_Rif(jTextField_CI);

        ValidateCamp();

        jButton_Register.setVisible(false);

        try {
            getClient getclient = new getClient();
            Thread hilo = new Thread(getclient);
            hilo.start();
        } catch (Exception e) {

            System.out.println("Error en hilo... " + e);

        }

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
        jLabel_Direction2 = new javax.swing.JLabel();
        jLabel_Nombre2 = new javax.swing.JLabel();
        jLabel_Telefono2 = new javax.swing.JLabel();
        jLabel_Rif2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(9, 53, 69));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField_Direction_Client.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Direction_Client.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Direction_Client.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Direction_Client.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Direction_Client.setBorder(null);
        jTextField_Direction_Client.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_Direction_ClientKeyReleased(evt);
            }
        });
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
        jTextField_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_NameKeyReleased(evt);
            }
        });
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
        jTextField_Telephone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_TelephoneKeyReleased(evt);
            }
        });
        add(jTextField_Telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 220, 30));

        jTextField_CI.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_CI.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_CI.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_CI.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_CI.setBorder(null);
        jTextField_CI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_CIKeyReleased(evt);
            }
        });
        add(jTextField_CI, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 220, 30));

        jLabel_CI.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_CI.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_CI.setText("C.I O RIF:");
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

        jLabel_Direction2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel_Direction2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Direction2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Direction2.setText("CAMPO REQUERIDO *");
        jLabel_Direction2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel_Direction2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 165, 220, 20));

        jLabel_Nombre2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel_Nombre2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Nombre2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Nombre2.setText("CAMPO REQUERIDO *");
        jLabel_Nombre2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel_Nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 165, 220, 20));

        jLabel_Telefono2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel_Telefono2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Telefono2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Telefono2.setText("CAMPO REQUERIDO *");
        jLabel_Telefono2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel_Telefono2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 265, 220, 20));

        jLabel_Rif2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel_Rif2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Rif2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Rif2.setText("CAMPO REQUERIDO *");
        jLabel_Rif2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel_Rif2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 365, 220, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_RegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RegisterMousePressed

        String name, identity, telephone, direction;

        name = jTextField_Name.getText().trim();
        telephone = jTextField_Telephone.getText().trim();
        identity = jTextField_CI.getText().trim();
        direction = jTextField_Direction_Client.getText().trim();
        
        name_client = name;
        identity_card_client = identity;

        RegisterClient registerClient = new RegisterClient(validateAddressRegister(), name, telephone, identity, direction);
        registerClient.RegisterClient();

    }//GEN-LAST:event_jButton_RegisterMousePressed

    private void jTextField_NameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_NameKeyReleased

        ValidateCamp();

    }//GEN-LAST:event_jTextField_NameKeyReleased

    private void jTextField_TelephoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_TelephoneKeyReleased

        ValidateCamp();

    }//GEN-LAST:event_jTextField_TelephoneKeyReleased

    private void jTextField_CIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_CIKeyReleased

        ValidateCamp();

    }//GEN-LAST:event_jTextField_CIKeyReleased

    private void jTextField_Direction_ClientKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Direction_ClientKeyReleased

        ValidateCamp();

    }//GEN-LAST:event_jTextField_Direction_ClientKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Register;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_CI;
    private javax.swing.JLabel jLabel_Direction2;
    private javax.swing.JLabel jLabel_Direction_Client;
    private javax.swing.JLabel jLabel_Name;
    private javax.swing.JLabel jLabel_Nombre2;
    private javax.swing.JLabel jLabel_Rif2;
    private javax.swing.JLabel jLabel_Telefono2;
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

    private int validateAddressRegister() {

        int address = Consult_Cl_Client.flag;

        if (Consult_Cl_Client.flag == 1) {

            jTextField_Name.requestFocus();

            jTextField_CI.setText(Consult_Cl_Client.ci_client);

        }

        return address;

    }

    private void ValidateCamp() {

        if (jTextField_Name.getText().isEmpty()) {

            jLabel_Nombre2.setText("*CAMPO REQUERIDO*");

        } else if (!jTextField_Name.getText().contains(" ")) {

            jLabel_Nombre2.setText("*FORMATO INVALIDO*");

        } else {

            jLabel_Nombre2.setText("");

        }

        if (jTextField_Telephone.getText().isEmpty()) {

            jLabel_Telefono2.setText("*CAMPO REQUERIDO*");

        } else if (jTextField_Telephone.getText().length() < 16) {

            jLabel_Telefono2.setText("*FORMATO INVALIDO*");

        } else if (!jTextField_Telephone.getText().contains("0412") && !jTextField_Telephone.getText().contains("0414")
                && !jTextField_Telephone.getText().contains("0424") && !jTextField_Telephone.getText().contains("0416")
                && !jTextField_Telephone.getText().contains("0426")) {

            jLabel_Telefono2.setText("*FORMATO INVALIDO*");

        } else {

            jLabel_Telefono2.setText("");

        }

        if (jTextField_CI.getText().isEmpty()) {

            jLabel_Rif2.setText("*CAMPO REQUERIDO*");

        } else if (jTextField_CI.getText().contains("v") && jTextField_CI.getText().length() > 9 || jTextField_CI.getText().length() < 8
                || jTextField_CI.getText().contains("V") && jTextField_CI.getText().length() > 9 || jTextField_CI.getText().length() < 8
                || jTextField_CI.getText().contains("j") && jTextField_CI.getText().length() != 10
                || jTextField_CI.getText().contains("J") && jTextField_CI.getText().length() != 10
                || jTextField_CI.getText().contains("g") && jTextField_CI.getText().length() != 10
                || jTextField_CI.getText().contains("G") && jTextField_CI.getText().length() != 10) {

            jLabel_Rif2.setText("*FORMATO INVALIDO*");

        } else {

            jLabel_Rif2.setText("");

        }

        if (jTextField_Direction_Client.getText().isEmpty()) {

            jLabel_Direction2.setText("*CAMPO REQUERIDO*");

        } else {

            jLabel_Direction2.setText("");

        }

        if (jTextField_Name.getText().isEmpty() || !jTextField_Name.getText().contains(" ")
                || jTextField_Telephone.getText().isEmpty() || jTextField_Telephone.getText().length() < 16
                || jTextField_Telephone.getText().length() < 16 || !jTextField_Name.getText().contains(" ")
                || !jTextField_Telephone.getText().contains("0412") && !jTextField_Telephone.getText().contains("0414")
                && !jTextField_Telephone.getText().contains("0424") && !jTextField_Telephone.getText().contains("0416")
                && !jTextField_Telephone.getText().contains("0426")
                || jTextField_Direction_Client.getText().isEmpty()
                || jTextField_CI.getText().isEmpty()
                || jTextField_CI.getText().contains("v") && jTextField_CI.getText().length() > 9 || jTextField_CI.getText().length() < 8
                || jTextField_CI.getText().contains("V") && jTextField_CI.getText().length() > 9 || jTextField_CI.getText().length() < 8
                || jTextField_CI.getText().contains("j") && jTextField_CI.getText().length() != 10
                || jTextField_CI.getText().contains("J") && jTextField_CI.getText().length() != 10
                || jTextField_CI.getText().contains("g") && jTextField_CI.getText().length() != 10
                || jTextField_CI.getText().contains("G") && jTextField_CI.getText().length() != 10) {

            jButton_Register.setVisible(false);

        } else {

            jButton_Register.setVisible(true);

        }

    }

}
