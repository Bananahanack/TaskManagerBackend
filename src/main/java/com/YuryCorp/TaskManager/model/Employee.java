package com.YuryCorp.TaskManager.model;

import com.sun.istack.NotNull;

import javax.persistence.*;

/**
 * Domain object that represent Employee.
 *
 * @author Bananahanack
 */
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @NotNull
    @Column(name = "last_name")
    private String lastName;

    @NotNull
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @NotNull
    @Column(name = "position")
    private String position;

    public Employee() {
    }

    public String getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getPosition() {
        return position;
    }

    public String getFullName() {
        return String.format("%s %s %s", lastName, firstName, middleName);
    }
}
