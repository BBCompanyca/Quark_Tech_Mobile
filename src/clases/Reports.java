package clases;

import java.sql.*;
import clases.BD_Connection;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import clases.Date;

public class Reports {

    Date date = new Date();

    public void ReportWarranty(File Ruta, int ID, String code, String equipo, String serial, String falla, String received, String time) {

        Document document = new Document();

        try {

            //String rutaa = System.getProperty("user.home");
            PdfWriter.getInstance(document, new FileOutputStream(Ruta + ".pdf"));

            com.itextpdf.text.Image header = com.itextpdf.text.Image.getInstance("src/images/BannerPDF.jpg");
            header.scaleToFit(650, 800);
            header.setAlignment(Chunk.ALIGN_CENTER);

            Paragraph fechaActual = new Paragraph();
            fechaActual.setAlignment(Paragraph.ALIGN_RIGHT);
            fechaActual.setFont(FontFactory.getFont("Roboto", 12, Font.BOLD, BaseColor.BLACK));
            fechaActual.add("FECHA: " + date.DateToDay());

            Paragraph title = new Paragraph();
            title.setAlignment(Paragraph.ALIGN_CENTER);
            title.setFont(FontFactory.getFont("Roboto", 14, Font.BOLD, BaseColor.BLACK));
            title.add("REPORTE DE REVISIÓN \n \n");

            document.open();
            document.add(header);
            document.add(fechaActual);
            document.add(title);

            PdfPTable informationClient = new PdfPTable(2);

            float[] widths = new float[]{1f, 2f};

            try {

                Connection cn = BD_Connection.connection();
                PreparedStatement pst = cn.prepareStatement(
                        "select name_client, identity_card_client, name_client, date_purchase from warranty where id_warranty = '" + ID + "'");

                ResultSet rs = pst.executeQuery();

                if (rs.next()) {

                    do {

                        informationClient.setWidths(widths);

                        Paragraph ParagraphName = new Paragraph();
                        ParagraphName.setAlignment(Paragraph.ALIGN_RIGHT);
                        ParagraphName.setFont(FontFactory.getFont("Roboto", 12, Font.BOLD, BaseColor.BLACK));
                        ParagraphName.add(" NOMBRE");
                        informationClient.addCell(ParagraphName);
                        informationClient.addCell(" " + rs.getString(1));

                        Paragraph ParagraphIndentity = new Paragraph();
                        ParagraphIndentity.setAlignment(Paragraph.ALIGN_RIGHT);
                        ParagraphIndentity.setFont(FontFactory.getFont("Roboto", 12, Font.BOLD, BaseColor.BLACK));
                        ParagraphIndentity.add(" CÉDULA:");
                        informationClient.addCell(ParagraphIndentity);
                        informationClient.addCell(" " + rs.getString(2));
                        
                        Paragraph ParagraphAtencion = new Paragraph();
                        ParagraphAtencion.setAlignment(Paragraph.ALIGN_RIGHT);
                        ParagraphAtencion.setFont(FontFactory.getFont("Roboto", 12, Font.BOLD, BaseColor.BLACK));
                        ParagraphAtencion.add(" ATENCIÓN:");
                        informationClient.addCell(ParagraphAtencion);
                        informationClient.addCell(" " + rs.getString(3));
                        
                        Paragraph ParagraphDatePurchase = new Paragraph();
                        ParagraphDatePurchase.setAlignment(Paragraph.ALIGN_RIGHT);
                        ParagraphDatePurchase.setFont(FontFactory.getFont("Roboto", 12, Font.BOLD, BaseColor.BLACK));
                        ParagraphDatePurchase.add(" FECHA DE COMPRA:");
                        informationClient.addCell(ParagraphDatePurchase);
                        informationClient.addCell(date.DatePurchaseEquipo(rs.getString(4)));

                    } while (rs.next());

                    document.add(informationClient);

                }

                cn.close();

            } catch (SQLException e) {

                System.err.println("¡Error al llenar la tabla! " + e);

            }

            Paragraph ParagraphEquipo = new Paragraph();
            ParagraphEquipo.setAlignment(Paragraph.ALIGN_LEFT);
            ParagraphEquipo.setFont(FontFactory.getFont("Roboto", 12, Font.BOLD, BaseColor.BLACK));
            ParagraphEquipo.add("\n \n EQUIPO: ");
            ParagraphEquipo.setFont(FontFactory.getFont("Roboto", 12, Font.NORMAL, BaseColor.BLACK));
            ParagraphEquipo.add(equipo);
            document.add(ParagraphEquipo);

            Paragraph ParagraphSerial = new Paragraph();
            ParagraphSerial.setAlignment(Paragraph.ALIGN_LEFT);
            ParagraphSerial.setFont(FontFactory.getFont("Roboto", 12, Font.BOLD, BaseColor.BLACK));
            ParagraphSerial.add("\n SERIAL: ");
            ParagraphSerial.setFont(FontFactory.getFont("Roboto", 12, Font.NORMAL, BaseColor.BLACK));
            ParagraphSerial.add(serial);
            document.add(ParagraphSerial);

            Paragraph ParagraphReceived = new Paragraph();
            ParagraphReceived.setAlignment(Paragraph.ALIGN_LEFT);
            ParagraphReceived.setFont(FontFactory.getFont("Roboto", 12, Font.BOLD, BaseColor.BLACK));
            ParagraphReceived.add("\n SE RECIBE CON: ");
            ParagraphReceived.setFont(FontFactory.getFont("Roboto", 12, Font.NORMAL, BaseColor.BLACK));
            ParagraphReceived.add(received);
            document.add(ParagraphReceived);

            Paragraph ParagraphFalla = new Paragraph();
            ParagraphFalla.setAlignment(Paragraph.ALIGN_LEFT);
            ParagraphFalla.setFont(FontFactory.getFont("Roboto", 12, Font.BOLD, BaseColor.BLACK));
            ParagraphFalla.add("\n FALLA: ");
            ParagraphFalla.setFont(FontFactory.getFont("Roboto", 12, Font.NORMAL, BaseColor.BLACK));
            ParagraphFalla.add(falla + ".");
            document.add(ParagraphFalla);

            try {

                //Consulta al servidor de la cantidad de días de garantía del equipo...
                Connection cn2 = BD_Connection.connection();
                PreparedStatement pst2 = cn2.prepareStatement("select day_warranty from equipo where code = '" + code + "'");

                ResultSet rs2 = pst2.executeQuery();

                if (rs2.next()) {

                    //Resultado de la consulta...
                    String day_warrantyEquipo = rs2.getString("day_warranty");

                    //Vista del usuario con formato de los días de garantía del equipo...
                    Paragraph ParagraphTimeWarranty = new Paragraph();
                    ParagraphTimeWarranty.setAlignment(Paragraph.ALIGN_LEFT);
                    ParagraphTimeWarranty.setFont(FontFactory.getFont("Roboto", 12, Font.BOLD, BaseColor.BLACK));
                    ParagraphTimeWarranty.add("\n TIEMPO DE GARANTÍA " + "(" + day_warrantyEquipo + " DIAS): ");
                    ParagraphTimeWarranty.setFont(FontFactory.getFont("Roboto", 12, Font.NORMAL, BaseColor.BLACK));
                    ParagraphTimeWarranty.add(time);
                    document.add(ParagraphTimeWarranty);

                }

                cn2.close();

            } catch (SQLException e) {

                System.err.println("¡Error al calular los días de garantía del equipo! " + e);

            }

            document.close();

        } catch (Exception e) {
        }

    }

}
