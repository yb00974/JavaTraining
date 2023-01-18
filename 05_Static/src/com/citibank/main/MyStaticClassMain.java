package com.citibank.main;

import com.citibank.main.domain.MyStaticClass;



public class MyStaticClassMain {
	
	static int num3 = 10;
	int num4 = 10;

	public static void main(String[] args) {
		System.out.println("main start");
		//only ref is creating not object
		//MyStaticClass mystaticclass;
		System.out.println("main end");
		MyStaticClass mystaticclass = new MyStaticClass();
		mystaticclass.display();
		//so here first time here static variable will not change to 10 it picks value 20
		//because value gets changed last as 20 from 1st object
		//after m1 object static value operation of addition it becomes 30
		//if i create object m2 it will take 20 value not 10 again but num1 will start with 10
		System.out.println("------------");
		MyStaticClass m1 = new MyStaticClass();
		m1.display();
		MyStaticClass.num2 = MyStaticClass.num2 + 10;
		//m1.num2 = m1.num2 + 10;--> this is allowed 
		System.out.println("Num2 now :" + MyStaticClass.num2);
		//MyStaticClass.num1--> this cant be used even though num1 is public. but static variable u can use class name no need for object
		m1.num1 = m1.num1 + 10;
		System.out.println("Num1 now after use of object for calling:" + m1.num1);
		System.out.println("Num3 :" + num3);
		//System.out.println("Num4 :" + num4);--> not allowed as main is static and num4 isnon static variable
	}
	

}
