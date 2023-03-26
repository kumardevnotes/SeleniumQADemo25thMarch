package com.controlstructures;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		String myDay = "Saturdayyyyyy";

		switch (myDay) {
		case "Monday":
			System.out.println("First day of the week");
			break;
		case "Friday":
			System.out.println("Fifth day of the week");
			break;
		case "Saturday":
			System.out.println("Sixth day of the week");
			System.out.println("Sixth day of the week");
			System.out.println("Sixth day of the week");
			break;
		case "Sunday":
			System.out.println("Seventh day of the week");
			break;
		default:
			System.out.println("You have entered invalid day");
			
		}
		System.out.println("Outside switch case");
	}

}
