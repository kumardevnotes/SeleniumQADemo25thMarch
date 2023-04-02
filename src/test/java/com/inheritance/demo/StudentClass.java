package com.inheritance.demo;

//Inheriting the methods of Parent into Child
//Child class extends Parent class
//Subclass extends Super class
public class StudentClass extends SchoolClass{ // 3+2 = 5

	//below is a static method
	public static void main(String[] args) {
		StudentClass myObj = new StudentClass(); //standard expression to create an object of the class
		
		//calling methods using the object as shown below
		myObj.dislayStdName();
		myObj.dislayStdId();
		
		myObj.dislayStdName();
		myObj.dislayStdName("Kumar");
		
		myObj.displaySchoolName();
		myObj.displaySchoolId();
		
		
	}
	
	//Overriding the method of parent class in child class
	//Runtime or dynamic polymorphism
	public void displaySchoolId() {
		System.out.println(1234);
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
