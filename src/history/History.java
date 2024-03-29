package history;

import OtherClass.TextPrompt;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import OtherClass.Paneles;
import javax.swing.JTextField;

public class History extends javax.swing.JPanel {

    Paneles paneles = new Paneles();
    FilterRequestHistory searchClass = new FilterRequestHistory();
    public static int ID;

    public History() {
        initComponents();

        TextPrompt search = new TextPrompt("Ingrese algún serial...", jTextField_Search_Serial);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane_H = new javax.swing.JScrollPane();
        jTable_History_H = new javax.swing.JTable();
        jTextField_Search_Serial = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton_Search_Client = new javax.swing.JButton();
        jDateChooser_Desde = new com.toedter.calendar.JDateChooser();
        jDateChooser_Hasta = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_Message = new javax.swing.JLabel();

        setBackground(new java.awt.Color(9, 53, 69));
        setPreferredSize(new java.awt.Dimension(890, 470));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane_H.setBackground(new java.awt.Color(9, 53, 69));
        jScrollPane_H.setBorder(null);
        jScrollPane_H.setForeground(new java.awt.Color(204, 204, 204));

        jTable_History_H.setBackground(new java.awt.Color(220, 220, 220));
        jTable_History_H.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jTable_History_H.setForeground(new java.awt.Color(230, 230, 230));
        jTable_History_H.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Marca", "Modelo", "Serial", "Cliente", "Rif", "ESTATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_History_H.setGridColor(new java.awt.Color(240, 240, 240));
        jTable_History_H.setSelectionBackground(new java.awt.Color(9, 53, 69));
        jScrollPane_H.setViewportView(jTable_History_H);

        add(jScrollPane_H, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 890, 260));

        jTextField_Search_Serial.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Search_Serial.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextField_Search_Serial.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Search_Serial.setBorder(null);
        jTextField_Search_Serial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField_Search_SerialMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextField_Search_SerialMouseReleased(evt);
            }
        });
        jTextField_Search_Serial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Search_SerialActionPerformed(evt);
            }
        });
        jTextField_Search_Serial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_Search_SerialKeyPressed(evt);
            }
        });
        add(jTextField_Search_Serial, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 590, 30));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Serial");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 90, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 590, 10));

        jButton_Search_Client.setText("Buscar");
        jButton_Search_Client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_Search_ClientMousePressed(evt);
            }
        });
        add(jButton_Search_Client, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 400, 80, 30));

        jDateChooser_Desde.setBackground(new java.awt.Color(9, 53, 69));
        jDateChooser_Desde.setDateFormatString("yyyy-MM-dd");
        add(jDateChooser_Desde, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 29, 160, -1));

        jDateChooser_Hasta.setBackground(new java.awt.Color(9, 53, 69));
        jDateChooser_Hasta.setDateFormatString("yyyy-MM-dd");
        add(jDateChooser_Hasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 80, 160, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Hasta:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 83, 70, 20));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Desde:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 33, 70, 20));

        jLabel_Message.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Message.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(jLabel_Message, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 410, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_Search_SerialMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_Search_SerialMousePressed


    }//GEN-LAST:event_jTextField_Search_SerialMousePressed

    private void jTextField_Search_SerialMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_Search_SerialMouseReleased
        //nothing
    }//GEN-LAST:event_jTextField_Search_SerialMouseReleased

    private void jTextField_Search_SerialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Search_SerialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Search_SerialActionPerformed

    private void jTextField_Search_SerialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Search_SerialKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            String desde = ((JTextField) jDateChooser_Desde.getDateEditor().getUiComponent()).getText();
            String hasta = ((JTextField) jDateChooser_Hasta.getDateEditor().getUiComponent()).getText();

            String search = jTextField_Search_Serial.getText().trim();
            FilterRequestHistory filterRequestHistory = new FilterRequestHistory();
            filterRequestHistory.filterRequestHistory(search, desde, hasta);
            jTextField_Search_Serial.setText("");
            jTextField_Search_Serial.requestFocus();

            EventTable();

        }

    }//GEN-LAST:event_jTextField_Search_SerialKeyPressed

    private void jButton_Search_ClientMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Search_ClientMousePressed

        String desde = ((JTextField) jDateChooser_Desde.getDateEditor().getUiComponent()).getText();
        String hasta = ((JTextField) jDateChooser_Hasta.getDateEditor().getUiComponent()).getText();

        String search = jTextField_Search_Serial.getText().trim();

        FilterRequestHistory filterRequestHistory = new FilterRequestHistory();
        filterRequestHistory.filterRequestHistory(search, desde, hasta);

        jTextField_Search_Serial.setText("");

        jTextField_Search_Serial.requestFocus();

        EventTable();

    }//GEN-LAST:event_jButton_Search_ClientMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Search_Client;
    private com.toedter.calendar.JDateChooser jDateChooser_Desde;
    private com.toedter.calendar.JDateChooser jDateChooser_Hasta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel_Message;
    public static javax.swing.JScrollPane jScrollPane_H;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTable jTable_History_H;
    public static javax.swing.JTextField jTextField_Search_Serial;
    // End of variables declaration//GEN-END:variables

    private void EventTable() {

        jTable_History_H.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {

                int fila_point = jTable_History_H.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point >= -1) {

                    ID = (int) jTable_History_H.getValueAt(fila_point, columna_point);

                    paneles.Panel_Priliminar_History();

                }

            }

        });

    }

}
