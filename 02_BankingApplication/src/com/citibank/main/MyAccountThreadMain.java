package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.MyAccount;
import com.citibank.main.domain.MyAccountThread;

public class MyAccountThreadMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int txnchoice;
		int actno;
		double balance;
		double amount;
		
		System.out.println("Enter choice for Withdraw or Deposit");
		System.out.println("1.Withdraw 2.Deposit");
		txnchoice = scanner.nextInt();
		System.out.println("Enter Accountno:");
		actno = scanner.nextInt();
		System.out.println("Enter Balance:");
		balance = scanner.nextDouble();
		System.out.println("Enter amount:");
		amount = scanner.nextDouble();
		
		// TODO Auto-generated method stub
		//Myaccount is my resource //My Account threadis thread calling MyAccount
		MyAccount myacct = new MyAccount(actno, balance);
		MyAccountThread myaccountthread = new MyAccountThread(actno, myacct, balance, amount, txnchoice);
		Thread thread1 = new Thread(myaccountthread);
		thread1.start();
		MyAccount myacct1 = new MyAccount(actno, balance);
		MyAccountThread myaccountthread1 = new MyAccountThread(actno, myacct1, balance, amount, txnchoice);
		Thread thread2 = new Thread(myaccountthread1);
		thread2.start();

	}

}
