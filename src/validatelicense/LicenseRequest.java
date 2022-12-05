package validatelicense;

import OtherClass.BD_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class LicenseRequest {

    BD_Connection connection = new BD_Connection();

    public LicenseRequest() {
        RequestLicense();
    }

    private void RequestLicense() {

        try {

            Connection cn = connection.connection();
            PreparedStatement pst = cn.prepareStatement(
                    "select license, expiration_date, type_license from license");

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                
                License.getInstance().setLicense(rs.getString(1));
                License.getInstance().setDateExpiration(rs.getString(2));
                License.getInstance().setTypeLicense(rs.getString(3));

            }

            cn.close();

        } catch (SQLException e) {

            System.err.println("¡Error al consultar la licensia del sistema! " + e);

        }

    }
    
    private Calendar CalendarExpiration(){
        
        Calendar dateExpirationCalendar = Calendar.getInstance();
        
        int year = Integer.parseInt(License.getInstance().getDateExpiration().substring(0, 4));
        int month = Integer.parseInt(License.getInstance().getDateExpiration().substring(5,7));
        int day = Integer.parseInt(License.getInstance().getDateExpiration().substring(8,10));
        
        dateExpirationCalendar.set(year, month - 1, day);
        
        return dateExpirationCalendar;
        
    }

    private int calculateDayExpiration() {

        Calendar today = Calendar.getInstance();

        int dayExpiration = 0;

        if (CalendarExpiration().after(today)) {

            long todayMs = today.getTimeInMillis();
            long dateExpriationMs = CalendarExpiration().getTimeInMillis();

            dayExpiration = (int) (Math.abs(todayMs - dateExpriationMs) / (86400000));

        }

        if (CalendarExpiration().before(today)) {

            dayExpiration = - 3;

        }
        
        License.getInstance().setDaysFromExpirate(dayExpiration);

        return dayExpiration;

    }

    public void validateDayEpiration() {

        if (calculateDayExpiration() <= 15 && calculateDayExpiration() > 0) {

            JOptionPane.showMessageDialog(null, "Tu licencia está por expirar pronto \n"
                    + "faltan " + calculateDayExpiration() + " días para que expire.", "Warning", JOptionPane.WARNING_MESSAGE);

        }

        if (calculateDayExpiration() == 0) {
            JOptionPane.showMessageDialog(null, "Tu licencia expira hoy \n"
                    + "por favor contacta a tú proveedor.", "Emergencia", JOptionPane.OK_OPTION);

        }
        
        if(calculateDayExpiration() < 0){
            
            JOptionPane.showMessageDialog(null, "Tu licencia está vencida \n"
                    + "por favor contacta a tú proveedor.", "Emergencia", JOptionPane.OK_OPTION);
            
            System.exit(0);
            
            
        }

    }

}
