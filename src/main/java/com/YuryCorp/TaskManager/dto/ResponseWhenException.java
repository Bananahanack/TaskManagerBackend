package com.YuryCorp.TaskManager.dto;

/**
 * @author Bananahanack
 */
public class ResponseWhenException {
    private String message;

    public ResponseWhenException() {
    }

    public ResponseWhenException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
