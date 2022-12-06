package equipo;

import OtherClass.BD_Connection;
import OtherClass.Paneles;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import login.Login;
import moviments.Register_Movimiento;

public class UpdateEquipo {

    private int equipoID;
    private String brand, model, color, capacity, dayWaranty;

    Paneles paneles = new Paneles();

    BD_Connection connection = new BD_Connection();

    public UpdateEquipo(int equipoID, String brand, String model, String color, String capacity, String dayWaranty) {
        this.equipoID = equipoID;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.capacity = capacity;
        this.dayWaranty = dayWaranty;
    }

    public void UpdateEquipo() {

        if (CodeIsValidate()) {

            try {

                Connection cn = connection.connection();
                PreparedStatement pst = cn.prepareStatement(
                        "update equipo set code = ?, brand = ?, model = ?, color = ?, capacity = ?, day_warranty = ?, "
                        + "last_modification = ? where id_equipo = '" + equipoID + "'");

                pst.setString(1, generateCode());
                pst.setString(2, brand);
                pst.setString(3, model);
                pst.setString(4, color);
                pst.setString(5, capacity);
                pst.setString(6, dayWaranty);
                pst.setString(7, Login.user);

                pst.executeUpdate();

                cn.close();

                Register_Movimiento movimiento = new Register_Movimiento(Login.ID_User, "M/E", generateCode(), Login.direction);
                Thread register = new Thread(movimiento);
                register.start();

                JOptionPane.showMessageDialog(null, "Modificación exitosa.");

                paneles.PanelEquipos();

            } catch (SQLException e) {

                System.err.println("Error al modificar la información del equipo " + e);
                JOptionPane.showMessageDialog(null, "¡Error al modificar la información del equipo!", "¡Error!",
                        JOptionPane.OK_OPTION);

            }

        } else {

            JOptionPane.showMessageDialog(null, "¡Ya exite un equipo registrados con estos parametros!",
                    "¡Acceso Denegado!", JOptionPane.OK_OPTION);

        }

    }

    private boolean CodeIsValidate() {

        boolean isValidate = true;
        int flag = 0;

        do {

            if (!getCodeEquipos.codeEquipoList.isEmpty()) {

                for (int i = 0; i < getCodeEquipos.codeEquipoList.size(); i++) {

                    if (getCodeEquipos.codeEquipoList.get(i).getCodeEquipo().equals(generateCode())
                            && getCodeEquipos.codeEquipoList.get(i).getEquipoID() != equipoID) {

                        isValidate = false;

                    }

                    flag = 1;

                }

            }

        } while (flag != 1);

        return isValidate;
    }

    private String generateCode() {

        String code = "";

        code = brand.substring(0, 3)
                + model + capacity + "-" + color.substring(0, 1);

        return code;

    }

}
