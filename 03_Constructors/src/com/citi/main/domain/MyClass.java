package com.citi.main.domain;

public class MyClass {
	public MyClass() {
		// putting default message in this constructor
		System.out.println("Default message: for MyClass Constructor");
	}
	//contructor overloading
	public MyClass(int i) {
		// putting default message in this constructor
		System.out.println("Integer Constructor for MyClass ");
	}
	//contructor overloading
		public MyClass(String s) {
			// putting default message in this constructor
			System.out.println("String Constructor for MyClass ");
		}
		//contructor overloading
		public MyClass(int i, int j) {
					// putting default message in this constructor
			System.out.println("Mult Constructor for MyClass ");
				}
	public void show() {
		//normal public method not contructor to run display
		System.out.println("Hi");
	}

	

}
