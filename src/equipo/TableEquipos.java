package equipo;

import login.Login;
import java.sql.*;
import OtherClass.BD_Connection;
import OtherClass.TextPrompt;
import OtherClass.Paneles;
import java.awt.event.KeyEvent;
import moviments.Register_Movimiento;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public final class TableEquipos extends javax.swing.JPanel {

    public static String code;

    Paneles paneles = new Paneles();

    DefaultTableModel model = new DefaultTableModel();

    BD_Connection connection = new BD_Connection();

    FilterRequestEquipo filterRequestEquipo = new FilterRequestEquipo();

    public TableEquipos() {
        initComponents();

        //Objeto para el PlayHolders del jTextField buscar usuarios...
        TextPrompt search_user = new TextPrompt("Ingrese algún parametro", jTextField_Search_Equipo);

        //Método para llenar la tabla de equipos...
        getEquipos();

        //Método para validar el acceso a los botones...
        ValidateButtons();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField_Search_Equipo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton_Delete_Equipo = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        jTable_Equipo = new javax.swing.JTable();
        jButton_Search_User = new javax.swing.JButton();
        jButton_New_Equipo = new javax.swing.JButton();
        jButton_Update_Equipo = new javax.swing.JButton();

        setBackground(new java.awt.Color(9, 53, 69));
        setPreferredSize(new java.awt.Dimension(790, 370));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Equipos");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 100, 30));

        jTextField_Search_Equipo.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Search_Equipo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextField_Search_Equipo.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Search_Equipo.setBorder(null);
        jTextField_Search_Equipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField_Search_EquipoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextField_Search_EquipoMouseReleased(evt);
            }
        });
        jTextField_Search_Equipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Search_EquipoActionPerformed(evt);
            }
        });
        jTextField_Search_Equipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_Search_EquipoKeyPressed(evt);
            }
        });
        add(jTextField_Search_Equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 690, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 690, 10));

        jButton_Delete_Equipo.setText("BORRAR");
        jButton_Delete_Equipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_Delete_EquipoMousePressed(evt);
            }
        });
        add(jButton_Delete_Equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 380, 100, 35));

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

        jButton_New_Equipo.setText("NUEVO");
        jButton_New_Equipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_New_EquipoMousePressed(evt);
            }
        });
        jButton_New_Equipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_New_EquipoActionPerformed(evt);
            }
        });
        add(jButton_New_Equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 100, 35));

        jButton_Update_Equipo.setText("MODIFICAR");
        jButton_Update_Equipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_Update_EquipoMousePressed(evt);
            }
        });
        jButton_Update_Equipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Update_EquipoActionPerformed(evt);
            }
        });
        add(jButton_Update_Equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, 100, 35));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_Search_EquipoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_Search_EquipoMousePressed

    }//GEN-LAST:event_jTextField_Search_EquipoMousePressed

    private void jTextField_Search_EquipoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_Search_EquipoMouseReleased
        //nothing
    }//GEN-LAST:event_jTextField_Search_EquipoMouseReleased

    private void jTextField_Search_EquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Search_EquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Search_EquipoActionPerformed

    private void jButton_Search_UserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Search_UserMousePressed

        String search = jTextField_Search_Equipo.getText().trim();

        filterRequestEquipo.setSearch(search);
        filterRequestEquipo.RequestEquipo();

        jTextField_Search_Equipo.setText("");

    }//GEN-LAST:event_jButton_Search_UserMousePressed

    private void jTextField_Search_EquipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Search_EquipoKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            String search = jTextField_Search_Equipo.getText().trim();

            filterRequestEquipo.setSearch(search);
            filterRequestEquipo.RequestEquipo();

            jTextField_Search_Equipo.setText("");

        }

    }//GEN-LAST:event_jTextField_Search_EquipoKeyPressed

    private void jButton_New_EquipoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_New_EquipoMousePressed

        paneles.PanelCreateCodeEquipo();

    }//GEN-LAST:event_jButton_New_EquipoMousePressed

    private void jButton_New_EquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_New_EquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_New_EquipoActionPerformed

    private void jButton_Update_EquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Update_EquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Update_EquipoActionPerformed

    private void jButton_Update_EquipoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Update_EquipoMousePressed

        int fila_point = jTable_Equipo.getSelectedRow();
        int columna_point = 0;

        if (fila_point > -1) {

            code = (String) model.getValueAt(fila_point, columna_point);

            paneles.Panel_Update_Equipo();

        } else {

            JOptionPane.showMessageDialog(null, "¡Debes seleccionar un cliente!", "¡Acceso Denegado!",
                    JOptionPane.OK_OPTION);

        }

    }//GEN-LAST:event_jButton_Update_EquipoMousePressed

    private void jButton_Delete_EquipoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Delete_EquipoMousePressed

        int fila_point = jTable_Equipo.getSelectedRow();
        int columna_point = 0;
        String code = "";

        if (fila_point > -1) {

            code = (String) model.getValueAt(fila_point, columna_point);

            int value = JOptionPane.showConfirmDialog(null, "¿Desea eliminar este equipo?", "¡Selección!",
                    JOptionPane.YES_NO_OPTION);

            if (value == 0) {

                try {

                    Connection cn = connection.connection();
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

    }//GEN-LAST:event_jButton_Delete_EquipoMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Delete_Equipo;
    private javax.swing.JButton jButton_New_Equipo;
    private javax.swing.JButton jButton_Search_User;
    private javax.swing.JButton jButton_Update_Equipo;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JScrollPane jScrollPane;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTable jTable_Equipo;
    private javax.swing.JTextField jTextField_Search_Equipo;
    // End of variables declaration//GEN-END:variables

    private void getEquipos() {

        try {

            Connection cn = connection.connection();
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

    private void ValidateButtons() {

        if (Login.type_account.equals("Vendedor")) {

            jButton_Delete_Equipo.setVisible(false);

            add(jButton_New_Equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, 100, 35));
            add(jButton_Update_Equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 380, 100, 35));

        }

    }   

}
