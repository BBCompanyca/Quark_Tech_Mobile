package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

            //Validación de que los campos de texto no estén vacios.
            if (view.jTextField_Username.getText().equals("") || view.jPasswordField_Password.getText().equals("")) {

                view.jLabel_Anwser.setText("¡Debes llenar todos los campos!");
                
            } else {
                
                //Envío de los datos de inicio de sesión y respuesta del modelo...
                model.setUsername(view.jTextField_Username.getText().trim());
                model.setPassword(view.jPasswordField_Password.getText().trim());
                model.Login();
                
                //Respuesta del modelo con los datos enviados de inicio de sesión...
                if (model.Login() == true) {
                    
                    //Respuesta cuando los datos enviados son correctos...
                    view.jLabel_Anwser.setText("¡Exito!");
                    
                } else {
                    
                    //Respuesta cuando los datos enviados son incorrectos...
                    view.jLabel_Anwser.setText("!Nombre de usuario o contraseña incorrectos!");
                    
                    view.jTextField_Username.setText("");
                    view.jPasswordField_Password.setText("");
                    
                }

            }

        }

    }

}
