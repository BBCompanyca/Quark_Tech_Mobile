package view;

import login.Login;
import clases.BD_Connection;
import clases.Paneles;
import clases.Register_Movimiento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Update_Equipo extends javax.swing.JPanel {

    int ID;
    Paneles paneles = new Paneles();

    public Update_Equipo() {
        initComponents();

        getInformation();

        validateCamp();

        jLabel_Title.setText("Modificación de Equipo - " + Equipos.code);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Title = new javax.swing.JLabel();
        jLabel_Brand = new javax.swing.JLabel();
        jTextField_Brand = new javax.swing.JTextField();
        jLabel_Brand2 = new javax.swing.JLabel();
        jLabel_Color = new javax.swing.JLabel();
        jTextField_Color = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jTextField_Capacity = new javax.swing.JTextField();
        jLabel_Capacity = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField_Model = new javax.swing.JTextField();
        jLabel_Model = new javax.swing.JLabel();
        jLabel_Model2 = new javax.swing.JLabel();
        jLabel_Color2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel_DayWarranty2 = new javax.swing.JLabel();
        jTextField_DayWarranty = new javax.swing.JTextField();
        jLabel_day_warranty = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jButton_UpdateEquipo = new javax.swing.JButton();

        setBackground(new java.awt.Color(9, 53, 69));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Title.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        jLabel_Title.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Title.setText("Modificar Equipo");
        add(jLabel_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 890, 40));

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

        jLabel_Brand2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel_Brand2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Brand2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Brand2.setText("CAMPO REQUERIDO *");
        jLabel_Brand2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel_Brand2, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 215, 150, 20));

        jLabel_Color.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Color.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Color.setText("Color:");
        add(jLabel_Color, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 80, -1));

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
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 140, 10));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 80, 10));

        jTextField_Capacity.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Capacity.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Capacity.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Capacity.setBorder(null);
        jTextField_Capacity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_CapacityKeyReleased(evt);
            }
        });
        add(jTextField_Capacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 80, 30));

        jLabel_Capacity.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Capacity.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Capacity.setText("Capacidad:");
        add(jLabel_Capacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, -1));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 130, 10));

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

        jLabel_Model.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Model.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Model.setText("Modelo:");
        add(jLabel_Model, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        jLabel_Model2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel_Model2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Model2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Model2.setText("CAMPO REQUERIDO *");
        jLabel_Model2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel_Model2, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 215, 150, 20));

        jLabel_Color2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel_Color2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Color2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Color2.setText("CAMPO REQUERIDO *");
        jLabel_Color2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel_Color2, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 325, 150, 20));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 130, 10));

        jLabel_DayWarranty2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel_DayWarranty2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_DayWarranty2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_DayWarranty2.setText("CAMPO REQUERIDO *");
        jLabel_DayWarranty2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel_DayWarranty2, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 215, 150, 20));

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
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 140, 10));

        jButton_UpdateEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Update_Dark_C.png"))); // NOI18N
        jButton_UpdateEquipo.setBorder(null);
        jButton_UpdateEquipo.setBorderPainted(false);
        jButton_UpdateEquipo.setContentAreaFilled(false);
        jButton_UpdateEquipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_UpdateEquipo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Update_Ligth_C.png"))); // NOI18N
        jButton_UpdateEquipo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Update_Ligth_C.png"))); // NOI18N
        jButton_UpdateEquipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_UpdateEquipoMousePressed(evt);
            }
        });
        add(jButton_UpdateEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 140, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_BrandKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_BrandKeyReleased

        validateCamp();
    }//GEN-LAST:event_jTextField_BrandKeyReleased

    private void jTextField_ColorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ColorKeyReleased

        validateCamp();
    }//GEN-LAST:event_jTextField_ColorKeyReleased

    private void jTextField_CapacityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_CapacityKeyReleased

        validateCamp();
    }//GEN-LAST:event_jTextField_CapacityKeyReleased

    private void jTextField_ModelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ModelKeyReleased

        validateCamp();
    }//GEN-LAST:event_jTextField_ModelKeyReleased

    private void jTextField_DayWarrantyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_DayWarrantyKeyReleased

        validateCamp();
    }//GEN-LAST:event_jTextField_DayWarrantyKeyReleased

    private void jButton_UpdateEquipoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_UpdateEquipoMousePressed

        try {

            Connection cn2 = BD_Connection.connection();
            PreparedStatement pst2 = cn2.prepareStatement(
                    "select code from equipo where code = '" + generateCode() + "' and not id_equipo = '" + ID + "'");

            ResultSet rs2 = pst2.executeQuery();

            if (rs2.next()) {

                JOptionPane.showMessageDialog(null, "¡Ya exite un equipo registrados con estos parametros!",
                        "¡Acceso Denegado!", JOptionPane.OK_OPTION);

                cn2.close();

            } else {

                cn2.close();

                try {

                    Connection cn = BD_Connection.connection();
                    PreparedStatement pst = cn.prepareStatement(
                            "update equipo set code = ?, brand = ?, model = ?, color = ?, capacity = ?, day_warranty = ?, "
                            + "last_modification = ? where code = '" + Equipos.code + "'");

                    pst.setString(1, generateCode());
                    pst.setString(2, jTextField_Brand.getText().trim());
                    pst.setString(3, jTextField_Model.getText().trim());
                    pst.setString(4, jTextField_Color.getText().trim());

                    if (jTextField_Capacity.getText().trim().length() < 3 && jTextField_Capacity.getText().trim().length() > 4) {

                        pst.setString(5, "N/A");

                    } else {

                        if (!jTextField_Capacity.getText().trim().contains("GB")) {

                            pst.setString(5, jTextField_Capacity.getText().trim() + "GB");

                        } else {

                            pst.setString(5, jTextField_Capacity.getText().trim());

                        }

                    }

                    pst.setString(6, jTextField_DayWarranty.getText().trim());
                    pst.setString(7, Login.user);

                    pst.executeUpdate();

                    cn.close();

                    Register_Movimiento movimiento = new Register_Movimiento(Login.ID_User, "M/E", generateCode(), Login.direction);
                    Thread register = new Thread(movimiento);
                    register.start();

                    JOptionPane.showMessageDialog(null, "Modificación exitosa.");

                    paneles.PanelEquipos();

                } catch (SQLException e) {

                    System.err.println("Error al modificar la información del equipo " + e);
                    JOptionPane.showMessageDialog(null, "¡Error al modificar la información del equipo!", "¡Error!",
                            JOptionPane.OK_OPTION);

                }

            }

        } catch (SQLException e) {

            System.err.println("Error al consultar el código del equipo " + e);
            JOptionPane.showMessageDialog(null, "¡Error al consultar el código del equipo!", "¡Error!",
                    JOptionPane.OK_OPTION);
        }


    }//GEN-LAST:event_jButton_UpdateEquipoMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_UpdateEquipo;
    private javax.swing.JLabel jLabel_Brand;
    private javax.swing.JLabel jLabel_Brand2;
    private javax.swing.JLabel jLabel_Capacity;
    private javax.swing.JLabel jLabel_Color;
    private javax.swing.JLabel jLabel_Color2;
    private javax.swing.JLabel jLabel_DayWarranty2;
    private javax.swing.JLabel jLabel_Model;
    private javax.swing.JLabel jLabel_Model2;
    private javax.swing.JLabel jLabel_Title;
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

            jButton_UpdateEquipo.setVisible(false);

        } else {

            jButton_UpdateEquipo.setVisible(true);

        }

    }

    private void getInformation() {

        try {

            Connection cn = BD_Connection.connection();
            PreparedStatement pst = cn.prepareStatement("select id_equipo, brand, model, color, capacity, day_warranty "
                    + "from equipo where code = '" + Equipos.code + "'");

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                ID = rs.getInt("id_equipo");
                jTextField_Brand.setText(rs.getString("brand"));
                jTextField_Model.setText(rs.getString("model"));
                jTextField_Color.setText(rs.getString("color"));

                if (!rs.getString(4).equals("N/A")) {

                    jTextField_Capacity.setText(rs.getString("capacity"));

                } else {

                    jTextField_Capacity.setText("");

                }

                jTextField_DayWarranty.setText(rs.getString("day_warranty"));

            }

            cn.close();

        } catch (SQLException e) {

            System.err.println("Error al vaciar la información del equipo " + e);
            JOptionPane.showMessageDialog(null, "¡Error al consultar la información del equipo!", "¡Error!",
                    JOptionPane.OK_OPTION);

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
