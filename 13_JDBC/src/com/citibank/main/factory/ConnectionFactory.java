package com.citibank.main.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.citibank.main.domain.Customer;

public class ConnectionFactory {
	private String driverName = "com.mysql.cj.jdbc.Driver";
	
	private String url = "jdbc:mysql://localhost:3306/citibankdb";
	private String userId = "root";
	private String password = "root";
	
	private Connection connection;
	
	public Connection getConnection() {
		try {
			Class.forName(driverName);
			connection = DriverManager.getConnection(url, userId, password);
			return connection;
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("failed to load driver");
			e.printStackTrace();
		}
		return null;
	}

}
