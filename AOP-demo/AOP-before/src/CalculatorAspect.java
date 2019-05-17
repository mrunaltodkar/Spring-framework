package com.capgemini.spring.aspects;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.*;

@Component
@Aspect
public class CalculatorAspect{
	
	@Before("execution (* com.capgemini.spring.calculator.CalculatorAddition.add(..))")
	public void log(){
		System.out.println("Add success...");
	}
}