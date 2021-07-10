package com.YuryCorp.TaskManager.errors;

/**
 * @author Bananahanack
 */
public class NotFoundException extends RuntimeException {
    public NotFoundException(String id, String notFoundName) {
        super((notFoundName + " id not found: " + id).toUpperCase());
    }
}
