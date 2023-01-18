package com.citibank.main;

import com.citibank.main.domain.ThreadTwo;

public class ThreadTwoMain {

	public static void main(String[] args) {
		// object of thread class because we need to use Thread class features
		//no reationship with Thread class so no polymorphism
		//here is thread two class which is runnable interface
		//Thread class has ability to take feature of runnableinterface
		System.out.println("Main Starts");
		ThreadTwo threadTwo = new ThreadTwo();
		Thread thread = new Thread(threadTwo);
		
		thread.start();
		for (int i = 0; i < 1000; i++) {
			System.out.println("Main thread two run:" + i);
			//1000miliseconds = 100 sec
			try {
			//this will sleep the current running thread which is main thread	
				System.out.println("Thread Two main sleeps");
				Thread.sleep(100);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("Main End");
	}

}
