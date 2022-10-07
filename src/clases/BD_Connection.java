package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class BD_Connection {

    private int flag = 0;

    public Connection connection() {

        try {

            Connection cn = DriverManager.getConnection(
                    
                    //Base De Datos para desarrollo...
                    "jdbc:mysql://quarktechmobileccs.online:3306/u972055873_developerqtm",
                    "u972055873_developer",
                    "V3]gdibBdFjw"); 
                    
                    //Base De Datos De Producción...
                    /*"jdbc:mysql://quarktechmobileccs.online:3306/u972055873_quarktech",
                    "u972055873_globalpayment",
                    "~8d$:Vn7CdR");*/
            setFlag(0);

            return cn;

        } catch (SQLException e) {

            if (getFlag() < 3) {

                try {

                    setFlag(getFlag() + 1);

                    Thread.sleep(3000);

                    connection();

                } catch (InterruptedException ex) {

                    Logger.getLogger(BD_Connection.class.getName()).log(Level.SEVERE, null, ex);

                }

            } else {

                System.out.println("¡Error al conectar con la base de datos! " + e);

                JOptionPane.showMessageDialog(null,
                        "¡Ops... Tenemos problemas para conectar con el servidor!\n"
                        + "                        ¡Se cerrará la aplicación!\n"
                        + "           -Por favor consulta tu conexión a internet-",
                        "¡Error!", JOptionPane.ERROR_MESSAGE);

                System.exit(0);

            }

        }

        return (null);

    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
