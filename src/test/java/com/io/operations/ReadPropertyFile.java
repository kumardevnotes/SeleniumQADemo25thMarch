package com.io.operations;

import java.io.FileReader;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws Exception {
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
