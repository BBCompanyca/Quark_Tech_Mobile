package clases;

import java.sql.*;
import clases.BD_Connection;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;

public class Reports {

    public void ReportWarranty(int ID, File Ruta, String fecha) {

        Document document = new Document();

        try {

            //String rutaa = System.getProperty("user.home");
            PdfWriter.getInstance(document, new FileOutputStream(Ruta + ".pdf"));

            com.itextpdf.text.Image header = com.itextpdf.text.Image.getInstance("src/images/BannerPDF.jpg");
            header.scaleToFit(650, 1000);
            header.setAlignment(Chunk.ALIGN_CENTER);

            Paragraph fechaActual = new Paragraph();
            fechaActual.setAlignment(Paragraph.ALIGN_RIGHT);
            fechaActual.add("Fecha: " + fecha);
            fechaActual.setFont(FontFactory.getFont("Tahoma", 14, Font.BOLD, BaseColor.DARK_GRAY));

            Paragraph title = new Paragraph();
            title.setAlignment(Paragraph.ALIGN_CENTER);
            title.add("REPORTE DE REVISIÓN \n \n");
            title.setFont(FontFactory.getFont("Tahoma", 14, Font.BOLD, BaseColor.DARK_GRAY));

            document.open();
            document.add(header);
            document.add(fechaActual);
            document.add(title);

            PdfPTable informationClient = new PdfPTable(2);
            

            try {

                Connection cn = BD_Connection.connection();
                PreparedStatement pst = cn.prepareStatement(
                        "select name_client, identity_card_client, name_client, date_purchase from warranty where id_warranty = '" + ID + "'");

                ResultSet rs = pst.executeQuery();

                if (rs.next()) {

                    do {
                        
                        informationClient.addCell("Nombre:");
                        informationClient.addCell(rs.getString(1));
                        informationClient.addCell("Cédula");
                        informationClient.addCell(rs.getString(2));
                        informationClient.addCell("Atención:");
                        informationClient.addCell(rs.getString(3));
                        informationClient.addCell("Fecha De Compra:");
                        informationClient.addCell(rs.getString(4));

                    } while (rs.next());

                    document.add(informationClient);

                }

            } catch (SQLException e) {

                System.err.println("¡Error al llenar la tabla! " + e);

            }

            document.close();

        } catch (Exception e) {
        }

    }

}
