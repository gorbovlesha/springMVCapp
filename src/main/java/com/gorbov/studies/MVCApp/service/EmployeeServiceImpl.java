package com.gorbov.studies.MVCApp.service;

import com.gorbov.studies.MVCApp.dao.EmployeeDAO;
import com.gorbov.studies.MVCApp.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.findAll();
    }

    @Override
    @Transactional
    public void updateEmployee(Employee employee) {
        employeeDAO.update(employee);
    }

    @Override
    @Transactional
    public void addEmployee(Employee employee) {
        employeeDAO.add(employee);
    }

    @Override
    @Transactional
    public void deleteEmployee(Employee employee) {
        employeeDAO.delete(employee);
    }

    @Override
    @Transactional
    public Employee getEmployeeById(int id) {
        return employeeDAO.findById(id);
    }
}
