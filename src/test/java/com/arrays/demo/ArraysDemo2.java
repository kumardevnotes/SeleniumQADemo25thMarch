package com.arrays.demo;

public class ArraysDemo2 {

	public static void main(String args[]) {
		//We cant not store new values into array - 1st disadvantage
		//we cant not store data of diff data types into array why bcoz array store only same data type values
		//Arrays are not dynamic in size . space is wasted
		//Declaring array with size
		//
		int myNumbers[] = new int[100]; //it stores 6 values -- length-1=6-1=5
		
		for(int i=0; i < myNumbers.length ; i++) { //i=6; 6 < 6;
			myNumbers[i] = 100+i; //myNumbers[5] = 100+5
		}
		//100 101 102 103 104 105
		
		for(int i=0; i < myNumbers.length ; i ++) {
			System.out.println(myNumbers[i]);
		}
		
		System.out.println("Hello Arrays");
		System.out.println("Hello Arrays");
		System.out.println("Hello Arrays");
	}

}

