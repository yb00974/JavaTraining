package com.citibank.main;

import com.citibank.main.domain.Resource;

public class SyncMain {

	public static void main(String[] args) {
		//asynchronous call-main function is thread for JVM
		//to show main is thread work on below code
		Thread thread = Thread.currentThread();
		System.out.println(thread);
		thread.setName("Main Thread");
		thread.setPriority(9);
		System.out.println(thread);
	//--------for asynchronus call
	Resource resource = new Resource();
	resource.message("Hi");
	resource.message("Hello");
	resource.message("How are you today?");

	}

}
