package view;

import java.sql.*;
import clases.BD_Connection;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static view.Clients.ID;

public class TabletConsultClient extends javax.swing.JPanel {

    DefaultTableModel model = new DefaultTableModel();

    public TabletConsultClient() {
        initComponents();

        getClients();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        jTable_Client = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(9, 53, 69));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_Client.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable_Client.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_ClientKeyPressed(evt);
            }
        });
        jScrollPane.setViewportView(jTable_Client);

        add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 750, 260));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Cliente:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_ClientKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_ClientKeyPressed

        

    }//GEN-LAST:event_jTable_ClientKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable jTable_Client;
    // End of variables declaration//GEN-END:variables

    private void getClients() {

        if (Login.type_account.equals("Moderador")) {

            try {

                Connection cn = BD_Connection.connection();
                PreparedStatement pst = cn.prepareStatement(
                        "select id_client, name_client, telephone_client, cedula_client, direction_tienda, registered_by from client "
                        + "where cedula_client = '" + Consult_Cl_Client.ci_client + "'");

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
                        "select id_client, name_client, telephone_client, cedula_client, registered_by from client where direction_tienda = '"
                        + Login.direction + "' and cedula_client = '" + Consult_Cl_Client.ci_client + "'");

                ResultSet rs = pst.executeQuery();

                jTable_Client = new JTable(model);
                jScrollPane.setViewportView(jTable_Client);

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

                cn.close();

            } catch (SQLException e) {

                System.err.println("¡Error al consultar la lista de clientes! " + e);
                JOptionPane.showMessageDialog(null, "¡Error al consultar la lista de clientes!", "¡Error!",
                        JOptionPane.OK_OPTION);

            }

        }

    }

}
