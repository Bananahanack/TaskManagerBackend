package com.YuryCorp.TaskManager.errors;

/**
 * Custom api Runtime Exception
 * @author Bananahanack
 */
public class ApiRuntimeException extends RuntimeException {
    public ApiRuntimeException(String id){
        super("text " + id);

    }

}
