package view;

import clases.BD_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public final class Solicitudes extends javax.swing.JPanel {

    int index;

    public Solicitudes() {
        initComponents();

        View_Window();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel_Content = new javax.swing.JPanel();

        setBackground(new java.awt.Color(9, 53, 69));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

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
            PreparedStatement pst = cn.prepareStatement(
                    "select id_warranty from warranty where technical = '" + Login.user + "' and status = '" + "Solicitud Enviada - En Espera" + "'");

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                int id_warranty_consult = rs.getInt("id_warranty");

                view.Information_Solicitudes info = new view.Information_Solicitudes(id_warranty_consult);
                jPanel_Content.add(info);
                jPanel_Content.revalidate();
                info.setVisible(true);

            }

        } catch (Exception e) {
        }

    }

}
