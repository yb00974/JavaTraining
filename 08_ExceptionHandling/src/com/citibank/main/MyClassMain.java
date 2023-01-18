package com.citibank.main;

import com.citibank.main.domain.MyClass;

public class MyClassMain {

	public static void main(String[] args) {

		MyClass myclass = new MyClass();
		System.out.println("Now accept the inputs:");
		myclass.accept();
		System.out.println("Now calcualte:");
		myclass.calculate();
		System.out.println("Now Results:");
		myclass.display();

	}

}
