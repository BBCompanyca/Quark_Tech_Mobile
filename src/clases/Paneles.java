package clases;

import java.awt.BorderLayout;
import view.Acerca_De;
import view.Clients;
import equipo.infrastructure.CodeEquipos;
import warranty.infrastructure.Consult_Cl_Client;
import equipo.infrastructure.ViewRegisterEquipo;
import static view.Dashboard.jPanel_Content;
import static view.Dashboard.jPanel_Content_Menu;
import equipo.infrastructure.TableEquipos;
import view.History;
import warranty.infrastructure.Warranty;
import menu.Menu_Mod_Adm;
import menu.Menu_Seller;
import menu.Menu_Tecnico;
import view.Movimientos;
import notifications.Container_Notification;
import view.Preliminar_History;
import warranty.infrastructure.Preliminar_Warranty;
import view.Principal;
import view.Register_Client;
import warranty.infrastructure.Register_Warranty;
import view.Register_User;
import view.Reset_Password;
import view.Review_Technical;
import warranty.infrastructure.SentWarranty;
import request.infrastructure.Container_Solicitudes;
import view.Table_Technical;
import view.Update_Client;
import equipo.infrastructure.ViewUpdateEquipo;
import view.Update_User;
import view.Users;
import view.Warranty_Technical;
import view.sentWarranty_Technical;

public class Paneles {

    int WidthPanel = 890, HeigthPanel = 470;

