package com.controlstructures;

public class WhileDemoDoWhileDemo {

	public static void main(String[] args) {
		
		//while and dowhile used to run the same statements repeatendly
		// In while, first condition is checked and then execution starts if condition is true
		int number = 10;
		while (number > 0) { 
			System.out.println(number);
			number--; // 9
		}

		//In dowhile, execution starts first and then condition is checked
		//if condition is true then again do while is executed
		int number2 = 5;
		do {
			System.out.println(number2);
			number2--; //4
		} while (number2 > 0); //0 >0
	}

}
