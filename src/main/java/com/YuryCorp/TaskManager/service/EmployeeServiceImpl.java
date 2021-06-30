package com.YuryCorp.TaskManager.service;

import com.YuryCorp.TaskManager.model.Employee;
import com.YuryCorp.TaskManager.repository.EmployeeRepository;
import com.YuryCorp.TaskManager.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getById(String id) {
        return employeeRepository.findById(id)
                .orElseThrow(RuntimeException::new);
    }

    @Override
    public Employee create(Employee employee, String projectId) {
        employee.setProject(projectRepository.findById(projectId)
                .orElseThrow(RuntimeException::new));
        return employeeRepository.save(employee);
    }

    @Override
    public void delete(String id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public long countOfEmployees() {
        return employeeRepository.count();
    }

/*    @PostConstruct
    public void populateTestData() {
        if (projectRepository.count() == 0) {
            projectRepository.saveAll(
                    Stream.of("Path-Way Electronics;Electronics project", "E-Tech;E-Tech project", "Path-E-Tech;Path-E-Tech project")
                            .map(sStr-> {
                                String[] split = sStr.split(";");
                                Project project = new Project();
                                project.setName(split[0]);
                                project.setDescription(split[1]);
                                return project;
                            })
                            .collect(Collectors.toList()));
        }

        if (employeeRepository.count() == 0) {
            Random rand = new Random(0);
            List<Project> projects = projectRepository.findAll();
            List<String> positions = Stream.of("junior", "middle", "senior", "architect").collect(Collectors.toList());
            employeeRepository.saveAll(
                    Stream.of("Gabrielle Patel", "Brian Robinson", "Eduardo Haugen",
                            "Koen Johansen", "Alejandro Macdonald", "Angel Karlsson", "Yahir Gustavsson", "Haiden Svensson",
                            "Emily Stewart", "Corinne Davis", "Ryann Davis", "Yurem Jackson", "Kelly Gustavsson",
                            "Eileen Walker", "Katelyn Martin", "Israel Carlsson", "Quinn Hansson", "Makena Smith",
                            "Danielle Watson", "Leland Harris", "Gunner Karlsen", "Jamar Olsson", "Lara Martin",
                            "Ann Andersson", "Remington Andersson", "Rene Carlsson", "Elvis Olsen", "Solomon Olsen",
                            "Jaydan Jackson", "Bernard Nilsen")
                            .map(sStr -> {
                                String[] split = sStr.split(" ");
                                Employee employee = new Employee();
                                employee.setFirstName(split[0]);
                                employee.setLastName(split[1]);
                                employee.setProject(projects.get(rand.nextInt(projects.size())));
                                String email = (employee.getFirstName() + "." + employee.getLastName() + "@" + employee.getProject().getName().replaceAll("[\\s-]", "") + ".com").toLowerCase();
                                employee.setEmail(email);
                                employee.setPosition(positions.get(rand.nextInt(positions.size())));
                                return employee;
                            }).collect(Collectors.toList()));
        }
    }*/
}
