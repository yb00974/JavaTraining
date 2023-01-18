package com.citibank.main;

import com.citibank.main.domain.ThreadOne;

public class ThreadOneMain {
	public static void main(String[] args) {
		System.out.println("Main Start");
		ThreadOne threadone = new ThreadOne();
		//threadone.run() -->is like function calling it would not create the thread
		//so use .start --> this creates thread
		threadone.start();
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("Main thread run:" + i);
			//1000miliseconds = 100 sec
			try {
			//this will sleep the current running thread which is main thread	
				System.out.println("Thread one main sleeps");
				Thread.sleep(100);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("Main End");
	}

}
