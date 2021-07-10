package com.YuryCorp.TaskManager.repository;

import com.YuryCorp.TaskManager.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for {@link Project} class.
 *
 * @author Bananahanack
 */
@Repository
public interface ProjectRepository extends JpaRepository<Project, String> {

}
