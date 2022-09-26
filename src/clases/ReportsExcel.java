package clases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import login.Login;

public class ReportsExcel implements Runnable {

    String search, shop, desde, hasta;
    File fichero;

    public ReportsExcel(File fichero, String search, String shop, String desde, String hasta) {

        this.search = search;
        this.shop = shop;
        this.desde = desde;
        this.hasta = hasta;
        this.fichero = fichero;

    }

    @Override
    public void run() {

        GenerateReport();

    }

    public String Query() {
        String query = "";

        if (Login.type_account.equals("Moderador")) {

            if (shop.equals("Todos") && search.equals("")) {

                query = "select m.id_movimiento, m.operation, m.fecha_format, u.username, m.referencia, m.shop from movimientos m "
                        + "join user u on u.id_user = m.id_user and m.fecha between '" + desde + "' and '" + hasta + "'";

            } else if (shop.equals("Todos") && !search.equals("")) {

                query = "select m.id_movimiento, m.operation, m.fecha_format, u.username, m.referencia, m.shop from movimientos m "
                        + "join user u on u.id_user = m.id_user and u.username = '" + search + "' and m.fecha between '" + desde + "' and '" + hasta + "'";

            } else if (!shop.equals("Todos") && search.equals("")) {

                query = "select m.id_movimiento, m.operation, m.fecha_format, u.username, m.referencia, m.shop from movimientos m "
                        + "join user u on u.id_user = m.id_user and shop = '" + shop + "' and m.fecha between '" + desde + "' and '" + hasta + "'";

            } else {

                query = "select m.id_movimiento, m.operation, m.fecha_format, u.username, m.referencia, m.shop from movimientos m "
                        + "join user u on u.id_user = m.id_user and shop = '" + shop + "' and u.username = '" + search + "' "
                        + "and m.fecha between '" + desde + "' and '" + hasta + "'";

            }

        } else {

            if (search.isEmpty()) {

                query = "select m.id_movimiento, m.operation, m.fecha_format, u.username, m.referencia from movimientos m "
                        + "join user u on u.id_user = m.id_user and shop = '" + Login.direction + "' "
                        + "and m.fecha between '" + desde + "' and '" + hasta + "'";

            } else {

                query = "select m.id_movimiento, m.operation, m.fecha_format, u.username, m.referencia from movimientos m "
                        + "join user u on u.id_user = m.id_user and shop = '" + Login.direction + "' and u.username = '" + search + "' "
                        + "and m.fecha between '" + desde + "' and '" + hasta + "'";

            }

        }

        return query;

    }

