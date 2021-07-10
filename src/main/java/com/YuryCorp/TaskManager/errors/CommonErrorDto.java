package com.YuryCorp.TaskManager.errors;

/**
 * @author Bananahanack
 */
public class CommonErrorDto {
    private String errorCode;
    private String message;

    public CommonErrorDto() {
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
