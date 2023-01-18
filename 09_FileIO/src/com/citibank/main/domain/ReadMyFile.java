package com.citibank.main.domain;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadMyFile {
	private String path = "C:\\MyJavaTraining\\test.txt";
	//class input stream created just reference
	private InputStream inputStream;
	//private byte[] data = new byte[100];
	private byte[] data;
	private int arrayLength;
	
	public void readFile() {
		//inputstream assigned object for FileInputStream
		//it will throw error if just below code ask for exception handling
		//this is checked exception
		//inputStream = new FileInputStream(path);
		try {
			//just to read the length we will define File class object and length function as long
			File file = new File(path);
			//typecasting as lngth is long and we converted it into int
			arrayLength = (int) file.length();
			data = new byte[arrayLength];
			inputStream = new FileInputStream(path);
			//now we are passing empy data array and read function will read and fill this data array
			inputStream.read(data);
			for (byte b : data) {
				//typecast byte data to char so forcing it
				System.out.print((char) b);
				
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found:");
			//e.printStackTrace();--?gives stack of classes where error happened
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("error in reading");
		}
		finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Failed to close the File");
			}
		}
	}
	
	

}
