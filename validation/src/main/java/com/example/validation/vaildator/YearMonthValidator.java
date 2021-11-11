package com.example.validation.vaildator;

import com.example.validation.annotation.YearMonth;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class YearMonthValidator implements ConstraintValidator<YearMonth, String> {

    private String pattern;

    @Override
    public void initialize(YearMonth constraintAnnotation){
        this.pattern = constraintAnnotation.pattern();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context){
        //yyyyMM
        try{//01의 의미는 임의로 넣어줌 모든달에는 1일이 존재하기 때문
            LocalDate localDate = LocalDate.parse(value+"01", DateTimeFormatter.ofPattern(this.pattern));
        }catch(Exception e){
            return false;
        }
        return true;
    }
}

