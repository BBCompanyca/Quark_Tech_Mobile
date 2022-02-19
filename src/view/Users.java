package view;

import clases.TextPrompt;

public class Users extends javax.swing.JPanel {

    public Users() {
        initComponents();
        
        //Objeto para el PlayHolders del jTexttField buscar usuarios...
        TextPrompt search_user = new TextPrompt("Ingrese el nombre del usuario", jTextField_Search_User);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField_Search_User = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton_Delete_User = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        jTable_User = new javax.swing.JTable();
        jButton_Search_User = new javax.swing.JButton();
        jButton_New_User = new javax.swing.JButton();
        jButton_Update_User = new javax.swing.JButton();

        setBackground(new java.awt.Color(9, 53, 69));
        setPreferredSize(new java.awt.Dimension(790, 370));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Usuarios");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 100, 30));

        jTextField_Search_User.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Search_User.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextField_Search_User.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Search_User.setBorder(null);
        jTextField_Search_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField_Search_UserMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextField_Search_UserMouseReleased(evt);
            }
        });
        jTextField_Search_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Search_UserActionPerformed(evt);
            }
        });
        add(jTextField_Search_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 590, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 590, 10));

        jButton_Delete_User.setText("BORRAR");
        add(jButton_Delete_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, 100, 35));

        jScrollPane.setBackground(new java.awt.Color(9, 53, 69));
        jScrollPane.setBorder(null);
        jScrollPane.setForeground(new java.awt.Color(240, 240, 240));

        jTable_User.setBackground(new java.awt.Color(9, 53, 69));
        jTable_User.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jTable_User.setForeground(new java.awt.Color(240, 240, 240));
        jTable_User.setModel(new javax.swing.table.DefaultTableModel(
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
                "ID", "Nombre", "Nombre De Usuario", "Dirección", "Permisos De"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_User.setGridColor(new java.awt.Color(240, 240, 240));
        jTable_User.getTableHeader().setReorderingAllowed(false);
        jScrollPane.setViewportView(jTable_User);
        if (jTable_User.getColumnModel().getColumnCount() > 0) {
            jTable_User.getColumnModel().getColumn(0).setResizable(false);
            jTable_User.getColumnModel().getColumn(1).setResizable(false);
            jTable_User.getColumnModel().getColumn(2).setResizable(false);
            jTable_User.getColumnModel().getColumn(3).setResizable(false);
            jTable_User.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 690, 203));

        jButton_Search_User.setText("Buscar");
        add(jButton_Search_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 80, 30));

        jButton_New_User.setText("NUEVO");
        add(jButton_New_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 100, 35));

        jButton_Update_User.setText("MODIFICAR");
        add(jButton_Update_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 100, 35));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_Search_UserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_Search_UserMousePressed
        
    }//GEN-LAST:event_jTextField_Search_UserMousePressed

    private void jTextField_Search_UserMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_Search_UserMouseReleased
        //nothing
    }//GEN-LAST:event_jTextField_Search_UserMouseReleased

    private void jTextField_Search_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Search_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Search_UserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Delete_User;
    private javax.swing.JButton jButton_New_User;
    private javax.swing.JButton jButton_Search_User;
    private javax.swing.JButton jButton_Update_User;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable_User;
    private javax.swing.JTextField jTextField_Search_User;
    // End of variables declaration//GEN-END:variables
}
