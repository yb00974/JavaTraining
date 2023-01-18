package com.citi.main;

import com.citi.main.domain.MyClass;
import com.citi.main.domain.MyClassTest;

public class MyClassTestMain {
	//if you have parameterised contructor java will not provide default constructor but if no constructor is defined
	//for creating the object java gives default constructor

	public static void main(String[] args) {
		//start n beginning
		System.out.println("Main start:");
		//create MyClass object here
		MyClassTest myclasstest = new MyClassTest(10);
	}

}
