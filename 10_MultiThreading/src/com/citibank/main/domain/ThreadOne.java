package com.citibank.main.domain;

public class ThreadOne extends Thread{
	@Override
	public void run() {
		System.out.println("We are in ThreadOne");
		for (int i = 0; i < 1000; i++) {
		System.out.println("Threadone run:" + i);
		try {
			System.out.println("ThreadOne sleeps");
			Thread.sleep(100);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		}
	}
}
