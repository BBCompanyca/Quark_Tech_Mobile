package model;

import clases.BD_Connection;
import java.sql.*;
import javax.swing.JOptionPane;

public class M_Login {

    private String username, password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean Login() {

        try {

            Connection cn = BD_Connection.connection();
            PreparedStatement pst = cn.prepareStatement(
                "select * from user where username = '" + this.username + "' and password = '" + this.password + "'");
            
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                
                return true;
                
            } else {
                
                return false;
                
            }
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "¡Error en el boton acceder \n "
                    + "contacte a un administrador!", "Error", 
                    JOptionPane.ERROR_MESSAGE);
            
            System.out.println("¡Error en el boton acceder! " + e);
            
        }
        
        return null;

    }

}
