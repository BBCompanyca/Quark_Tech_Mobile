package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import model.M_Login;
import view.Login;

public class C_Login implements ActionListener {

    private Login view;
    private M_Login model;

    public C_Login(Login view, M_Login model) {

        this.view = view;
        this.model = model;
        this.view.jButton_Acceder.addActionListener(this);

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == view.jButton_Acceder) {

            if (view.jTextField_Username.getText().equals("") || view.jPasswordField_Password.getText().equals("")) {

                view.jLabel_Anwser.setText("¡Debes llenar todos los campos!");
                
            } else {

                model.setUsername(view.jTextField_Username.getText().trim());
                model.setPassword(view.jPasswordField_Password.getText().trim());
                model.Login();
                
                if (model.Login() == true) {
                    
                    view.jLabel_Anwser.setText("¡Exito!");
                    
                } else {
                    
                    view.jLabel_Anwser.setText("!Nombre de usuario o contraseña incorrectos!");
                    
                    view.jTextField_Username.setText("");
                    view.jPasswordField_Password.setText("");
                    
                }

            }

        }

    }

}
