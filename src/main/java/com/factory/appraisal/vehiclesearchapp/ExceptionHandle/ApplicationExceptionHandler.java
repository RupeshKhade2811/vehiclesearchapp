package com.factory.appraisal.vehiclesearchapp.ExceptionHandle;
/**
 * This is class handles the all exceptions which will be thrown in project
 * this class provide customized global exception handling
 *
 */

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.io.IOException;
import java.util.*;

@RestControllerAdvice
public class ApplicationExceptionHandler  {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<?> handleMethodArgumentException(MethodArgumentNotValidException ex){

        List<String> errors = new ArrayList<>();
        for (FieldError error : ex.getBindingResult().getFieldErrors()) {
            errors.add(error.getField() + ": " + error.getDefaultMessage());
        }
        for (ObjectError error : ex.getBindingResult().getGlobalErrors()) {
            errors.add(error.getObjectName() + ": " + error.getDefaultMessage());
        }
        return ResponseEntity.badRequest().body(errors);
    }


    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<?> handleRutimeException(RuntimeException ex){


      if(  ex.getClass().getName().equalsIgnoreCase("org.springframework.dao.InvalidDataAccessResourceUsageException")){
          String message = "Invalid Field enterd ";
          ErrorResponse errorResponse = new ErrorResponse(HttpStatus.BAD_REQUEST.value(),message);

          return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
      }
        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public  ResponseEntity<?> handleIllegalArgumentException(IllegalArgumentException ex){
        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage());

        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(NumberFormatException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public  ResponseEntity<?> handleNumberFormatException(NumberFormatException ex){
        String message = "please Enter Integers ";
        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.BAD_REQUEST.value(),message);

        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public  ResponseEntity<?> handleMethodArgumentTypeMismatchException(MethodArgumentTypeMismatchException ex){
        String message = "please Enter Integers.. ";
        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.BAD_REQUEST.value(),message);

        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(IOException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public  ResponseEntity<?> handleIOException(IOException ex){

        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(),ex.getMessage());

        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }



}