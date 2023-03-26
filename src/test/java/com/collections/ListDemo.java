package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		//In List collection
		//Size is dynamic, you can sore any data type and can also Store duplicates
		//List stores values index based
		List empdetails = new ArrayList();
		empdetails.add("John Miller");
		empdetails.add(1122);
		empdetails.add(5000.4040);
		empdetails.add('F');
		empdetails.add(true);
		empdetails.add("John Miller");
		empdetails.add("John Miller");
		System.out.println(empdetails);
		
		//empdetails.remove(0);
		System.out.println(empdetails);
		
		//empdetails.clear();
		System.out.println(empdetails);
		
		System.out.println(empdetails.contains("John Miller"));
		
		for(Object obj : empdetails) {
			System.out.println(obj);
		}
	}

}
