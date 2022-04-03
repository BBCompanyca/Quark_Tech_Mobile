package clases;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class FormatText {

    char d;
    int count = 0;

    //Método para validar el numero de telefono...
    public void ValidateNumber(JTextField a) {

        a.addKeyListener(new KeyAdapter() {

            @Override
            public void keyTyped(KeyEvent e) {

                char c = e.getKeyChar();

                if (!Character.isDigit(c) || a.getText().length() >= 16) {

                    e.consume();

                }

                if (a.getText().length() == 4 && c != com.sun.glass.events.KeyEvent.VK_BACKSPACE) {

                    String point = a.getText();

                    a.setText(point + " - ");

                } else if (a.getText().length() == 10 && c != com.sun.glass.events.KeyEvent.VK_BACKSPACE
                        || a.getText().length() == 13 && c != com.sun.glass.events.KeyEvent.VK_BACKSPACE) {

                    String point = a.getText();

                    a.setText(point + ".");

                }

            }

        });

    }

    public String ValidateCI2(String ci) {

        String aux = "";
        int count = 0;

        for (int i = ci.length() - 1; i >= 0; i--) {
            if (count == 3) {

                aux = ci.charAt(i) + "." + aux;
                count = 1;

            } else {

                aux = ci.charAt(i) + aux;
                count++;

            }
        }

        return aux;

    }

    //Método para validar el numero de cédula...
    public void ValidateCI(JTextField a) {

        a.addKeyListener(new KeyAdapter() {

            @Override
            public void keyTyped(KeyEvent e) {

                char c = e.getKeyChar();

                count++;

                if (!Character.isDigit(c)) {

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

                if (!Character.isLetter(c) && c != ' '
                        || a.getText().length() == 0 && !Character.isLetter(c) && c == ' ') {

                    e.consume();

                }

                if (d == ' ' && c == ' ') {

                    e.consume();

                }

                d = c;

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

    //Método para quitar el formato a los campos de texto...
    public String unFormatText(String cadena) {

        String newCadena = "";

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ' && cadena.charAt(i) != '\n' && cadena.charAt(i) != '-' && cadena.charAt(i) != '.') {
                newCadena = newCadena + cadena.charAt(i);
            }
        }

        return newCadena;
    }

    //Método para validar el formato de la capacidad del equipo...
    public void ValidateCapacityEquipo(JTextField a) {

        a.addKeyListener(new KeyAdapter() {

            @Override
            public void keyTyped(KeyEvent e) {

                char c = e.getKeyChar();

                if (!Character.isDigit(c) || a.getText().length() == 4) {

                    e.consume();

                }

                if (a.getText().length() == 0 && c == ' ') {

                    e.consume();

                }

                if (a.getText().length() == 1 && c != com.sun.glass.events.KeyEvent.VK_BACKSPACE) {

                    String point = a.getText();

                    a.setText(point + "/");

                }

            }
        });

    }

}