package com.citibank.domain.service;

import java.util.List;

import com.citibank.main.domain.Customer;
import com.citibank.main.repository.CustomerRepository;
import com.citibank.main.repository.CustomerRepositoryInterface;

public class CustomerService implements CustomerServiceInterface {
	//we are creating has of relationship means composition
	
	//private CustomerRepository customerRepository = new CustomerRepository();
	//now polymorphism so we will use interface ref using object of class
	private CustomerRepositoryInterface customerRepository = new CustomerRepository();
	//after this we use spring--which says dont create object i will create just define reference
	//@Autowire to create object in case of spring
	@Override
	public boolean addNewCustomer(Customer customer) {
		//calling function of customer Repository class
		//logging
		//authentication
		return customerRepository.addNewCustomer(customer);
	}

	@Override
	public Customer getCustomerByCustomerId(int customerId) {
		return customerRepository.getCustomerByCustomerId(customerId);
	}

	@Override
	public List<Customer> getAllCustomer() {
		
		return customerRepository.getAllCustomer();
	}

	@Override
	public boolean updateCustomerByCustomerId(Customer customer) {
		
		return customerRepository.updateCustomerByCustomerId(customer);
	}

	@Override
	public boolean deleteCustomerByCustomerId(int customerId) {
	
		return customerRepository.deleteCustomerByCustomerId(customerId);
	}

}