    //Panel que se inicia cuando abre el sistema...
    public void PanelMain() {

        Principal main = new Principal();
        main.setSize(WidthPanel, HeigthPanel);
        main.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(main, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();

    }

    //Panel con la tabla de los usuarios registrados...
    public void PanelUsers() {

        Users users = new Users();
        users.setSize(WidthPanel, HeigthPanel);
        users.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(users, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();

    }

    //Panel para registrar a nuevos usuarios...
    public void PanelRegisterUser() {

        Register_User registerUsers = new Register_User();
        registerUsers.setSize(WidthPanel, HeigthPanel);
        registerUsers.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(registerUsers, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();

    }

    //Panel para módificiar la información de los usuarios...
    public void PanelUpadteUser() {

        Update_User updateUsers = new Update_User();
        updateUsers.setSize(WidthPanel, HeigthPanel);
        updateUsers.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(updateUsers, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();

    }

    //Panel con la tabla de los clientes registrados...
    public void PanelClients() {

        Clients clients = new Clients();
        clients.setSize(WidthPanel, HeigthPanel);
        clients.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(clients, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();

    }

    //Panel para registrar nuevos clientes...
    public void PanelRegisterClient() {

        Register_Client register_client = new Register_Client();
        register_client.setSize(WidthPanel, HeigthPanel);
        register_client.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(register_client, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();

    }

    //Panel para módificar la información de los clientes...
    public void PanelUpdateClient() {

        Update_Client update_client = new Update_Client();
        update_client.setSize(WidthPanel, HeigthPanel);
        update_client.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(update_client, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();

    }

    //Panel para módificar las contraseñas de los usuarios...
    public void PanelResetPassword() {

        Reset_Password pl = new Reset_Password();
        pl.setSize(WidthPanel, HeigthPanel);
        pl.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(pl, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();

    }

    //Panel con la tabla de los equipos registrados en el sistema...
    public void PanelEquipos() {

        TableEquipos equipos = new TableEquipos();
        equipos.setSize(WidthPanel, HeigthPanel);
        equipos.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(equipos, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();

    }
    
    //Panel para mostrar la información para modificar equipos...
    public void Panel_Update_Equipo() {

        ViewUpdateEquipo update_Equipo = new ViewUpdateEquipo();
        update_Equipo.setSize(890, 600);
        update_Equipo.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(update_Equipo, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();

    }

    //Panel con la tabla de los equipos...
    public void PanelCodeEquipos() {

        CodeEquipos CodeEquipos = new CodeEquipos();
        CodeEquipos.setSize(WidthPanel, HeigthPanel);
        CodeEquipos.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(CodeEquipos, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();

    }

    //Panel para registrar nuevos equipos...
    public void PanelCreateCodeEquipo() {

        ViewRegisterEquipo createCodeEquipo = new ViewRegisterEquipo();
        createCodeEquipo.setSize(WidthPanel, HeigthPanel);
        createCodeEquipo.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(createCodeEquipo, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();

    }

    //Panel para consultar el N° de C.I del cliente...
    public void PanelConsulCient() {

        Consult_Cl_Client consutl_ci_client = new Consult_Cl_Client();
        consutl_ci_client.setSize(WidthPanel, HeigthPanel);
        consutl_ci_client.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(consutl_ci_client, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();

    }

    //Panel con la tabla de las garantías...
    public void PanelWarranty() {

        Warranty warranty = new Warranty();
        warranty.setSize(WidthPanel, HeigthPanel);
        warranty.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(warranty, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();

    }

    //Panel con la tabla de las garantías del técnico...
    public void PanelWarrantyTechnical() {

        Warranty_Technical warranty_technical = new Warranty_Technical();
        warranty_technical.setSize(WidthPanel, HeigthPanel);
        warranty_technical.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(warranty_technical, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();

    }

    //Panel para registrar una nueva garantía...
    public void PanelRegisterWarranty() {

        Register_Warranty register_warranty = new Register_Warranty();
        register_warranty.setSize(WidthPanel, HeigthPanel);
        register_warranty.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(register_warranty, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();

    }

    //Panel para ver la informaciòn de las garantìas...
    public void Panel_PreliminarWarranty() {

        Preliminar_Warranty preliminar_warranty = new Preliminar_Warranty();
        preliminar_warranty.setSize(WidthPanel, HeigthPanel);
        preliminar_warranty.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(preliminar_warranty, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();

    }

    //Panel de envios de las garantìas a servicio técnico...
    public void Panel_SentWarranty() {

        SentWarranty Sent_warranty = new SentWarranty();
        Sent_warranty.setSize(WidthPanel, HeigthPanel);
        Sent_warranty.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(Sent_warranty, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();

    }

    //Panel de envio de garantía a la tienda...
    public void Panel_SentWarranty_Technical() {

        sentWarranty_Technical Sent_warranty_technical = new sentWarranty_Technical();
        Sent_warranty_technical.setSize(WidthPanel, HeigthPanel);
        Sent_warranty_technical.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(Sent_warranty_technical, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();

    }

    //Panel de la Preliminar de las garantìas...
    public void Panel_Table_Technical() {

        Table_Technical table_technical = new Table_Technical();
        table_technical.setSize(WidthPanel, HeigthPanel);
        table_technical.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(table_technical, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();

    }

    //Panel para hacer la revision de los equipos...
    public void Panel_Review_Technical() {

        Review_Technical review_technical = new Review_Technical();
        review_technical.setSize(WidthPanel, HeigthPanel);
        review_technical.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(review_technical, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();

    }

    //Panel para las solicitudes de las garantìas...
    public void Panel_Solicitudes() {

        Container_Solicitudes solicitudes = new Container_Solicitudes();
        solicitudes.setSize(WidthPanel, HeigthPanel);
        solicitudes.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(solicitudes, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();

    }

    //Panel para las el historico del equipo...
    public void Panel_History() {

        History history = new History();
        history.setSize(WidthPanel, HeigthPanel);
        history.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(history, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();

    }

    //Panel para las el historico de los Movimientos...
    public void Panel_Movimientos() {

        Movimientos movimientos = new Movimientos();
        movimientos.setSize(WidthPanel, HeigthPanel);
        movimientos.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(movimientos, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();

    }

    //Panel para las el preliminar del historico del equipo...
    public void Panel_Priliminar_History() {

        Preliminar_History preliminar_History = new Preliminar_History();
        preliminar_History.setSize(890, 600);
        preliminar_History.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(preliminar_History, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();

    }
    
    //Panel para mostrar la información de acerca de...
    public void Panel_Acerca_De() {

        Acerca_De acerca_De = new Acerca_De();
        acerca_De.setSize(890, 600);
        acerca_De.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(acerca_De, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();

    }
    
    //Panel para mostrar las notificaciones...
    public void Panel_Notifications() {

        Container_Notification notifications = new Container_Notification();
        notifications.setSize(400, 400);
        notifications.setLocation(235, 35);

        jPanel_Content.removeAll();
        jPanel_Content.add(notifications, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();

    }

    //Panel con el menú de MOD y ADM...
    public void PanelMenu_Mod_Admin() {

        Menu_Mod_Adm menu = new Menu_Mod_Adm();
        menu.setSize(210, 700);
        menu.setLocation(0, 0);

        jPanel_Content_Menu.removeAll();
        jPanel_Content_Menu.add(menu, BorderLayout.CENTER);
        jPanel_Content_Menu.revalidate();
        jPanel_Content_Menu.repaint();

    }

    //Panel con el menú para los vendedores...
    public void PanelMenu_Seller() {

        Menu_Seller menu = new Menu_Seller();
        menu.setSize(210, 700);
        menu.setLocation(0, 0);

        jPanel_Content_Menu.removeAll();
        jPanel_Content_Menu.add(menu, BorderLayout.CENTER);
        jPanel_Content_Menu.revalidate();
        jPanel_Content_Menu.repaint();

    }

    //Panel con el menú para los técnicos...
    public void PanelMenu_Tecnico() {

        Menu_Tecnico menu = new Menu_Tecnico();
        menu.setSize(210, 700);
        menu.setLocation(0, 0);

        jPanel_Content_Menu.removeAll();
        jPanel_Content_Menu.add(menu, BorderLayout.CENTER);
        jPanel_Content_Menu.revalidate();
        jPanel_Content_Menu.repaint();

    }

}
