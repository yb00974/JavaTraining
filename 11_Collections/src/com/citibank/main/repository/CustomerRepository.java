package com.citibank.main.repository;
//by creating class by adding interface it wrote all methods

import java.util.ArrayList;
import java.util.List;

import com.citibank.main.domain.Customer;

public class CustomerRepository implements CustomerRepositoryInterface {
	//creating list of customer object which is empty at first then cal
	//addnewcustomer to add values
	private List<Customer> customerList = new ArrayList<>();

	@Override
	public boolean addNewCustomer(Customer customer) {
		// predefined add function is there(first option to select comes as with return type boolean for object list for customer
		return customerList.add(customer);
	}

	@Override
	public Customer getCustomerByCustomerId(int customerId) {
		
		//System.out.println("Lets compare customer Id to find in the List:");
		
		for (Customer customer : customerList) {
			if (customer.getCustomerId() == customerId) {
				//System.out.println("Customer value found::" + customer);
				return customer;
				
			}
	}
		return null;
	}

	@Override
	public List<Customer> getAllCustomer() {
		//here for loop not required because we are returning whole list
		//for (Customer customer : customerList) {
			//System.out.println(customer);
			return customerList;
		
	}

	@Override
	public boolean updateCustomerByCustomerId(Customer customer) {
		boolean flag = false;
		for (Customer c : customerList) {
			if (c.getCustomerId() == customer.getCustomerId()) {
				c.setName(customer.getName());
				c.setAddress(customer.getAddress());
				c.setPhno(customer.getPhno());
				return true;
			}	
	}
		return false;
	}

	@Override
	public boolean deleteCustomerByCustomerId(int customerId) {
		for (Customer c : customerList) {
			if (c.getCustomerId() == customerId) {
				//System.out.println("Customer value found for ::" + c);
				//System.out.println("Now delete the customer:");
				customerList.remove(c);
				return true;
			}
			
		}
		return false;
	}

}
