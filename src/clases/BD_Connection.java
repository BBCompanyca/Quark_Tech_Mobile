package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class BD_Connection {

    public static Connection connection() {

        try {

            Connection cn = DriverManager.getConnection(
                     "jdbc:mysql://localhost/quark_tech_mobile", "root", "");

                   /*"jdbc:mysql://quarktechmobileccs.online:3306/u972055873_quarktech",
                    "u972055873_globalpayment",
                    "~8d$:Vn7CdR");*/

            return cn;

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "¡Error al conectar con la base de datos!", "Error",
                    JOptionPane.ERROR_MESSAGE);

            System.out.println("¡Error al conectar con la base de datos! " + e);

        }

        return (null);

    } 
       
       
}
