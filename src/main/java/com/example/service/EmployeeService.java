package com.example.service;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepo;

    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    public void saveEmployee(Employee emp) {
        employeeRepo.save(emp);
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepo.findById(id).orElse(null);
    }

    public void deleteEmployee(Long id) {
        employeeRepo.deleteById(id);
    }
}
