package com.YuryCorp.TaskManager.controller;

import com.YuryCorp.TaskManager.model.Employee;
import com.YuryCorp.TaskManager.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Request handler related with {@link Employee}
 *
 * <p>Supported requests:
 * <ul>
 * <li>getting all Employees</li>
 * <li>getting an Employee by identifier</li>
 * <li>creating new Employee</li>
 * <li>deleting Employee by identifier</li>
 * </ul>
 * </p>
 *
 * @author Bananahanack
 */
@RestController
@RequestMapping("api/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> getAll() {
        return employeeService.getAll();
    }

    @GetMapping("{id}")
    public Employee get(@PathVariable String id) {
        return employeeService.getById(id);
    }

    @PostMapping
    public Employee create(@RequestBody Employee employee) {
        return employeeService.create(employee);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        employeeService.delete(id);
    }
}
