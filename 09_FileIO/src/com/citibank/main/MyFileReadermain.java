package com.citibank.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.citibank.main.domain.MyFileReader;

public class MyFileReadermain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path;
		//defining File class n type file variable
		File file;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the path for the input file you want to read:");
		path = scanner.next();
		file = new File(path);
		int arrayLength = (int) file.length();
		//defining reference of standard class File Reader and my server class myfilereader
		FileReader filereader = null;
		MyFileReader myfilereader = null;
		BufferedReader bufferedreader = null;
		
		//now if i need to read line by line i need FileReader class
		//to bring in record from harddisk in RAM and buffer Read will read the RAM
		try {
			filereader = new FileReader(file);
			bufferedreader = new BufferedReader(filereader);
			myfilereader = new MyFileReader(bufferedreader);
			String data  = myfilereader.readFileLineByLine();
			System.out.println("data :" + data);
		} catch(FileNotFoundException e){
			System.out.println("error while opening file");
		}
		finally {
			try {
				bufferedreader.close();
				filereader.close();
			} catch (IOException e1) {
				System.out.println("close failed:");
			}
				
		}
			
		}
		
		
//		try {
//			filereader = new FileReader(file);
//			System.out.println("path of file found n pointer set now will read thru server");
//			myfilereader = new MyFileReader(file, filereader);
//			myfilereader.readFile();
//		} catch (FileNotFoundException e) {
//			System.out.println("No file path found to read");
//		}finally {
//			try {
//				filereader.close();
//				System.out.println("File Reader resource closed successfully");
//			} catch (IOException e) {
//				System.out.println("resource not closed due to error");
//			}
//			
//		}
//		

	}
	


