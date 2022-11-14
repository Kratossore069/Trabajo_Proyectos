package com.portfolio.EmployeesControl.util.reports;

import java.awt.Color;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.portfolio.EmployeesControl.model.Employee;

public class EmployeeExporterPDF {

    private List<Employee> employeesList;

    public EmployeeExporterPDF(List<Employee> employeesList) {
        super();
        this.employeesList = employeesList;
    }

    private void writeTableHeader(PdfPTable table) {
        PdfPCell celda = new PdfPCell();

        celda.setBackgroundColor(Color.BLUE);
        celda.setPadding(5);

        Font fuente = FontFactory.getFont(FontFactory.HELVETICA);
        fuente.setColor(Color.WHITE);

        celda.setPhrase(new Phrase("ID", fuente));
        table.addCell(celda);

        celda.setPhrase(new Phrase("Nombre", fuente));
        table.addCell(celda);

        celda.setPhrase(new Phrase("Apellido", fuente));
        table.addCell(celda);

        celda.setPhrase(new Phrase("Email", fuente));
        table.addCell(celda);

        celda.setPhrase(new Phrase("Fecha", fuente));
        table.addCell(celda);

        celda.setPhrase(new Phrase("Telefono", fuente));
        table.addCell(celda);

        celda.setPhrase(new Phrase("Sexo", fuente));
        table.addCell(celda);

        celda.setPhrase(new Phrase("Salario", fuente));
        table.addCell(celda);
    }

    private void escribirDatosDeLatable(PdfPTable table) {
        for (Employee Employee : employeesList) {
            table.addCell(String.valueOf(Employee.getId()));
            table.addCell(Employee.getNombre());
            table.addCell(Employee.getApellido());
            table.addCell(Employee.getEmail());
            table.addCell(Employee.getFecha().toString());
            table.addCell(String.valueOf(Employee.getTelefono()));
            table.addCell(Employee.getSexo());
            table.addCell(String.valueOf(Employee.getSalario()));
        }
    }

    public void exportar(HttpServletResponse response) throws DocumentException, IOException {
        Document documento = new Document(PageSize.A4);
        PdfWriter.getInstance(documento, response.getOutputStream());

        documento.open();

        Font fuente = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
        fuente.setColor(Color.BLUE);
        fuente.setSize(18);

        Paragraph titulo = new Paragraph("Lista de Employees", fuente);
        titulo.setAlignment(Paragraph.ALIGN_CENTER);
        documento.add(titulo);

        PdfPTable table = new PdfPTable(8);
        table.setWidthPercentage(100);
        table.setSpacingBefore(15);
        table.setWidths(new float[] { 1f, 2.3f, 2.3f, 6f, 2.9f, 3.5f, 2f, 2.2f });
        table.setWidthPercentage(110);

        writeTableHeader(table);
        escribirDatosDeLatable(table);

        documento.add(table);
        documento.close();
    }
}
