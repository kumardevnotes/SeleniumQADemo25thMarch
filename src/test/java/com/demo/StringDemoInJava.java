package com.demo;

public class StringDemoInJava {

	public static void main(String[] args) {
		
		String empName = "Mike TysonM"; //""
		//empName[0]=M empName[1]=i empName[2]=k empName[3]=e empName[4]=
		//empName[5]=T empName[6]=y empName[7]=s empName[8]=o  empName[9]=n empName[length()-1=10]=M
		//length() = 10 length()-1 = 9
		
		System.out.println(empName);
		System.out.println(empName.toLowerCase());
		System.out.println(empName.toUpperCase());
		System.out.println(empName.charAt(5)); //T
		System.out.println(empName.equals("Mike Tyson")); //true , false
		
		System.out.println(empName.equalsIgnoreCase("mike tyson"));
		System.out.println(empName.replace('M', 'X'));
		System.out.println(empName.startsWith("Mike")); //true
		System.out.println(empName.endsWith("ABC")); //false
		System.out.println(empName.isEmpty()); //true
		
		System.out.println(empName.substring(4));
		
		System.out.println(empName.length());
	}

}
