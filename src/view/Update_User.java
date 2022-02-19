package view;

import clases.TextPrompt;

public class Update_User extends javax.swing.JPanel {

    
    public Update_User() {
        initComponents();
        
        TextPrompt name = new TextPrompt("Ingrese el nombre de usuario", jTextField_Name);
        TextPrompt username = new TextPrompt("Ingrese el nombre de usuario", jTextField_Username);
        TextPrompt telephone = new TextPrompt("Ingrese el número de teléfono", jTextField_Telephone);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField_Name = new javax.swing.JTextField();
        jTextField_Telephone = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField_Username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Last_Modification = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(9, 53, 69));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Nombre:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jTextField_Name.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Name.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextField_Name.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Name.setBorder(null);
        jTextField_Name.setCaretColor(new java.awt.Color(240, 240, 240));
        add(jTextField_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 240, 30));

        jTextField_Telephone.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Telephone.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextField_Telephone.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Telephone.setBorder(null);
        jTextField_Telephone.setCaretColor(new java.awt.Color(240, 240, 240));
        add(jTextField_Telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 240, 30));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Estatus:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

        jTextField_Username.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Username.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextField_Username.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Username.setBorder(null);
        jTextField_Username.setCaretColor(new java.awt.Color(240, 240, 240));
        add(jTextField_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 240, 30));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Nombre De Usuario:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Modificado Por:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, -1, -1));

        jTextField_Last_Modification.setEditable(false);
        jTextField_Last_Modification.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Last_Modification.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextField_Last_Modification.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Last_Modification.setBorder(null);
        jTextField_Last_Modification.setCaretColor(new java.awt.Color(240, 240, 240));
        add(jTextField_Last_Modification, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 240, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 240, -1));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 240, -1));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 240, -1));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 240, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Administrador", "Gerente", "Tecnico" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 110, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Almacen", "Caricuao", "City Market" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 260, 100, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Teléfono:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Permisos De:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Dirección:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 240, -1, -1));

        jButton1.setText("Modificar");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 140, 40));

        jButton2.setText("Contraseña");
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 140, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField_Last_Modification;
    private javax.swing.JTextField jTextField_Name;
    private javax.swing.JTextField jTextField_Telephone;
    private javax.swing.JTextField jTextField_Username;
    // End of variables declaration//GEN-END:variables
}
