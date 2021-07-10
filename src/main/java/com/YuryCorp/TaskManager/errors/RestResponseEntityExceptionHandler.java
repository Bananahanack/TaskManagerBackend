package com.YuryCorp.TaskManager.errors;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

/**
 * @author Bananahanack
 */
@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<CommonErrorResponse> customHandleDataIntegrityViolation(DataIntegrityViolationException exception) {
        CommonErrorResponse error = new CommonErrorResponse();
        error.setTime(LocalDateTime.now());
        error.setError(
                String.format("%s %s",
                        exception.getCause().toString(),
                        "(Probably this entry already exists!)".toUpperCase()
                ));
        error.setStatus(HttpStatus.NOT_ACCEPTABLE.value());
        return new ResponseEntity<>(error, HttpStatus.NOT_ACCEPTABLE);
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<CommonErrorResponse> customHandleNotFound(NotFoundException ex) {
        CommonErrorResponse error = new CommonErrorResponse();
        error.setTime(LocalDateTime.now());
        error.setError(ex.getMessage());
        error.setStatus(HttpStatus.NOT_FOUND.value());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}
