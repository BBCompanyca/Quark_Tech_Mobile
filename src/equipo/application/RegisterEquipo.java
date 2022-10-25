package equipo.application;

import clases.BD_Connection;
import clases.Paneles;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import login.Login;
import moviments.Register_Movimiento;

public class RegisterEquipo {

    BD_Connection connection = new BD_Connection();

    Paneles paneles = new Paneles();

    String brand, model, color, capacity, daywarranty;

    public RegisterEquipo(String brand, String model, String color, String capacity, String daywarranty) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.capacity = capacity;
        this.daywarranty = daywarranty;

    }

    private String generateCode() {

        String code;

        code = brand.substring(0, 3)
                + model + capacity + "-" + color.substring(0, 1);

        return code;

    }

    private boolean CodeIsValidate() {

        boolean isValidate = true;

        for (int i = 0; i < getCodeEquipos.codeEquipoList.size(); i++) {

            if (getCodeEquipos.codeEquipoList.get(i).getCodeEquipo().equals(generateCode())) {

                isValidate = false;

            }

        }

        return isValidate;
    }

    public void RegisterEquipo() {

        if (CodeIsValidate()) {

            try {

                Connection cn3 = connection.connection();
                PreparedStatement pst3 = cn3.prepareStatement(
                        "insert into equipo values(?, ?, ?, ?, ?, ?, ?, ?, ?)");

                pst3.setInt(1, 0);
                pst3.setString(2, generateCode());
                pst3.setString(3, brand);
                pst3.setString(4, model);
                pst3.setString(5, color);
                pst3.setString(6, capacity);
                pst3.setString(7, daywarranty);
                pst3.setString(8, Login.user);
                pst3.setString(9, "");

                pst3.executeUpdate();

                Register_Movimiento movimiento = new Register_Movimiento(Login.ID_User, "R/E", generateCode(), Login.direction);
                Thread register = new Thread(movimiento);
                register.start();

                JOptionPane.showMessageDialog(null, "¡Equipo registrado con exito!", "!Exito!",
                        JOptionPane.INFORMATION_MESSAGE);

                paneles.PanelEquipos();

                cn3.close();

            } catch (SQLException e) {

                System.err.println("¡Error al registrar el equipo! " + e);
                JOptionPane.showMessageDialog(null, "¡Error al registrar el equipo!", "¡Acceso Denegado!",
                        JOptionPane.OK_OPTION);

            }

        } else {

            JOptionPane.showMessageDialog(null, "¡Este equipo ya está registrado en el sistema!", "¡Acceso Denegado!",
                    JOptionPane.OK_OPTION);

        }

    }

}
