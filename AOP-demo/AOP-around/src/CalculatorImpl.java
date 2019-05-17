package com.capgemini.spring.calculator;
import org.springframework.stereotype.Component;

@Component
public class CalculatorImpl implements Calculator{

	public void add(int num1,int num2){
		System.out.println(num1+num2);
	}
	
	public void divide(int num1,int num2){
		System.out.println(num1/num2);
	}	
}