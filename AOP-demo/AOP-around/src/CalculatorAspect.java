package com.capgemini.spring.aspects;
import org.springframework.stereotype.Component;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Component
@Aspect
public class CalculatorAspect{
	
	@Around("execution (* com.capgemini.spring.calculator.CalculatorImpl.add(..))")
	public void logAdd(ProceedingJoinPoint pjp)throws Throwable{
		Object[] args=pjp.getArgs();
		int first=Integer.parseInt(args[0].toString());
		int second=Integer.parseInt(args[1].toString());
		if(first>0 && second>0){
			pjp.proceed();
		}else{
			System.out.println("Add fail...");
		}
		
	}

	@Around("execution (* com.capgemini.spring.calculator.CalculatorImpl.divide(..))")
	public void logDivide(ProceedingJoinPoint pjp)throws Throwable{
		Object[] args=pjp.getArgs();
		int first=Integer.parseInt(args[0].toString());
		int second=Integer.parseInt(args[1].toString());
		if(second!=0){
			pjp.proceed();
		}else{
			System.out.println("Can't divide by zero...");
		}
		return args;
	}
}