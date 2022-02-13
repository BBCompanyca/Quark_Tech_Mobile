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

    /*
        Método para conectar con la base de datos y consultar los datos recibidos del controlador
        para el inicio de sesión
    */
    public Boolean Login() {

        try {

            Connection cn = BD_Connection.connection();
            PreparedStatement pst = cn.prepareStatement(
                "select * from user where username = '" + this.username + "' and password = '" + this.password + "'");
            
            ResultSet rs = pst.executeQuery();
            
            //Respuesta de los datos de inicio de sesión...
            return rs.next();
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "¡Error en el boton acceder \n "
                    + "contacte a un administrador!", "Error", 
                    JOptionPane.ERROR_MESSAGE);
            
            System.out.println("¡Error en el boton acceder! " + e);
            
        }
        
        return null;

    }

}
