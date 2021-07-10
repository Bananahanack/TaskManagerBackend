package com.YuryCorp.TaskManager.errors;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

/**
 * @author Bananahanack
 */
public class CommonErrorResponse {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy:MM:dd hh:mm::ss")
    private LocalDateTime time;
    private int status;
    private String error;

    public CommonErrorResponse() {
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
