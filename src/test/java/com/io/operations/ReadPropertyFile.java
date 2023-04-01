package com.io.operations;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		String rootPath = System.getProperty("user.dir");
		FileReader fileReaderObj = new FileReader(rootPath+"//src//test//resources//appData.properties");
		
		Properties properties = new Properties();
		
		properties.load(fileReaderObj);
		System.out.println(properties.getProperty("appName"));
		System.out.println(properties.getProperty("appUrl"));
		System.out.println(properties.getProperty("appUserName"));
		System.out.println(properties.getProperty("appPassword"));
		System.out.println(properties.getProperty("apEnv"));
		System.out.println(properties.getProperty("appBrowser"));
	}

}
