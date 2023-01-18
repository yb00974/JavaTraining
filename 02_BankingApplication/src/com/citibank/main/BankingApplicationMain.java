package com.citibank.main;

import com.citibank.main.domain.Account;
//this class package which we are invoking

public class BankingApplicationMain {

	public static void main(String[] args) {
		//this is to show main is starting and ending point
		System.out.println("main start");
		//object creation line
		Account account = new Account();
		//this is function calling
//		account.accountNumber = 101;-->since private cant do this
//		account.name = "Yaminee";
		account.setAccountNumber(101);
		account.setName("Yaminee");
		account.setBalance(2000.00);
//		account.setAccountNumber(201);
	//201 overrides 101
		account.getAccountNumber();
		System.out.println(account.getAccountNumber());
		//without sysout it will not print in console but only get
		//this will be object.method name
		account.withdraw();
		/*Account-->this is class
		/*account this is object
		 */
		//this is to show main is starting and ending point
		System.out.println("main end");

	}

}
