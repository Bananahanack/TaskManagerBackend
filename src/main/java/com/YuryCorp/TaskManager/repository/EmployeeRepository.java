package com.YuryCorp.TaskManager.repository;

import com.YuryCorp.TaskManager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for {@link Employee} class.
 *
 * @author Bananahanack
 */
public interface EmployeeRepository extends JpaRepository<Employee, String> {

}
