package com.citibank.main;

import com.citibank.main.domain.MyStaticClass;



public class MyStaticClassMainV1 {
	
	static int num3 = 10;
	int num4 = 10;

	public static void main(String[] args) {
		System.out.println("main start");
		//only ref is creating not object
		//MyStaticClass mystaticclass;
		MyStaticClass.num2 = 50;
		//by using the variable we loading the class in class loader.it will execute static block
		//but non static block  we need object
		MyStaticClass myclass = new MyStaticClass();
		System.out.println("main end");
		
	}
	

}
