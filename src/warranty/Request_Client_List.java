package warranty;

import java.util.ArrayList;
import OtherClass.BD_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Request_Client_List implements Runnable {

    BD_Connection connection = new BD_Connection();
    public static ArrayList<Client> client_List = new ArrayList<>();

    @Override
    public void run() {

        getListClient();

    }

    private ArrayList<Client> getListClient() {

        try {

            Connection cn = connection.connection();
            PreparedStatement pst = cn.prepareStatement("select * from client");

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                Client client = new Client(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
                        rs.getString(6), rs.getString(7));

                client_List.add(client);

            }

            cn.close();

        } catch (SQLException e) {

            System.err.println("¡Error al consultar la lista de clientes! " + e);

        }

        return client_List;

    }

}
