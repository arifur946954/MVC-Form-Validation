package com.FormValidation.FormValidation.Validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValitor implements ConstraintValidator<CourseCode,String> {
    public String CoursePrefex;

    @Override
    public void initialize(CourseCode theCourseCode) {

       CoursePrefex=theCourseCode.value();
    }

    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
        boolean result;
        if(theCode  != null){
            result=theCode.startsWith(CoursePrefex);
        }

       else {
             result=true;
        }
        return result;


    }
}
