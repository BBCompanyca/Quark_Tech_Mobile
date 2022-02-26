package view;

import clases.BD_Connection;
import clases.TextPrompt;

public class Register_Client extends javax.swing.JPanel {
    
    public Register_Client() {
        initComponents();
        
        TextPrompt name = new TextPrompt("Ingrese el nombre", jTextField_Name);
        TextPrompt telephone = new TextPrompt("Ingrese el N° de teléfono", jTextField_Telephone);
        TextPrompt ci = new TextPrompt("Ingrese el N° de cédula", jTextField_CI);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Name = new javax.swing.JLabel();
        jTextField_Name = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel_Telephone = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField_Telephone = new javax.swing.JTextField();
        jTextField_CI = new javax.swing.JTextField();
        jLabel_CI = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Direction = new javax.swing.JTextArea();
        jLabel_Name1 = new javax.swing.JLabel();
        jButton_Register = new javax.swing.JButton();

        setBackground(new java.awt.Color(9, 53, 69));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Name.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Name.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Name.setText("Dirección:");
        add(jLabel_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        jTextField_Name.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Name.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextField_Name.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Name.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Name.setBorder(null);
        add(jTextField_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 220, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 220, -1));

        jLabel_Telephone.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Telephone.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Telephone.setText("Teléfono:");
        add(jLabel_Telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 220, -1));

        jTextField_Telephone.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Telephone.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextField_Telephone.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Telephone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Telephone.setBorder(null);
        add(jTextField_Telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 220, 30));

        jTextField_CI.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_CI.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextField_CI.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_CI.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_CI.setBorder(null);
        add(jTextField_CI, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 220, 30));

        jLabel_CI.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_CI.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_CI.setText("Correo:");
        add(jLabel_CI, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 220, -1));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setHorizontalScrollBar(null);

        jTextArea_Direction.setBackground(new java.awt.Color(9, 53, 69));
        jTextArea_Direction.setColumns(20);
        jTextArea_Direction.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextArea_Direction.setForeground(new java.awt.Color(240, 240, 240));
        jTextArea_Direction.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jScrollPane1.setViewportView(jTextArea_Direction);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 340, 150));

        jLabel_Name1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Name1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Name1.setText("Nombre:");
        add(jLabel_Name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        jButton_Register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_register_dark.png"))); // NOI18N
        jButton_Register.setBorder(null);
        jButton_Register.setBorderPainted(false);
        jButton_Register.setContentAreaFilled(false);
        jButton_Register.setFocusPainted(false);
        jButton_Register.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_Register.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_register_ligth.png"))); // NOI18N
        jButton_Register.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_register_ligth.png"))); // NOI18N
        jButton_Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_RegisterMousePressed(evt);
            }
        });
        add(jButton_Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 190, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_RegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RegisterMousePressed

        
    }//GEN-LAST:event_jButton_RegisterMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Register;
    private javax.swing.JLabel jLabel_CI;
    private javax.swing.JLabel jLabel_Name;
    private javax.swing.JLabel jLabel_Name1;
    private javax.swing.JLabel jLabel_Telephone;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextArea_Direction;
    public javax.swing.JTextField jTextField_CI;
    public javax.swing.JTextField jTextField_Name;
    public javax.swing.JTextField jTextField_Telephone;
    // End of variables declaration//GEN-END:variables
}
