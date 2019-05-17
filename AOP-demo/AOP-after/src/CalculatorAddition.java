package com.capgemini.spring.calculator;
import org.springframework.stereotype.Component;

@Component
public class CalculatorAddition implements Calculator{

	public void add(int num1,int num2){
		System.out.println(num1+num2);
	}	
}