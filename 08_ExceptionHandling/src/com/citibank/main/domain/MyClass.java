package com.citibank.main.domain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyClass {
	private double num1;
	private double num2;
	private double num3;
	public void accept() {
		Scanner scanner = new Scanner(System.in);
		//1 try can have multiple catch
		//accept values from user
		//we can have single catch for multiple try
		try {
		System.out.println("enter value for num1");
		num1 = scanner.nextDouble();
		
		System.out.println("enter value for num2");
		num2 = scanner.nextDouble();
	//InputMismatchException is class with e as object	
		
	}
		catch (InputMismatchException e) {
		System.out.println("Invalid Input from user:");
		System.out.println("Program will continue its flow:");
		//if system sets message we will get message else we will get null
		//e is reference of InputMismatchException class
		System.out.println(e.getMessage());
		}
		//this below catch will not execute as above catch is doing same
		//but if u put Exception before InputMismatchException because exception 
		//is parent of InputMismatchException. If parents handles all y need child handling
		
		catch (Exception e) {
			System.out.println("exception in code:");
			System.out.println(e.getMessage());
			
		}
		finally {
			System.out.println("Thankyou!");
			//you close the resources in same method. if i would have defined my
			//Scanner object in class then i would have written finalise  scanner close in class
			//try with finally is allowed without catch
			scanner.close();
		}
	
	}
	public void calculate() {
		//calculate result
		num3 = num1/num2 ;
		
	}
	public void display() {
		System.out.println("Num1:" + num1);
		System.out.println("Num2:" + num2);
		System.out.println("Num3:" + num3);
	}

}
