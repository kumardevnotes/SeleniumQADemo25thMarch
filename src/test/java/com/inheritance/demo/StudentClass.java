package com.inheritance.demo;

public class StudentClass {

	//below is a static method
	public static void main(String[] args) {
		StudentClass myObj = new StudentClass(); //standard expression to create an object of the class
		
		//calling methods using the object as shown below
		myObj.dislayStdName();
		myObj.dislayStdId();
		
		myObj.dislayStdName();
		myObj.dislayStdName("Kumar");
	}
	
	//If method names are same in a Java file, then it is called method overloadoing or static polymorphism
	
	//declaring a non-static method as shown below
	public void dislayStdName() {
		System.out.println("John Miller");
	}
	
	//Parameterizing a method in Java
	public void dislayStdName(String stdName) {
		System.out.println("Given name is " + stdName);
	}
	
	//declaring a non-static method as shown below
	public void dislayStdId() {
		System.out.println(112233);
	}


}
