package com.interfaces.demo;

public class MyStdClass implements MySchoolInterface {

	public static void main(String[] args) {
		MyStdClass mystdClassObj  = new MyStdClass();
		mystdClassObj.displaySchoolName();
		mystdClassObj.displaySchoolName("Reynolds High school");
		mystdClassObj.getSchollFee();
	}

	@Override
	public void displaySchoolName() {
		System.out.println("Model School");
	}

	@Override
	public void displaySchoolName(String schoolName) {
		System.out.println(schoolName);
	}

	@Override
	public int getSchollFee() {
		return 500;
	}

}
