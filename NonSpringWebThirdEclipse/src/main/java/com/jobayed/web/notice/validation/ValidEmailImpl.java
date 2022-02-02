package com.jobayed.web.notice.validation;

import org.apache.commons.validator.routines.EmailValidator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidEmailImpl implements ConstraintValidator<ValidEmail,String> {
    private int min;
    @Override
    public void initialize(ValidEmail constraintAnnotation) {
        //ConstraintValidator.super.initialize(constraintAnnotation);
        min = constraintAnnotation.min();
    }

    @Override
    public boolean isValid(String strEmail, ConstraintValidatorContext context) {
        if(strEmail.length()<min)
            return false;

        return EmailValidator.getInstance(false).isValid(strEmail);
    }
}
