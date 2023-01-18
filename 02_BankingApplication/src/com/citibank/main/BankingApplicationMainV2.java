package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Account;

public class BankingApplicationMainV2 {

	public static void main(String[] args) {
		System.out.println("Welcome to XYZ Bank");
		// accept i/p from user there is class called scanner
		Scanner scanner = new Scanner(System.in);
		// scanner is java do ctrl+space for syntak.this is defining object
		// system.in taking input from console, system.out giving o/p to console
		System.out.println("Enter accountNumber:");
		int accountNumber = scanner.nextInt();
		System.out.println("Enter Name");
		String name = scanner.next();
		System.out.println("Enter Balance:");
		double balance = scanner.nextDouble();
		scanner.close();

		// account class object
		Account account = new Account();
		account.setAccountNumber(accountNumber);
		account.setName(name);
		account.setBalance(balance);

		System.out.println("Account open successfully");
//		System.out.println("account number:" + account.getAccountNumber());
//		System.out.println("Name:" + account.getName());
//		System.out.println("Balance:" + account.getBalance());
//to write in same
		// '/n' for line break
		System.out.println("account number::" + account.getAccountNumber() + '\n' + "Name::" + account.getName()
				+ "Balance::" + account.getBalance());
	}

}
