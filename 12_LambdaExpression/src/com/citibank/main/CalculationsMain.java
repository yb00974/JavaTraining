package com.citibank.main;

import com.citibank.main.domain.CalculationsInterface;

public class CalculationsMain {
	
	public static void main(String[] args) {
		double num1 = 200;
		double num2 = 300;
		
		double result;
		CalculationsInterface calInt = new CalculationsInterface() {
			
			@Override
			
			public double doCalculations(double number1, double number2) {
				double num3;
				num3 = num2 + num1;
				return num3;
			}
			
		};
		result = calInt.doCalculations(num1, num2);
		System.out.println("Result:"+ result);
		
		System.out.println("---Applying Lambda expression----");
		CalculationsInterface calInt1 = (n1 , n2) -> {
			double n3;
			n3 = n1+ n2;
			return n3;
		};
		result = calInt1.doCalculations(num1,num2);
		System.out.println("Result:" + result);
	}
	

}
