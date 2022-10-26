package equipo.infrastructure;

import OtherClass.BD_Connection;
import OtherClass.FormatText;
import OtherClass.Paneles;
import OtherClass.TextPrompt;
import equipo.application.RegisterEquipo;
import equipo.application.getCodeEquipos;

public class ViewRegisterEquipo extends javax.swing.JPanel {

    FormatText formatText = new FormatText();

    Paneles paneles = new Paneles();

    BD_Connection connection = new BD_Connection();

    public ViewRegisterEquipo() {
        initComponents();

        TextPrompt brand = new TextPrompt("Ej. Alcatel 1", jTextField_Brand);
        TextPrompt model = new TextPrompt("Ej. 5033EP", jTextField_Model);
        TextPrompt color = new TextPrompt("Ej. Negro", jTextField_Color);
        TextPrompt capacity = new TextPrompt("Ej. 2/32GB", jTextField_Capacity);
        TextPrompt dayWarranty = new TextPrompt("Ej. 90", jTextField_DayWarranty);

        formatText.ValidateCapacityEquipo(jTextField_Capacity);

        validateCamp();

        jButton_Register.setVisible(false);

        getCodeEquipos getcodeequipos = new getCodeEquipos();
        Thread hilo = new Thread(getcodeequipos);
        hilo.start();

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

        String brand, model, color, capacity, daywarranty;

        brand = jTextField_Brand.getText().trim();
        model = jTextField_Model.getText().trim();
        color = jTextField_Color.getText().trim();
        capacity = jTextField_Capacity.getText().trim();
        daywarranty = jTextField_DayWarranty.getText().trim();
        
        RegisterEquipo registerEquipo = new RegisterEquipo(brand, model, color, capacity, daywarranty);
        registerEquipo.RegisterEquipo();

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
    public static javax.swing.JButton jButton_Register;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Brand;
    public static javax.swing.JLabel jLabel_Brand2;
    private javax.swing.JLabel jLabel_Capacity;
    private javax.swing.JLabel jLabel_Color;
    public static javax.swing.JLabel jLabel_Color2;
    public static javax.swing.JLabel jLabel_DayWarranty2;
    private javax.swing.JLabel jLabel_Model;
    public static javax.swing.JLabel jLabel_Model2;
    private javax.swing.JLabel jLabel_day_warranty;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    public static javax.swing.JTextField jTextField_Brand;
    public static javax.swing.JTextField jTextField_Capacity;
    public static javax.swing.JTextField jTextField_Color;
    public static javax.swing.JTextField jTextField_DayWarranty;
    public static javax.swing.JTextField jTextField_Model;
    // End of variables declaration//GEN-END:variables

    public void validateCamp() {

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
    

}
