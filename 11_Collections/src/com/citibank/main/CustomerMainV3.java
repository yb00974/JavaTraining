package com.citibank.main;

import java.util.HashSet;
//in case of hashset memory gets divided in 16blocks
//and sort order is on basis of hashcode-->hashode is converted to some value between 0 to 15 thru formula
//so that object goes to index no (lets say formula gave 4 so it is stored in 4)
//so we need to override the hashset function hashcode and equals
//but when we use String class we dnt require hashing logic because String class does override of hashcode and equals
//so i updated Customer class for customer
import java.util.Set;

import com.citibank.main.domain.Customer;

public class CustomerMainV3 {

	public static void main(String[] args) {
		Set<Customer> customerSet = new HashSet<>();
		Customer cust1 = new Customer(101, "Yaminee Bhardwaj", "Wagholi", "9975578425");
		Customer cust2 = new Customer(201, "Neelima Bhardwaj", "Pimple", "9975578426");
		Customer cust3 = new Customer(301, "Mani Bhardwaj", "Udaipur", "9975578427");
		Customer cust4 = new Customer(401, "Lokesh Sharma", "Shobhagpura", "9975578428");
		Customer cust5 = new Customer(501, "Beena Sharma", "Aligarh", "9975578429");
		Customer cust6 = new Customer(501, "Beena Sharma", "Aligarh", "9975578429");
		
		System.out.println("First Customer::" + cust1.hashCode());
		System.out.println("Adding 1st Customer ::"+ customerSet.add(cust1));
//		System.out.println("Adding 2nd Customer ::"+ customerSet.add(cust2));
//		System.out.println("Adding 3rd Customer ::"+ customerSet.add(cust3));
//		System.out.println("Adding 4th Customer ::"+ customerSet.add(cust4));
		System.out.println("fifth Customer::" + cust5.hashCode());
		System.out.println("Adding 5th Customer ::"+ customerSet.add(cust5));
		System.out.println("sixth Customer::" + cust6.hashCode());
		System.out.println("Adding 6th Customer ::"+ customerSet.add(cust6));
		
		System.out.println("Printing Hashset");
		for (Customer customer : customerSet) {
			System.out.println(customer);		
		}
		
		
	}

}
