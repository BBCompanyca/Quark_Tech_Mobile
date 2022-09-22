package Notifications.View;

import Notifications.model.Request_Notifications;

public final class Contain_Notification extends javax.swing.JPanel {

    public Contain_Notification() {
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

        for (int i = 0; i < Request_Notifications.ejemploLista.size(); i++) {

            Information_Notification info = new Information_Notification(
                    Request_Notifications.ejemploLista.get(i).getID(), Request_Notifications.ejemploLista.get(i).getUsername_technical(),
                    Request_Notifications.ejemploLista.get(i).getMessage(), Request_Notifications.ejemploLista.get(i).getBrand(),
                    Request_Notifications.ejemploLista.get(i).getModel(), Request_Notifications.ejemploLista.get(i).getColor(),
                    Request_Notifications.ejemploLista.get(i).getSerial(), Request_Notifications.ejemploLista.get(i).getFalla(),
                    Request_Notifications.ejemploLista.get(i).getStatus_notification());
            jPanel_Content.add(info);
            jPanel_Content.revalidate();
            info.setVisible(true);

        }

    }

    /*public class RequestView implements Runnable {

        int id_warranty_consult;

        public RequestView(int id_warranty_consult) {

            this.id_warranty_consult = id_warranty_consult;

        }

        @Override
        public void run() {

            Information_Notification info = new Information_Notification(id_warranty_consult);
            jPanel_Content.add(info);
            jPanel_Content.revalidate();
            info.setVisible(true);

        }

    }*/
}
