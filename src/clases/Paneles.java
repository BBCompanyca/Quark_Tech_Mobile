package clases;

import java.awt.BorderLayout;
import view.Clients;
import view.CodeEquipos;
import view.Consult_Cl_Client;
import view.CreateCodeEquipo;
import static view.Dashboard.jPanel_Content;
import static view.Dashboard.jPanel_Content_Menu;
import view.Equipos;
import view.Warranty;
import view.Menu_Mod_Adm;
import view.Menu_Seller;
import view.Menu_Tecnico;
import view.Preliminar_Warranty;
import view.Principal;
import view.Register_Client;
import view.Register_Warranty;
import view.Register_User;
import view.Reset_Password;
import view.SentWarranty;
import view.Update_Client;
import view.Update_User;
import view.Users;

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

        Equipos equipos = new Equipos();
        equipos.setSize(WidthPanel, HeigthPanel);
        equipos.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(equipos, BorderLayout.CENTER);
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

        CreateCodeEquipo createCodeEquipo = new CreateCodeEquipo();
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
    
    //Panel para ver la informaciòn de las garantìas...
    public void Panel_SentWarranty() {

        SentWarranty Sent_warranty = new SentWarranty();
        Sent_warranty.setSize(WidthPanel, HeigthPanel);
        Sent_warranty.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(Sent_warranty, BorderLayout.CENTER);
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
