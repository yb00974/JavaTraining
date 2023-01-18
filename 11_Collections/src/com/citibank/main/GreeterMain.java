package com.citibank.main;

import com.citibank.main.domain.GoodAfternoonGreeter;
import com.citibank.main.domain.GoodMorningGreeter;
import com.citibank.main.domain.Greeter;

public class GreeterMain {

	public static void main(String[] args) {
		//polymorphism for interface
		
		Greeter greeter1 = new GoodMorningGreeter();
		greeter1.greet();
		Greeter greeter2 = new GoodAfternoonGreeter();
		greeter2.greet();
		
		//anonymous inner class which gives us leverage to use the simple functionality
		//this is ref of interface/(class if we use abstract class)   using class within that n method
		//so its object pointing to anonymous class
		Greeter greeter3 = new Greeter() {
			
			@Override
			public void greet() {
				System.out.println("Good Evening Java");
				
			}
		};
		greeter3.greet();
		System.out.println("------------");
		System.out.println("Lamda expression on only interface which has only one method(functional interface)");
		Greeter greeter4 = () -> {
			System.out.println("My Way!!");
		};
		greeter4.greet();
		
		System.out.println("Lamda expression another way)");
		Greeter greeter5 = () -> System.out.println("Good Night!!");
		
		greeter5.greet();
		
		Runnable runnable = () -> System.out.println("We are in thread");
		Thread thread = new Thread(runnable);
		thread.start();
		System.out.println("------------------");
		//lamba expression directly put values in start frunction of thread class which is imposed by runnable interface
		new Thread (() -> System.out.println("We are in thread1")).start();
		System.out.println("-------------------");
		new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(1000);
					System.out.println("We are in thread 3");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}		
							
			}
		}).start();
	}

}
