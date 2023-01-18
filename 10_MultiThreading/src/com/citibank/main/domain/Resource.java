package com.citibank.main.domain;

public class Resource {
	//public void message(String textMessage) {
	//this synchronized verb makes is synchromised call 
	//that which ever thread starts that will complete until then no other thread will be called
	public synchronized void message(String textMessage) {
		System.out.println("[");
		System.out.println(textMessage);
		//sleep doesnt need object its static function of class Thread
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}

}
