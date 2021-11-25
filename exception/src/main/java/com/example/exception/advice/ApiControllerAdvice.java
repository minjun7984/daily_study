package com.example.exception.advice;

import com.example.exception.controller.ApiController;
import com.example.exception.dto.Error;
import com.example.exception.dto.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;
import javax.validation.Path;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@RestControllerAdvice(basePackageClasses = ApiController.class)
public class ApiControllerAdvice {

    @ExceptionHandler(value =Exception.class)
    public ResponseEntity exception(Exception e){
        System.out.println(e.getClass().getName()); // 어떤클래스가 오류가 나는지
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("");
    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResponseEntity methodArgumentNotValidException(MethodArgumentNotValidException e){

        List<Error> errorList = new ArrayList<>();
        BindingResult bindingResult = e.getBindingResult();
        bindingResult.getAllErrors().forEach(error -> {
            FieldError field = (FieldError) error;
            String fieldName = field.getField();
            String message = field.getDefaultMessage();
            String value = field.getRejectedValue().toString();

            System.out.println("----------");
            System.out.println(fieldName);
            System.out.println(message);
            System.out.println(value);

            Error errorMessage = new Error();
            errorMessage.setField(fieldName);
            errorMessage.setMessage(message);
            errorMessage.setInvalidValue(value);

            errorList.add(errorMessage);
            
        });
        ErrorResponse errorResponse = new ErrorResponse();

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }

    @ExceptionHandler(value = ConstraintViolationException.class)
    public ResponseEntity constrainViolationException(ConstraintViolationException e){
        e.getConstraintViolations().forEach(error ->{
            Stream<Path.Node> stream = StreamSupport.stream(error.getPropertyPath().spliterator(),false);
            List<Path.Node> list = stream.collect(Collectors.toList());

            String field = error.getPropertyPath().toString();
            String message = error.getMessage();
            String invalidValue = error.getInvalidValue().toString();

            System.out.println("----------");
            System.out.println(field);
            System.out.println(message);
            System.out.println(invalidValue);
        });
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }

    @ExceptionHandler(value = MissingServletRequestParameterException.class)
    public ResponseEntity missingServletRequestParameterException(MissingServletRequestParameterException e){
        String fieldName = e.getParameterName();
        String fieldType = e.getParameterType();
        String invalidValue = e.getMessage();

        System.out.println(fieldName);
        System.out.println(fieldType);
        System.out.println(invalidValue);

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }
}
