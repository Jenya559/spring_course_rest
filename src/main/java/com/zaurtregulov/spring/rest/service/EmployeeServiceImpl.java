package com.zaurtregulov.spring.rest.service;

import com.zaurtregulov.spring.rest.dao.EmployeeDao;
import com.zaurtregulov.spring.rest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Transactional
    @Override
    public List<Employee> getAllEmployees() {

        return employeeDao.getAllEmployees();
    }

    @Transactional
    @Override
    public void addEmployee(Employee employee) {
        employeeDao.addEmployee(employee);
    }

    @Transactional
    @Override
    public Employee getEmployee(int id) {
        return employeeDao.getEmployee(id);
    }


    @Transactional
    @Override
    public void deleteEmployee(int id) {
        employeeDao.deleteEmployee(id);

    }


}