    public void GenerateReport() {

        if (Login.type_account.equals("Moderador")) {

            Workbook book = new XSSFWorkbook();
            Sheet sheet = book.createSheet("Movimientos");

            CellStyle StyleCabezera = book.createCellStyle();
            StyleCabezera.setAlignment(HorizontalAlignment.CENTER);
            StyleCabezera.setVerticalAlignment(VerticalAlignment.CENTER);
            StyleCabezera.setBorderTop(BorderStyle.THIN);
            StyleCabezera.setBorderRight(BorderStyle.THIN);
            StyleCabezera.setBorderBottom(BorderStyle.THIN);
            StyleCabezera.setBorderLeft(BorderStyle.THIN);

            Font FontCabezera = book.createFont();
            FontCabezera.setBold(true);

            StyleCabezera.setFont(FontCabezera);

            Row cabezera = sheet.createRow(4);

            Cell celdaID = cabezera.createCell(3);
            celdaID.setCellValue("ID");
            celdaID.setCellStyle(StyleCabezera);

            Cell celdaOperation = cabezera.createCell(4);
            celdaOperation.setCellValue("OPERACIÓN");
            celdaOperation.setCellStyle(StyleCabezera);

            Cell celdaFecha = cabezera.createCell(5);
            celdaFecha.setCellValue("FECHA");
            celdaFecha.setCellStyle(StyleCabezera);

            Cell celdaUsuario = cabezera.createCell(6);
            celdaUsuario.setCellValue("USUARIO");
            celdaUsuario.setCellStyle(StyleCabezera);

            Cell celdaReferencia = cabezera.createCell(7);
            celdaReferencia.setCellValue("REFERENCIA");
            celdaReferencia.setCellStyle(StyleCabezera);

            Cell celdaTienda = cabezera.createCell(8);
            celdaTienda.setCellValue("TIENDA");
            celdaTienda.setCellStyle(StyleCabezera);

            int fila = 5;

            CellStyle StyleTable = book.createCellStyle();
            StyleTable.setBorderTop(BorderStyle.THIN);
            StyleTable.setBorderRight(BorderStyle.THIN);
            StyleTable.setBorderBottom(BorderStyle.THIN);
            StyleTable.setBorderLeft(BorderStyle.THIN);
            StyleTable.setAlignment(HorizontalAlignment.CENTER);
            StyleTable.setVerticalAlignment(VerticalAlignment.CENTER);

            try {

                Connection cn = BD_Connection.connection();
                PreparedStatement pst = cn.prepareStatement(Query());

                ResultSet rs = pst.executeQuery();

                int numColumn = rs.getMetaData().getColumnCount();

                while (rs.next()) {

                    Row filaTable = sheet.createRow(fila);

                    for (int i = 0; i < numColumn; i++) {

                        Cell celdasTable = filaTable.createCell(i + 3);
                        celdasTable.setCellStyle(StyleTable);

                        celdasTable.setCellValue(rs.getString(i + 1));

                    }

                    fila++;

                }

                JOptionPane.showMessageDialog(null, "¡Reporte Generado Con Exito!");

                cn.close();

            } catch (SQLException e) {

                System.err.println("¡Error en generar reporte de Excel " + e);
                JOptionPane.showMessageDialog(null, "¡Error al generar reporte de Excel!", "¡Error!", JOptionPane.OK_OPTION);

            }

            try {
                FileOutputStream out = new FileOutputStream(fichero + ".xlsx");
                try {
                    book.write(out);
                    out.close();
                } catch (IOException ex) {
                    System.out.println("¡Error en el segundo catch " + ex);
                }
            } catch (FileNotFoundException ex) {
                System.out.println("¡Error en el primer catch " + ex);
            }

        } else if (Login.type_account.equals("Administrador")) {

            Workbook book = new XSSFWorkbook();
            Sheet sheet = book.createSheet("Movimientos");

            CellStyle StyleCabezera = book.createCellStyle();
            StyleCabezera.setAlignment(HorizontalAlignment.CENTER);
            StyleCabezera.setVerticalAlignment(VerticalAlignment.CENTER);
            StyleCabezera.setBorderTop(BorderStyle.THIN);
            StyleCabezera.setBorderRight(BorderStyle.THIN);
            StyleCabezera.setBorderBottom(BorderStyle.THIN);
            StyleCabezera.setBorderLeft(BorderStyle.THIN);

            Font FontCabezera = book.createFont();
            FontCabezera.setBold(true);

            StyleCabezera.setFont(FontCabezera);

            Row cabezera = sheet.createRow(4);

            Cell celdaID = cabezera.createCell(3);
            celdaID.setCellValue("ID");
            celdaID.setCellStyle(StyleCabezera);

            Cell celdaOperation = cabezera.createCell(4);
            celdaOperation.setCellValue("OPERACIÓN");
            celdaOperation.setCellStyle(StyleCabezera);

            Cell celdaFecha = cabezera.createCell(5);
            celdaFecha.setCellValue("FECHA");
            celdaFecha.setCellStyle(StyleCabezera);

            Cell celdaUsuario = cabezera.createCell(6);
            celdaUsuario.setCellValue("USUARIO");
            celdaUsuario.setCellStyle(StyleCabezera);

            Cell celdaReferencia = cabezera.createCell(7);
            celdaReferencia.setCellValue("REFERENCIA");
            celdaReferencia.setCellStyle(StyleCabezera);

            int fila = 5;

            CellStyle StyleTable = book.createCellStyle();
            StyleTable.setBorderTop(BorderStyle.THIN);
            StyleTable.setBorderRight(BorderStyle.THIN);
            StyleTable.setBorderBottom(BorderStyle.THIN);
            StyleTable.setBorderLeft(BorderStyle.THIN);
            StyleTable.setAlignment(HorizontalAlignment.CENTER);
            StyleTable.setVerticalAlignment(VerticalAlignment.CENTER);

            try {

                Connection cn = BD_Connection.connection();
                PreparedStatement pst = cn.prepareStatement(Query());

                ResultSet rs = pst.executeQuery();

                int numColumn = rs.getMetaData().getColumnCount();

                while (rs.next()) {

                    Row filaTable = sheet.createRow(fila);

                    for (int i = 0; i < numColumn; i++) {

                        Cell celdasTable = filaTable.createCell(i + 3);
                        celdasTable.setCellStyle(StyleTable);

                        celdasTable.setCellValue(rs.getString(i + 1));

                    }

                    fila++;

                }

                JOptionPane.showMessageDialog(null, "¡Reporte Generado Con Exito!");

                cn.close();

            } catch (SQLException e) {

                System.err.println("¡Error en generar reporte de Excel " + e);
                JOptionPane.showMessageDialog(null, "¡Error al generar reporte de Excel!", "¡Error!", JOptionPane.OK_OPTION);

            }

            try {
                FileOutputStream out = new FileOutputStream(fichero + ".xlsx");
                try {
                    book.write(out);
                    out.close();
                } catch (IOException ex) {
                    System.out.println("¡Error en el segundo catch " + ex);
                }
            } catch (FileNotFoundException ex) {
                System.out.println("¡Error en el primer catch " + ex);
            }

        }

    }

}
