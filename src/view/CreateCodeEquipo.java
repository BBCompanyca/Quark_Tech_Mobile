package view;

import java.sql.*;
import clases.BD_Connection;
import clases.FormatText;
import clases.Paneles;
import clases.Register_Movimiento;
import clases.TextPrompt;
import java.awt.Color;
import javax.swing.JOptionPane;

public class CreateCodeEquipo extends javax.swing.JPanel {

    FormatText formatText = new FormatText();

    Paneles paneles = new Paneles();

    public CreateCodeEquipo() {
        initComponents();

        TextPrompt brand = new TextPrompt("Ej. Alcatel 1", jTextField_Brand);
        TextPrompt model = new TextPrompt("Ej. 5033EP", jTextField_Model);
        TextPrompt color = new TextPrompt("Ej. Negro", jTextField_Color);
        TextPrompt capacity = new TextPrompt("Ej. 2/32GB", jTextField_Capacity);
        TextPrompt dayWarranty = new TextPrompt("Ej. 90", jTextField_DayWarranty);

        formatText.ValidateCapacityEquipo(jTextField_Capacity);

        validateCamp();

        jButton_Register.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel_Brand = new javax.swing.JLabel();
        jTextField_Brand = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField_Model = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel_Model = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jTextField_Color = new javax.swing.JTextField();
        jLabel_Color = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jTextField_Capacity = new javax.swing.JTextField();
        jLabel_Capacity = new javax.swing.JLabel();
        jButton_Register = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jTextField_DayWarranty = new javax.swing.JTextField();
        jLabel_day_warranty = new javax.swing.JLabel();
        jLabel_DayWarranty2 = new javax.swing.JLabel();
        jLabel_Color2 = new javax.swing.JLabel();
        jLabel_Brand2 = new javax.swing.JLabel();
        jLabel_Model2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(9, 53, 69));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Crear Nuevo Equipo");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 890, 40));

