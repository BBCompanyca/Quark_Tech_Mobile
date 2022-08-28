package view;

import java.sql.*;
import clases.BD_Connection;
import clases.FormatText;
import clases.Paneles;
import clases.Register_Movimiento;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.util.Date;
import javax.swing.BorderFactory;

public class Register_Warranty extends javax.swing.JPanel {

    public static int flag = 0, flag_AddressRegisterAndConsult = 0, flag_calendar = 0, day_warranty = 0, flag_register = 0, time_Warranty = 0, id_client = 0;

    String brand, model, color, date_register, date_purchase, day, month, year, time_Warranty_STG, identity_card_client;
    public static String serial, falla, received, name_client;

    Paneles paneles = new Paneles();

    //Instancia para darle formato a los campos de texto.
    FormatText formattext = new FormatText();

    public Register_Warranty() {
        initComponents();

        getAddressPanel();

        //Método para validar la dirección de la interfaz...
        validateAddress();

        //getInformationEquipo();
        jCalendar.setVisible(false);

        jTextArea_Recibido.setBorder(BorderFactory.createCompoundBorder(jTextArea_Recibido.getBorder(),
                BorderFactory.createEmptyBorder(2, 2, 2, 2)));

        jButton_Register.setVisible(false);

        validateCamp();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jCalendar = new com.toedter.calendar.JCalendar();
        jLabel_Equipo = new javax.swing.JLabel();
        jTextField_Equipo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField_Code = new javax.swing.JTextField();
        jLabel_Recibido = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jTextField_Serial = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jTextField_Falla = new javax.swing.JTextField();
        jLabel_Falla = new javax.swing.JLabel();
        jLabel_Code = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Recibido = new javax.swing.JTextArea();
        jLabel_garantia = new javax.swing.JLabel();
        jButton_Register = new javax.swing.JButton();
        jLabel_Serial = new javax.swing.JLabel();
        jButton_Search_Code = new javax.swing.JButton();
        jLabel_DatePurchase = new javax.swing.JLabel();
        jTextField_Calendar = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jButton_Calendar = new javax.swing.JButton();
        jLabel_Title = new javax.swing.JLabel();
        jLabel_Code2 = new javax.swing.JLabel();
        jLabel_Falla2 = new javax.swing.JLabel();
        jLabel_Equipo2 = new javax.swing.JLabel();
        jLabel_Date2 = new javax.swing.JLabel();
        jLabel_Serial2 = new javax.swing.JLabel();
        jLabel_Received2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(9, 53, 69));
        setMinimumSize(new java.awt.Dimension(890, 360));
        setPreferredSize(new java.awt.Dimension(890, 360));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCalendar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jCalendarMousePressed(evt);
            }
        });
        jCalendar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCalendarPropertyChange(evt);
            }
        });
        add(jCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, -1, -1));

        jLabel_Equipo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Equipo.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Equipo.setText("Equipo:");
        add(jLabel_Equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        jTextField_Equipo.setEditable(false);
        jTextField_Equipo.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Equipo.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Equipo.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Equipo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Equipo.setBorder(null);
        add(jTextField_Equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 250, 20));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 250, -1));

        jTextField_Code.setEditable(false);
        jTextField_Code.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Code.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Code.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Code.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Code.setBorder(null);
        add(jTextField_Code, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 150, 20));

        jLabel_Recibido.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Recibido.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Recibido.setText("Se recibe con:");
        add(jLabel_Recibido, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 120, 30));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 150, -1));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 150, -1));

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
        jTextField_Serial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_SerialKeyReleased(evt);
            }
        });
        add(jTextField_Serial, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 150, 20));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 250, -1));

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
        jTextField_Falla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_FallaKeyReleased(evt);
            }
        });
        add(jTextField_Falla, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 250, 20));

        jLabel_Falla.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Falla.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Falla.setText("Falla:");
        add(jLabel_Falla, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        jLabel_Code.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Code.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Code.setText("Código:");
        add(jLabel_Code, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea_Recibido.setBackground(new java.awt.Color(9, 53, 69));
        jTextArea_Recibido.setColumns(5);
        jTextArea_Recibido.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextArea_Recibido.setForeground(new java.awt.Color(240, 240, 240));
        jTextArea_Recibido.setLineWrap(true);
        jTextArea_Recibido.setRows(5);
        jTextArea_Recibido.setText("\n");
        jTextArea_Recibido.setWrapStyleWord(true);
        jTextArea_Recibido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextArea_RecibidoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea_Recibido);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 330, 100));

        jLabel_garantia.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel_garantia.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_garantia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(jLabel_garantia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 890, 30));

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
        add(jButton_Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 190, 60));

        jLabel_Serial.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Serial.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Serial.setText("Serial:");
        add(jLabel_Serial, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        jButton_Search_Code.setFocusPainted(false);
        jButton_Search_Code.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_Search_CodeMousePressed(evt);
            }
        });
        add(jButton_Search_Code, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, 30));

        jLabel_DatePurchase.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_DatePurchase.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_DatePurchase.setText("Fecha de compra:");
        add(jLabel_DatePurchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, -1, -1));

        jTextField_Calendar.setEditable(false);
        jTextField_Calendar.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Calendar.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Calendar.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Calendar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Calendar.setBorder(null);
        jTextField_Calendar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_CalendarFocusGained(evt);
            }
        });
        jTextField_Calendar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_CalendarKeyTyped(evt);
            }
        });
        add(jTextField_Calendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 130, 20));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 130, -1));

        jButton_Calendar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_CalendarMousePressed(evt);
            }
        });
        add(jButton_Calendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, -1, 30));

        jLabel_Title.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        jLabel_Title.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Title.setText("Nueva Garantía - Cliente: ");
        add(jLabel_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 890, 40));

        jLabel_Code2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel_Code2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Code2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Code2.setText("CAMPO REQUERIDO *");
        jLabel_Code2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel_Code2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 135, 150, 20));

        jLabel_Falla2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel_Falla2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Falla2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Falla2.setText("CAMPO REQUERIDO *");
        jLabel_Falla2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel_Falla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 405, 150, 20));

        jLabel_Equipo2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel_Equipo2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Equipo2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Equipo2.setText("CAMPO REQUERIDO *");
        jLabel_Equipo2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel_Equipo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 225, 150, 20));

        jLabel_Date2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel_Date2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Date2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Date2.setText("CAMPO REQUERIDO *");
        jLabel_Date2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel_Date2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 135, 150, 20));

        jLabel_Serial2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel_Serial2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Serial2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Serial2.setText("CAMPO REQUERIDO *");
        jLabel_Serial2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel_Serial2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 315, 150, 20));

        jLabel_Received2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel_Received2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Received2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Received2.setText("CAMPO REQUERIDO *");
        jLabel_Received2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel_Received2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 305, 150, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_SerialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SerialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_SerialActionPerformed

    private void jTextField_FallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_FallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_FallaActionPerformed

    private void jButton_RegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RegisterMousePressed

        clases.Date date = new clases.Date();

        int flag = 0;

        String code, equipo, date_purchase;

        code = jTextField_Code.getText().trim();
        equipo = jTextField_Equipo.getText().trim();
        serial = jTextField_Serial.getText().trim();
        falla = jTextField_Falla.getText().trim();
        date_purchase = jTextField_Calendar.getText().trim();
        received = jTextArea_Recibido.getText().trim();

        if (flag_register == 0) {

            try {

                Connection cn = BD_Connection.connection();
                PreparedStatement pst = cn.prepareStatement(
                        "select serial from warranty where serial = '" + serial + "' and not status = '" + "Entregado" + "'");

                ResultSet rs = pst.executeQuery();

                if (rs.next()) {

                    jLabel_Serial.setForeground(Color.red);

                    JOptionPane.showMessageDialog(null, "¡Ya existe un equipo con este serial registrado en el sistema!",
                            "¡Acceso Denegado!", JOptionPane.OK_OPTION);

                    jTextField_Serial.setText("");

                    cn.close();

                } else {

                    cn.close();

                    try {

                        Connection cn2 = BD_Connection.connection();
                        PreparedStatement pst2 = cn2.prepareStatement(
                                "insert into warranty values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

                        pst2.setInt(1, 0);
                        pst2.setInt(2, id_client);
                        pst2.setInt(3, CodeEquipos.id_equipo);
                        pst2.setInt(4, 0);
                        pst2.setInt(5, Login.ID_User);
                        pst2.setString(6, Login.direction);
                        pst2.setString(7, serial);
                        pst2.setString(8, falla);
                        pst2.setString(9, date.DateToDay());
                        pst2.setString(10, received);
                        pst2.setInt(11, time_Warranty);
                        pst2.setString(12, date_purchase);
                        pst2.setString(13, "");
                        pst2.setString(14, "");
                        pst2.setString(15, "");
                        pst2.setString(16, "");
                        pst2.setString(17, "Nuevo Ingreso");
                        pst2.setString(18, "");
                        pst2.setString(19, "");
                        pst2.setString(20, "");
                        pst2.setString(21, "");
                        pst2.setString(22, DateFormat());
                        pst2.setString(23, "000-00-00");

                        pst2.executeUpdate();

                        Register_Movimiento movimiento = new Register_Movimiento(Login.ID_User, "R/G", serial, Login.direction);
                        Thread register = new Thread(movimiento);
                        register.start();

                        PaintAndCleanCamp();

                        JOptionPane.showMessageDialog(null, "Registro Exitoso", "¡Exito!",
                                JOptionPane.INFORMATION_MESSAGE);

                        serial = "";
                        falla = "";
                        received = "";
                        jTextField_Code.setText("");
                        jTextField_Equipo.setText("");

                        paneles.PanelWarranty();;

                    } catch (SQLException e) {

                        System.err.println("¡Error al registrar el equipo! " + e);
                        JOptionPane.showMessageDialog(null, "¡Error al registrar el equipo!",
                                "¡Error!", JOptionPane.OK_OPTION);

                    }

                }

            } catch (SQLException e) {

                System.err.println("¡Error al validar la información del equipo! " + e);
                JOptionPane.showMessageDialog(null, "¡Error al validar la información del equipo!",
                        "¡Error!", JOptionPane.OK_OPTION);

            }

        } else {

            jLabel_DatePurchase.setForeground(Color.red);

            JOptionPane.showMessageDialog(null, "¡Debes seleccionar una fecha valida!", "¡Acceso Denegado!",
                    JOptionPane.OK_OPTION);

            jTextField_Calendar.setText("");

        }

    }//GEN-LAST:event_jButton_RegisterMousePressed

    private void jButton_Search_CodeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Search_CodeMousePressed

        //Si presiona el boton para seleccionar un equipo se guardará la información de la interfaz...
        serial = jTextField_Serial.getText().trim();
        falla = jTextField_Falla.getText().trim();
        received = jTextArea_Recibido.getText().trim();

        //Variable bandera para saber de donde se está abriendo la interfaz...
        flag = 1;

        //Panel para seleccionar el equipo para garantía...
        paneles.PanelCodeEquipos();


    }//GEN-LAST:event_jButton_Search_CodeMousePressed

    private void jButton_CalendarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_CalendarMousePressed

        if (!jTextField_Code.getText().equals("")) {

            if (flag_calendar == 0) {

                jCalendar.setVisible(true);

                flag_calendar = 1;

            } else {

                jCalendar.setVisible(false);

                flag_calendar = 0;

            }

        } else {

            jLabel_Code.setForeground(Color.red);

            JOptionPane.showMessageDialog(null, "¡Debes seleccionar un equipo!", "¡Acceso denegado!",
                    JOptionPane.OK_OPTION);

        }

    }//GEN-LAST:event_jButton_CalendarMousePressed

    private void jCalendarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendarPropertyChange

        if (evt.getOldValue() != null) {

            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            jTextField_Calendar.setText(format.format(jCalendar.getCalendar().getTime()));
            date_purchase = format.format(jCalendar.getCalendar().getTime());

            jCalendar.setVisible(false);

            flag_calendar = 0;

            jTextField_Calendar.requestFocus();

        }


    }//GEN-LAST:event_jCalendarPropertyChange

    private void jTextField_CalendarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_CalendarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CalendarKeyTyped

    private void jCalendarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCalendarMousePressed


    }//GEN-LAST:event_jCalendarMousePressed

    private void jTextField_CalendarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_CalendarFocusGained

        dayWarranty();

    }//GEN-LAST:event_jTextField_CalendarFocusGained

    private void jTextField_SerialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_SerialKeyReleased

        validateCamp();

    }//GEN-LAST:event_jTextField_SerialKeyReleased

    private void jTextField_FallaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_FallaKeyReleased

        validateCamp();


    }//GEN-LAST:event_jTextField_FallaKeyReleased

    private void jTextArea_RecibidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea_RecibidoKeyReleased

        validateCamp();

    }//GEN-LAST:event_jTextArea_RecibidoKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Calendar;
    private javax.swing.JButton jButton_Register;
    private javax.swing.JButton jButton_Search_Code;
    private com.toedter.calendar.JCalendar jCalendar;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel_Code;
    private javax.swing.JLabel jLabel_Code2;
    private javax.swing.JLabel jLabel_Date2;
    private javax.swing.JLabel jLabel_DatePurchase;
    private javax.swing.JLabel jLabel_Equipo;
    private javax.swing.JLabel jLabel_Equipo2;
    private javax.swing.JLabel jLabel_Falla;
    private javax.swing.JLabel jLabel_Falla2;
    private javax.swing.JLabel jLabel_Received2;
    private javax.swing.JLabel jLabel_Recibido;
    private javax.swing.JLabel jLabel_Serial;
    private javax.swing.JLabel jLabel_Serial2;
    private javax.swing.JLabel jLabel_Title;
    public static javax.swing.JLabel jLabel_garantia;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextArea jTextArea_Recibido;
    private javax.swing.JTextField jTextField_Calendar;
    public javax.swing.JTextField jTextField_Code;
    public javax.swing.JTextField jTextField_Equipo;
    private javax.swing.JTextField jTextField_Falla;
    private javax.swing.JTextField jTextField_Serial;
    // End of variables declaration//GEN-END:variables

    //Método para validar la dirección de donde se está abriendo la interfaz...
    private void validateAddress() {

        if (flag == 1) {

            jTextField_Serial.setText(serial);
            jTextField_Falla.setText(falla);
            jTextArea_Recibido.setText(received);

        } else {

            jTextField_Serial.setText("");
            jTextField_Falla.setText("");
            jTextArea_Recibido.setText("");
            jTextField_Code.setText("");
            jTextField_Equipo.setText("");

        }

    }

    // Método para calcular cuantos días de garantías tiene un equipo...
    private void dayWarranty() {

        // Variables para guardar el día, mes y año en que fue comprado el equipo...
        int day = 0, month = 0, year = 0;

        // Esto es para obtener la fecha completa en que fue comprado el equipo...
        String date = jTextField_Calendar.getText().trim();

        // Aquí estoy asignando el día, mes y año a cada variable correspondiente...
        day = Integer.parseInt(date.substring(0, 2));
        month = Integer.parseInt(date.substring(3, 5));
        year = Integer.parseInt(date.substring(6, 10));

        // Aquí estoy creando un calendario...
        Calendar calendarPurachase = Calendar.getInstance();

        // Aquí estooy asiganandole el día, mes y año al calendario creado arriba...
        calendarPurachase.set(Calendar.DATE, day);
        calendarPurachase.set(Calendar.MONTH, month - 1);
        calendarPurachase.set(Calendar.YEAR, year);

        // En esta linea estoy creando otro calendario y obteniendo la fecha actual...
        Calendar dateNow = Calendar.getInstance();

        // Esto es una condicion o pregunta donde me estoy preguntado...
        // ¿La fecha que se compró al equipo es mayor a la fecha actual?
        if (calendarPurachase.after(dateNow)) {

            // Es esta condición se cumple, osea... si la fecha que compraron el teléfono,
            // es mayor a hoy, deja un mensaje de error porque es imposible que el teléfono
            // lo compren mañana o pasado o ETC...
            jLabel_garantia.setForeground(Color.red);
            jLabel_garantia.setText("¡Error en formato de fecha!"); //Deja este mensaje.

            // Esto es una variable bandera, eso es para comicarle a otro método que está pasando aqui...
            // si el valor es uno 1 es porque no es valido el formato...
            flag_register = 1;

        } else { // Si no se cumple la condición de la imagen anterior entra a este bloque...

            // Si el valor es 0 es porque si hay un valor valido en la fecha...
            flag_register = 0;

            // Aquí estoy sumando los días que hay entre la fecha que se compró y la fecha actual...
            calendarPurachase.add(Calendar.DATE, day_warranty);

            // Si el resultado de la suma, es una fecha mayor a la fecha actual es porque el equipo
            // aun tiene garantía...
            if (calendarPurachase.after(dateNow)) {

                // Aquí estoy calculando en mili segundos cuantos milisegundos han pasado desde el día
                // en que se compró el equipo, y cuantos milisegundos han pasado hoy...
                long timePurchase = calendarPurachase.getTimeInMillis();
                long timeNow = dateNow.getTimeInMillis();

                // Luego de obtener los mili segundos hago una resta de los milisegundo de haber comprado el equipo
                // y hoy y eso lo divido entre 86400000 que es la cantidad de milisegundos que tiene un día.
                time_Warranty = (int) ((Math.abs(timeNow - timePurchase)) / 86400000);

                // Luego dejo este mensaje donde indica cuantos días le quedan de garantía al equipo...
                jLabel_garantia.setForeground(new Color(240, 240, 240));
                jLabel_garantia.setText("El equipo tiene: " + time_Warranty + " días de garantía...");

            } else { // Si la suma de la condición de arriba es menor a la fecha actual, entra en este bloque...

                time_Warranty = 0;

                // Y deja este mensaje para que el usuario sepa que el equipo no tiene garantía...
                jLabel_garantia.setForeground(Color.red);
                jLabel_garantia.setText("El equipo no cumple con los días de garantía...");

            }

        }

        calendarPurachase.set(Calendar.DATE, day);
        calendarPurachase.set(Calendar.MONTH, month - 1);
        calendarPurachase.set(Calendar.YEAR, year);

        validateCamp();

    }

    private void PaintAndCleanCamp() {

        jLabel_Code.setForeground(Color.GREEN);
        jLabel_DatePurchase.setForeground(Color.GREEN);
        jLabel_Equipo.setForeground(Color.GREEN);
        jLabel_Falla.setForeground(Color.GREEN);
        jLabel_Serial.setForeground(Color.GREEN);
        jLabel_Recibido.setForeground(Color.GREEN);

        jTextField_Code.setText("");
        jTextField_Equipo.setText("");
        jTextField_Serial.setText("");
        jTextField_Falla.setText("");
        jTextField_Calendar.setText("");
        jTextArea_Recibido.setText("");
        jLabel_garantia.setText("");

    }

    private String DateNow() {

        Date Datenow = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        return format.format(Datenow);

    }

    private String DateFormat() {

        String dateFormat = DateNow().substring(6, 10) + "-" + DateNow().substring(3, 5) + "-" + DateNow().substring(0, 2);

        return dateFormat;

    }

    private void validateCamp() {

        if (jTextField_Code.getText().isEmpty()) {

            jLabel_Code2.setText("CAMPO REQUERIDO *");

        } else {

            jLabel_Code2.setText("");

        }

        if (jTextField_Equipo.getText().isEmpty()) {

            jLabel_Equipo2.setText("CAMPO REQUERIDO *");

        } else {

            jLabel_Equipo2.setText("");

        }

        if (jTextField_Serial.getText().isEmpty()) {

            jLabel_Serial2.setText("CAMPO REQUERIDO *");

        } else {

            jLabel_Serial2.setText("");

        }

        if (jTextField_Falla.getText().isEmpty()) {

            jLabel_Falla2.setText("CAMPO REQUERIDO *");

        } else {

            jLabel_Falla2.setText("");

        }

        if (jTextField_Calendar.getText().isEmpty()) {

            jLabel_Date2.setText("CAMPO REQUERIDO *");

        } else {

            jLabel_Date2.setText("");

        }

        if (jTextArea_Recibido.getText().isEmpty()) {

            jLabel_Received2.setText("CAMPO REQUERIDO *");

        } else {

            jLabel_Received2.setText("");

        }

        if (jTextField_Code.getText().isEmpty() || jTextField_Equipo.getText().isEmpty() || jTextField_Serial.getText().isEmpty()
                || jTextField_Falla.getText().isEmpty() || jTextField_Calendar.getText().isEmpty() || jTextArea_Recibido.getText().isEmpty()) {

            jButton_Register.setVisible(false);

        } else {

            jButton_Register.setVisible(true);

        }

    }

    private void getAddressPanel() {

        if (flag_AddressRegisterAndConsult == 1) {

            getInformationClient();

        } else if (flag_AddressRegisterAndConsult == 2) {

            RequestEquipo requestEquipo = new RequestEquipo();
            Thread hiloEquipo = new Thread(requestEquipo);
            hiloEquipo.start();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            jLabel_Title.setText("Nueva Garantía - Cliente: " + name_client);

        } else {

            name_client = Consult_Cl_Client.name_client;

            id_client = Consult_Cl_Client.id_client;

            jLabel_Title.setText("Nueva Garantía - Cliente: " + name_client);

        }

    }

    public void getInformationClient() {

        name_client = Register_Client.name_client;

        try {

            Connection cn = BD_Connection.connection();
            PreparedStatement pst = cn.prepareStatement("select id_client from client where "
                    + "unformat_identity_card_client = '" + Register_Client.identity_card_client + "'");

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                id_client = rs.getInt("id_client");
                jLabel_Title.setText("Nueva Garantía - Cliente: " + name_client);

            }

            cn.close();

        } catch (SQLException e) {

            System.out.println("¡Error al consultar el ID del cliente! " + e);
            JOptionPane.showMessageDialog(null, "¡Error al consultar el ID del cliente!", "¡Error", JOptionPane.OK_OPTION);

        }

    }

    public void getInformationEquipo() {

        try {

            Connection cn = BD_Connection.connection();
            PreparedStatement pst = cn.prepareStatement("select code, brand, model, color, capacity, day_warranty from equipo "
                    + "where id_equipo = '" + CodeEquipos.id_equipo + "'");

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                day_warranty = rs.getInt("day_warranty");
                brand = rs.getString("brand");
                model = rs.getString("model");
                color = rs.getString("color");

                jTextField_Code.setText(rs.getString("code"));

                jTextField_Equipo.setText(rs.getString("brand") + " - " + rs.getString("model")
                        + " - " + rs.getString("color") + " - " + rs.getString("capacity"));

            }

            cn.close();

        } catch (SQLException e) {

            System.err.println("¡Error al consultar la información del equipo! " + e);
            JOptionPane.showMessageDialog(null, "¡Error al consultar la información del equipo!", "¡Error!", JOptionPane.OK_OPTION);

        }

    }

    public class RequestEquipo implements Runnable {

        @Override
        public void run() {

            getInformationEquipo();

        }

    }

}
