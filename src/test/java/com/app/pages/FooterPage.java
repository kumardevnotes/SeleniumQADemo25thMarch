package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FooterPage {
	public WebDriver driver = null;
	public static By copyRightSymbol = By.xpath("//p[contains(text(),'2023 Speak Languages')]");
	public static By privacyPolicyLink = By.linkText("Privacy policy");
	public static By termsOfUseLink = By.linkText("Terms of use");
	public static By contactUsLink = By.linkText("Contact us");
	public static By languageDD = By.id("language_menu");

	public FooterPage(WebDriver driverInstance) {
		this.driver = driverInstance;
	}

	public boolean isFooterLoaded() {
		return driver.findElement(copyRightSymbol).isDisplayed() && driver.findElement(privacyPolicyLink).isDisplayed()
				&& driver.findElement(termsOfUseLink).isDisplayed() && driver.findElement(contactUsLink).isDisplayed()
				&& driver.findElement(languageDD).isDisplayed();
	}

}
