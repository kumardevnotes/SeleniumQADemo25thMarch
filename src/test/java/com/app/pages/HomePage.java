package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	public WebDriver driver = null;
	public static String pageTitleExpected = "Speak Languages — Learn a new language online";
	public static By appLogo = By.id("logo");
	public static By loggedInUserLabel = By.xpath("//li[@id='nav_user']/a");

	public HomePage(WebDriver driverInstance) {
		this.driver = driverInstance;
	}

	public boolean isHomePageLoaded() {
		boolean isTitleMatched = false;
		boolean isLogoDisplayed = false;
		boolean isUserLabelDisplayed = false;

		if (pageTitleExpected.equals(driver.getTitle()))
			isTitleMatched = true;
		isLogoDisplayed = driver.findElement(appLogo).isDisplayed();
		isUserLabelDisplayed = driver.findElement(loggedInUserLabel).isDisplayed();

		/*
		// if displayed, it returns true, if not it returns false
		driver.findElement(appLogo).isDisplayed();

		// if enabled, it returns true, if not it returns false
		driver.findElement(appLogo).isEnabled();

		// if selected, it returns true, if not it returns false
		driver.findElement(loggedInUserLabel).isSelected();
		*/

		return isTitleMatched && isLogoDisplayed && isUserLabelDisplayed;
	}
}
