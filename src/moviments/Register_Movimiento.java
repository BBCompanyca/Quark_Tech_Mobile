package moviments;

import clases.BD_Connection;
import java.sql.*;
import java.text.SimpleDateFormat;

public class Register_Movimiento implements Runnable {

    private int id_user;
    private String operation, referencia, shop;
    
    BD_Connection connection = new BD_Connection();

    public Register_Movimiento(int id_user, String operation, String referencia, String shop) {

        this.id_user = id_user;
        this.operation = operation;
        this.referencia = referencia;
        this.shop = shop;

    }

    @Override
    public void run() {

        Register();

    }

    public void Register() {

        try {

            Connection cn = connection.connection();
            PreparedStatement pst = cn.prepareStatement(
                    "insert into movimientos values (?, ?, ?, ?, ?, ?, ?)");

            pst.setInt(1, 0);
            pst.setString(2, fecha());
            pst.setString(3, fecha_format());
            pst.setString(4, operation);
            pst.setInt(5, id_user);
            pst.setString(6, referencia);
            pst.setString(7, shop);

            pst.executeUpdate();

            cn.close();

            System.out.println(fecha_format());
            System.out.println("Registrado con exito.!!");

        } catch (SQLException e) {

            System.out.println("Error: " + e);

        }
    }

    public String fecha() {

        java.util.Date Datenow = new java.util.Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        return format.format(Datenow);

    }

    public String fecha_format() {

       String fecha_format = fecha().substring(8, 10) + "/" + fecha().substring(5, 7) + "/" + fecha().substring(0, 4);

        return fecha_format;
    }

}
