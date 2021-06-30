package com.YuryCorp.TaskManager.service;

import com.YuryCorp.TaskManager.model.Employee;

import java.util.List;

/**
 * @author Bananahanack
 */
public interface EmployeeService {
    List<Employee> getAll();

    Employee getById(String id);

    Employee create(Employee employee, String projectId);

    void delete(String id);

    long countOfEmployees();
}
