package com.YuryCorp.TaskManager.service;

import com.YuryCorp.TaskManager.dto.EmployeeDto;
import com.YuryCorp.TaskManager.model.Employee;
import com.YuryCorp.TaskManager.repository.EmployeeRepository;
import com.YuryCorp.TaskManager.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Implementation of {@link EmployeeService}.
 *
 * <p>Performs standard CRUD operations using DataBase.</p>
 *
 * @author Bananahanack
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final ProjectRepository projectRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository, ProjectRepository projectRepository) {
        this.employeeRepository = employeeRepository;
        this.projectRepository = projectRepository;
    }

    @Override
    public List<EmployeeDto> getAll() {
        return employeeRepository.findAll().stream()
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public EmployeeDto getById(String id) {
         return employeeRepository.findById(id).map(this::entityToDto)
                .orElseThrow(()-> new RuntimeException("EMPLOYEE by this ID doesn't exist!!!"));
    }

    @Override
    public EmployeeDto create(Employee employee) {
//        employee.setProject(projectRepository.findById(projectId)
//                .orElseThrow(RuntimeException::new));
//        return employeeRepository.save(employee);


        return entityToDto(employeeRepository.save(employee));
    }

    @Override
    public void delete(String id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public long countOfEmployees() {
        return employeeRepository.count();
    }

    private EmployeeDto entityToDto(Employee employee){
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(employee.getId());
        employeeDto.setFirstName(employee.getFirstName());
        employeeDto.setLastName(employee.getLastName());
        employeeDto.setEmail(employee.getEmail());
        employeeDto.setPosition(employee.getPosition());
        return employeeDto;
    }

    private Employee dtoToEntity(EmployeeDto employeeDto){
        Employee employee = new Employee();
        employee.setLastName(employeeDto.getLastName());
        employee.setFirstName(employeeDto.getFirstName());
        employee.setEmail(employeeDto.getEmail());
        employee.setPosition(employeeDto.getPosition());
        return employee;
    }

}
