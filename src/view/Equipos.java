package view;

import java.sql.*;
import clases.BD_Connection;
import clases.TextPrompt;
import clases.Paneles;
import clases.Register_Movimiento;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public final class Equipos extends javax.swing.JPanel {
        
    public static String code;

    Paneles paneles = new Paneles();

    DefaultTableModel model = new DefaultTableModel();

    public Equipos() {
        initComponents();

        //Objeto para el PlayHolders del jTextField buscar usuarios...
        TextPrompt search_user = new TextPrompt("Ingrese algún parametro", jTextField_Search_User);

        //Método para llenar la tabla de equipos...
        getEquipos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField_Search_User = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton_Delete_User = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        jTable_Equipo = new javax.swing.JTable();
        jButton_Search_User = new javax.swing.JButton();
        jButton_New_User = new javax.swing.JButton();
        jButton_Update_User = new javax.swing.JButton();

        setBackground(new java.awt.Color(9, 53, 69));
        setPreferredSize(new java.awt.Dimension(790, 370));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Equipos");
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
        add(jTextField_Search_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 690, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 690, 10));

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

        jTable_Equipo.setBackground(new java.awt.Color(9, 53, 69));
        jTable_Equipo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jTable_Equipo.setForeground(new java.awt.Color(240, 240, 240));
        jTable_Equipo.setModel(new javax.swing.table.DefaultTableModel(
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
                "Codigo", "Marca", "Modelo", "Color", "Dias De Garantías"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Equipo.setGridColor(new java.awt.Color(240, 240, 240));
        jTable_Equipo.setSelectionBackground(new java.awt.Color(9, 53, 69));
        jScrollPane.setViewportView(jTable_Equipo);
        if (jTable_Equipo.getColumnModel().getColumnCount() > 0) {
            jTable_Equipo.getColumnModel().getColumn(0).setResizable(false);
            jTable_Equipo.getColumnModel().getColumn(1).setResizable(false);
            jTable_Equipo.getColumnModel().getColumn(2).setResizable(false);
            jTable_Equipo.getColumnModel().getColumn(3).setResizable(false);
            jTable_Equipo.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 850, 270));

        jButton_Search_User.setText("Buscar");
        jButton_Search_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_Search_UserMousePressed(evt);
            }
        });
        add(jButton_Search_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, 80, 30));

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


    }//GEN-LAST:event_jButton_Search_UserMousePressed

    private void jTextField_Search_UserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Search_UserKeyPressed


    }//GEN-LAST:event_jTextField_Search_UserKeyPressed

    private void jButton_New_UserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_New_UserMousePressed

        paneles.PanelCreateCodeEquipo();

    }//GEN-LAST:event_jButton_New_UserMousePressed

    private void jButton_New_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_New_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_New_UserActionPerformed

    private void jButton_Update_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Update_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Update_UserActionPerformed

    private void jButton_Update_UserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Update_UserMousePressed
        
        int fila_point = jTable_Equipo.getSelectedRow();
        int columna_point = 0;

        if (fila_point > -1) {

            code = (String) model.getValueAt(fila_point, columna_point);

            paneles.Panel_Update_Equipo();

        } else {

            JOptionPane.showMessageDialog(null, "¡Debes seleccionar un cliente!", "¡Acceso Denegado!",
                    JOptionPane.OK_OPTION);

        }

    }//GEN-LAST:event_jButton_Update_UserMousePressed

    private void jButton_Delete_UserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Delete_UserMousePressed

        int fila_point = jTable_Equipo.getSelectedRow();
        int columna_point = 0;
        String code = "";

        if (fila_point > -1) {

            code = (String) model.getValueAt(fila_point, columna_point);

            int value = JOptionPane.showConfirmDialog(null, "¿Desea eliminar este equipo?", "¡Selección!",
                    JOptionPane.YES_NO_OPTION);

            if (value == 0) {

                try {

                    Connection cn = BD_Connection.connection();
                    PreparedStatement pst = cn.prepareStatement(
                            "delete from equipo where code = '" + code + "'");

                    pst.executeUpdate();

                    Register_Movimiento register_Movimiento = new Register_Movimiento(Login.ID_User, "E/E", code, Login.direction);
                    Thread hilo = new Thread(register_Movimiento);
                    hilo.start();

                    model.setRowCount(0);
                    model.setColumnCount(0);

                    JOptionPane.showMessageDialog(null, "Equipo eliminado.");

                    getEquipos();

                    cn.close();

                } catch (SQLException e) {

                    System.err.println("¡Error al eliminar el equipo! " + e);
                    JOptionPane.showMessageDialog(null, "¡Error al eliminar el equipo!", "¡Error!",
                            JOptionPane.OK_OPTION);

                }

            } else {

                model.setRowCount(0);
                model.setColumnCount(0);
                getEquipos();

            }

        } else {

            JOptionPane.showMessageDialog(null, "¡Debes seleccionar un equipo!", "¡Acceso Denegado!",
                    JOptionPane.OK_OPTION);

        }

    }//GEN-LAST:event_jButton_Delete_UserMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Delete_User;
    private javax.swing.JButton jButton_New_User;
    private javax.swing.JButton jButton_Search_User;
    private javax.swing.JButton jButton_Update_User;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable_Equipo;
    private javax.swing.JTextField jTextField_Search_User;
    // End of variables declaration//GEN-END:variables

    private void getEquipos() {

        try {

            Connection cn = BD_Connection.connection();
            PreparedStatement pst = cn.prepareStatement(
                    "select code, brand, model, color, day_warranty from equipo");

            ResultSet rs = pst.executeQuery();

            jTable_Equipo = new JTable(model);
            jScrollPane.setViewportView(jTable_Equipo);

            model.addColumn("Código");
            model.addColumn("Marca");
            model.addColumn("Modelo");
            model.addColumn("Color");
            model.addColumn("Días de garantías");

            while (rs.next()) {
                Object[] fila = new Object[5];

                for (int i = 0; i < 5; i++) {

                    fila[i] = rs.getObject(i + 1);

                }

                model.addRow(fila);

            }

            cn.close();

        } catch (SQLException e) {

            System.err.println("¡Error al consultar la lista de equipos! " + e);
            JOptionPane.showMessageDialog(null, "¡Error al consultar la lista de equipos!", "¡Error!",
                    JOptionPane.OK_OPTION);

        }

    }

}
