package com.citibank.main.repository;
//by creating class by adding interface it wrote all methods

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.citibank.main.domain.Customer;
import com.citibank.main.factory.ConnectionFactory;

public class CustomerRepository implements CustomerRepositoryInterface {
	//creating list of customer object which is empty at first then cal
	//addnewcustomer to add values
	private String driverName = "com.mysql.cj.jdbc.Driver";
	private List<Customer> customerList = new ArrayList<>();
	private String url = "jdbc:mysql://localhost:3306/citibankdb";
	private String userId = "root";
	private String password = "root";
	private String sql;
	private Connection connection;
	private PreparedStatement preparedStatement;
	private int rowCount;
	ResultSet resultSet;
	

	@Override
	public boolean addNewCustomer(Customer customer) {
		// predefined add function is there(first option to select comes as with return type boolean for object list for customer
		connection = new ConnectionFactory().getConnection();
	  	sql = "insert into customer_details(name,address,phoneno) values(?,?,?)";
	  	try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, customer.getName());
		  	preparedStatement.setString(2, customer.getAddress());
		  	preparedStatement.setString(3, customer.getPhno());
		  	rowCount = preparedStatement.executeUpdate();
		  	if(rowCount > 0)
		  		return true;
		} catch (SQLException e) {
			System.out.println("exception in add query");
			System.out.println(e.getMessage());
			return false;
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
			System.out.println("close of connection failed");
			}
		}
	  
	  	return customerList.add(customer);
	}

	@Override
	public Customer getCustomerByCustomerId(int customerId) {
		
		connection = new ConnectionFactory().getConnection();
	  	sql = "select * from customer_details where customer_id = ?";
	  	try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, customerId);
			//we dont have ? so we dnt need to set just execute
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				int customerID = resultSet.getInt("customer_id");
				String name = resultSet.getString("name");
				String address = resultSet.getString("address");
				String phoneno = resultSet.getString("phoneno");
				Customer customer = new Customer(customerID, name, address, phoneno);
				return customer;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception in query execution");
			System.out.println(e.getMessage());
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return null;
	}

	@Override
	public List<Customer> getAllCustomer() {
		//here for loop not required because we are returning whole list
		//for (Customer customer : customerList) {
			//System.out.println(customer);
		//now get connection from myfactory class
		  	connection = new ConnectionFactory().getConnection();
		  	sql = "select * from customer_details";
		  	try {
				preparedStatement = connection.prepareStatement(sql);
				//we dont have ? so we dnt need to set just execute
				resultSet = preparedStatement.executeQuery();
				while(resultSet.next()) {
					int customerID = resultSet.getInt("customer_id");
					String name = resultSet.getString("name");
					String address = resultSet.getString("address");
					String phoneno = resultSet.getString("phoneno");
					Customer customer = new Customer(customerID, name, address, phoneno);
					customerList.add(customer);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Exception in query execution");
				System.out.println(e.getMessage());
			} finally {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return customerList;
		
	}

	@Override
	public boolean updateCustomerByCustomerId(Customer customer) {
		connection = new ConnectionFactory().getConnection();
	  	sql = "update customer_details set name=?, address=?, phoneno=? where customer_id = ?";
	  	try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(4, customer.getCustomerId());
			preparedStatement.setString(1, customer.getName());
		  	preparedStatement.setString(2, customer.getAddress());
		  	preparedStatement.setString(3, customer.getPhno());
			rowCount = preparedStatement.executeUpdate();
			if(rowCount > 0){
				return true;
				
			}
		} catch (SQLException e) {
			System.out.println("exception in update query");
			System.out.println(e.getMessage());
			return false;
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
			System.out.println("close of connection failed");
			}
		}
		return false;
	}

	@Override
	public boolean deleteCustomerByCustomerId(int customerId) {
		connection = new ConnectionFactory().getConnection();
		
	  	sql = "delete from customer_details where customer_id = ?";
	  	try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, customerId);
			rowCount = preparedStatement.executeUpdate();
			if(rowCount > 0){
				return true;
				
			}
		} catch (SQLException e) {
			System.out.println("exception in delete query");
			System.out.println(e.getMessage());
			return false;
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
			System.out.println("close of connection failed");
			}
		}
		return false;
	}

}
