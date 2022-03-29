package view;

import java.sql.*;
import clases.BD_Connection;
import clases.DateWarranty;
import clases.FormatText;
import clases.Paneles;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class Register_Warranty extends javax.swing.JPanel {

    int day_warranty = 0, flag_calendar = 0;
    public static int flag = 0;
    public static String serial, falla, numOrden, recibided;

    Paneles paneles = new Paneles();

    //Instancia para darle formato a los campos de texto.
    FormatText formattext = new FormatText();

    //Instancia para calcular los días de garantía de cada equipo...
    DateWarranty dateWarranty = new DateWarranty();

    public Register_Warranty() {
        initComponents();

        //Método para obtener la información del equipo...
        getInformationEquipo();

        //Método para validar la dirección de la interfaz...
        validateAddress();
        
        jCalendar.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jCalendar = new com.toedter.calendar.JCalendar();
        jLabel_Marca = new javax.swing.JLabel();
        jTextField_Equipo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField_Code = new javax.swing.JTextField();
        jLabel_Recibido = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jTextField_Serial = new javax.swing.JTextField();
        jLabel_DatePurchase = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jTextField_Falla = new javax.swing.JTextField();
        jLabel_Falla = new javax.swing.JLabel();
        jTextField_NumOrden = new javax.swing.JTextField();
        jLabel_NumeroDeOrden = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel_Color = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Recibido = new javax.swing.JTextArea();
        jLabel_garantia = new javax.swing.JLabel();
        jButton_Register = new javax.swing.JButton();
        jLabel_Serial = new javax.swing.JLabel();
        jButton_Search_Code = new javax.swing.JButton();
        jButton_Calendar = new javax.swing.JButton();
        jTextField_Calendar = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(9, 53, 69));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCalendar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCalendarPropertyChange(evt);
            }
        });
        add(jCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        jLabel_Marca.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Marca.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Marca.setText("Equipo:");
        add(jLabel_Marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jTextField_Equipo.setEditable(false);
        jTextField_Equipo.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Equipo.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Equipo.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Equipo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Equipo.setBorder(null);
        add(jTextField_Equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 250, 20));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 250, -1));

        jTextField_Code.setEditable(false);
        jTextField_Code.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Code.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Code.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Code.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Code.setBorder(null);
        add(jTextField_Code, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 150, 20));

        jLabel_Recibido.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Recibido.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Recibido.setText("Se recibe con:");
        add(jLabel_Recibido, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 120, 30));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 150, -1));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 150, -1));

        jTextField_Serial.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Serial.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Serial.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Serial.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Serial.setBorder(null);
        jTextField_Serial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_SerialActionPerformed(evt);
            }
        });
        add(jTextField_Serial, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 150, 20));

        jLabel_DatePurchase.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_DatePurchase.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_DatePurchase.setText("Fecha de compra:");
        add(jLabel_DatePurchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, -1, -1));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 210, -1));

        jTextField_Falla.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Falla.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Falla.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Falla.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Falla.setBorder(null);
        jTextField_Falla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_FallaActionPerformed(evt);
            }
        });
        add(jTextField_Falla, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 210, 20));

        jLabel_Falla.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Falla.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Falla.setText("Falla:");
        add(jLabel_Falla, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jTextField_NumOrden.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_NumOrden.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_NumOrden.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_NumOrden.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_NumOrden.setBorder(null);
        add(jTextField_NumOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 120, 20));

        jLabel_NumeroDeOrden.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_NumeroDeOrden.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_NumeroDeOrden.setText("N° ORDEN:");
        add(jLabel_NumeroDeOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, -1, -1));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 120, -1));

        jLabel_Color.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Color.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Color.setText("Código:");
        add(jLabel_Color, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea_Recibido.setBackground(new java.awt.Color(9, 53, 69));
        jTextArea_Recibido.setColumns(5);
        jTextArea_Recibido.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextArea_Recibido.setForeground(new java.awt.Color(240, 240, 240));
        jTextArea_Recibido.setRows(5);
        jTextArea_Recibido.setText("\n");
        jScrollPane1.setViewportView(jTextArea_Recibido);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 330, 130));

        jLabel_garantia.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel_garantia.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_garantia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(jLabel_garantia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 790, 30));

        jButton_Register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_register_dark.png"))); // NOI18N
        jButton_Register.setBorder(null);
        jButton_Register.setBorderPainted(false);
        jButton_Register.setContentAreaFilled(false);
        jButton_Register.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_register_ligth.png"))); // NOI18N
        jButton_Register.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_register_ligth.png"))); // NOI18N
        jButton_Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_RegisterMousePressed(evt);
            }
        });
        add(jButton_Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 190, 60));

        jLabel_Serial.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Serial.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Serial.setText("Serial:");
        add(jLabel_Serial, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jButton_Search_Code.setFocusPainted(false);
        jButton_Search_Code.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_Search_CodeMousePressed(evt);
            }
        });
        add(jButton_Search_Code, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, 30));

        jButton_Calendar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_CalendarMousePressed(evt);
            }
        });
        add(jButton_Calendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 65, -1, 30));

        jTextField_Calendar.setEditable(false);
        jTextField_Calendar.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Calendar.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Calendar.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Calendar.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Calendar.setBorder(null);
        add(jTextField_Calendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 130, 20));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 130, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_SerialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SerialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_SerialActionPerformed

    private void jTextField_FallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_FallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_FallaActionPerformed

    private void jButton_RegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RegisterMousePressed

    }//GEN-LAST:event_jButton_RegisterMousePressed

    private void jButton_Search_CodeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Search_CodeMousePressed

        //Si presiona el boton para seleccionar un equipo se guardará la información de la interfaz...
        serial = jTextField_Serial.getText().trim();
        falla = jTextField_Falla.getText().trim();
        numOrden = jTextField_NumOrden.getText().trim();
        recibided = jTextArea_Recibido.getText().trim();

        //Variable bandera para saber de donde se está abriendo la interfaz...
        flag = 1;

        //Panel para seleccionar el equipo para garantía...
        paneles.PanelCodeEquipos();


    }//GEN-LAST:event_jButton_Search_CodeMousePressed

    private void jButton_CalendarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_CalendarMousePressed
        
        if (flag_calendar == 0) {
            
            jCalendar.setVisible(true);
            
            flag_calendar = 1;
            
        } else {
            
            jCalendar.setVisible(false);
            
            flag_calendar = 0;
            
        }
        
    }//GEN-LAST:event_jButton_CalendarMousePressed

    private void jCalendarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendarPropertyChange
       
        if (evt.getOldValue() != null) {
            
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            jTextField_Calendar.setText(format.format(jCalendar.getCalendar().getTime()));
            
            jCalendar.setVisible(false);
            
            flag_calendar = 0;
            
        }
        
    }//GEN-LAST:event_jCalendarPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Calendar;
    private javax.swing.JButton jButton_Register;
    private javax.swing.JButton jButton_Search_Code;
    private com.toedter.calendar.JCalendar jCalendar;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel_Color;
    private javax.swing.JLabel jLabel_DatePurchase;
    private javax.swing.JLabel jLabel_Falla;
    private javax.swing.JLabel jLabel_Marca;
    private javax.swing.JLabel jLabel_NumeroDeOrden;
    private javax.swing.JLabel jLabel_Recibido;
    private javax.swing.JLabel jLabel_Serial;
    public static javax.swing.JLabel jLabel_garantia;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextArea jTextArea_Recibido;
    private javax.swing.JTextField jTextField_Calendar;
    private javax.swing.JTextField jTextField_Code;
    private javax.swing.JTextField jTextField_Equipo;
    private javax.swing.JTextField jTextField_Falla;
    private javax.swing.JTextField jTextField_NumOrden;
    private javax.swing.JTextField jTextField_Serial;
    // End of variables declaration//GEN-END:variables

    //Método para validar la dirección de donde se está abriendo la interfaz...
    private void validateAddress() {

        if (flag == 1) {

            jTextField_Serial.setText(serial);
            jTextField_Falla.setText(falla);
            jTextField_NumOrden.setText(numOrden);
            jTextArea_Recibido.setText(recibided);

        } else {

            jTextField_Serial.setText("");
            jTextField_Falla.setText("");
            jTextField_NumOrden.setText("");
            jTextArea_Recibido.setText("");
            jTextField_Code.setText("");
            jTextField_Equipo.setText("");

        }

    }

    //Método para obtener la información del equipo...
    private void getInformationEquipo() {

        jTextField_Code.setText(CodeEquipos.code);

        try {

            Connection cn = BD_Connection.connection();
            PreparedStatement pst = cn.prepareStatement("select brand, model, color, capacity, day_warranty from equipo "
                    + "where code = '" + CodeEquipos.code + "'");

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                day_warranty = rs.getInt("day_warranty");

                jTextField_Equipo.setText(rs.getString("brand") + " - " + rs.getString("model")
                        + " - " + rs.getString("color") + " - " + rs.getString("capacity"));

            }

            cn.close();

        } catch (SQLException e) {

            System.err.println("¡Error al consultar la información del equipo! " + e);
            JOptionPane.showMessageDialog(null, "¡Error al consultar la información del equipo!", "¡Error!", JOptionPane.OK_OPTION);

        }

    }

}
