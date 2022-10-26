package view;

import OtherClass.BD_Connection;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import OtherClass.Paneles;

public class Table_Technical extends javax.swing.JPanel {
    
    BD_Connection connection = new BD_Connection();

    DefaultTableModel model = new DefaultTableModel();
    
    Paneles paneles = new Paneles();
    
    public static int ID_Technical;

    public Table_Technical() {

        initComponents();

        getInformationTechnical();
        
        EventTable();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        jTable_Technical = new javax.swing.JTable();

        setBackground(new java.awt.Color(9, 53, 69));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane.setBackground(new java.awt.Color(9, 53, 69));
        jScrollPane.setBorder(null);
        jScrollPane.setForeground(new java.awt.Color(240, 240, 240));

        jTable_Technical.setBackground(new java.awt.Color(9, 53, 69));
        jTable_Technical.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jTable_Technical.setForeground(new java.awt.Color(240, 240, 240));
        jTable_Technical.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Nombre De Usuario", "Teléfono", "Tienda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Technical.setGridColor(new java.awt.Color(240, 240, 240));
        jTable_Technical.setSelectionBackground(new java.awt.Color(9, 53, 69));
        jScrollPane.setViewportView(jTable_Technical);

        add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 893, 380));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable jTable_Technical;
    // End of variables declaration//GEN-END:variables

    private void getInformationTechnical() {

        try {

            Connection cn = connection.connection();
            PreparedStatement pst = cn.prepareStatement(
                    "select id_user, name_user, username, telephone, direction from user where type_account = '" + "Tecnico" + "' and "
                    + "status = '" + "Activo" + "'");

            ResultSet rs = pst.executeQuery();

            jTable_Technical = new JTable(model);
            jScrollPane.setViewportView(jTable_Technical);

            model.addColumn("ID");
            model.addColumn("Nombre");
            model.addColumn("Nombre De Usuario");
            model.addColumn("Teléfono");
            model.addColumn("Tienda");

            while (rs.next()) {
                Object[] fila = new Object[5];

                for (int i = 0; i < 5; i++) {

                    fila[i] = rs.getObject(i + 1);

                }

                model.addRow(fila);

            }

            cn.close();

        } catch (SQLException e) {

            System.err.println("¡Error al consultar la lista de tecnicos! " + e);
            JOptionPane.showMessageDialog(null, "¡Error al consultar la lista de tecnicos!", "¡Error!",
                    JOptionPane.OK_OPTION);

        }

    }
    
     private void EventTable() {

        jTable_Technical.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {

                int fila_point = jTable_Technical.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point >= -1) {

                    ID_Technical = (int) jTable_Technical.getValueAt(fila_point, columna_point);

                    paneles.Panel_SentWarranty();

                }

            }

        });

    }

}
