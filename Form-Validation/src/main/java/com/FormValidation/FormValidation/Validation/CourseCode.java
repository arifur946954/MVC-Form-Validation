package com.FormValidation.FormValidation.Validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValitor.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)

public @interface CourseCode {
    //define default course code
    public  String value() default "CSE-";
    //define etton message
    public String message() default "Must strat with CSE-";
    //define default gropu
    public Class<?>[] groups() default {};
    //define default payloads
    public Class<? extends Payload>[] payload() default {};

}
