package com.YuryCorp.TaskManager.controller;

import com.YuryCorp.TaskManager.controller.EmployeeController;
import com.YuryCorp.TaskManager.repository.EmployeeRepository;
import com.YuryCorp.TaskManager.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * @author Bananahanack
 */


@SpringBootTest
@AutoConfigureMockMvc
@WebMvcTest(EmployeeController.class)
public class EmployeeControllerTest {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private MockMvc mock;
    @Autowired
    private EmployeeController employeeController;
    @MockBean
    private EmployeeService employeeService;

    @Test
    public void contextLoads() throws Exception{
        assertThat(employeeController).isNotNull();
    }

    @Test
    public void rootUrlStatusIsOk() throws Exception {
        this.mock.perform(get("/api/employees"))
                .andExpect(status().isOk());
    }

    @Test
    public void getAll() throws Exception{
        this.mock.perform(get("/api/employees"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$", hasSize(6)))
                .andExpect(jsonPath("$[0].id", is("1")))
        ;
    }



}
