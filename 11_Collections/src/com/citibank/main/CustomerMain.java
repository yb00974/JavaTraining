package com.citibank.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.citibank.main.domain.Customer;

public class CustomerMain {

	public static void main(String[] args) {
		Customer cust1 = new Customer(101, "Yaminee Bhardwaj", "Wagholi", "9975578425");
		Customer cust2 = new Customer(201, "Neelima Bhardwaj", "Pimple", "9975578426");
		Customer cust3 = new Customer(301, "Mani Bhardwaj", "Udaipur", "9975578427");
		Customer cust4 = new Customer(401, "Lokesh Sharma", "Shobhagpura", "9975578428");
		Customer cust5 = new Customer(501, "Beena Sharma", "Aligarh", "9975578429");

		List<Customer> customerList = new ArrayList<>();

		customerList.add(cust1);
		customerList.add(cust2);
		customerList.add(cust3);
		customerList.add(cust4);
		customerList.add(cust5);

		printAllCustomers(customerList);
		Scanner scanner = new Scanner(System.in);
		//now we will accept customer id, name and address for update
//		int customerId;
//		System.out.println("Enter CustomerId::");
//		customerId = scanner.nextInt();
//		printCustomerByCustomerId(customerList, customerId);
		int customerId;
		String name,address,phone;
		System.out.println("Enter CustomerId for update::");
		customerId = scanner.nextInt();
		//commenting to use delete
//		scanner.nextLine();
//		System.out.println("Enter New name::");
//		name = scanner.nextLine();
//		scanner.nextLine();
//		System.out.println("Enter New Address");
//		address = scanner.nextLine();
//		scanner.nextLine();
//		System.out.println("Enter New phno");
//		phone = scanner.nextLine();		
//		Customer updCust = new Customer(customerId, name, address, phone);
//		updateCustomerByCustomerId(customerList, updCust);
		deleteAllCustomers(customerList, customerId);
		System.out.println("-------------");
		printAllCustomers(customerList);
		

	}
	private static void deleteAllCustomers(List<Customer> customerList,int customerId) {
		System.out.println("Lets compare customer Id for delete");
		boolean flag = false;
		for (Customer c : customerList) {
			if (c.getCustomerId() == customerId) {
				System.out.println("Customer value found for ::" + c);
				System.out.println("Now delete the customer:");
				customerList.remove(c);
				flag = true;
				System.out.println("deleted Customer");
				//System.out.println(c);				
				break;
			}
			
		}
	}
					

	private static void printAllCustomers(List<Customer> customerList) {
		System.out.println("All Customers:");
		for (Customer customer : customerList) {
			System.out.println(customer);
		}
	}
	
	private static void updateCustomerByCustomerId(List<Customer> customerList, Customer updCust) {
		System.out.println("Lets compare customer Id for update");
		boolean flag = false;
		for (Customer c : customerList) {
			if (c.getCustomerId() == updCust.getCustomerId()) {
				System.out.println("Customer value found for ::" + updCust);
				System.out.println("Now update the customer:");
				c.setName(updCust.getName());
				c.setAddress(updCust.getAddress());
				c.setPhno(updCust.getPhno());
				flag = true;
				System.out.println("updated Customer");
				System.out.println(c);
				
				break;
				
				

			}

		}
	}

	private static void printCustomerByCustomerId(List<Customer> customerList, int customerId) {
		boolean flag = false;
		System.out.println("Lets compare customer Id");
		for (Customer customer : customerList) {
			if (customer.getCustomerId() == customerId) {
				System.out.println("Customer value found::" + customer);
				flag = true;
				break;

			}

		}
		if (flag == false) {
			System.out.println("No Customer found:");
		}
	}

}