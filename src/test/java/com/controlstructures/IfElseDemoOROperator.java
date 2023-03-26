package com.controlstructures;

import java.util.Scanner;

public class IfElseDemoOROperator {

	public static void main(String[] args) {
		/*
		 * If voterAge is less than 18, not allowed to vote
		 * If voterAge is  greater than 18 and less than 60 -- he has to vote at the voting station
		 *  If voterAge is  greater than 60 -- he has to vote from his home
		 * */ 
		System.out.println("Please enter the age of the voter");
		Scanner scan = new Scanner(System.in);
		int voterAge = scan.nextInt();
		
		if(voterAge > 18 || voterAge < 60 ) { // 60 > 18 || 60 < 60 --> true || false --> true
			System.out.println("Voter has to go and vote at the voting station");
		}
		else if( voterAge > 60 ) { //3500 > 1000 && 3500 < 2000 --> true && false --> false
			System.out.println("Voter can vote from home");
		}
		
		else  {
			System.out.println("Voter is not allowed to Vote");
		}
		
		/*
		 * OR operator - ||
		 * true || true --> true
		 * true || false --> true
		 * false || true --> true
		 * false || false --> false
		 * */

	}

}
