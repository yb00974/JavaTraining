package com.citi.main;

import com.citi.main.domain.MyClass;

public class MyClassMain {

	public static void main(String[] args) {
		//start n beginning
		System.out.println("Main start:");
		//create MyClass object here
		MyClass myclass = new MyClass();
		//this is method being called thru object
		myclass.show();
		System.out.println("contstructor called without ref just object creation:");
		//now commenting this below line to try call with creation of object n method in one line
		//new MyClass();
		new MyClass().show();
		//testing constructor overloading by calling without ref object (just object creation)
		System.out.println("Integer constructor call");
		new MyClass(10);
		System.out.println("String constructor call");
		new MyClass("Test");
		new MyClass(10, 20);
		System.out.println("mult constructor call");
		System.out.println("Main End:");

	}

}
