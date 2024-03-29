package user;

import login.Login;
import OtherClass.TextPrompt;
import java.sql.*;
import OtherClass.BD_Connection;
import OtherClass.Paneles;
import moviments.Register_Movimiento;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public final class Users extends javax.swing.JPanel {

    BD_Connection connection = new BD_Connection();

    public static int ID;
    String direction, type_Account, permission, username;

    Paneles paneles = new Paneles();

    private static DefaultTableModel model;

    public Users() {
        initComponents();

        direction = Login.direction;
        type_Account = Login.type_account;

        //Objeto para el PlayHolders del jTextField buscar usuarios...
        TextPrompt search_user = new TextPrompt("Ingrese algún parametro", jTextField_Search_User);

        //Método para obtener la lista de usuarios...
        getUsers();

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
        jTextField_Search_User.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_Search_UserKeyPressed(evt);
            }
        });
        add(jTextField_Search_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 700, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 700, 10));

        jButton_Delete_User.setText("BORRAR");
        jButton_Delete_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_Delete_UserMousePressed(evt);
            }
        });
        add(jButton_Delete_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 380, 100, 35));

        jScrollPane.setBackground(new java.awt.Color(9, 53, 69));
        jScrollPane.setBorder(null);
        jScrollPane.setForeground(new java.awt.Color(240, 240, 240));

        jTable_User.setBackground(new java.awt.Color(9, 53, 69));
        jTable_User.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jTable_User.setForeground(new java.awt.Color(240, 240, 240));
        jTable_User.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Nombre De Usuario", "Dirección", "Permisos De", "Estatus"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_User.setGridColor(new java.awt.Color(240, 240, 240));
        jTable_User.setSelectionBackground(new java.awt.Color(9, 53, 69));
        jScrollPane.setViewportView(jTable_User);
        if (jTable_User.getColumnModel().getColumnCount() > 0) {
            jTable_User.getColumnModel().getColumn(0).setResizable(false);
            jTable_User.getColumnModel().getColumn(1).setResizable(false);
            jTable_User.getColumnModel().getColumn(2).setResizable(false);
            jTable_User.getColumnModel().getColumn(3).setResizable(false);
            jTable_User.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 850, 260));

        jButton_Search_User.setText("Buscar");
        jButton_Search_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_Search_UserMousePressed(evt);
            }
        });
        add(jButton_Search_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, 80, 30));

        jButton_New_User.setText("NUEVO");
        jButton_New_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_New_UserMousePressed(evt);
            }
        });
        jButton_New_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_New_UserActionPerformed(evt);
            }
        });
        add(jButton_New_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 100, 35));

        jButton_Update_User.setText("MODIFICAR");
        jButton_Update_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_Update_UserMousePressed(evt);
            }
        });
        jButton_Update_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Update_UserActionPerformed(evt);
            }
        });
        add(jButton_Update_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, 100, 35));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_Search_UserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_Search_UserMousePressed

    }//GEN-LAST:event_jTextField_Search_UserMousePressed

    private void jTextField_Search_UserMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_Search_UserMouseReleased
        //nothing
    }//GEN-LAST:event_jTextField_Search_UserMouseReleased

    private void jTextField_Search_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Search_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Search_UserActionPerformed

    private void jButton_Search_UserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Search_UserMousePressed

        String search = jTextField_Search_User.getText().trim();
        FilterRequestUser filterRequestUser = new FilterRequestUser();
        filterRequestUser.filterRequestUser(search);
        jTextField_Search_User.setText("");

    }//GEN-LAST:event_jButton_Search_UserMousePressed

    private void jTextField_Search_UserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Search_UserKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            String search = jTextField_Search_User.getText().trim();
            FilterRequestUser filterRequestUser = new FilterRequestUser();
            filterRequestUser.filterRequestUser(search);
            jTextField_Search_User.setText("");

        }

    }//GEN-LAST:event_jTextField_Search_UserKeyPressed

    private void jButton_New_UserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_New_UserMousePressed

        //Método para llamar a la interfaz de registrar usuarios...
        paneles.PanelRegisterUser();

    }//GEN-LAST:event_jButton_New_UserMousePressed

    private void jButton_New_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_New_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_New_UserActionPerformed

    private void jButton_Update_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Update_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Update_UserActionPerformed

    private void jButton_Update_UserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Update_UserMousePressed

        int fila_point = jTable_User.getSelectedRow();
        int columna_punt = 0;

        if (fila_point > -1) {

            ID = (int) getInstanceUser().getValueAt(fila_point, columna_punt);

            paneles.PanelUpadteUser();

        } else {

            JOptionPane.showMessageDialog(null, "¡Debes seleccionar un usuario!", "¡Acceso Denegado!",
                    JOptionPane.OK_OPTION);

        }

    }//GEN-LAST:event_jButton_Update_UserMousePressed

    private void jButton_Delete_UserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Delete_UserMousePressed

        int fila_point = jTable_User.getSelectedRow();
        int columna_point = 0;

        if (fila_point > -1) {

            ID = (int) jTable_User.getValueAt(fila_point, columna_point);

            if (Login.type_account.equals("Moderador")) {

                permission = (String) jTable_User.getValueAt(fila_point, 4);
                username = (String) jTable_User.getValueAt(fila_point, 2);

            } else {

                permission = (String) jTable_User.getValueAt(fila_point, 3);
                username = (String) jTable_User.getValueAt(fila_point, 2);

            }

            if (ID != Login.ID_User) {

                if (!Login.type_account.equals(permission) && permission.equals("Moderador") || Login.type_account.equals(permission)) {

                    JOptionPane.showMessageDialog(null, "¡No tienes permisos para eliminar esta cuenta!", "¡Acceso Denegado!",
                            JOptionPane.OK_OPTION);

                } else {

                    int selection = JOptionPane.showConfirmDialog(null, "¿Realmente desea eliminar este usuario?", "¡Confirmar!",
                            JOptionPane.YES_NO_OPTION);

                    if (selection == 0) {

                        try {

                            Connection cn = connection.connection();
                            PreparedStatement pst = cn.prepareStatement(
                                    "delete from user where id_user = '" + ID + "'");

                            pst.executeUpdate();

                            Register_Movimiento register_Movimiento = new Register_Movimiento(Login.ID_User, "E/U", username, Login.direction);
                            Thread hilo = new Thread(register_Movimiento);
                            hilo.start();

                            getInstanceUser().removeRow(fila_point);

                            JOptionPane.showMessageDialog(null, "Usuario eliminado.");

                            cn.close();

                        } catch (SQLException e) {

                            System.err.println("¡Error al eliminar el usuario! " + e);
                            JOptionPane.showMessageDialog(null, "¡Error al eliminar el usuario!", "¡Error!",
                                    JOptionPane.OK_OPTION);

                        }

                    }

                }

            } else {

                JOptionPane.showMessageDialog(null, "¡No puedes eliminar tú cuenta!", "¡Acceso Denegado!",
                        JOptionPane.OK_OPTION);

            }

        } else {

            JOptionPane.showMessageDialog(null, "¡Debes seleccionar un usuario!", "¡Acceso Denegado!",
                    JOptionPane.OK_OPTION);

        }

    }//GEN-LAST:event_jButton_Delete_UserMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Delete_User;
    private javax.swing.JButton jButton_New_User;
    private javax.swing.JButton jButton_Search_User;
    private javax.swing.JButton jButton_Update_User;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JScrollPane jScrollPane;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTable jTable_User;
    private javax.swing.JTextField jTextField_Search_User;
    // End of variables declaration//GEN-END:variables

    private void getUsers() {

        if (type_Account.equals("Moderador")) {

            try {

                //Conexión a la BD para consultar la lista de los usuarios para administradores...
                Connection cn = connection.connection();
                PreparedStatement pst = cn.prepareStatement(
                        "select id_user, name_user, username, direction, type_account, status from user");

                ResultSet rs = pst.executeQuery();

                //Diseño de la tabla...
                jTable_User = new JTable(getInstanceUser());
                jScrollPane.setViewportView(jTable_User);

                getInstanceUser().setColumnCount(0);
                getInstanceUser().setRowCount(0);

                getInstanceUser().addColumn("ID");
                getInstanceUser().addColumn("Nombre");
                getInstanceUser().addColumn("Nombre De Usuario");
                getInstanceUser().addColumn("Dirección");
                getInstanceUser().addColumn("Permisos De");
                getInstanceUser().addColumn("Estatus");

                while (rs.next()) {

                    Object[] fila = new Object[6];
                    for (int i = 0; i < 6; i++) {

                        fila[i] = rs.getObject(i + 1);

                    }

                    getInstanceUser().addRow(fila);

                }

                cn.close();

            } catch (SQLException e) {

                System.err.println("¡Error al consultar la lista de usuarios! " + e);
                JOptionPane.showMessageDialog(null, "¡Error al consultar la lista de usuarios!", "¡Error!",
                        JOptionPane.OK_CANCEL_OPTION);

            }

        } else {

            try {

                //Conexión a la BD para consultar la lista de los usuarios para administradores...
                Connection cn = connection.connection();
                PreparedStatement pst = cn.prepareStatement(
                        "select id_user, name_user, username, type_account, status from user where direction = '"
                        + direction + "'");

                ResultSet rs = pst.executeQuery();

                //Diseño de la tabla...
                jTable_User = new JTable(getInstanceUser());
                jScrollPane.setViewportView(jTable_User);

                getInstanceUser().setColumnCount(0);
                getInstanceUser().setRowCount(0);

                getInstanceUser().addColumn("ID");
                getInstanceUser().addColumn("Nombre");
                getInstanceUser().addColumn("Nombre De Usuario");
                getInstanceUser().addColumn("Permisos De");
                getInstanceUser().addColumn("Estatus");

                while (rs.next()) {

                    Object[] fila = new Object[5];
                    for (int i = 0; i < 5; i++) {

                        fila[i] = rs.getObject(i + 1);

                    }

                    getInstanceUser().addRow(fila);

                }

                cn.close();

            } catch (SQLException e) {

                System.err.println("¡Error al consultar la lista de usuarios! " + e);
                JOptionPane.showMessageDialog(null, "¡Error al consultar la lista de usuarios!", "¡Error!",
                        JOptionPane.OK_CANCEL_OPTION);

            }

        }

    }

    public static DefaultTableModel getInstanceUser() {

        if (model == null) {
            model = new DefaultTableModel();
        }

        return model;

    }

}
