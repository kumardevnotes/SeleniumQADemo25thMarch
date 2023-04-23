package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	public WebDriver driver = null;
	public static By emailAddressField = By.id("email_input");
	public static By passwordField = By.id("password_input");
	public static By loginButton = By.id("login_button");
	
	public LoginPage(WebDriver driverInstance){
		this.driver = driverInstance;
	}
	
	public void loginIntoApp(String userEmail, String password) throws InterruptedException {
		driver.findElement(emailAddressField).sendKeys(userEmail);
		driver.findElement(passwordField).sendKeys(password);
		driver.findElement(loginButton).click();
		Thread.sleep(6000);
	}
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
}
