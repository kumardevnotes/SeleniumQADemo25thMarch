package com.controlstructures;

public class SwitchCaseWithInt {

	public static void main(String[] args) {
		int empId = 999;

		switch (empId) {
		case 1122:
			System.out.println("This empId belongs to John");
			break;
		case 1000:
			System.out.println("This empId belongs to Mike");
			break;
		default:
			System.out.println("You have entered invalid empId");
			break;
		}
		System.out.println("Outside switch case");
	}

}
