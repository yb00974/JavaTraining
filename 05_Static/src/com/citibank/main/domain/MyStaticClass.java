package com.citibank.main.domain;

public class MyStaticClass {
	
	public MyStaticClass() {
		System.out.println("default constructor of MyClass:");
	}
	//order is static block then non static block before object creation and then default constructor when objects gets created
	//if u dnt define static block then seq is non static block and then default constructor
	static {
		System.out.println("Static block of MyStaticClass");
	}
	{
		System.out.println("Non Static Block of MyStaticClass");
	}
	
	//private int num1 = 10;
	public int num1 = 10;
	//private static int num2 = 10;
	public static int num2 = 10;
	final int max = 500;

	public  void display() {
		
		System.out.println("Number 1:" + num1);
		System.out.println("Number 2:" + num2);
		//max = max + 200;--> this is wrong statement as max cant be chnaged at all
		num1 = num1 + 10;
		num2 = num2 + 10;
		System.out.println("Number 1:" + num1);
		System.out.println("Number 2:" + num2);
		
		
		
	}

}
