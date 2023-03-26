package com.classdemo;

public class JavaClassDemo {

	static String stdName = "John Doe";
	static int stdId = 2233;

	public static void main(String[] args) {
		JavaClassDemo obj = new JavaClassDemo();
		//calling methods
		obj.displayName();
		obj.displayId();
	}

	//non-static method declaration
	public void displayName() {
       System.out.println(stdName);
	}

	//non-static method declaration
	public void displayId() {
		System.out.println(stdId);
	}

}
