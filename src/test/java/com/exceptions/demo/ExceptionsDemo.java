package com.exceptions.demo;

public class ExceptionsDemo {
	
	 /*Throwable
	 * Exception
	 * 
	 * Checked exception category
	 * FileNotFoundException
	 * IOException
	 * 
	 * Unchecked exception category
	 * NulPointerException
	 * ArithmeticException
	 * ArrayIndexOutofBoundsException
	 * */

	public static void main(String[] args) {
		System.out.println("Start of the program");
		
		try {
			String empName = "Kumar";
			System.out.println(empName.toUpperCase());
			
			int firstNum = 100;
			int secondNum = 10;
			System.out.println(firstNum/secondNum); //100 is divided by 10
			
		} catch (NullPointerException e) {
			System.out.println("Caught an exception "+e);
		}
		
		catch (ArithmeticException e) {
			System.out.println("Caught an exception "+e);
		}
		
		finally {
			//to close open files, to delete unwanted files 
			System.out.println("I am an optional block in try..catch. I will run always");
		}
		
		System.out.println("End of the program");
	}

}
