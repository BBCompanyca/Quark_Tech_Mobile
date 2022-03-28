package clases;

import com.toedter.calendar.JDateChooser;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JTextField;
import static view.Register_Warranty.jLabel_garantia;

public class DateWarranty {
    
    int day, months, year;
    
    //Método para validar la fecha...
    public void ValidateDate(JTextField a) {

        a.addKeyListener(new KeyAdapter() {

            @Override
            public void keyTyped(KeyEvent e) {

                char c = e.getKeyChar();

                if (!Character.isDigit(c) || a.getText().length() == 10) {

                    e.consume();

                }

                if (a.getText().length() == 2 && c != com.sun.glass.events.KeyEvent.VK_BACKSPACE
                        || a.getText().length() == 5 && c != com.sun.glass.events.KeyEvent.VK_BACKSPACE) {

                    String point = a.getText();

                    a.setText(point + "/");

                }

                if (a.getText().length() == 10 && c == '*') {

                    day = Integer.parseInt(a.getText().substring(0, 2));
                    months = Integer.parseInt(a.getText().substring(3, 5));
                    year = Integer.parseInt(a.getText().substring(6, 10));
                    
                    Calendar DatePurchase = Calendar.getInstance();
                    DatePurchase.set(year, months - 1, day);
                    DatePurchase.set(Calendar.HOUR, 0);
                    DatePurchase.set(Calendar.HOUR_OF_DAY, 0);
                    DatePurchase.set(Calendar.MINUTE, 0);
                    DatePurchase.set(Calendar.SECOND, 0);
                    
                    Calendar DateNow = Calendar.getInstance();
                    DateNow.set(Calendar.HOUR, 0);
                    DateNow.set(Calendar.HOUR_OF_DAY, 0);
                    DateNow.set(Calendar.MINUTE, 0);
                    DateNow.set(Calendar.SECOND, 0);

                    long nowMilliseconds = DateNow.getTimeInMillis();
                    long purchaseMilliseconds = DatePurchase.getTimeInMillis();
                    
                    int warrantyTime = (int) (Math.abs(nowMilliseconds - purchaseMilliseconds)) / 86400000 + 1;
                    warrantyTime = 90 - warrantyTime;
                    
                    jLabel_garantia.setText("Le quedan " + warrantyTime + " días de garantía.");
                    
                }

            }

        });

    }
    
    public void Date(JDateChooser a){
        
        Date fecha = a.getDate();
        
        
        
    }

    
}
