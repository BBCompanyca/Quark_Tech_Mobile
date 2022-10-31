package report.pdf;

import OtherClass.BD_Connection;
import OtherClass.Date;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ReportPDF {

    Date date = new Date();

    BD_Connection connection = new BD_Connection();

    private File ruta;
    private PDF pdf;
    private String time;

    public ReportPDF(File ruta, PDF pdf, String time) {
        this.ruta = ruta;
        this.pdf = pdf;
        this.time = time;

    }

    public void ReportWarranty() {

        Document document = new Document();

        try {

            PdfWriter.getInstance(document, new FileOutputStream(ruta + ".pdf"));

            com.itextpdf.text.Image header = com.itextpdf.text.Image.getInstance(System.getProperty("user.home") + "\\Desktop\\quark_tech_mobile\\images\\BannerPDF2.jpg");
            header.scaleToFit(500, 600);
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

            informationClient.setWidths(widths);

            Paragraph ParagraphName = new Paragraph();
            ParagraphName.setAlignment(Paragraph.ALIGN_RIGHT);
            ParagraphName.setFont(FontFactory.getFont("times new roman", 12, Font.BOLD, BaseColor.BLACK));
            ParagraphName.add(" NOMBRE:");
            informationClient.addCell(ParagraphName);
            informationClient.addCell(" " + pdf.getNameClient());

            Paragraph ParagraphIndentity = new Paragraph();
            ParagraphIndentity.setAlignment(Paragraph.ALIGN_RIGHT);
            ParagraphIndentity.setFont(FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK));
            ParagraphIndentity.add(" CÉDULA O RIF:");
            informationClient.addCell(ParagraphIndentity);
            informationClient.addCell(" " + pdf.getIdentityClient());

            Paragraph ParagraphAtencion = new Paragraph();
            ParagraphAtencion.setAlignment(Paragraph.ALIGN_RIGHT);
            ParagraphAtencion.setFont(FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK));
            ParagraphAtencion.add(" DIRECCIÓN:");
            informationClient.addCell(ParagraphAtencion);
            informationClient.addCell(" " + pdf.getDirectionClient());

            Paragraph ParagraphDatePurchase = new Paragraph();
            ParagraphDatePurchase.setAlignment(Paragraph.ALIGN_RIGHT);
            ParagraphDatePurchase.setFont(FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK));
            ParagraphDatePurchase.add(" FECHA DE COMPRA:");
            informationClient.addCell(ParagraphDatePurchase);
            informationClient.addCell(date.DatePurchaseEquipo(pdf.getDatePurchase()));

            document.add(informationClient);

            Paragraph ParagraphEquipo = new Paragraph();
            ParagraphEquipo.setAlignment(Paragraph.ALIGN_LEFT);
            ParagraphEquipo.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK));
            ParagraphEquipo.add("\n \nEQUIPO: ");
            ParagraphEquipo.setFont(FontFactory.getFont("Arial", 12, Font.NORMAL, BaseColor.BLACK));
            ParagraphEquipo.add(pdf.getBrand() + " " + pdf.getModel() + " " + pdf.getColor());
            document.add(ParagraphEquipo);

            Paragraph ParagraphSerial = new Paragraph();
            ParagraphSerial.setAlignment(Paragraph.ALIGN_LEFT);
            ParagraphSerial.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK));
            ParagraphSerial.add("\nSERIAL: ");
            ParagraphSerial.setFont(FontFactory.getFont("Arial", 12, Font.NORMAL, BaseColor.BLACK));
            ParagraphSerial.add(pdf.getSerial());
            document.add(ParagraphSerial);

            Paragraph ParagraphReceived = new Paragraph();
            ParagraphReceived.setAlignment(Paragraph.ALIGN_LEFT);
            ParagraphReceived.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK));
            ParagraphReceived.add("\nSE RECIBE CON: ");
            ParagraphReceived.setFont(FontFactory.getFont("Arial", 12, Font.NORMAL, BaseColor.BLACK));
            ParagraphReceived.add(pdf.getReceived());
            document.add(ParagraphReceived);

            Paragraph ParagraphFalla = new Paragraph();
            ParagraphFalla.setAlignment(Paragraph.ALIGN_LEFT);
            ParagraphFalla.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK));
            ParagraphFalla.add("\nFALLA: ");
            ParagraphFalla.setFont(FontFactory.getFont("Arial", 12, Font.NORMAL, BaseColor.BLACK));
            ParagraphFalla.add(pdf.getFalla());
            document.add(ParagraphFalla);

            Paragraph ParagraphTimeWarranty = new Paragraph();
            ParagraphTimeWarranty.setAlignment(Paragraph.ALIGN_LEFT);
            ParagraphTimeWarranty.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK));
            ParagraphTimeWarranty.add("\nTIEMPO DE GARANTÍA " + "(" + pdf.getDayWarranty() + " DIAS): ");
            ParagraphTimeWarranty.setFont(FontFactory.getFont("Arial", 12, Font.NORMAL, BaseColor.BLACK));
            ParagraphTimeWarranty.add(time);
            document.add(ParagraphTimeWarranty);

            if (!pdf.getCommentsTechnical().equals("")) {

                Paragraph ParagraphCommets_Technical = new Paragraph();
                ParagraphCommets_Technical.setAlignment(Paragraph.ALIGN_LEFT);
                ParagraphCommets_Technical.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK));
                ParagraphCommets_Technical.add("\nOBSERVACIÓN TÉCNICA: ");
                ParagraphCommets_Technical.setFont(FontFactory.getFont("Arial", 12, Font.NORMAL, BaseColor.BLACK));
                ParagraphCommets_Technical.add(pdf.getCommentsTechnical());
                document.add(ParagraphCommets_Technical);

                Paragraph ParagraphStatus_Technical = new Paragraph();
                ParagraphStatus_Technical.setAlignment(Paragraph.ALIGN_LEFT);
                ParagraphStatus_Technical.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK));
                ParagraphStatus_Technical.add("\n(" + pdf.getStatusTechnical() + ")");
                document.add(ParagraphStatus_Technical);

            }

            document.close();

            JOptionPane.showMessageDialog(null, "Reporte Creado Correctamente...");

        } catch (DocumentException | IOException e) {

            System.err.println("¡Error al generar reporte! " + e);
            JOptionPane.showMessageDialog(null, "Error Al Generar Reporte.", "¡Error!", JOptionPane.OK_OPTION);

        }

    }
}
