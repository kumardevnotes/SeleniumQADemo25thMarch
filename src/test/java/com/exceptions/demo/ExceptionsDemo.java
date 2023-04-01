package com.exceptions.demo;

public class ExceptionsDemo {
	
	/*Throwable
	 * Exception
	 * NulPointerException
	 * FileNotFoundException
	 * ArithmeticException
	 * ArrayIndexOutofBoundsException
	 * IOException*/

	public static void main(String[] args) {
		try {
			
			String myName = "Kumar";
			System.out.println(myName.toUpperCase());
			
			int firstNum = 100;
			int secondNum = 10;
			System.out.println(firstNum/secondNum); //100/0
			
		} catch (NullPointerException e) {
			System.out.println("Caught an exception: "+e);
		}
		
		catch (ArithmeticException e) {
			System.out.println("Caught an exception: "+e);
		}
		
		finally {
			System.out.println("This is executed whether you get exception or not");
		}
		
		System.out.println("End of the program");
	}

}
