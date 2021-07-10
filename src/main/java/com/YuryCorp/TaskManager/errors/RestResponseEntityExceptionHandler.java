package com.YuryCorp.TaskManager.errors;

import com.YuryCorp.TaskManager.dto.ResponseWhenException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author Bananahanack
 */
@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(value = {DataIntegrityViolationException.class})
    protected ResponseEntity<ResponseWhenException> handleConflict(DataIntegrityViolationException ex){
        ResponseWhenException responseWhenException = new ResponseWhenException(ex.getMessage());
        return new ResponseEntity<>(responseWhenException, HttpStatus.OK);
    }
}
