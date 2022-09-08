package view;

import clases.BD_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public final class Notifications extends javax.swing.JPanel {

    int index;

    public Notifications() {
        initComponents();

        View_Window();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel_Content = new javax.swing.JPanel();

        setBackground(new java.awt.Color(9, 53, 69));
        setBorder(new javax.swing.border.MatteBorder(null));

        jScrollPane1.setBackground(new java.awt.Color(9, 53, 69));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(400, 200));

        jPanel_Content.setBackground(new java.awt.Color(9, 53, 69));
        jPanel_Content.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane1.setViewportView(jPanel_Content);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel jPanel_Content;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void View_Window() {

        try {

            Connection cn = BD_Connection.connection();
            PreparedStatement pst = cn.prepareStatement("select id_notification from notifications "
                    + "where id_userReceived = '" + Login.ID_User + "'");

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                int id_warranty_consult = rs.getInt("id_notification");
                RequestView requestView = new RequestView(id_warranty_consult);
                Thread hilo = new Thread(requestView);
                hilo.start();

            }

        } catch (SQLException e) {

            System.err.println("¡Error al mostrar notificaciones! " + e);
            JOptionPane.showMessageDialog(null, "¡Error al mostrar las solicitudes!", "¡Error!",
                    JOptionPane.OK_OPTION);

        }

    }
    
    public class RequestView implements Runnable {
        
        int id_warranty_consult;
        
        public RequestView(int id_warranty_consult){
            
           this.id_warranty_consult = id_warranty_consult;
            
        }

        @Override
        public void run() {

            Information_Notification info = new Information_Notification(id_warranty_consult);
            jPanel_Content.add(info);
            jPanel_Content.revalidate();
            info.setVisible(true); 
           

        }

    }

}