package com.citibank.main;

import com.citibank.main.repository.CustomerRepository;

import java.util.List;
import java.util.Scanner;

import com.citibank.main.domain.Customer;
import com.citibank.main.domain.service.CustomerService;

public class CustomerMain {
	public static void main(String[] args) {
		CustomerService customerservice = new CustomerService();
		List<Customer> customerList = customerservice.getAllCustomer();
		Customer cust1 = null;
		for (Customer customer : customerList ) {
			System.out.println("Customer details :");
			System.out.println(customer);
		}
		//selecting only 1 customer
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the customer id for select");
		int customerId = scanner.nextInt();
		if (customerId > 0) {
			System.out.println("search for customer Id : " + customerId);
			cust1 = customerservice.getCustomerByCustomerId(customerId);
			if (cust1 != null) {
				System.out.println("customer details");
				System.out.println(cust1);			
				
			}
		}
		//adding new customer
		//accept input fields
//		System.out.println("enter the details for insert");
//		System.out.println("enter name");
//		String name1 = scanner.next();
//		System.out.println("enter address");
//		String address1 = scanner.next();
//		System.out.println("enter phoneno");
//		String phoneno1 = scanner.next();
//		Customer cust2 = new Customer(0, name1, address1, phoneno1);
//		boolean flag = customerservice.addNewCustomer(cust2);
//		if (flag == true) {
//			System.out.println("insert successful");
//			
//		}
//		else {
//			System.out.println("insert failed");
//		}
		//update  customer
				//accept input fields
//				System.out.println("enter the custid for update");
//				System.out.println("enter customerId");
//				int custId = scanner.nextInt();
//				System.out.println("enter name");
//				String name3 = scanner.next();
//				System.out.println("enter address");
//				String address3 = scanner.next();
//				System.out.println("enter phoneno");
//				String phoneno3 = scanner.next();
//				Customer cust3 = new Customer(custId, name3, address3, phoneno3);
//				
//				boolean flag1 = customerservice.updateCustomerByCustomerId(cust3);
//				if (flag1 == true) {
//					System.out.println("update successful");
//					
//				}
//				else {
//					System.out.println("update failed");
//				}
				//delete  customer
				//accept input fields
				System.out.println("enter the custid for delete");
				System.out.println("enter customerId");
				int custId1 = scanner.nextInt();
				
				boolean flag2 = customerservice.deleteCustomerByCustomerId(custId1);
				if (flag2 == true) {
					System.out.println("delete successful");
					
				}else {
					System.out.println("delete failed");
				}
		
		
	}
	
		
		

}
