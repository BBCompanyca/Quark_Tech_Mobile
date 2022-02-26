package view;

public class Clients extends javax.swing.JPanel {

    public Clients() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField_Search_Client = new javax.swing.JTextField();
        jButton_Search_Client = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        jTable_Client = new javax.swing.JTable();
        jButton_New_Client = new javax.swing.JButton();
        jButton_Update_Client = new javax.swing.JButton();
        jButton_Delete_Client = new javax.swing.JButton();

        setBackground(new java.awt.Color(9, 53, 69));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Clientes");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 100, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 590, 10));

        jTextField_Search_Client.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Search_Client.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextField_Search_Client.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Search_Client.setBorder(null);
        jTextField_Search_Client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField_Search_ClientMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextField_Search_ClientMouseReleased(evt);
            }
        });
        jTextField_Search_Client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Search_ClientActionPerformed(evt);
            }
        });
        jTextField_Search_Client.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_Search_ClientKeyPressed(evt);
            }
        });
        add(jTextField_Search_Client, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 590, 30));

        jButton_Search_Client.setText("Buscar");
        jButton_Search_Client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_Search_ClientMousePressed(evt);
            }
        });
        add(jButton_Search_Client, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 80, 30));

        jScrollPane.setBackground(new java.awt.Color(9, 53, 69));
        jScrollPane.setBorder(null);
        jScrollPane.setForeground(new java.awt.Color(240, 240, 240));

        jTable_Client.setBackground(new java.awt.Color(9, 53, 69));
        jTable_Client.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jTable_Client.setForeground(new java.awt.Color(240, 240, 240));
        jTable_Client.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Dirección", "Tienda", "Registrado Por"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Client.setGridColor(new java.awt.Color(240, 240, 240));
        jTable_Client.setSelectionBackground(new java.awt.Color(9, 53, 69));
        jScrollPane.setViewportView(jTable_Client);

        add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 750, 203));

        jButton_New_Client.setText("NUEVO");
        jButton_New_Client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_New_ClientMousePressed(evt);
            }
        });
        jButton_New_Client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_New_ClientActionPerformed(evt);
            }
        });
        add(jButton_New_Client, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 100, 35));

        jButton_Update_Client.setText("MODIFICAR");
        jButton_Update_Client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_Update_ClientMousePressed(evt);
            }
        });
        jButton_Update_Client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Update_ClientActionPerformed(evt);
            }
        });
        add(jButton_Update_Client, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 100, 35));

        jButton_Delete_Client.setText("BORRAR");
        jButton_Delete_Client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_Delete_ClientMousePressed(evt);
            }
        });
        add(jButton_Delete_Client, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, 100, 35));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_Search_ClientMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_Search_ClientMousePressed

    }//GEN-LAST:event_jTextField_Search_ClientMousePressed

    private void jTextField_Search_ClientMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_Search_ClientMouseReleased
        //nothing
    }//GEN-LAST:event_jTextField_Search_ClientMouseReleased

    private void jTextField_Search_ClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Search_ClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Search_ClientActionPerformed

    private void jTextField_Search_ClientKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Search_ClientKeyPressed

        
    }//GEN-LAST:event_jTextField_Search_ClientKeyPressed

    private void jButton_Search_ClientMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Search_ClientMousePressed

       
    }//GEN-LAST:event_jButton_Search_ClientMousePressed

    private void jButton_New_ClientMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_New_ClientMousePressed

    }//GEN-LAST:event_jButton_New_ClientMousePressed

    private void jButton_New_ClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_New_ClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_New_ClientActionPerformed

    private void jButton_Update_ClientMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Update_ClientMousePressed

        
    }//GEN-LAST:event_jButton_Update_ClientMousePressed

    private void jButton_Update_ClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Update_ClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Update_ClientActionPerformed

    private void jButton_Delete_ClientMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Delete_ClientMousePressed

       
    }//GEN-LAST:event_jButton_Delete_ClientMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Delete_Client;
    private javax.swing.JButton jButton_New_Client;
    private javax.swing.JButton jButton_Search_Client;
    private javax.swing.JButton jButton_Update_Client;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable_Client;
    private javax.swing.JTextField jTextField_Search_Client;
    // End of variables declaration//GEN-END:variables
}
