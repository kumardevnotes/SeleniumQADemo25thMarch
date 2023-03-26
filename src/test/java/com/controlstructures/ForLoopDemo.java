package com.controlstructures;

public class ForLoopDemo {

	public static void main(String[] args) {
		   //Declaration; condition;increment
		for (int i = 0; i < 5; i++) { // 5 ; 5 < 5
			System.out.println("Hello All!");
		}
		System.out.println("*************");
		//Declaration; condition;decrement
		for (int i = 5; i > 0; i--) { // 0 ; 0 > 0
			System.out.println("Hello All!");
		}
		System.out.println("*************");
		
		//Print only even numbers from 1 to 10 -- 2, 4, 6 ,8 , 10
		for (int i = 1; i < 11; i++) { 
			if(i==1 || i==3 || i==5 || i==7 || i==9) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("*************");
		for (int i = 1; i < 11; i++) { 
			if(i==5) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("I am ouside forloop");
		
		
		
	}

}
