package com.bh.methods;

public class JavaMethods {

	// Java method is a block of statements
	public static void main(String[] args) {
		String empName = "John Miller";
		//System.out.println(empName);

		// calling a method by its name
		//displayEmpSalay();
		
		displayEmpPincode();
		displayName("Kumar");

		displayEmpPincode();
		displayName("Mehatha");

		displayEmpPincode();
		displayName("Saloni");
	}

	// Declaring a static method in java
	public static void displayEmpSalay() {
		System.out.println("100000");
	}

	// Declaring a static method in java
	public static void displayEmpPincode() {
		System.out.println("500072");
	}

	// Declaring a static method with String parameter
	public static void displayName(String empName) {
		System.out.println("empName given is " + empName);
	}

}
