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
import javax.swing.JOptionPane;

public class ReportsPDF implements Runnable {

    Date date = new Date();

    int ID;
    File ruta;
    String brand, model, serial, received, falla, time, comments_technical, status_technical;

    public ReportsPDF(File fichero, int ID, String brand, String model, String serial, String received, String falla, String time, String comments_technical, String status_technical) {

        this.ID = ID;
        this.ruta = fichero;
        this.brand = brand;
        this.model = model;
        this.serial = serial;
        this.received = received;
        this.falla = falla;
        this.time = time;
        this.comments_technical = comments_technical;
        this.status_technical = status_technical;

    }

    @Override
    public void run() {

        ReportWarranty();

    }

    public void ReportWarranty() {

        Document document = new Document();

        try {

            PdfWriter.getInstance(document, new FileOutputStream(ruta + ".pdf"));

            com.itextpdf.text.Image header = com.itextpdf.text.Image.getInstance(System.getProperty("user.home") + "\\Desktop\\quark_tech_mobile\\images\\BannerPDF2.jpg");
            header.scaleToFit(600, 700);
            header.setAlignment(Chunk.ALIGN_CENTER);

            Paragraph fechaActual = new Paragraph();
            fechaActual.setAlignment(Paragraph.ALIGN_RIGHT);
            fechaActual.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK));
            fechaActual.add("FECHA: " + date.DateToDay());

