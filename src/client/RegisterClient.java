package client;

import OtherClass.BD_Connection;
import OtherClass.FormatText;
import OtherClass.Paneles;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import login.Login;
import moviments.Register_Movimiento;
import warranty.Register_Warranty;

public class RegisterClient {

    private int address;
    private String name, telephone, identity, direction;

    public RegisterClient(int address, String name, String telephone, String identity, String direction) {
        this.address = address;
        this.name = name;
        this.telephone = telephone;
        this.identity = identity;
        this.direction = direction;
    }

    public void RegisterClient() {

        BD_Connection connection = new BD_Connection();
        FormatText formatText = new FormatText();
        Paneles paneles = new Paneles();

        if (!ValidateIsIndentityAvailable()) {

            JOptionPane.showMessageDialog(null, "¡Ya existe un cliente con este Número de Cédula!", "¡Acceso Denegado!",
                    JOptionPane.OK_OPTION);

        } else {

            try {

                Connection cn2 = connection.connection();
                PreparedStatement pst2 = cn2.prepareStatement(
                        "insert into client values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

                pst2.setInt(1, 0);
                pst2.setString(2, name);
                pst2.setString(3, telephone);
                pst2.setString(4, formatText.unFormatText(telephone));
                pst2.setString(5, formatText.Identity_Card_Client(identity));
                pst2.setString(6, identity.toUpperCase());
                pst2.setString(7, direction);
                pst2.setString(8, Login.direction);
                pst2.setString(9, String.valueOf(Login.ID_User));
                pst2.setString(10, "");

                pst2.executeUpdate();

                RegisterMoviment();

                JOptionPane.showMessageDialog(null, "Registro exitoso.", "¡Exito!", JOptionPane.INFORMATION_MESSAGE);

                if (address == 1) {

                    Register_Warranty.flag_AddressRegisterAndConsult = 1;
                    paneles.PanelRegisterWarranty();

                } else {

                    paneles.PanelClients();

                }

                cn2.close();

            } catch (SQLException e) {

                System.err.println("¡Error al registrar cliente! " + e);
                JOptionPane.showMessageDialog(null, "¡Error al registrar cliente!", "¡Acceso Denegado!",
                        JOptionPane.OK_OPTION);

            }

        }

    }

    private boolean ValidateIsIndentityAvailable() {

        boolean isAvailable = true;
        int flag = 0;

        do {

            if (!getClient.clientList.isEmpty()) {

                for (int i = 0; i < getClient.clientList.size(); i++) {

                    if (getClient.clientList.get(i).getIdentity().equalsIgnoreCase(identity)) {

                        isAvailable = false;

                    }

                }

                flag = 1;

            }

        } while (flag != 1);

        return isAvailable;

    }

    private void RegisterMoviment() {

        Register_Movimiento movimiento = new Register_Movimiento(Login.ID_User, "R/C", name, Login.direction);
        Thread register = new Thread(movimiento);
        register.start();

    }

}
