package view;

public class Equipos extends javax.swing.JPanel {

    public Equipos() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField_Search_User = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton_Search_User = new javax.swing.JButton();
        jButton_New_User = new javax.swing.JButton();
        jButton_Update_User = new javax.swing.JButton();
        jButton_Delete_User = new javax.swing.JButton();

        setBackground(new java.awt.Color(9, 53, 69));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Marca", "Modelo", "color", "Serial", "Estatus", "Recidente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 750, 203));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Equipos");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 100, 30));

        jTextField_Search_User.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_Search_User.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextField_Search_User.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_Search_User.setBorder(null);
        jTextField_Search_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField_Search_UserMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextField_Search_UserMouseReleased(evt);
            }
        });
        jTextField_Search_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Search_UserActionPerformed(evt);
            }
        });
        jTextField_Search_User.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_Search_UserKeyPressed(evt);
            }
        });
        add(jTextField_Search_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 590, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 590, 10));

        jButton_Search_User.setText("Buscar");
        jButton_Search_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_Search_UserMousePressed(evt);
            }
        });
        add(jButton_Search_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 80, 30));

        jButton_New_User.setText("NUEVO");
        jButton_New_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_New_UserMousePressed(evt);
            }
        });
        jButton_New_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_New_UserActionPerformed(evt);
            }
        });
        add(jButton_New_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 100, 35));

        jButton_Update_User.setText("PRELIMINAR");
        jButton_Update_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_Update_UserMousePressed(evt);
            }
        });
        jButton_Update_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Update_UserActionPerformed(evt);
            }
        });
        add(jButton_Update_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 100, 35));

        jButton_Delete_User.setText("BORRAR");
        jButton_Delete_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_Delete_UserMousePressed(evt);
            }
        });
        add(jButton_Delete_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, 100, 35));
    }// </editor-fold>                        

    private void jTextField_Search_UserMousePressed(java.awt.event.MouseEvent evt) {                                                    

    }                                                   

    private void jTextField_Search_UserMouseReleased(java.awt.event.MouseEvent evt) {                                                     
        //nothing
    }                                                    

    private void jTextField_Search_UserActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
    }                                                      

    private void jTextField_Search_UserKeyPressed(java.awt.event.KeyEvent evt) {                                                  

        
    }                                                 

    private void jButton_Search_UserMousePressed(java.awt.event.MouseEvent evt) {                                                 

       
    }                                                

    private void jButton_New_UserMousePressed(java.awt.event.MouseEvent evt) {                                              

    }                                             

    private void jButton_New_UserActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void jButton_Update_UserMousePressed(java.awt.event.MouseEvent evt) {                                                 

       
    }                                                

    private void jButton_Update_UserActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void jButton_Delete_UserMousePressed(java.awt.event.MouseEvent evt) {                                                 

        
    }                                                


    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton_Delete_User;
    private javax.swing.JButton jButton_New_User;
    private javax.swing.JButton jButton_Search_User;
    private javax.swing.JButton jButton_Update_User;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_Search_User;
    // End of variables declaration                   
}
