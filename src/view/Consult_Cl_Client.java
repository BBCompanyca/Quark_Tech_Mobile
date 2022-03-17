package view;

import java.sql.*;
import clases.BD_Connection;
import clases.TextPrompt;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import static view.Dashboard.jPanel_Content;

public class Consult_Cl_Client extends javax.swing.JPanel {


    public Consult_Cl_Client() {
        initComponents();

        TextPrompt text = new TextPrompt("Ingrese el N° de C.I del Cliente", jTextField_CI_Client);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_CI_Client = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton_Restart = new javax.swing.JButton();
        jLabel_Title = new javax.swing.JLabel();
        jTextField_CI_Client = new javax.swing.JTextField();

        setBackground(new java.awt.Color(9, 53, 69));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_CI_Client.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel_CI_Client.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_CI_Client.setText("Número C.I:");
        add(jLabel_CI_Client, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 250, 10));

        jButton_Restart.setText("Consultar");
        jButton_Restart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_RestartMousePressed(evt);
            }
        });
        jButton_Restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RestartActionPerformed(evt);
            }
        });
        add(jButton_Restart, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 190, 40));

        jLabel_Title.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel_Title.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Title.setText("Consultar Cliente Para Registro De Equipo");
        add(jLabel_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 790, 50));

        jTextField_CI_Client.setBackground(new java.awt.Color(9, 53, 69));
        jTextField_CI_Client.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jTextField_CI_Client.setForeground(new java.awt.Color(240, 240, 240));
        jTextField_CI_Client.setBorder(null);
        add(jTextField_CI_Client, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 250, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_RestartMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RestartMousePressed

    }//GEN-LAST:event_jButton_RestartMousePressed

    private void jButton_RestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RestartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_RestartActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Restart;
    private javax.swing.JLabel jLabel_CI_Client;
    private javax.swing.JLabel jLabel_Title;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField_CI_Client;
    // End of variables declaration//GEN-END:variables

    

}
