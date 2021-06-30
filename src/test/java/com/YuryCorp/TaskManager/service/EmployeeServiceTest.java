package com.YuryCorp.TaskManager.service;

import com.YuryCorp.TaskManager.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Bananahanack
 */

@SpringBootTest
public class EmployeeServiceTest {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void createEmployeeTest(){
        
    }

}
