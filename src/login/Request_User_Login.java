package login;

import clases.BD_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Request_User_Login implements Runnable {

    BD_Connection connection = new BD_Connection();

    public static ArrayList<User_Login> user_Login_List = new ArrayList<>();

    @Override
    public void run() {

        Request_User_Login();

    }

    private void Request_User_Login() {

        try {

            Connection cn = connection.connection();
            PreparedStatement pst = cn.prepareStatement(
                    "select id_user, username, password, name_user, direction, type_account, status from user");

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                User_Login user_Login = new User_Login(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));

                user_Login_List.add(user_Login);

            }

            cn.close();

        } catch (SQLException e) {

            System.err.println("¡Error al consultar la lista de usuarios! " + e);

        }

    }

}
