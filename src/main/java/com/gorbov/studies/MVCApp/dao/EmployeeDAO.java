package com.gorbov.studies.MVCApp.dao;

import com.gorbov.studies.MVCApp.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    void add(Employee employee);
    void update(Employee employee);
    void delete(Employee employee);
    List<Employee> findAll();
    Employee findById(int id);

}
