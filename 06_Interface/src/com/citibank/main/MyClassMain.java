package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.MyClass;
import com.citibank.main.domain.MyInterface;
import com.citibank.main.factory.MyFactory;

public class MyClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Start");
		//created object of MyClass
		MyClass myclass = new MyClass();
		myclass.show();
		
		//MyInterface myinterface = new MyInterface() ;-->not allowed as interface is abstarct u cant create object
		//this is polymorphism now interface ref using object of MyClass
		MyInterface myinterface = new MyClass();
		myinterface.show();
		System.out.println("--------------");
		//u can call message variable thru Interface -MyInterface
		System.out.println(MyInterface.message);
		//u can call message variable thru class object myclass as myclass implements MyInterface
		System.out.println(myclass.message);
		System.out.println("---------------------");
		//input of choice for object
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter choice for Class:");
		System.out.println("1.MyClass");
		System.out.println("2.YourClass");
		int choice = scanner.nextInt();
		MyInterface myinterface2 = MyFactory.getObject(choice);
		
		if (myinterface2!= null)
		{myinterface2.show();}
		System.out.println("Main End");		
		

	}

}
