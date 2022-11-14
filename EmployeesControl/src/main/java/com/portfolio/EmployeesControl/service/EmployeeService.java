package com.portfolio.EmployeesControl.service;

import com.portfolio.EmployeesControl.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EmployeeService {

    public List<Employee> findAll();

    public Page<Employee> findAll(Pageable pageable);

    public void save(Employee employee);

    public Employee findOne(Long id);

    public void delete(Long id);
    
}
