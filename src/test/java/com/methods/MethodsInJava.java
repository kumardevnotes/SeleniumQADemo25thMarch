package com.methods;

public class MethodsInJava {

	public static void main(String[] args) {
		//Calling a method
		displayName();
		//Calling a method
		displayName("Kumar");
		
		displayName();
		displayName("Sam");
		
		displayName();
		displayName("James");
	}

	//Declaring a method
	//Methods contain block of code or statements
	//Method overloading in java that means same method name but with different param list or diff logic
	public static void displayName() {
		System.out.println("Joh Miller");
	}

	//Declaring a method
	public static void displayName(String name) {
		System.out.println("Given name is " + name);
	}
	
	// Single line comments
	// single comments
	
	/*
	 * multi
	 * line
	 * comments
	 * */

}
