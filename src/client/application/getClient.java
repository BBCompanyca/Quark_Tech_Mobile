package client.application;

import OtherClass.BD_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import client.domain.Client;

public class getClient implements Runnable {

    BD_Connection connection = new BD_Connection();

    public static ArrayList<Client> clientList = new ArrayList<>();

    @Override
    public void run() {
        getClient();
    }

    private void getClient() {

        try {

            Connection cn = connection.connection();
            PreparedStatement pst = cn.prepareStatement("select id_client, unformat_identity_card_client from client");

            ResultSet rs = pst.executeQuery();

            clientList.clear();

            while (rs.next()) {

                Client client = new Client(rs.getInt(1), rs.getString(2));

                clientList.add(client);

            }

            cn.close();

        } catch (SQLException e) {

            System.out.println("¡Error al consultar la lista de clientes! " + e);

        }

    }

}
