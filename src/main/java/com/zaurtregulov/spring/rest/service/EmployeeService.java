package com.zaurtregulov.spring.rest.service;

import com.zaurtregulov.spring.rest.entity.Employee;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public void addEmployee(Employee employee);

    Employee getEmployee(int id);

    public void deleteEmployee(int id);

}