package com.roject.check;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.File;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.jupiter.api.Test;

import com.roject.check.entity.EI;

public class EIEvaluate {

	@Test
	public void TaxReturnValidation() {
		EI tab = new EI();
		File f1 = new File("e:/docs/ei/Eitest3.txt");
		System.out.println("\nPath ::" + f1.getAbsolutePath());
		tab.taxReturnValidation(f1);
		 ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		 Validator validator=factory.getValidator();
		 
		 Set<ConstraintViolation<EI>> violations = validator.validate(tab);
		
		 System.out.println("\nTotal Violations ::"+violations.size());
	
		 
    for(ConstraintViolation msg: violations)
    	{
    	System.out.println("\nViolations::" +msg.getMessage());
    	
    	
    	}
         assertTrue(violations.isEmpty());	
        
	}
		
		
	
	}

