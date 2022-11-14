package com.portfolio.EmployeesControl.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import com.portfolio.EmployeesControl.model.Employee;
import com.portfolio.EmployeesControl.service.EmployeeService;
import com.portfolio.EmployeesControl.util.pagination.PageRender;
import com.portfolio.EmployeesControl.util.reports.EmployeeExporterExcel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.lowagie.text.DocumentException;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/ver/{id}")
    public String verDetallesDelEmployee(@PathVariable(value = "id") Long id,Map<String,Object> modelo,RedirectAttributes flash) {
        Employee employee = employeeService.findOne(id);
        if(employee == null) {
            flash.addFlashAttribute("error", "Employee does not exists");
            return "redirect:/listar";
        }

        modelo.put("employee",employee);
        modelo.put("titulo", "Employee details " + employee.getName());
        return "ver";
    }

    @GetMapping({"/","/listar",""})
    public String listarEmployees(@RequestParam(name = "page",defaultValue = "0") int page,Model modelo) {
        Pageable pageRequest = PageRequest.of(page, 4);
        Page<Employee> Employees = employeeService.findAll(pageRequest);
        PageRender<Employee> pageRender = new PageRender<>("/listar", Employees);

        modelo.addAttribute("titulo","List of employees");
        modelo.addAttribute("employees",Employees);
        modelo.addAttribute("page", pageRender);

        return "listar";
    }

    @GetMapping("/form")
    public String mostrarFormularioDeRegistrarCliente(Map<String,Object> modelo) {
        Employee Employee = new Employee();
        modelo.put("Employee", Employee);
        modelo.put("titulo", "Registro de Employees");
        return "form";
    }

    @PostMapping("/form")
    public String guardarEmployee(@Valid Employee Employee,BindingResult result,Model modelo,RedirectAttributes flash,SessionStatus status) {
        if(result.hasErrors()) {
            modelo.addAttribute("titulo", "Registro de cliente");
            return "form";
        }

        String mensaje = (Employee.getId() != null) ? "El Employee ha sido editato con exito" : "Employee registrado con exito";

        employeeService.save(Employee);
        status.setComplete();
        flash.addFlashAttribute("success", mensaje);
        return "redirect:/listar";
    }

    @GetMapping("/form/{id}")
    public String editarEmployee(@PathVariable(value = "id") Long id,Map<String, Object> modelo,RedirectAttributes flash) {
        Employee Employee = null;
        if(id > 0) {
            Employee = employeeService.findOne(id);
            if(Employee == null) {
                flash.addFlashAttribute("error", "El ID del Employee no existe en la base de datos");
                return "redirect:/listar";
            }
        }
        else {
            flash.addFlashAttribute("error", "El ID del Employee no puede ser cero");
            return "redirect:/listar";
        }

        modelo.put("Employee",Employee);
        modelo.put("titulo", "Edición de Employee");
        return "form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarCliente(@PathVariable(value = "id") Long id,RedirectAttributes flash) {
        if(id > 0) {
            employeeService.delete(id);
            flash.addFlashAttribute("success", "Employee eliminado con exito");
        }
        return "redirect:/listar";
    }

    @GetMapping("/exportarPDF")
    public void exportarListadoDeEmployeesEnPDF(HttpServletResponse response) throws DocumentException, IOException {
        response.setContentType("application/pdf");

        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String fechaActual = dateFormatter.format(new Date());

        String cabecera = "Content-Disposition";
        String valor = "attachment; filename=Employees_" + fechaActual + ".pdf";

        response.setHeader(cabecera, valor);

        List<Employee> Employees = employeeService.findAll();

        EmployeeExporterPDF exporter = new EmployeeExporterPDF(Employees);
        exporter.exportar(response);
    }

    @GetMapping("/exportarExcel")
    public void exportarListadoDeEmployeesEnExcel(HttpServletResponse response) throws DocumentException, IOException {
        response.setContentType("application/octet-stream");

        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String fechaActual = dateFormatter.format(new Date());

        String cabecera = "Content-Disposition";
        String valor = "attachment; filename=Employees_" + fechaActual + ".xlsx";

        response.setHeader(cabecera, valor);

        List<Employee> Employees = employeeService.findAll();

        EmployeeExporterExcel exporter = new EmployeeExporterExcel(Employees);
        exporter.export(response);
    }
}
