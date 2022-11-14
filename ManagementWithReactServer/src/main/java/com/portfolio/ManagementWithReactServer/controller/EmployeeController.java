package com.portfolio.ManagementWithReactServer.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.portfolio.ManagementWithReactServer.exception.ResourceNotFoundException;
import com.portfolio.ManagementWithReactServer.model.Employee;
import com.portfolio.ManagementWithReactServer.repository.EmployeeRepository;
import com.portfolio.ManagementWithReactServer.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/management/")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // get all employees
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.listAllEmployees();
    }

    // create employee rest api
    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    // get employee by id rest api
    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
        Employee employee = employeeService.getEmployeeById(id);
        return ResponseEntity.ok(employee);
    }

    // update employee rest api

    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails){
        Employee updateEmployee = employeeService.updateEmployee(id,employeeDetails);
        return ResponseEntity.ok(updateEmployee);
    }

    // delete employee rest api
    @DeleteMapping("/employees/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id){
        Map<String, Boolean> response = employeeService.deleteEmployeeById(id);
        return ResponseEntity.ok(response);
    }
}
