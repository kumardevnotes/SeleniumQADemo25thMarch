package com.bh.methods;

public class NonStaticMethodsJava {

	public static void main(String[] args) {
		//Below is a standard expression to create an object of a class
		NonStaticMethodsJava myObj = new NonStaticMethodsJava();
		
		//Calling a non-static method using class object
		myObj.displayEmpSalay();
		myObj.displayEmpPincode();
		myObj.displayName("Kumar");
		
		myObj.displayEmpTaxStatus(40000);
		myObj.displayEmpTaxStatus(25000);
	}

	// Declaring a non-static method in java
	public void displayEmpSalay() {
		System.out.println("100000");
	}

	// Declaring a non-static method in java
	public void displayEmpPincode() {
		System.out.println("500072");
	}

	// Declaring a non-static method with String parameter
	public void displayName(String empName) {
		System.out.println("empName given is " + empName);
	}
	
	//Declaring a non-static method with int parameter
	public void displayEmpTaxStatus(int empSal) { //25000
		if(empSal > 35000) { //25000 > 35000
			System.out.println("Emp has to pay tax");
		}
		else
		{
			System.out.println("Emp no need to pay any tax");
		}
	}

}
