package com.citibank.main.domain;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteMyFile {
	//variable of File Class
	//private File file;
	//variable of OutputStream because we need to write n create o/p file
	//private FileOutputStream fileOutputStream;
	//polymorphism as OutputStream Class is parent and can invoke object of child fileOutputStream
	private OutputStream outputStream ;

	//variable of what we will write 
	private String outMessage;
	//constructor param as we need values from user u cant pass empty arguments
//	public WriteMyFile(File file, FileOutputStream fileOutputStream, String outMessage) {
//		super();
//		this.file = file;
//		this.fileOutputStream = fileOutputStream;
//		this.outMessage = outMessage;
//	}
	public WriteMyFile(OutputStream outputStream, String outMessage) {
		super();
		//this.file = file;
		this.outputStream = outputStream;
		this.outMessage = outMessage;
	}
	public boolean writeFile() {
		//this getBytes is function which convert string to byte and give byte array
		//byte array given to write method n it writes in file
		//outputStream.write(outMessage.getBytes());-->this statement can be as below
		byte[] data = outMessage.getBytes();
		try {
			outputStream.write(data);
			return true;
		} catch (IOException e) {
			System.out.println("Error in writing the file");
			return false;
		}finally {
			try {
				outputStream.close();
			} catch (IOException e) {
				System.out.println("Error in closing the file");
			}
		}
		
	}
	

}
