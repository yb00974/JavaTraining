package com.citibank.main.domain;

public class MyAccount {
	private int actno;
	// this is going to be my main resouce class which will be used as thread
	private double balance;
	
	//private int trxchoice;

	public MyAccount(int actno, double balance) {
		super();
		this.actno = actno;
		//this.trxchoice = trxchoice;
		this.balance = balance;
	}

	public boolean withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			System.out.println("Can do withdraw");
			try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			balance = balance - amount;
			System.out.println("Withdraw Ends");
			return true;
		}
		System.out.println("Withdraw Ends");

		return false;
	}
	
	public boolean deposit(double amount) {
		if (amount > 0) {
			System.out.println("can do deposit");try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			balance = balance + amount;
			System.out.println("Deposit Ends");
			return true;
		}
		System.out.println("Deposit Ends");
		return false;
	}

}
