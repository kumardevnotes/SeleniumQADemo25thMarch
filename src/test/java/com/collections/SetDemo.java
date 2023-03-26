package com.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		//In List collection
		//Size is dynamic, you can sore any data type and can not Store duplicates
		//Set will not follow indexing
		Set empdetails = new HashSet();
		empdetails.add("John Miller");
		empdetails.add(1122);
		empdetails.add(5000.4040);
		empdetails.add('F');
		empdetails.add(true);
		empdetails.add("John Miller");
		empdetails.add("John Miller");
		//below index based removing not there in Set collection
		//empdetails.remove(int index)
		
		System.out.println(empdetails);
	}

}
