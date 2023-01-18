package com.citibank.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.citibank.domain.service.CustomerService;
import com.citibank.main.domain.Customer;

public class CustomerMainV2 {

	public static void main(String[] args) {
		// from here we will call service layer-->this calls -->repository call
		CustomerService customerService = new CustomerService();
		//add 5 customer
		//here customer class just a envelop for variables we dnt do any business logic there
		System.out.println("adding Customers");
		//right now just hardcoding but we can use scanner to accept input
		Customer cust1 = new Customer(101, "Yaminee Bhardwaj", "Wagholi", "9975578425");
		Customer cust2 = new Customer(201, "Neelima Bhardwaj", "Pimple", "9975578426");
		Customer cust3 = new Customer(301, "Mani Bhardwaj", "Udaipur", "9975578427");
		Customer cust4 = new Customer(401, "Lokesh Sharma", "Shobhagpura", "9975578428");
		Customer cust5 = new Customer(501, "Beena Sharma", "Aligarh", "9975578429");
		
		System.out.println("Adding 1st Customer ::"+ customerService.addNewCustomer(cust1));
		System.out.println("Adding 2nd Customer ::"+ customerService.addNewCustomer(cust2));
		System.out.println("Adding 3rd Customer ::"+ customerService.addNewCustomer(cust3));
		System.out.println("Adding 4th Customer ::"+ customerService.addNewCustomer(cust4));
		System.out.println("Adding 5th Customer ::"+ customerService.addNewCustomer(cust5));
		
		System.out.println("-------------------------------");
		System.out.println("Printing all the customers from the List(DB)::");
		List<Customer> customerList = customerService.getAllCustomer();
		for (Customer customer : customerList) {
			System.out.println(customer);			
		}
		
		System.out.println("-------------------------------");
		System.out.println("Printing only 1 customers from the List(DB)::");
		Scanner scanner = new Scanner(System.in);
		int custId;
		System.out.println("Enter the Customer you want to retrieve:");
		custId = scanner.nextInt();
		System.out.println("Printing the Customer:");
		Customer customer = customerService.getCustomerByCustomerId(custId);
		System.out.println(customer);
		System.out.println("-------------------------------");
		System.out.println("Updating only 1 customers from the List(DB)::");
		boolean flag = false;
		System.out.println("Enter the Customer you want to update:");
		custId = scanner.nextInt();		
		scanner.nextLine();
		System.out.println("Enter the name");
		String name = scanner.nextLine();
	
		System.out.println("Enter the address");
		String address = scanner.nextLine();
		//scanner.nextLine();
		System.out.println("Enter the phoneno");
		String phno = scanner.nextLine();	
		Customer customer1 = new Customer(custId, name, address, phno);
		flag = customerService.updateCustomerByCustomerId(customer1);
		if (flag == true) {
			System.out.println("update successful");
			System.out.println("Printing the updated Customer:");
			customer1 = customerService.getCustomerByCustomerId(custId);
			System.out.println(customer1);
		}
		else
		{
			System.out.println("Update not successful");
		}
		System.out.println("-------------------------------");
		System.out.println("Deleting only 1 customers from the List(DB)::");
		System.out.println("Enter the Customer you want to delete:");
		custId = scanner.nextInt();	
		boolean flag2 = false;
		flag2 = customerService.deleteCustomerByCustomerId(custId);
		if (flag2 == true) {
			System.out.println("delete successful");
			System.out.println("Printing the all Customer:");
			List<Customer> customerList1 = customerService.getAllCustomer();
			for (Customer customer3 : customerList1) {
				System.out.println(customer3);			
			}
		}
		else
		{
			System.out.println("Delete not successful");
		}
		
			
	}

}
