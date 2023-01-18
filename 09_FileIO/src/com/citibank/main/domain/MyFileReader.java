package com.citibank.main.domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class MyFileReader {
	//File reader class reads in char not with byte
	//data will be in char
	private char [] data;
	//need file -->this will give path too
	private File file;
	//length of file
	private int length;
	//who will read file
	private Reader reader;
	//this is chile of FileReader class allowing line by line 
	private BufferedReader bufferedReader;
	//constructor
	//here File is meta class for all details like length n all etc but Reader is another class  which is to doing read of file
	//they are both different class
	public MyFileReader(File file, Reader reader) {
		super();
		//this.data = data;
		this.file = file;
		//this.length = length;
		this.reader = reader;
	}
	//to read child class uncommon method i will call constructor with explicit ref of child class which is FileReader other wise we need to down cast as thru polymorphism u cnat do that
	public MyFileReader(BufferedReader bufferedReader) {
		this.bufferedReader = bufferedReader;		
	}
	//to read file line by line
	public String readFileLineByLine() {
		String fileData = "";
		try {
			//below line commenting. this will only read one line
			//if file has lot of line then we need loop
			//String fileData = bufferedReader.readLine();
			//now read line by line logic
			
			String temp = bufferedReader.readLine();
			do {
				fileData = fileData + temp + "\n";
				temp = bufferedReader.readLine();
			}while(temp != null);
			return fileData;
		} catch (IOException e) {
			System.out.println("Error While Reading file");
			return "";
		} finally {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				System.out.println("Error While closing BufferedReader");
			}
		}
	}
	
	//method
	public String readFile() {
		try {
			length = (int)file.length();
			data = new char[length];
			reader.read(data);
			String dataFromFile = new String(data);
			System.out.println("datafromfile :" + dataFromFile);
			return dataFromFile;
		} catch (IOException e) {
			System.out.println("error while reading file");
		}finally {
			try {
			reader.close();
		}catch(IOException e) {
			System.out.println("Error while closing the file");
		}
		}
		return "";
	}
	

}
