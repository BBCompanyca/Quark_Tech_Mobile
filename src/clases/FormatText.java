package clases;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class FormatText {

    //Método para validar el numero de telefono...
    public void ValidateNumber(JTextField a) {

        a.addKeyListener(new KeyAdapter() {

            @Override
            public void keyTyped(KeyEvent e) {

                char c = e.getKeyChar();

                if (!Character.isDigit(c) || a.getText().length() >= 11) {

                    e.consume();

                }

            }

        });

    }

    //Método para validar el nombre...
    public void ValidateName(JTextField a) {

        a.addKeyListener(new KeyAdapter() {

            @Override
            public void keyTyped(KeyEvent e) {

                char c = e.getKeyChar();

                if (!Character.isLetter(c) && c != ' ' || a.getText().contains(" ") && !Character.isLetter(c)) {

                    e.consume();

                }

            }

        });

    }

    //Método para validar el nombre de usuario...
    public void ValidateUsername(JTextField a) {

        a.addKeyListener(new KeyAdapter() {

            @Override
            public void keyTyped(KeyEvent e) {

                char c = e.getKeyChar();

                if (!Character.isLetter(c) && !Character.isDigit(c) && c != '_') {

                    e.consume();

                }

            }

        });

    }

}
