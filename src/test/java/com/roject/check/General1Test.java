package com.roject.check;

import java.io.File;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.jupiter.api.Test;

import com.roject.check.entity.General1;

public class General1Test
	{
	
	@Test
	public void TaxReturnValidations()
	{
	General1 val=new General1();
	File f2=new File("e:docs/general1/general1test1.txt");
	System.out.println("\nPath::"+f2.getAbsolutePath());
	val.taxReturnValidation(f2);
	
	ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
	Validator validator=factory.getValidator();
	
	Set<ConstraintViolation<General1>> violations=validator.validate(val);
	
	System.out.println("\nTotal Violation::"+violations.size());
	
	for(ConstraintViolation msg:violations)
	{
		System.out.println("\nViolations::"+msg.getMessage());
		}	
	}
}
