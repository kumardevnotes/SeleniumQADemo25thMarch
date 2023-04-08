package com.interfaces.demo;

//It contains methods with or without body
public abstract class MySchoolAbtractClass {

	//non-abstract method or method with body
	public void displaySchoolName() {
		System.out.println("High School");
	}
	
	//abstract method or method without body
	public abstract void displaySchoolName(String schoolName);
	
	public abstract int getSchollFee();
	
}
