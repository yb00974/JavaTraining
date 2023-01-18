package com.citibank.main.domain.service;

import java.util.List;

import com.citibank.main.domain.Customer;

public interface CustomerServiceInterface {
	//this is the repository interface which will have contract relationship
		//with class Repository
		//here we will define the CRUD operation 5 operations for future
		//interface has only declaration
		//added Customer class object because we will create list of Customer object
		public boolean addNewCustomer(Customer customer);
		//i have to return the customer so return type is object of customer
		public Customer getCustomerByCustomerId(int customerId);
		//return customer array for reading all
		public List<Customer> getAllCustomer();
		//return type for update for boolean return type
		//to view updated list we can call getall ya getcustomer method
		public boolean updateCustomerByCustomerId(Customer customer);
		//similar for delete (like update)
		public boolean deleteCustomerByCustomerId(int customerId);

}
