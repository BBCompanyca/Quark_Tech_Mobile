package clases;

import java.awt.BorderLayout;
import static view.Dashboard.jPanel_Content;
import static view.Dashboard.jPanel_Content_Menu;
import view.Menu_Mod_Adm;
import view.Menu_Seller;
import view.Menu_Tecnico;
import view.Principal;
import view.Reset_Password;
import view.Users;

public class Paneles {

    public void PanelMain() {

        Principal main = new Principal();
        main.setSize(790, 470);
        main.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(main, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();

    }

    public void PanelUsers() {

        Users users = new Users();
        users.setSize(790, 470);
        users.setLocation(0, 0);

        jPanel_Content.removeAll();
        jPanel_Content.add(users, BorderLayout.CENTER);
        jPanel_Content.revalidate();
        jPanel_Content.repaint();

    }
    
    public void PanelResetPassword(){
        
        Reset_Password pl = new Reset_Password();
        pl.setSize(790, 370);
        pl.setLocation(0, 0);
        
        jPanel_Content.removeAll();
        jPanel_Content.add(pl, BorderLayout.CENTER);
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
