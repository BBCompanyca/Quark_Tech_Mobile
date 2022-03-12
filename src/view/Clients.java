package view;

import java.sql.*;
import clases.BD_Connection;
import clases.Paneles;
import clases.TextPrompt;
import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Clients extends javax.swing.JPanel {

    DefaultTableModel model = new DefaultTableModel();
    
    Paneles paneles = new Paneles();

    String type_Account, direction;
    public static int ID;

    public Clients() {
        initComponents();

        type_Account = Login.type_account;
        direction = Login.direction;

        TextPrompt search = new TextPrompt("Ingrese algún parametro", jTextField_Search_Client);

        getClients();

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
                "ID", "Nombre", "Teléfono", "Tienda", "Registrado Por"
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
        jButton_New_Client.setFocusPainted(false);
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
        jButton_Update_Client.setFocusPainted(false);
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
        jButton_Delete_Client.setFocusPainted(false);
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

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            String search = jTextField_Search_Client.getText().trim();
            String query = "";

            if (search.equals("") && !type_Account.equals("Moderador")) {

                query = "select id_client, name_client, telephone_client, cedula_client, registered_by from client where direction_tienda = '"
                        + direction + "'";

            } else if (!search.equals("") && !type_Account.equals("Moderador")) {

                query = "select id_client, name_client, telephone_client, cedula_client, registered_by from client where id_client = '" + search + "' and direction_tienda = '" + direction + "' "
                        + "or name_client = '" + search + "' and direction_tienda = '" + direction + "' or telephone_client = '"
                        + search + "' and direction_tienda = '" + direction + "' or registered_by = '" + search + "' and direction_tienda = '" + direction + "' or cedula_client = '" + search + "' and direction_tienda = '" + direction + "'";

            } else if (search.equals("") && type_Account.equals("Moderador")) {

                query = "select id_client, name_client, telephone_client, cedula_client, direction_tienda, registered_by from client";

            } else if (!search.equals("") && type_Account.equals("Moderador")) {

                query = "select id_client, name_client, telephone_client, cedula_client, direction_tienda, registered_by from client where "
                        + "id_client = '" + search + "' or name_client = '" + search + "' or telephone_client = '"
                        + search + "' or registered_by = '" + search + "' or direction_tienda = '" + search + "' or cedula_client = '"
                        + search + "'";

            }

            try {

                Connection cn = BD_Connection.connection();
                PreparedStatement pst = cn.prepareStatement(query);

                ResultSet rs = pst.executeQuery();

                model.setColumnCount(0);
                model.setRowCount(0);

                jTable_Client = new JTable(model);
                jScrollPane.setViewportView(jTable_Client);

                if (type_Account.equals("Moderador")) {

                    model.addColumn("ID");
                    model.addColumn("Nombre");
                    model.addColumn("Teléfono");
                    model.addColumn("Cédula");
                    model.addColumn("Tienda");
                    model.addColumn("Registrado Por");

                    while (rs.next()) {

                        Object[] fila = new Object[6];
                        for (int i = 0; i < 6; i++) {

                            fila[i] = rs.getObject(i + 1);

                        }

                        model.addRow(fila);

                    }

                } else {

                    model.addColumn("ID");
                    model.addColumn("Nombre");
                    model.addColumn("Teléfono");
                    model.addColumn("Cédula");
                    model.addColumn("Registrado Por");

                    while (rs.next()) {

                        Object[] fila = new Object[5];
                        for (int i = 0; i < 5; i++) {

                            fila[i] = rs.getObject(i + 1);

                        }

                        model.addRow(fila);

                    }

                }

                cn.close();

                jTextField_Search_Client.setText("");
                jTextField_Search_Client.requestFocus();

            } catch (SQLException e) {

                System.err.println("¡Error al consultar la lista de clientes! " + e);
                JOptionPane.showMessageDialog(null, "¡Error al consultar la lista de clientes!", "¡Error!",
                        JOptionPane.OK_OPTION);

            }

        }

    }//GEN-LAST:event_jTextField_Search_ClientKeyPressed

    private void jButton_Search_ClientMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Search_ClientMousePressed

        String search = jTextField_Search_Client.getText().trim();
        String query = "";

        if (search.equals("") && !type_Account.equals("Moderador")) {

            query = "select id_client, name_client, telephone_client, cedula_client, registered_by from client where direction_tienda = '"
                    + direction + "'";

        } else if (!search.equals("") && !type_Account.equals("Moderador")) {

            query = "select id_client, name_client, telephone_client, cedula_client, registered_by from client where id_client = '" + search + "' and direction_tienda = '" + direction + "' "
                    + "or name_client = '" + search + "' and direction_tienda = '" + direction + "' or telephone_client = '"
                    + search + "' and direction_tienda = '" + direction + "' or registered_by = '" + search + "' and direction_tienda = '" + direction + "' or cedula_client = '" + search + "' and direction_tienda = '" + direction + "'";

        } else if (search.equals("") && type_Account.equals("Moderador")) {

            query = "select id_client, name_client, telephone_client, cedula_client, direction_tienda, registered_by from client";

        } else if (!search.equals("") && type_Account.equals("Moderador")) {

            query = "select id_client, name_client, telephone_client, cedula_client, direction_tienda, registered_by from client where "
                    + "id_client = '" + search + "' or name_client = '" + search + "' or telephone_client = '"
                    + search + "' or registered_by = '" + search + "' or direction_tienda = '" + search + "' or cedula_client = '"
                    + search + "'";

        }

        try {

            Connection cn = BD_Connection.connection();
            PreparedStatement pst = cn.prepareStatement(query);

            ResultSet rs = pst.executeQuery();

            model.setColumnCount(0);
            model.setRowCount(0);

            jTable_Client = new JTable(model);
            jScrollPane.setViewportView(jTable_Client);

            if (type_Account.equals("Moderador")) {

                model.addColumn("ID");
                model.addColumn("Nombre");
                model.addColumn("Teléfono");
                model.addColumn("Cédula");
                model.addColumn("Tienda");
                model.addColumn("Registrado Por");

                while (rs.next()) {

                    Object[] fila = new Object[6];
                    for (int i = 0; i < 6; i++) {

                        fila[i] = rs.getObject(i + 1);

                    }

                    model.addRow(fila);

                }

            } else {

                model.addColumn("ID");
                model.addColumn("Nombre");
                model.addColumn("Teléfono");
                model.addColumn("Cédula");
                model.addColumn("Registrado Por");

                while (rs.next()) {

                    Object[] fila = new Object[5];
                    for (int i = 0; i < 5; i++) {

                        fila[i] = rs.getObject(i + 1);

                    }

                    model.addRow(fila);

                }

            }

            cn.close();

            jTextField_Search_Client.setText("");
            jTextField_Search_Client.requestFocus();

        } catch (SQLException e) {

            System.err.println("¡Error al consultar la lista de clientes! " + e);
            JOptionPane.showMessageDialog(null, "¡Error al consultar la lista de clientes!", "¡Error!",
                    JOptionPane.OK_OPTION);

        }

    }//GEN-LAST:event_jButton_Search_ClientMousePressed

    private void jButton_New_ClientMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_New_ClientMousePressed

    }//GEN-LAST:event_jButton_New_ClientMousePressed

    private void jButton_New_ClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_New_ClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_New_ClientActionPerformed

    private void jButton_Update_ClientMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Update_ClientMousePressed

        int fila_point = jTable_Client.getSelectedRow();
        int columna_punt = 0;

        if (fila_point > -1) {

            ID = (int) model.getValueAt(fila_point, columna_punt);

            paneles.PanelUpdateClient();

        } else {

            JOptionPane.showMessageDialog(null, "¡Debes seleccionar un cliente!", "¡Acceso Denegado!",
                    JOptionPane.OK_OPTION);

        }

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

    private void getClients() {

        if (type_Account.equals("Moderador")) {

            try {

                Connection cn = BD_Connection.connection();
                PreparedStatement pst = cn.prepareStatement(
                        "select id_client, name_client, telephone_client, cedula_client, direction_tienda, registered_by from client");

                ResultSet rs = pst.executeQuery();

                jTable_Client = new JTable(model);
                jScrollPane.setViewportView(jTable_Client);

                model.addColumn("ID");
                model.addColumn("Nombre");
                model.addColumn("Teléfono");
                model.addColumn("Cédula");
                model.addColumn("Tienda");
                model.addColumn("Registrado Por");

                while (rs.next()) {

                    Object[] fila = new Object[6];
                    for (int i = 0; i < 6; i++) {

                        fila[i] = rs.getObject(i + 1);

                    }

                    model.addRow(fila);

                }

                cn.close();

            } catch (SQLException e) {

                System.out.println("¡Error al consultar la lista de clientes! " + e);
                JOptionPane.showMessageDialog(null, "¡Error al consultar la lista de clientes!", "¡Error!",
                        JOptionPane.OK_OPTION);

            }

        } else {

            try {

                Connection cn = BD_Connection.connection();
                PreparedStatement pst = cn.prepareStatement(
                        "select id_client, name_client, telephone_client, registered_by from client where direction_tienda = '"
                        + direction + "'");

                ResultSet rs = pst.executeQuery();

                jTable_Client = new JTable(model);
                jScrollPane.setViewportView(jTable_Client);

                model.addColumn("ID");
                model.addColumn("Nombre");
                model.addColumn("Teléfono");
                model.addColumn("Registrado Por");

                while (rs.next()) {

                    Object[] fila = new Object[4];
                    for (int i = 0; i < 4; i++) {

                        fila[i] = rs.getObject(i + 1);

                    }

                    model.addRow(fila);

                }

                cn.close();

            } catch (SQLException e) {

                System.err.println("¡Error al consultar la lista de clientes! " + e);
                JOptionPane.showMessageDialog(null, "¡Error al consultar la lista de clientes!", "¡Error!",
                        JOptionPane.OK_OPTION);

            }

        }

    }

}
