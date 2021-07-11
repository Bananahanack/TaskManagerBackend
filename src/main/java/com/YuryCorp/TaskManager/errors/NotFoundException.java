package com.YuryCorp.TaskManager.errors;

/**
 * Custom Exeption class. Customised {@link RuntimeException}.
 * @author Bananahanack
 */
public class NotFoundException extends RuntimeException {
    public NotFoundException(String id, String notFoundName) {
        super((notFoundName + " id not found: " + id).toUpperCase());
    }
}
