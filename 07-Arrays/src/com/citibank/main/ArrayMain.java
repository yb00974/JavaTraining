package com.citibank.main;

public class ArrayMain {

	public static void main(String[] args) {
		//defining array
		int [] numbers = new int[5];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;

		//for each loop-->u cant change original value using for loop variable
		for (int i : numbers) {
			System.out.println("print array:");
			System.out.println(i);
			i = i + 1;
			System.out.println("updated array value :" + i);
			
			
			}
		System.out.println("----------");
		for (int j : numbers) {
			System.out.println(j);
						
		}

	}

}
