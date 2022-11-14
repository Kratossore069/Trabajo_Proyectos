package com.portfolio.ManagementWithReactServer.services;

import com.portfolio.ManagementWithReactServer.model.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> listAllEmployees();

    void deleteEmployee(Employee employee);

    Employee updateEmployee(Long id, Employee employee);
    Map<String, Boolean> deleteEmployeeById(Long id);
    Employee getEmployeeById(Long id);
}
