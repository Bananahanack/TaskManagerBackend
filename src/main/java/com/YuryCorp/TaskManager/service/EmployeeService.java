package com.YuryCorp.TaskManager.service;

import com.YuryCorp.TaskManager.dto.EmployeeDto;
import com.YuryCorp.TaskManager.model.Employee;

import java.util.List;

/**
 * @author Bananahanack
 */
public interface EmployeeService {
    List<EmployeeDto> getAll();

    EmployeeDto getById(String id);

    EmployeeDto create(EmployeeDto employeeDto);

    void delete(String id);

    long countOfEmployees();
}
