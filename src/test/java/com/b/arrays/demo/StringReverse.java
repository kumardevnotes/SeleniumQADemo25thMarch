package com.b.arrays.demo;

public class StringReverse {

	public static void main(String[] args) {
		
		/*
		 * Arrays are used to store multiple values into a single variable
		 * Arrays are fixed in size
		 * Arrays store same type of data - homogenous  data
		 * */
		
		String cityName= "Hyderabad"; // dabaredyH
		
		char cityChars[] = cityName.toCharArray(); //{'H' , 'y' ,'d'}
		
		for (int i = cityChars.length-1;  i >= 0; i--) {
			System.out.print(cityChars[i]);
			//System.out.println(cityChars[i]);
		}
	
		
		

	}

}
