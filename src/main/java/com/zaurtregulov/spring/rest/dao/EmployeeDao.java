package com.zaurtregulov.spring.rest.dao;

import com.zaurtregulov.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    public List<Employee> getAllEmployees();


    public void addEmployee(Employee employee);

    Employee getEmployee(int id);

    public void deleteEmployee(int id);
}