            Paragraph title = new Paragraph();
            title.setAlignment(Paragraph.ALIGN_CENTER);
            title.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK));
            title.add("REPORTE DE REVISIÓN \n \n");

            document.open();
            document.add(header);
            document.add(fechaActual);
            document.add(title);

            PdfPTable informationClient = new PdfPTable(2);

            float[] widths = new float[]{1.5f, 2f};

            try {

                Connection cn = BD_Connection.connection();
                PreparedStatement pst = cn.prepareStatement(
                        "select c.name_client, c.identity_card_client, c.direction_client, w.date_purchase from warranty w join client c on "
                        + "c.id_client = w.id_client and w.id_warranty = '" + ID + "'");

                ResultSet rs = pst.executeQuery();

                if (rs.next()) {

                    do {

                        informationClient.setWidths(widths);

                        Paragraph ParagraphName = new Paragraph();
                        ParagraphName.setAlignment(Paragraph.ALIGN_RIGHT);
                        ParagraphName.setFont(FontFactory.getFont("times new roman", 12, Font.BOLD, BaseColor.BLACK));
                        ParagraphName.add(" NOMBRE:");
                        informationClient.addCell(ParagraphName);
                        informationClient.addCell(" " + rs.getString(1));

                        Paragraph ParagraphIndentity = new Paragraph();
                        ParagraphIndentity.setAlignment(Paragraph.ALIGN_RIGHT);
                        ParagraphIndentity.setFont(FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK));
                        ParagraphIndentity.add(" CÉDULA O RIF:");
                        informationClient.addCell(ParagraphIndentity);
                        informationClient.addCell(" " + rs.getString(2));

                        Paragraph ParagraphAtencion = new Paragraph();
                        ParagraphAtencion.setAlignment(Paragraph.ALIGN_RIGHT);
                        ParagraphAtencion.setFont(FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK));
                        ParagraphAtencion.add(" DIRECCIÓN:");
                        informationClient.addCell(ParagraphAtencion);
                        informationClient.addCell(" " + rs.getString(3));

                        Paragraph ParagraphDatePurchase = new Paragraph();
                        ParagraphDatePurchase.setAlignment(Paragraph.ALIGN_RIGHT);
                        ParagraphDatePurchase.setFont(FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK));
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
            ParagraphEquipo.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK));
            ParagraphEquipo.add("\n \n               EQUIPO: ");
            ParagraphEquipo.setFont(FontFactory.getFont("Arial", 12, Font.NORMAL, BaseColor.BLACK));
            ParagraphEquipo.add(brand + " " + model);
            document.add(ParagraphEquipo);

            Paragraph ParagraphSerial = new Paragraph();
            ParagraphSerial.setAlignment(Paragraph.ALIGN_LEFT);
            ParagraphSerial.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK));
            ParagraphSerial.add("\n               SERIAL: ");
            ParagraphSerial.setFont(FontFactory.getFont("Arial", 12, Font.NORMAL, BaseColor.BLACK));
            ParagraphSerial.add(serial);
            document.add(ParagraphSerial);

            Paragraph ParagraphReceived = new Paragraph();
            ParagraphReceived.setAlignment(Paragraph.ALIGN_LEFT);
            ParagraphReceived.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK));
            ParagraphReceived.add("\n               SE RECIBE CON: ");
            ParagraphReceived.setFont(FontFactory.getFont("Arial", 12, Font.NORMAL, BaseColor.BLACK));
            ParagraphReceived.add(received);
            document.add(ParagraphReceived);

            Paragraph ParagraphFalla = new Paragraph();
            ParagraphFalla.setAlignment(Paragraph.ALIGN_LEFT);
            ParagraphFalla.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK));
            ParagraphFalla.add("\n               FALLA: ");
            ParagraphFalla.setFont(FontFactory.getFont("Arial", 12, Font.NORMAL, BaseColor.BLACK));
            ParagraphFalla.add(falla);
            document.add(ParagraphFalla);

            try {

                //Consulta al servidor de la cantidad de días de garantía del equipo...
                Connection cn2 = BD_Connection.connection();
                PreparedStatement pst2 = cn2.prepareStatement("select day_warranty from warranty where id_warranty = '" + ID + "'");

                ResultSet rs2 = pst2.executeQuery();

                if (rs2.next()) {

                    //Resultado de la consulta...
                    String day_warrantyEquipo = rs2.getString("day_warranty");

                    Paragraph ParagraphTimeWarranty = new Paragraph();
                    ParagraphTimeWarranty.setAlignment(Paragraph.ALIGN_LEFT);
                    ParagraphTimeWarranty.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK));
                    ParagraphTimeWarranty.add("\n               TIEMPO DE GARANTÍA " + "(" + day_warrantyEquipo + " DIAS): ");
                    ParagraphTimeWarranty.setFont(FontFactory.getFont("Arial", 12, Font.NORMAL, BaseColor.BLACK));
                    ParagraphTimeWarranty.add(time);
                    document.add(ParagraphTimeWarranty);

                }

                cn2.close();

            } catch (SQLException e) {

                System.err.println("¡Error al calular los días de garantía del equipo! " + e);

            }

            if (!comments_technical.equals("")) {

                Paragraph ParagraphCommets_Technical = new Paragraph();
                ParagraphCommets_Technical.setAlignment(Paragraph.ALIGN_LEFT);
                ParagraphCommets_Technical.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK));
                ParagraphCommets_Technical.add("\n               OBSERVACIÓN TÉCNICA: ");
                ParagraphCommets_Technical.setFont(FontFactory.getFont("Arial", 12, Font.NORMAL, BaseColor.BLACK));
                ParagraphCommets_Technical.add(comments_technical);
                document.add(ParagraphCommets_Technical);

                Paragraph ParagraphStatus_Technical = new Paragraph();
                ParagraphStatus_Technical.setAlignment(Paragraph.ALIGN_LEFT);
                ParagraphStatus_Technical.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK));
                ParagraphStatus_Technical.add("\n               (" + status_technical + ")");
                document.add(ParagraphStatus_Technical);

            }

            document.close();

            JOptionPane.showMessageDialog(null, "Reporte Creado Correctamente...");

        } catch (Exception e) {

            System.err.println("¡Error al generar reporte! " + e);
            JOptionPane.showMessageDialog(null, "Error Al Generar Reporte.", "¡Error!", JOptionPane.OK_OPTION);

        }

    }

}
