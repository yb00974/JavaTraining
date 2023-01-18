package com.citibank.main.domain;

public class MyThread implements Runnable {
	//this is my common thread which i will call multiple times
	//this resource ka ref, we will create object in main
	private Resource resource;
	private String textMessage;
	
	
	public MyThread(Resource resource, String message) {
		super();
		this.resource = resource;
		this.textMessage = message;
	}


	@Override
	public void run() {
	
		resource.message(textMessage);
		
	}
	

}
