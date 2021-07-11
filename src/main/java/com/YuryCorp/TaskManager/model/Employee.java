package com.YuryCorp.TaskManager.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * Domain object that represent Employee.
 *
 * @author Bananahanack
 */
@Entity
public class Employee extends AbstractEntity{
    @NotEmpty(message = "The 'LASTNAME' field cannot be empty or null!")
    @Column(name = "last_name")
    private String lastName;

    @NotEmpty(message = "The 'FIRSTNAME' field cannot be empty or null!")
    @Column(name = "first_name")
    private String firstName;

    @Email
    @NotEmpty(message = "The 'EMAIL' field cannot be empty or null!")
    @Column(name = "email", unique = true)
    private String email;

    @NotEmpty(message = "The 'POSITION' field cannot be empty or null!")
    @Column(name = "position")
    private String position;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "project_id")
    @JsonIgnore
    private Project project;

    @OneToMany(mappedBy = "employee", fetch = FetchType.EAGER)
    private List<Task> tasks;

    public Employee() {
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getFullName() {
        return String.format("%s %s", lastName, firstName);
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
