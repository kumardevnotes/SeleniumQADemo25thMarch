package com.io.operations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadTextDocDemo {

	public static void main(String[] args) throws Exception {
		String rootFolder = System.getProperty("user.dir");
		File myFile = new File(rootFolder +"//src//test//resources//myFile.txt");
		
		BufferedReader brObj = new BufferedReader(new FileReader(myFile));
		String myData;
		
		while((myData = brObj.readLine())!= null) { // null != null --> 2 != 2 --> false
			System.out.println(myData);
		}
		
		System.out.println("I have reached end of the file");
	}

}
