package report.pdf;

import OtherClass.BD_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class getInfoPDF implements Runnable {

    private int warrantyID;
    private static PDF pdf;

    BD_Connection connection = new BD_Connection();

    public getInfoPDF(int warrantyID) {
        this.warrantyID = warrantyID;
    }

    @Override
    public void run() {
        setPdf(null);
        getInfoPDF();
    }

    private void getInfoPDF() {

        try {

            Connection cn = connection.connection();
            PreparedStatement pst = cn.prepareStatement(
                    "select e.brand, e.model, e.color, w.serial, w.received, w.falla, w.comments_technical, "
                    + "w.status_technical, c.name_client, c.identity_card_client, c.direction_client, "
                    + "c.telephone_client, w.date_purchase, w.day_warranty, w.shop "
                    + "from warranty w "
                    + "join client c on c.id_client = w.id_client and w.id_warranty = '" + warrantyID + "' "
                    + "join equipo e on e.id_equipo = w.id_equipo and w.id_warranty = '" + warrantyID + "'");

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                PDF pdf = new PDF(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),
                        rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), 
                rs.getString(15));

                setPdf(pdf);
            }

            cn.close();

        } catch (SQLException e) {

            System.err.println("¡Error al rellenar el PDF! " + e);

        }

    }

    public void setPdf(PDF pdf) {
        this.pdf = pdf;
    }

    public static PDF getPdf() {
        return pdf;
    }

}
