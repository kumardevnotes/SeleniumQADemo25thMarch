package com.b.arrays.demo;

public class ArraysDemo {

	public static void main(String[] args) {

		int empId = 450;

		//Creating array and assignign values to array
		int empIds[] = { 200, 300, 400, 500 }; // 0 1 2 3 .. Position of last value in array length-1
		
		char myChars[] = {'g', 'h', 'l'};

		for (int i = 0; i < empIds.length; i++) {
			//System.out.println("element " + empIds[i] + " position is " + i);
		}

		//Printing the array in reverse order 
		for (int i = empIds.length-1;  i >= 0; i--) {
			System.out.println("element " + empIds[i] + " position is " + i);
		}
		
		
		//declaring array with Size
		int myList[] = new int[5];
		
		//storing values into array
		for (int i = 0; i < myList.length; i++) {
			myList[i] = 100+i;
		}
		
		//printing array values
		for (int i = 0; i < myList.length; i++) {
		System.out.println(myList[i]);
		}

	}

}
