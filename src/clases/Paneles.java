package clases;

import java.awt.BorderLayout;
import view.Clients;
import view.Consult_Cl_Client;
import static view.Dashboard.jPanel_Content;
import static view.Dashboard.jPanel_Content_Menu;
import view.Equipos;
import view.Menu_Mod_Adm;
import view.Menu_Seller;
import view.Menu_Tecnico;
import view.Principal;
import view.Register_Client;
import view.Register_Equipo;
import view.Register_User;
import view.Reset_Password;
import view.TabletConsultClient;
import view.Update_Client;
import view.Update_User;
import view.Users;

public class Paneles {

    public void PanelMain() {

        Principal main = new Principal();
        main.setSize(790, 370);
        main.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(main, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();

    }

    public void PanelUsers() {

        Users users = new Users();
        users.setSize(790, 370);
        users.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(users, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();

    }
    
    public void PanelRegisterUser(){
        
        Register_User registerUsers = new Register_User();
        registerUsers.setSize(790, 370);
        registerUsers.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(registerUsers, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();
        
    }
    
    public void PanelUpadteUser(){
       
        Update_User updateUsers = new Update_User();
        updateUsers.setSize(790, 370);
        updateUsers.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(updateUsers, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();
        
    }

    public void PanelClients() {

        Clients clients = new Clients();
        clients.setSize(790, 370);
        clients.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(clients, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();
        
    }

    public void PanelRegisterClient() {

        Register_Client register_client = new Register_Client();
        register_client.setSize(790, 370);
        register_client.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(register_client, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();

    }
    
    public void PanelUpdateClient() {

        Update_Client update_client = new Update_Client();
        update_client.setSize(790, 370);
        update_client.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(update_client, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();

    }

    public void PanelResetPassword() {

        Reset_Password pl = new Reset_Password();
        pl.setSize(790, 370);
        pl.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(pl, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();

    }
    
    public void PanelEquipos() {

        Equipos equipos = new Equipos();
        equipos.setSize(790, 370);
        equipos.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(equipos, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();

    }
    
    public void PanelConsulCient() {

        Consult_Cl_Client consutl_ci_client = new Consult_Cl_Client();
        consutl_ci_client.setSize(790, 370);
        consutl_ci_client.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(consutl_ci_client, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();

    }
    
    public void TabletConsultClient() {

        TabletConsultClient tableconsultclient = new TabletConsultClient();
        tableconsultclient.setSize(790, 370);
        tableconsultclient.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(tableconsultclient, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();

    }
    
    public void PanelRegisterEquipo() {

        Register_Equipo register_equipo = new Register_Equipo();
        register_equipo.setSize(790, 370);
        register_equipo.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(register_equipo, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();

    }

    public void PanelMenu_Mod_Admin() {

        Menu_Mod_Adm menu = new Menu_Mod_Adm();
        menu.setSize(210, 600);
        menu.setLocation(0, 0);

        jPanel_Content_Menu.removeAll();
        jPanel_Content_Menu.add(menu, BorderLayout.CENTER);
        jPanel_Content_Menu.revalidate();
        jPanel_Content_Menu.repaint();

    }

    public void PanelMenu_Seller() {

        Menu_Seller menu = new Menu_Seller();
        menu.setSize(210, 600);
        menu.setLocation(0, 0);

        jPanel_Content_Menu.removeAll();
        jPanel_Content_Menu.add(menu, BorderLayout.CENTER);
        jPanel_Content_Menu.revalidate();
        jPanel_Content_Menu.repaint();

    }

    public void PanelMenu_Tecnico() {

        Menu_Tecnico menu = new Menu_Tecnico();
        menu.setSize(210, 600);
        menu.setLocation(0, 0);

        jPanel_Content_Menu.removeAll();
        jPanel_Content_Menu.add(menu, BorderLayout.CENTER);
        jPanel_Content_Menu.revalidate();
        jPanel_Content_Menu.repaint();

    }

}
