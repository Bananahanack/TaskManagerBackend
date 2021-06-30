package com.YuryCorp.TaskManager.model;

/**
 * Enum, describing the task execution status.
 *
 * @author Bananahanack
 */
public enum TaskStatus {
    NOT_STARTED("Not started"),
    IN_PROGRESS("In progress"),
    COMPLETED("Completed"),
    POSTPONED("Postponed");

    private String title;

    TaskStatus(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
