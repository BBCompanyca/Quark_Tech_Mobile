package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class BD_Connection {

    public static Connection connection() {
 
        try {

            Connection cn = DriverManager.getConnection(
                    
                   //"jdbc:mysql://localhost/quark_tech_mobile", "root", "");
                  
                    //Base De Datos para desarrollo...
                  /*  "jdbc:mysql://quarktechmobileccs.online:3306/u972055873_developerqtm",
                    "u972055873_developer",
                    "V3]gdibBdFjw"); */
                    
                    //Base De Datos De Producción...
                   "jdbc:mysql://quarktechmobileccs.online:3306/u972055873_quarktech",
                    "u972055873_globalpayment",
                    "~8d$:Vn7CdR"); 

            return cn;

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "¡Error al conectar con el servidor!", "Error",
                    JOptionPane.ERROR_MESSAGE);

            System.out.println("¡Error al conectar con la base de datos! " + e);

        }

        return (null);

    } 
       
       
}
