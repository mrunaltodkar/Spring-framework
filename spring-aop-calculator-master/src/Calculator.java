package com.capgemini.spring.calculator;

import com.capgemini.spring.*;
import java.lang.*;
import com.capgemini.spring.calculator.*;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.*;

public interface Calculator {
	public void add(int num1, int num2);
	public void divide(double num1, double num2);
	public double multiply(double num1, double num2);
	public double division(double num1, double num2) throws Exception;
}


@Service
class CalculatorImpl implements Calculator {

	public void add(int num1, int num2)
	{
		System.out.println(num1+num2);
	}


	public void divide(double num1, double num2)
	{
		System.out.println(num1/num2);
	}

	public double multiply(double num1, double num2)
	{	
		double mul=num1*num2;
		return mul;
	}

	public double division(double num1, double num2) throws Exception{
		if(num2==0){
			throw new Exception();
		}else
			return (num1/num2);
	}
}