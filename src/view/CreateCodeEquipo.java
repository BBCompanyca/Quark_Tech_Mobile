package view;

import java.sql.*;
import clases.BD_Connection;
import clases.FormatText;
import java.awt.Color;
import javax.swing.JOptionPane;

public class CreateCodeEquipo extends javax.swing.JPanel {

    FormatText formatText = new FormatText();
    
    public CreateCodeEquipo() {
        initComponents();
        
        //formatText.ValidateBrand(jTextField_Brand);
        
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
        jSeparator5 = new javax.swing.JSeparator();
        jTextField_Code = new javax.swing.JTextField();
        jLabel_Code = new javax.swing.JLabel();
        jButton_Register = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jTextField_DayWarranty = new javax.swing.JTextField();
        jLabel_day_warranty = new javax.swing.JLabel();

        setBackground(new java.awt.Color(9, 53, 69));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Crear Nuevo Equipo");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 790, 40));

        jLabel_Brand.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Brand.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Brand.setText("Marca:");
        add(jLabel_Brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jTextField_Brand.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Brand.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Brand.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Brand.setBorder(null);
        add(jTextField_Brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 220, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 220, 10));

        jTextField_Model.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Model.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Model.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Model.setBorder(null);
        add(jTextField_Model, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 220, 30));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 220, 10));

        jLabel_Model.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Model.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Model.setText("Modelo:");
        add(jLabel_Model, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 220, 10));

        jTextField_Color.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Color.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Color.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Color.setBorder(null);
        add(jTextField_Color, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 220, 30));

        jLabel_Color.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Color.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Color.setText("Color:");
        add(jLabel_Color, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 100, 10));

        jTextField_Capacity.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Capacity.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Capacity.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Capacity.setBorder(null);
        add(jTextField_Capacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 100, 30));

        jLabel_Capacity.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Capacity.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Capacity.setText("Capacidad:");
        add(jLabel_Capacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, -1));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 220, 10));

        jTextField_Code.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Code.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_Code.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Code.setBorder(null);
        add(jTextField_Code, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 220, 30));

        jLabel_Code.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_Code.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Code.setText("Codigo:");
        add(jLabel_Code, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, -1));

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
        add(jButton_Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 190, 60));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 135, 10));

        jTextField_DayWarranty.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_DayWarranty.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_DayWarranty.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_DayWarranty.setBorder(null);
        add(jTextField_DayWarranty, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 135, 30));

        jLabel_day_warranty.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel_day_warranty.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_day_warranty.setText("Días de garantía:");
        add(jLabel_day_warranty, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_RegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RegisterMousePressed

        int flag = 0;

        String brand, model, color, capacity, code, daywarranty;

        brand = jTextField_Brand.getText().trim();
        model = jTextField_Model.getText().trim();
        color = jTextField_Color.getText().trim();
        capacity = jTextField_Capacity.getText().trim();
        daywarranty = jTextField_DayWarranty.getText().trim();
        code = jTextField_Code.getText().trim();

        if (brand.equals("")) {

            jLabel_Brand.setForeground(Color.red);
            flag++;

        } else {

            jLabel_Brand.setForeground(new Color(240, 240, 240));

        }

        if (model.equals("")) {

            jLabel_Model.setForeground(Color.red);
            flag++;

        } else {

            jLabel_Model.setForeground(new Color(240, 240, 240));

        }

        if (color.equals("")) {

            jLabel_Color.setForeground(Color.red);
            flag++;

        } else {

            jLabel_Color.setForeground(new Color(240, 240, 240));

        }

        if (capacity.equals("")) {

            jLabel_Capacity.setForeground(Color.red);
            flag++;

        } else {

            jLabel_Capacity.setForeground(new Color(240, 240, 240));

        }

        if (code.equals("")) {

            jLabel_Code.setForeground(Color.red);
            flag++;

        } else {

            jLabel_Code.setForeground(new Color(240, 240, 240));

        }

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
                        PreparedStatement pst2 = cn2.prepareStatement("select code from equipo where = '" + code + "'");

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
                                pst3.setString(2, code);
                                pst3.setString(3, brand);
                                pst3.setString(4, model);
                                pst3.setString(5, color);
                                pst3.setString(6, capacity);
                                pst3.setString(7, daywarranty);
                                pst3.setString(8, Login.user);
                                pst3.setString(9, "");

                                pst3.executeUpdate();

                                PaintGreen();

                                JOptionPane.showMessageDialog(null, "¡Equipo registrado con exito!", "!Exito!",
                                        JOptionPane.INFORMATION_MESSAGE);

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Register;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Brand;
    private javax.swing.JLabel jLabel_Capacity;
    private javax.swing.JLabel jLabel_Code;
    private javax.swing.JLabel jLabel_Color;
    private javax.swing.JLabel jLabel_Model;
    private javax.swing.JLabel jLabel_day_warranty;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jTextField_Brand;
    private javax.swing.JTextField jTextField_Capacity;
    private javax.swing.JTextField jTextField_Code;
    private javax.swing.JTextField jTextField_Color;
    private javax.swing.JTextField jTextField_DayWarranty;
    private javax.swing.JTextField jTextField_Model;
    // End of variables declaration//GEN-END:variables

    private void PaintRed() {

        jLabel_Brand.setForeground(Color.red);
        jLabel_Model.setForeground(Color.red);
        jLabel_Color.setForeground(Color.red);
        jLabel_Code.setForeground(Color.red);
        jLabel_day_warranty.setForeground(Color.red);
        jLabel_Capacity.setForeground(Color.red);

    }

    private void PaintGreen() {

        jLabel_Brand.setForeground(Color.GREEN);
        jLabel_Model.setForeground(Color.GREEN);
        jLabel_Color.setForeground(Color.GREEN);
        jLabel_Code.setForeground(Color.GREEN);
        jLabel_day_warranty.setForeground(Color.GREEN);
        jLabel_Capacity.setForeground(Color.GREEN);

    }

    private void CleanCamp() {

        jTextField_Brand.setText("");
        jTextField_Model.setText("");
        jTextField_Color.setText("");
        jTextField_Code.setText("");
        jTextField_DayWarranty.setText("");
        jTextField_Capacity.setText("");

    }

}
