package com.controlstructures;

import java.util.Scanner;

/*
 * control structures in java
 * If..Else .. break/continue
 * Forloop
 * Switch
 * While
 * DoWhile..
 * */

public class IfElseDemo {

	public static void main(String[] args) {
		/*
		 * If emp has sal < 1000$, no need to pay
		 * If emp has sal > 1000$ and < 2000$ , has to pay 10% tax
		 * If emp has sal > 2000$, has to pay 20% tax
		 * */ 
		System.out.println("Please enter emp salary to process the tax %");
		Scanner scan = new Scanner(System.in);
		int empSal = scan.nextInt();
		
		if(empSal < 1000) { //3500 < 1000 --> false
			System.out.println("No need to pay tax");
		}
		else if(empSal > 1000 && empSal < 2000 ) { //3500 > 1000 && 3500 < 2000 --> true && false --> false
			System.out.println("Emp has to pay 10% tax");
		}
		
		else  {
			System.out.println("Emp has to pay 20% tax");
		}
		
		/*
		 * AND operator - &&
		 * true && true && true && true--> true
		 * true && false --> false
		 * false && true --> false
		 * false && false --> false
		 * */

	}

}
