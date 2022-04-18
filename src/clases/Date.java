package clases;

import java.text.SimpleDateFormat;

public class Date {

    public String DateToDay() {

        java.util.Date Datenow = new java.util.Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        return format.format(Datenow);

    }

    public String DatePurchaseEquipo(String date) {

        String[] meses = {"ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE",
            "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"};

        String day = date.substring(0, 2);
        int month = Integer.parseInt(date.substring(3, 5));
        String year = date.substring(6, 10);
        
        date = " " + day + " DE " + meses[month - 1] + " DEL " + year;
        
        return date;

    }

}
