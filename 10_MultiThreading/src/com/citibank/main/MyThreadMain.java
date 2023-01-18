package com.citibank.main;

import com.citibank.main.domain.MyThread;
import com.citibank.main.domain.Resource;

public class MyThreadMain {

	public static void main(String[] args) {
	
		// here i will call MyThread class as thread
		//this asynchronous call
		System.out.println("Main Starts");
		Resource resource = new Resource();
		MyThread myThread = new MyThread(resource, "Hi");
		Thread thread = new Thread(myThread);
		thread.start();
		
		MyThread myThread1 = new MyThread(resource, "Hello");
		Thread thread1 = new Thread(myThread1);
		thread1.start();
		
		MyThread myThread2 = new MyThread(resource, "How are you today?");
		Thread thread2 = new Thread(myThread2);
		thread2.start();
		

	}

}
