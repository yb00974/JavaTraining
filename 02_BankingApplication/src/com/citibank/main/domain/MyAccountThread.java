package com.citibank.main.domain;

public class MyAccountThread implements Runnable {
	private int actno;
	MyAccount myAccount;
	private double balance;
	private double amount;
	private int trxchoice;
	//constructor

	@Override
	public void run() {
		
		if (trxchoice == 1) {
			
			myAccount.withdraw(amount);
			
		}
		if (trxchoice == 2) {
			myAccount.deposit(amount);
			
		}
		
	}
	public MyAccountThread(int actno, MyAccount myAccount, double balance, double amount, int trxchoice) {
		super();
		this.actno = actno;
		this.myAccount = myAccount;
		this.balance = balance;
		this.amount = amount;
		this.trxchoice = trxchoice;
	}
	
	
	

}
