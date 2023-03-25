package com.ReadDataDynamically;

import java.util.Scanner;

public class ReadDataFromKeyboard {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter emp details");
		
		String empName = scan.next();
		int empId = scan.nextInt();
		float empsal  = scan.nextFloat();
		
		System.out.println("Please check entered emp details");
		
		System.out.println(empName);
		System.out.println(empId);
		System.out.println(empsal);
	}

}
