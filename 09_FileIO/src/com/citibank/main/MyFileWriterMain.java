package com.citibank.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

import com.citibank.main.domain.MyFileWriter;

public class MyFileWriterMain {

	public static void main(String[] args) {
		String path ;
		String outMessage;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the path where you want to store the o/p:");
		path = scanner.next();		
		System.out.println("Enter the message for file:");
	    scanner.nextLine();
		outMessage = scanner.nextLine();
		File file = new File(path);
		Writer writer = null;
		try {
			//fileWriter is child class object assigned path
			//true is for append
			writer = new FileWriter(file, true);
			MyFileWriter myfilewriter = new MyFileWriter(writer, outMessage);
			
			if (myfilewriter.writeFile() == true) {
				System.out.println("write success");
			}
			else {
				System.out.println("Write Fail");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
