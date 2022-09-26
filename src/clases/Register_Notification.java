package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import login.Login;

public class Register_Notification implements Runnable {

    private String message;
    int RegisteredID, warrantyID, equipoID;
    
    Date date = new Date();

    public Register_Notification(int RegisteredID, int warrantyID, int equipoID, String message) {

        this.RegisteredID = RegisteredID;
        this.warrantyID = warrantyID;
        this.equipoID = equipoID;
        this.message = message;

    }

    @Override
    public void run() {
        
        InsertNotification();
        
    }

    public void InsertNotification() {

        try {

            Connection cn = BD_Connection.connection();
            PreparedStatement pst = cn.prepareStatement(
                    "insert into notifications values(?, ?, ?, ?, ?, ?, ?, ?)");

            pst.setInt(1, 0);
            pst.setInt(2, Login.ID_User);
            pst.setInt(3, RegisteredID);
            pst.setInt(4, warrantyID);
            pst.setInt(5, equipoID);
            pst.setString(6, message);
            pst.setString(7, "unread");
            pst.setString(8, date.DateToDay());
            pst.executeUpdate();

        } catch (SQLException e) {

            System.err.println("¡Error en registrar notificación! " + e);

        }

    }

}
