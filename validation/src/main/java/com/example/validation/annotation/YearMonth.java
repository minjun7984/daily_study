package com.example.validation.annotation;


import com.example.validation.vaildator.YearMonthValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Constraint(validatedBy = {YearMonthValidator.class})
@Target({ METHOD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)
public @interface YearMonth {

    String message() default "yyyyMM의 형태와 맞지 않습니다";

    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default{};
    String pattern() default "yyyyMMdd";

}
