package com.io.operations;

import java.io.File;
import java.io.IOException;

public class FoldersAndFilesWithJava {

	public static void main(String[] args) throws Exception {
		String rootPath = System.getProperty("user.dir");
		System.out.println(rootPath);
		
		File myFileObj = new File(rootPath+"//src//test//resources//MyFolder");
		if(myFileObj.mkdir()) { //true , if folder is created newly
			System.out.println("new folder created");
		}
		else {
			System.out.println("folder is already existed");
			myFileObj.delete();
			System.out.println("Deleted the existing folder and creating again");
			myFileObj.mkdir();
		}
		
		File myFileObj2 = new File(rootPath+"//src//test//resources//MyFolder//TestData.pdf");
		if(myFileObj2.createNewFile()) { //true , if folder is created newly
			System.out.println("new file created");
		}
		else {
			System.out.println("file is already existed");
			myFileObj2.delete();
			System.out.println("Deleted the existing file and creating again");
			myFileObj2.createNewFile();
		}
	}

}
