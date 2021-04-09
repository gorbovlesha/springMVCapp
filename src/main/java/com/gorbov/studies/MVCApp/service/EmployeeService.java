package com.gorbov.studies.MVCApp.service;

import com.gorbov.studies.MVCApp.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void updateEmployee(Employee employee);
    void addEmployee(Employee employee);
    void deleteEmployee(Employee employee);
    Employee getEmployeeById(int id);
}
