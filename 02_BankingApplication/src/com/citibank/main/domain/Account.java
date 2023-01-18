package com.citibank.main.domain;
//for MainV6 we are making account class as abstract
//public class Account {
public abstract class Account {
	private int accountNumber;
	private String name;
	private double balance;
	//creating overloading of contructor here default + paramater
	public Account() {
		System.out.println("Default Constructor of Account:");
	}
	//param constructor-->manual so commented it
	//public Account(int i,String s,double d) {
	//	System.out.println("parm Constructor of account:");
		//gave here i,s ,d because constructor input is i,s,d
	//	this.accountNumber = i;
	//	this.name = s;
	//	this.balance = d;
	//}
	
	public Account(int accountNumber, String name, double balance) {
		//super();
		//auto generated
		System.out.println("Parm constructor for Account");
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	//private is access type int-->type accountNumber-->variable
	//default is access type-->can only be used in same package
	//public access -->means this can be used in outside package in any other project also
	//given jar file we give access to other project then public can be used in other project
	//protected access-->
	//private access-->within class
	//auto generate getter and setters
	//rightcick on place where u want ur method-->source-->generate getter * setter
	//make it select all and public will generate for all the variables
	public int getAccountNumber() {
		return accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
//making withdraw and deposit as abstract method
	public abstract boolean withdraw(double amount);
//	public boolean withdraw(double amount) {
//		System.out.println("withdraw() called");
//		if (amount > 0 && amount <= balance) {
//			balance = balance - amount;
//			return true;
//		}
//		return false;
//	}
	public abstract boolean deposit(double amount);
//	public boolean deposit(double amount) {
//		System.out.println("deposit called");
//		if(amount > 0) {
//			balance = balance + amount;
//not using getBalance because within class private variable can be used
//in main we are using the getBalance because its another class
//			return true;
//		}
//		return false;
	//boolean flag is notifying main (user) that operation is successful
//	}
	//no need to have sysout or display here in methods in server side because
	//it will be logged but not visible to client(main version)
}
