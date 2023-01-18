package com.citibank.main.domain;

import java.io.IOException;
import java.io.Writer;

public class MyFileWriter {
	private Writer fileWriter;
	private String data;
	//constructor
	public MyFileWriter(Writer fileWriter, String data) {
		super();
		this.fileWriter = fileWriter;
		this.data = data;
	}
	
	//to write data in file line by line
	public boolean writeFile() {
		//we have string function to write so just write
		try {
			fileWriter.write(data);
			return true;
		} catch (IOException e) {
			System.out.println("write operation failed");
			return false;
		}finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("writer resource close failed");
			}
		}
		
	}
	

}
