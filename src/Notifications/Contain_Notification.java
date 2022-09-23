package notifications;

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

        for (int i = 0; i < Request_Notifications.noficationList.size(); i++) {

            Information_Notification info = new Information_Notification(
                    Request_Notifications.noficationList.get(i).getID(), Request_Notifications.noficationList.get(i).getUsername_technical(),
                    Request_Notifications.noficationList.get(i).getMessage(), Request_Notifications.noficationList.get(i).getBrand(),
                    Request_Notifications.noficationList.get(i).getModel(), Request_Notifications.noficationList.get(i).getColor(),
                    Request_Notifications.noficationList.get(i).getSerial(), Request_Notifications.noficationList.get(i).getFalla(),
                    Request_Notifications.noficationList.get(i).getStatus_notification());
            jPanel_Content.add(info);
            jPanel_Content.revalidate();
            info.setVisible(true);

        }

    }

}
