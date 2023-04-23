package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver = null;
	public static By logInLink = By.xpath("//a[.='Log in']");
	public static By signUpLink = By.xpath("//a[.='Sign up']");

	public LandingPage(WebDriver driverInstance) {
		this.driver = driverInstance;
	}

	public void launchLoginPage() {
		driver.findElement(logInLink).click();
	}

	public void launchSignupPage() {
		driver.findElement(signUpLink).click();
	}

	public void navigateToFooterSection() throws InterruptedException {
		JavascriptExecutor jsObject = (JavascriptExecutor) driver;
		WebElement langElement = driver.findElement(By.id("language_menu"));
		jsObject.executeScript("arguments[0].scrollIntoView();", langElement);
		Thread.sleep(2000);
	}

}
