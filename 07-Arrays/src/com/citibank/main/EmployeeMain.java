package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		//5 objects for Employee class invoking param constructor
		Employee e1 = new Employee(101, "Yaminee Bhardwaj", 1000.00);
		Employee e2 = new Employee(201, "Trupti Pagare", 1000.00);
		Employee e3 = new Employee(301, "Satyam Pandey", 1000.00);
		Employee e4 = new Employee(401, "Uday Nimje", 1000.00);
		Employee e5 = new Employee(501, "Kapil Rawat", 1000.00);
		
		//object address
		System.out.println("------------");
		System.out.println(e1);
		//print n has habbit to convert statement to to string so it becomes likes below
		//java push it for u like in above print.
		System.out.println(e1.toString());
		//so to get employye values we need to override tostring function from main object class
		//alt+shift+s then press S
		//logic of this alt+shift+s n press s in employee class
		
		System.out.println("-----------------");
		//creating employee class array now means object array. so type of array is employee  class
		Employee [] allEmployees = new Employee[5];
		Scanner scanner = new Scanner(System.in);
		int employeeId;
		String name;
		double salary;
		//for ctrl+space and second option of for
		for (int i = 0; i < allEmployees.length; i++) {
			System.out.println("Enter Employee Id :");
			employeeId = scanner.nextInt();
			System.out.println("Enter Name :");
			name = scanner.next();
			System.out.println("Enter Salary :");
			salary = scanner.nextDouble();
			Employee employee = new Employee(employeeId, name, salary);
			allEmployees[i] = employee;
			System.out.println();
			
			
		}
	for (Employee employee : allEmployees) {
		//for each u cant define index and have disposition cant be shown like employee 1 n fir details
		System.out.println("employee details :" + employee);
		
	}
		

			

	}

	

	

}
