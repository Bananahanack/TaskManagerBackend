package com.YuryCorp.TaskManager.model;

import javax.persistence.*;

/**
 * Domain object that represent Employee.
 *
 * @author Bananahanack
 */
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "last_name")
    private String lastName;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "middle_name")
    private String middleName;

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

    public String getFullName() {
        return String.format("%s %s %s", lastName, firstName, middleName);
    }
}
