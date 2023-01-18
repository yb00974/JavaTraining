package com.citibank.main.domain;

public class Savings extends Account {
	
	//defining boolean variable to show its salary or normal saving acct
	private boolean isSalary;
	//default constructor
	public Savings() {
		System.out.println("Default Constructor of Savings");
	}
	
	public Savings(int accountNumber, String name, double balance, boolean isSalary) {
		//this super will callparent class param constructor
		super(accountNumber, name, balance);
		System.out.println("Param Constructor of Savings");
		//now doing setter task of setting value
		this.isSalary = isSalary;
	}

	public boolean isSalary() {
		return isSalary;
	}
	//right click src-->generate getter setter

	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}
	//ctrl+space and then override from account
	@Override
	public boolean withdraw(double amount) {
		//write business logic
		//return super.withdraw(amount);
		//getbalance we are using because we are using parent balance field
		if (amount > 0 && amount <= getBalance()) {
			if (isSalary ) {
				System.out.println("this is salary account");
				setBalance(getBalance()- amount);
				return true;		
				}
		//not salary acct
		    if (isSalary == false && getBalance()- amount >= 1500 ) {
		    	setBalance(getBalance() - amount);
		    	return true;
		    }
		}		
		 return false; 
	}
	@Override
	public boolean deposit(double amount) {
		if (amount > 0) {
			System.out.println("Practive overriding the deposit para");
			setBalance(getBalance() + amount);
			return true;
		}
		return false;
	}
}
