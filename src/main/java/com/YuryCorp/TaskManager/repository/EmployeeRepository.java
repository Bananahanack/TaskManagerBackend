package com.YuryCorp.TaskManager.repository;

import com.YuryCorp.TaskManager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for {@link Employee} class.
 *
 * @author Bananahanack
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {
}