        jLabel_Brand.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Brand.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Brand.setText("Marca:");
        add(jLabel_Brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 70, -1));

        jTextField_Brand.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Brand.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Brand.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Brand.setBorder(null);
        jTextField_Brand.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_BrandKeyReleased(evt);
            }
        });
        add(jTextField_Brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 130, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 130, 10));

        jTextField_Model.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Model.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Model.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Model.setBorder(null);
        jTextField_Model.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_ModelKeyReleased(evt);
            }
        });
        add(jTextField_Model, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 130, 30));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 130, 10));

        jLabel_Model.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Model.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Model.setText("Modelo:");
        add(jLabel_Model, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 140, 10));

        jTextField_Color.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Color.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Color.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Color.setBorder(null);
        jTextField_Color.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_ColorKeyReleased(evt);
            }
        });
        add(jTextField_Color, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 140, 30));

        jLabel_Color.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Color.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Color.setText("Color:");
        add(jLabel_Color, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 80, -1));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 130, 10));

        jTextField_Capacity.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Capacity.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Capacity.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Capacity.setBorder(null);
        jTextField_Capacity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_CapacityKeyReleased(evt);
            }
        });
        add(jTextField_Capacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 130, 30));

        jLabel_Capacity.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Capacity.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Capacity.setText("Capacidad:");
        add(jLabel_Capacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, -1));

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
        add(jButton_Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 260, 190, 60));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 140, 10));

        jTextField_DayWarranty.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_DayWarranty.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_DayWarranty.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_DayWarranty.setBorder(null);
        jTextField_DayWarranty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_DayWarrantyKeyReleased(evt);
            }
        });
        add(jTextField_DayWarranty, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 140, 30));

        jLabel_day_warranty.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_day_warranty.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_day_warranty.setText("Días de garantía:");
        add(jLabel_day_warranty, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 140, -1));

        jLabel_DayWarranty2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel_DayWarranty2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_DayWarranty2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_DayWarranty2.setText("CAMPO REQUERIDO *");
        jLabel_DayWarranty2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel_DayWarranty2, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 215, 150, 20));

        jLabel_Color2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel_Color2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Color2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Color2.setText("CAMPO REQUERIDO *");
        jLabel_Color2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel_Color2, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 325, 150, 20));

        jLabel_Brand2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel_Brand2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Brand2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Brand2.setText("CAMPO REQUERIDO *");
        jLabel_Brand2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel_Brand2, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 215, 150, 20));

        jLabel_Model2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel_Model2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Model2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Model2.setText("CAMPO REQUERIDO *");
        jLabel_Model2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel_Model2, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 215, 150, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_RegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RegisterMousePressed

        int flag = 0;

        String brand, model, color, capacity, code, daywarranty;

        brand = jTextField_Brand.getText().trim();
        model = jTextField_Model.getText().trim();
        color = jTextField_Color.getText().trim();
        capacity = jTextField_Capacity.getText().trim();
        daywarranty = jTextField_DayWarranty.getText().trim();

        if (flag == 0) {

            try {

                Connection cn = BD_Connection.connection();
                PreparedStatement pst = cn.prepareStatement(
                        "select brand, model, color, capacity from equipo where brand = '" + brand + "' "
                        + "and model = '" + model + "' and color = '" + color + "' and "
                        + "capacity = '" + capacity + "'");

                ResultSet rs = pst.executeQuery();

                if (rs.next()) {

                    cn.close();

                    PaintRed();

                    JOptionPane.showMessageDialog(null, "¡Ya exite un equipo registrado con estos parametros!",
                            "¡Acceso Dengado!", JOptionPane.OK_OPTION);

                    CleanCamp();

                } else {

                    cn.close();

                    try {

                        Connection cn2 = BD_Connection.connection();
                        PreparedStatement pst2 = cn2.prepareStatement("select code from equipo where code = '" + generateCode() + "'");

                        ResultSet rs2 = pst2.executeQuery();

                        if (rs2.next()) {

                            cn2.close();

                            PaintRed();

                            JOptionPane.showMessageDialog(null, "¡Ya exite un equipo registrado con este código!",
                                    "¡Acceso Dengado!", JOptionPane.OK_OPTION);

                            CleanCamp();

                        } else {

                            cn2.close();

                            try {

                                Connection cn3 = BD_Connection.connection();
                                PreparedStatement pst3 = cn3.prepareStatement(
                                        "insert into equipo values(?, ?, ?, ?, ?, ?, ?, ?, ?)");

                                pst3.setInt(1, 0);
                                pst3.setString(2, generateCode());
                                pst3.setString(3, brand);
                                pst3.setString(4, model);
                                pst3.setString(5, color);
                                pst3.setString(6, capacity + "GB");
                                pst3.setString(7, daywarranty);
                                pst3.setString(8, Login.user);
                                pst3.setString(9, "");
                                
                                pst3.executeUpdate();

                                Register_Movimiento movimiento = new Register_Movimiento(Login.ID_User, "R/E", generateCode(), Login.direction);
                                Thread register = new Thread(movimiento);
                                register.start();
                                
                                PaintGreen();

                                CleanCamp();

                                JOptionPane.showMessageDialog(null, "¡Equipo registrado con exito!", "!Exito!",
                                        JOptionPane.INFORMATION_MESSAGE);

                                paneles.PanelEquipos();

                                cn3.close();

                            } catch (SQLException e) {

                                System.err.println("¡Error al registrar el equipo! " + e);
                                JOptionPane.showMessageDialog(null, "¡Error al registrar el equipo!", "¡Acceso Denegado!",
                                        JOptionPane.OK_OPTION);

                            }

                        }

                    } catch (SQLException e) {

                        System.err.println("¡Error al validar el código del equipo! " + e);
                        JOptionPane.showMessageDialog(null, "¡Error al validar el código del equipo!", "¡Acceso Denegado!",
                                JOptionPane.OK_OPTION);

                    }

                }

            } catch (SQLException e) {

                System.err.println("¡Error al validar los parametros del equipo! " + e);
                JOptionPane.showMessageDialog(null, "¡Error al validar los parametros del equipo!", "¡Acceso Denegado!",
                        JOptionPane.OK_OPTION);

            }

        } else {

            JOptionPane.showMessageDialog(null, "¡Debes llenar todos los campos!", "¡Acceso Dengado!",
                    JOptionPane.WARNING_MESSAGE);

        }

    }//GEN-LAST:event_jButton_RegisterMousePressed

    private void jTextField_BrandKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_BrandKeyReleased

        validateCamp();

    }//GEN-LAST:event_jTextField_BrandKeyReleased

    private void jTextField_ModelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ModelKeyReleased

        validateCamp();

    }//GEN-LAST:event_jTextField_ModelKeyReleased

    private void jTextField_DayWarrantyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_DayWarrantyKeyReleased

        validateCamp();

    }//GEN-LAST:event_jTextField_DayWarrantyKeyReleased

    private void jTextField_ColorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ColorKeyReleased

        validateCamp();

    }//GEN-LAST:event_jTextField_ColorKeyReleased

    private void jTextField_CapacityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_CapacityKeyReleased

        validateCamp();

    }//GEN-LAST:event_jTextField_CapacityKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Register;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Brand;
    private javax.swing.JLabel jLabel_Brand2;
    private javax.swing.JLabel jLabel_Capacity;
    private javax.swing.JLabel jLabel_Color;
    private javax.swing.JLabel jLabel_Color2;
    private javax.swing.JLabel jLabel_DayWarranty2;
    private javax.swing.JLabel jLabel_Model;
    private javax.swing.JLabel jLabel_Model2;
    private javax.swing.JLabel jLabel_day_warranty;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jTextField_Brand;
    private javax.swing.JTextField jTextField_Capacity;
    private javax.swing.JTextField jTextField_Color;
    private javax.swing.JTextField jTextField_DayWarranty;
    private javax.swing.JTextField jTextField_Model;
    // End of variables declaration//GEN-END:variables

    private void PaintRed() {

        jLabel_Brand.setForeground(Color.red);
        jLabel_Model.setForeground(Color.red);
        jLabel_Color.setForeground(Color.red);
        jLabel_day_warranty.setForeground(Color.red);
        jLabel_Capacity.setForeground(Color.red);

    }

    private void PaintGreen() {

        jLabel_Brand.setForeground(Color.GREEN);
        jLabel_Model.setForeground(Color.GREEN);
        jLabel_Color.setForeground(Color.GREEN);
        jLabel_day_warranty.setForeground(Color.GREEN);
        jLabel_Capacity.setForeground(Color.GREEN);

    }

    private void CleanCamp() {

        jTextField_Brand.setText("");
        jTextField_Model.setText("");
        jTextField_Color.setText("");
        jTextField_DayWarranty.setText("");
        jTextField_Capacity.setText("");

    }

    private void validateCamp() {

        if (jTextField_Brand.getText().isEmpty()) {

            jLabel_Brand2.setText("CAMPO REQUERIDO *");

        } else {

            jLabel_Brand2.setText("");

        }

        if (jTextField_Model.getText().isEmpty()) {

            jLabel_Model2.setText("CAMPO REQUERIDO *");

        } else {

            jLabel_Model2.setText("");

        }

        if (jTextField_DayWarranty.getText().isEmpty()) {

            jLabel_DayWarranty2.setText("CAMPO REQUERIDO *");

        } else {

            jLabel_DayWarranty2.setText("");

        }

        if (jTextField_Color.getText().isEmpty()) {

            jLabel_Color2.setText("CAMPO REQUERIDO *");

        } else {

            jLabel_Color2.setText("");

        }

        if (jTextField_Brand.getText().isEmpty() || jTextField_Model.getText().isEmpty()
                || jTextField_DayWarranty.getText().isEmpty() || jTextField_Color.getText().isEmpty()) {

            jButton_Register.setVisible(false);

        } else {

            jButton_Register.setVisible(true);

        }

    }

    private String generateCode() {

        String code = "";
        String capacity = jTextField_Capacity.getText().trim();

        if (capacity.length() < 3 && capacity.length() > 4) {

            capacity = "N/A";

        }

        code = jTextField_Brand.getText().substring(0, 3)
                + jTextField_Model.getText()
                + capacity + "-"
                + jTextField_Color.getText().substring(0, 1);

        return code;

    }

}
