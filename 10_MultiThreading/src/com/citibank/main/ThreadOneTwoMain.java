package com.citibank.main;

import com.citibank.main.domain.ThreadOne;
import com.citibank.main.domain.ThreadTwo;

public class ThreadOneTwoMain {

	public static void main(String[] args) {
		System.out.println("ThreadOnetwo Main starts");
		System.out.println("ThreadOnetwo Main creating child thread One");
		//here it was inheritance as it extends
		//ThreadOne is child of Thread so can directly use start function
		ThreadOne threadOne = new ThreadOne();
		threadOne.start();
		
		System.out.println("ThreadOnetwo Main creating child thread Two");
		//runnable interface
		ThreadTwo two = new ThreadTwo();
		Thread threadTwo = new Thread(two);
		threadTwo.start();
		System.out.println("ThreadOnetwo Main Ends");

	}

}
