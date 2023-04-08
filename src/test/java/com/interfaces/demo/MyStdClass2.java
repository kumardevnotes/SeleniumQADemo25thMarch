package com.interfaces.demo;

public class MyStdClass2 implements MySchoolInterface {

	public static void main(String[] args) {
		MyStdClass2 mystdClassObj  = new MyStdClass2();
		mystdClassObj.displaySchoolName();
		mystdClassObj.displaySchoolName("Primary school");
		mystdClassObj.getSchollFee();
	}

	@Override
	public void displaySchoolName() {
		System.out.println("Washington school");
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
