package equipo.application;

import OtherClass.BD_Connection;
import equipo.domain.Equipos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class getCodeEquipos implements Runnable {

    BD_Connection connection = new BD_Connection();

    public static ArrayList<Equipos> codeEquipoList = new ArrayList<>();

    @Override
    public void run() {

        getCodeEquipos();

    }

    private void getCodeEquipos() {

        try {

            Connection cn = connection.connection();
            PreparedStatement pst = cn.prepareStatement("select code, id_equipo from equipo");

            ResultSet rs = pst.executeQuery();
            
            codeEquipoList.clear();

            while (rs.next()) {

                Equipos equipos = new Equipos(rs.getString(1), rs.getInt(2));
                
                codeEquipoList.add(equipos);
                
            }

            cn.close();
            
        } catch (SQLException e) {
            
            System.err.println("¡Error al consultar la lista de códigos de equipos! " + e);
            
        }

    }

}
