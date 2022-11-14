package com.portfolio.EmployeesControl.service;

import com.portfolio.EmployeesControl.model.Employee;
import com.portfolio.EmployeesControl.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return (List<Employee>) employeeRepository.findAll();
    }

    @Override
    public Page<Employee> findAll(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Employee findOne(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        employeeRepository.deleteById(id);
    }
}
