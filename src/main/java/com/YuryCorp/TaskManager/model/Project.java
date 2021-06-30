package com.YuryCorp.TaskManager.model;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import java.util.LinkedList;
import java.util.List;

/**
 * Domain object that represent Project.
 *
 * @author Bananahanack
 */
@Entity
public class Project extends AbstractEntity{
    @NotNull
    @NotEmpty
    private String name;

    private String description;

    @OneToMany(mappedBy = "project", fetch = FetchType.EAGER)
    private List<Employee> employees;

    @OneToMany(mappedBy = "project", fetch = FetchType.EAGER)
    private List<Task> tasks;

    public Project() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Employee> getEmployee() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
