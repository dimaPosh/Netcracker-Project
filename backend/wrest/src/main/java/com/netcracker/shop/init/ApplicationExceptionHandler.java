package com.netcracker.shop.init;

import com.netcracker.shop.exception.NotFoundException;
import com.netcracker.shop.model.Holder;
import com.netcracker.shop.model.Violation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.validation.ConstraintViolationException;
import java.util.List;
import java.util.stream.Collectors;


/**
 * The type Application exception handler.
 */
@ControllerAdvice
public class ApplicationExceptionHandler {
    /**
     * Handle npe response entity.
     *
     * @param e the e
     * @return the response entity
     */
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<String> handleNpe(NotFoundException e) {
        return new ResponseEntity<>("{}", HttpStatus.NOT_FOUND);
    }

    /**
     * Handle cve response entity.
     *
     * @param e the e
     * @return the response entity
     */
    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<Holder<List<Violation>>> handleCve(ConstraintViolationException e) {
        return new ResponseEntity<>(
            new Holder<>(e
                .getConstraintViolations()
                .stream()
                .map(x -> new Violation(x.getMessage()))
                .collect(Collectors.toList())), HttpStatus.BAD_REQUEST);
    }

}
