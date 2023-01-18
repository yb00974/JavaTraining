package com.citibank.main.domain;

import java.io.File;
import java.util.Date;

public class MyFileMetaData {
	private String path = "C:\\MyJavaTraining\\test.txt";
	public void printFileMetadat() {
		//File io class got imported with standard fileobject
		//here just going to chekc path of file just get its metadata
		File file = new File(path);
		//checking if file path is right or wrong
		if(file.exists()){
			System.out.println("File NAme :" + file.getName());
			System.out.println("File Path :" + file.getPath());
			System.out.println("File Size :" + file.length() + "bytes");
			System.out.println("Can Open :" + file.canExecute());
			System.out.println("Can Write :" + file.canWrite());
			System.out.println("Can Read : " + file.canRead());
			//to convert timestamp in readable format
			Date lastModifiedDate = new Date(file.lastModified());
			System.out.println("Last Modified :" + lastModifiedDate);
					
		}else {
			System.out.println("File doesnt exists");
			System.out.println("Enter Valid path");
		}
	}

}
