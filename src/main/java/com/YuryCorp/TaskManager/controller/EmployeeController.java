package com.YuryCorp.TaskManager.controller;

import com.YuryCorp.TaskManager.dto.EmployeeDto;
import com.YuryCorp.TaskManager.model.Employee;
import com.YuryCorp.TaskManager.service.EmployeeService;
import com.sun.xml.bind.v2.TODO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
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
@Validated
public class EmployeeController {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public ResponseEntity<List<EmployeeDto>> getAll() {
        List<EmployeeDto> employeeList = employeeService.getAll();
        if (employeeList.isEmpty()) {
            new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(employeeList, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<EmployeeDto> get(@PathVariable String id) {
        EmployeeDto employeeDto = employeeService.getById(id);
        if (employeeDto == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(employeeDto, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<EmployeeDto> create(@Valid @RequestBody Employee employee) {
        if (employee == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(employeeService.create(employee), HttpStatus.CREATED);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        employeeService.delete(id);
    }

    @GetMapping("/count")
    public ResponseEntity<Long> getCountOfEmployees() {

        //TODO wrap the response

        return new ResponseEntity<>(employeeService.countOfEmployees(), HttpStatus.OK);
    }
}
