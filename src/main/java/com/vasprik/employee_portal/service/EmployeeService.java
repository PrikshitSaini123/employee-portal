package com.vasprik.employee_portal.service;

import com.vasprik.employee_portal.entity.Employee;
import com.vasprik.employee_portal.repo.EmployeeRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class EmployeeService {

    private final EmployeeRepo employeeRepo;

    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public List<Employee> getEmployeeList() {
        return employeeRepo.findAll();
    }

    public String addEmployee(Employee employee) {
        return employeeRepo.save(employee).getName() + "employee is added successfully!";
    }

    public String updateEmployee(Employee employee) {
        return employeeRepo.save(employee).getName() + "employee is updated successfully!";
    }
}
