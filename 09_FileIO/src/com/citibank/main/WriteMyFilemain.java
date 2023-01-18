package com.citibank.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

import com.citibank.main.domain.WriteMyFile;

public class WriteMyFilemain {
	
	private static String path ;
	private static String outMessage ;

	public static void main(String[] args) {	
		//first take input of what path u need to store the file
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the path where you want to store the o/p:");
		path = scanner.next();		
		System.out.println("Enter the message for file:");
	    scanner.nextLine();
		outMessage = scanner.nextLine();
		//call the File class contructor thru File object
		File file = new File(path);
		OutputStream outputStream = null;
		try  {
			//achieve polymorphism 
			//system defined class has constructor with boolean true shwoing we can append the data in file
			outputStream = new FileOutputStream(path,true);
			//path is going thru outputStream so no need to pass file in constructor
			WriteMyFile writemyfile = new WriteMyFile(outputStream, outMessage);
			System.out.println("OutMessage for test :" + outMessage);
			if (writemyfile.writeFile()) {
				System.out.println("please check for file");}
			else {
				System.out.println("failed to write file");
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				outputStream.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	}

}
