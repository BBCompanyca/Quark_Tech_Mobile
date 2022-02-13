package clases;

import controller.C_Login;
import model.M_Login;
import view.Login;

public class Main {
    public static void main (String args[]){
        
        Login view = new Login();
        M_Login model = new M_Login();
        C_Login ctrl = new C_Login(view, model);
        view.setVisible(true);
        
    }
    
}
