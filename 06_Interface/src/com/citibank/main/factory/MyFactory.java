package com.citibank.main.factory;

import java.awt.BorderLayout;

import com.citibank.main.domain.MyClass;
import com.citibank.main.domain.MyInterface;
import com.citibank.main.domain.YourClass;

public class MyFactory {
	//this is class solely created to return and get object.
	//so return type is MyInterface
	public static MyInterface getObject(int choice) {
		if(choice == 1) {
			return new MyClass();
		}
		if(choice == 2) {
			return new YourClass();
		}
		//to avoid null exception
		return null;
	}

}
