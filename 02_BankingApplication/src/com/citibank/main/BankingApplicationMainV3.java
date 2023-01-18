package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Account;

public class BankingApplicationMainV3 {

	public static void main(String[] args) {
		// all objects
		Scanner scanner = new Scanner(System.in);
		//here this should call default constructor
//		Account account = new Account();-->this call default contructor so now i just define ref
		Account account;

		// all variables since i can't used class variable
		int accountNumber;
		String name;
		double balance;
		double amount;
		// choice variable
		//int choice;-->making string to allow invalid choice if pressed a
		char choice;
		String continueChoice;
		boolean  isSalary;

		// function to accept the input
		System.out.println("Enter accountNumber:");
		accountNumber = scanner.nextInt();
		//so add extra scanner.nextLine after acct number
		scanner.nextLine();
		System.out.println("Enter Name");
		// since standard i/p is string and next convert to int or double
		// in case of string its already string so no need to write next
		//name = scanner.next();-->only acccepting yaminee not bhardwaj after space
		//name = scanner.nextLine();-->has ability to take space until press enter
		//issue is save+run (when after acct no we press enter , enter is stored in buffer
		//enter key saved in name variable n it does not ask for name
		//so add extra scanner.nextLine after acct number
		name = scanner.nextLine();
		System.out.println("Enter Balance:");
		balance = scanner.nextDouble();
	

		// setters and getters
		//commenting setter to call new account object n contructor
		//account.setAccountNumber(accountNumber);
		//account.setName(name);
		//account.setBalance(balance);
		//this below now i created object with ref which will call parm contructor not default
		account = new Account(accountNumber, name, balance);

		// now printing of success of open acct
		System.out.println("Account open success!");

		System.out.println("account number:" + account.getAccountNumber());
		System.out.println("Name:" + account.getName());
		System.out.println("Balance:" + account.getBalance());

		System.out.println();

		do {
			showTransactionMenu(scanner, account);
			System.out.println("Do you want to continue?");
			continueChoice = scanner.next();
		} while (continueChoice.equalsIgnoreCase("yes") || continueChoice.equalsIgnoreCase("y"));
		System.out.println("Thankyou for banking with us!!");

	}

	private static void showTransactionMenu(Scanner scanner, Account account) {
		double amount;
		char choice;
		System.out.println("Welcome " + account.getName() + " " + "Lets Begin");
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
			if (account.withdraw(amount))
				System.out.println("Withdraw success!");
			else
				System.out.println("withdraw failed!");

			break;
		case '2':
			System.out.println("Enter amount to deposit");
			// accepting amount
			amount = scanner.nextDouble();
			// now call deposit method-returns true or false
			if (account.deposit(amount))
				System.out.println("Deposit success!");
			else
				System.out.println("Deposit failed!");
			break;
		case '3':
			System.out.println("Check Balance");
			// accepting amount
			System.out.println("Balance:" + account.getBalance());
			break;
		case '4':
			System.out.println("Thankyou for banking with us");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
	}
}
