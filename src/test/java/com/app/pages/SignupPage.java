package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;

public class SignupPage {
	public WebDriver driver = null;

	public static By firstNameFild = By.id("first_name");
	public static By lastNameField = By.name("last_name");
	public static By emailAddressField = By.name("email");
	public static By passwordField = By.name("password");
	public static By genderDD = By.name("sex");
	public static By dayDD = By.name("dob_day");
	public static By monthDD = By.name("dob_month");
	public static By yearDD = By.name("dob_year");
	public static By signUpButton = By.xpath("//input[@value='Sign up']");
	public static By signUpSuccessMessage = By.xpath("//h1[contains(text(),'now activate your account!')]");

	public SignupPage(WebDriver driverInstance) {
		this.driver = driverInstance;
	}

	public String signUpAsNewUser() throws InterruptedException {
		
		Faker faker = new Faker();

		driver.findElement(firstNameFild).sendKeys(faker.name().firstName());
		driver.findElement(lastNameField).sendKeys(faker.name().lastName());
		driver.findElement(emailAddressField).sendKeys(faker.internet().emailAddress());
		driver.findElement(passwordField).sendKeys("Pwd112233");

		WebElement genderDDElement = driver.findElement(genderDD);
		Select gender = new Select(genderDDElement);
		gender.selectByVisibleText("Male");

		WebElement dayDDElement = driver.findElement(dayDD);
		Select day = new Select(dayDDElement);
		day.selectByIndex(4);

		WebElement monthDDElement = driver.findElement(monthDD);
		Select month = new Select(monthDDElement);
		month.selectByVisibleText("March");

		WebElement yearDDElement = driver.findElement(yearDD);
		Select year = new Select(yearDDElement);
		year.selectByVisibleText("1990");

		driver.findElement(signUpButton).click();

		Thread.sleep(5000);

		return driver.findElement(signUpSuccessMessage).getText();
	}
}
