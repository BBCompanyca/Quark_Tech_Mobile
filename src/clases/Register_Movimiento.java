package clases;

import java.sql.*;
import java.text.SimpleDateFormat;

public class Register_Movimiento implements Runnable {

    private int id_user;
    private String operation;

    public Register_Movimiento(int id_user, String operation) {

        this.id_user = id_user;
        this.operation = operation;

    }

    @Override
    public void run() {

        Register();

    }

    public void Register() {
        
        try {

            Connection cn = BD_Connection.connection();
            PreparedStatement pst = cn.prepareStatement(
                    "insert into movimientos values (?, ?, ?, ?)");

            pst.setInt(1, 0);
            pst.setString(2, fecha());
            pst.setString(3, operation);
            pst.setInt(4, id_user);

            pst.executeUpdate();

            cn.close();

            System.out.println("Registrado con exito.!!");

        } catch (SQLException e) {

            System.out.println("Error: " + e);

        }
    }

    public static String fecha() {

        java.util.Date Datenow = new java.util.Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        return format.format(Datenow);

    }

}
