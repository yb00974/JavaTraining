package com.citibank.main.domain;

public class Employee {
	private int employeeId;
	private String name;
	private double salary;
	
	//ctrl+space enter-->default constructor
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	//alt+shift+s then screen comes press O -->param constructor

	public Employee(int employeeId, String name, double salary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}
	//alt+shift+s then screen comes press R gives getter and setter
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	//so to get employye values we need to override tostring function from main object class
			//alt+shift+s then press S we didnt select inherit method because we wanted variables only
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	      
	
	

}
