package com.citibank.main.domain;

public class ThreadTwo implements Runnable{
//add unimplemented method when given error
	@Override
	public void run() {
		System.out.println("We are in ThreadTwo");
		for (int i = 0; i < 1000; i++) {
			System.out.println("Threadtwo run:" + i);
			try {
				System.out.println("ThreadTwo sleeps");
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		
		}
}
}
