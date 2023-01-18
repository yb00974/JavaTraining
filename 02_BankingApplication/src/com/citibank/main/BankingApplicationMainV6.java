package com.citibank.main;

import com.citibank.main.domain.Account;
import com.citibank.main.domain.Current;
import com.citibank.main.domain.Savings;

import java.util.Scanner;

public class BankingApplicationMainV6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Account account1 = null;

		
		// all variables since i can't used class variable
		int accountNumber;
		String name;
		int acctChoice;
		int odLimit;
		double balance;
		double amount;
		// choice variable
		//int choice;-->making string to allow invalid choice if pressed a
		char choice;
		String continueChoice;
		boolean isSalary = false;
		//instead of boolean true and false lets try Y/N
		char ans;

		// function to accept the input
		//now since name acct no and balance are common so adding it before
		System.out.println("Enter accountNumber:");
		accountNumber = scanner.nextInt();
		// so add extra scanner.nextLine after acct number
		scanner.nextLine();
		System.out.println("Enter Name");
		name = scanner.nextLine();
		System.out.println("Enter Balance:");
		balance = scanner.nextDouble();
		System.out.println("Enter your account choice: 1.Savings 2.Current");
		acctChoice = scanner.nextInt();
		if (acctChoice == 1) {
			System.out.println("Do you want to open Salary Acct(true/False):");
			isSalary = scanner.nextBoolean();
			if (isSalary == true) {
				System.out.println("Opening Salary account:");
								
			}
			if (isSalary == false) {
				System.out.println("Opening non Salary account:");
			}
			//here i am making acct1 ref common n using saving n current as per use
			account1 = new Savings(accountNumber, name, balance, isSalary);
		}
		if (acctChoice == 2) {
			System.out.println("Opening Current acct");
			System.out.println("Enter overdraft Limit for your current account:");
			odLimit = scanner.nextInt();
			account1 = new Current(accountNumber, name, balance, odLimit);
		}
		if (acctChoice != 1 && acctChoice !=2) {
			System.out.println("Invalid Choice for opening acct");
			System.exit(0);
		}
			
		System.out.println("Account Opened Successfully!!");
		System.out.println("Account Details:");
		System.out.println("Name :" + " " + name);
		System.out.println("Account Number: " + accountNumber);
		if (acctChoice == 1 && isSalary) {
			System.out.println("Account Type : Salary Account");}
		if (acctChoice == 1 && isSalary == false ) {
			System.out.println("Account Type : Salary Account");}
		if (acctChoice == 2) {
			System.out.println("Account Type : Current Account");}
		System.out.println("Balance: " + balance);
		
		System.out.println();
		
		do {
			System.out.println("Welcome " + name);
			System.out.println("Transaction Menu");
			System.out.println("Press 1. For Withdraw");
			System.out.println("Press 2. For Deposit");
			System.out.println("Press 3. For Check Balance");
			System.out.println("Press 4. For Exit");

			// Scanner for i/p for transaction menu
			System.out.println("Please enter your choice");
			//choice = scanner.nextInt();
			choice = scanner.next().charAt(0);

			// example of inline method not defining it as separate but in top down method
			switch (choice) {
			case '1':
				System.out.println("Enter amount to Withdraw");
				// accepting amount
				amount = scanner.nextDouble();
				// now call withdraw method-returns tru or false
				if (acctChoice == 1 ) {
					account1.withdraw(amount);			
				//	System.out.println("Withdraw success!");-->cant put as 1500 limit on non salary acct
				}
				//this not working
				if (acctChoice == 2) {
					//current acct
					account1.withdraw(amount);	
				}
//				else
//					System.out.println("withdraw failed!");
				break;
			case '2':
				System.out.println("Enter amount to deposit");
				// accepting amount
				amount = scanner.nextDouble();
				// now call deposit method-returns true or false
				if (account1.deposit(amount))
					System.out.println("Deposit success!");
				else
					System.out.println("Deposit failed!");
				break;
			case '3':
				System.out.println("Check Balance");
				// accepting amount
				System.out.println("Balance:" + account1.getBalance());
				break;
			case '4':
				System.out.println("Thankyou for banking with us");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
			System.out.println("Do you want to continue?");
			continueChoice = scanner.next();
		} while (continueChoice.equalsIgnoreCase("yes") || continueChoice.equalsIgnoreCase("y"));
		System.out.println("Thankyou for banking with us!!");
		
	}
	
		

	

}
