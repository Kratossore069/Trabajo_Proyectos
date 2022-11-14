package com.portfolio.EmployeesControl.util.reports;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import com.portfolio.EmployeesControl.model.Employee;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class EmployeeExporterExcel {

    private XSSFWorkbook book;
    private XSSFSheet page;

    private List<Employee> employeeList;

    public EmployeeExporterExcel(List<Employee> employeeList) {
        this.employeeList = employeeList;
        book = new XSSFWorkbook();
        page = book.createSheet("Employees");
    }

    private void writeTableHeader() {
        Row row = page.createRow(0);

        CellStyle style = book.createCellStyle();
        XSSFFont font = book.createFont();
        font.setBold(true);
        font.setFontHeight(16);
        style.setFont(font);

        Cell cell = row.createCell(0);
        cell.setCellValue("ID");
        cell.setCellStyle(style);

        cell = row.createCell(1);
        cell.setCellValue("Name");
        cell.setCellStyle(style);

        cell = row.createCell(2);
        cell.setCellValue("LastName");
        cell.setCellStyle(style);

        cell = row.createCell(3);
        cell.setCellValue("Email");
        cell.setCellStyle(style);

        cell = row.createCell(4);
        cell.setCellValue("Date");
        cell.setCellStyle(style);

        cell = row.createCell(5);
        cell.setCellValue("Phone");
        cell.setCellStyle(style);

        cell = row.createCell(6);
        cell.setCellValue("Gender");
        cell.setCellStyle(style);

        cell = row.createCell(7);
        cell.setCellValue("Salary");
        cell.setCellStyle(style);
    }

    private void writeTableData() {
        int rowsNumber = 1;

        CellStyle style = book.createCellStyle();
        XSSFFont font = book.createFont();
        font.setFontHeight(14);
        style.setFont(font);

        for(Employee employee : employeeList) {
            Row row = page.createRow(rowsNumber ++);

            Cell cell = row.createCell(0);
            cell.setCellValue(employee.getId());
            page.autoSizeColumn(0);
            cell.setCellStyle(style);

            cell = row.createCell(1);
            cell.setCellValue(employee.getName());
            page.autoSizeColumn(1);
            cell.setCellStyle(style);

            cell = row.createCell(2);
            cell.setCellValue(employee.getLastname());
            page.autoSizeColumn(2);
            cell.setCellStyle(style);

            cell = row.createCell(3);
            cell.setCellValue(employee.getEmail());
            page.autoSizeColumn(3);
            cell.setCellStyle(style);

            cell = row.createCell(4);
            cell.setCellValue(employee.getDate().toString());
            page.autoSizeColumn(4);
            cell.setCellStyle(style);

            cell = row.createCell(5);
            cell.setCellValue(employee.getPhone());
            page.autoSizeColumn(5);
            cell.setCellStyle(style);

            cell = row.createCell(6);
            cell.setCellValue(employee.getGender());
            page.autoSizeColumn(6);
            cell.setCellStyle(style);

            cell = row.createCell(7);
            cell.setCellValue(employee.getSalary());
            page.autoSizeColumn(7);
            cell.setCellStyle(style);
        }
    }

    public void export(HttpServletResponse response) throws IOException {
        writeTableHeader();
        writeTableData();

        ServletOutputStream outPutStream = response.getOutputStream();
        book.write(outPutStream);

        book.close();
        outPutStream.close();
    }
}
