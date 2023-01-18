package com.citibank.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ConnectionTest {

	public static void main(String[] args) {
		System.out.println("Main Start");
		Connection connect = null;
		Scanner scanner = new Scanner(System.in);
		String name;
		String address;
		String phoneno;
		int rowCount = 0;
		//whatever classname we put under "" forNAme that will be forcefully loaded
		//for Name static method of class Class and its loaded in JVM
		//driver.class under com.mysql.cj.jdbc which is imp driver which we need to load
		//we did right click copy qualified name n remove .class from it
		//to establish connection
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.Driver Loaded successfully");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found!!");
		}
		//to make connection with database we need to do below
		try {
			//this getconnection is returning the object of the class which is implemneting DriverManager Class
			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/citibankdb", "root", "root");
			System.out.println("connection successful");
			//here we created string for prepared statement
			//this  ? gives its prepared statement n avoid sql injection
			//this ? will be replaced with values from prepared statement later
			String sql = "insert into customer_details(name,address,phoneno) values(?,?,?)";
			//created PreparedStatement
			PreparedStatement preparedStatement = connect.prepareStatement(sql);
			//execute query
//			preparedStatement.setString(1, "Yaminee Bhardwaj");
//			preparedStatement.setString(2, "Pune");
//			preparedStatement.setString(3, "99999");
//			preparedStatement.setString(1, "Neelima Bhardwaj");
//			preparedStatement.setString(2, "Pune1");
//			preparedStatement.setString(3, "999999");
			for (int i = 0; i < 5; i++) {
			System.out.println("Enter name:");	
			name =  scanner.nextLine();
			System.out.println("Enter address:");
			address = scanner.nextLine();
			System.out.println("Enter phoneno:");
			phoneno = scanner.nextLine();
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, address);
			preparedStatement.setString(3, phoneno);
			
			rowCount = preparedStatement.executeUpdate();
			System.out.println("insert happening");
			}
			
			System.out.println("I am here");
			System.out.println("Row count:" + rowCount);
			if(rowCount > 0) {
			
				System.out.println("Record insert successfully");
			}
			else {
				System.out.println("No rows inserted!!");
			}
			
		} catch ( SQLException e) {
			System.out.println("Connection failed");
		} finally {
			try {
				connect.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Close of connection failed");
			}
		}
		System.out.println("Main End");
	}

}
