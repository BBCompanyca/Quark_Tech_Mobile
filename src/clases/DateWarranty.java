package clases;

import java.awt.Color;
import static view.Register_Warranty.jLabel_garantia;
import java.util.Calendar;

public class DateWarranty {

    public void Date(String date) {

        Calendar dateNow = Calendar.getInstance();
        
        /*Calendar resetDate = date;

        if (datePurachase.after(dateNow)) {

            jLabel_garantia.setForeground(Color.red);

            jLabel_garantia.setText("¡Error en formato de fecha!");

        } else {

            datePurachase.add(Calendar.DATE, day_warranty - 1);

            if (datePurachase.after(dateNow)) {

                jLabel_garantia.setText("Cumple con el tiempo de garantía....");

            } else {

                jLabel_garantia.setForeground(Color.red);

                jLabel_garantia.setText("¡El equipo no cumple con el tiempo de garantía!");

            }

        } */

       // datePurachase = resetDate;
        //System.out.println("Salida: " + datePurachase);

    } 

}
