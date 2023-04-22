package com.testng.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeleniumDropdownDemo {
	
	public static ChromeDriver driver = null;

	@Test
	public void selMethodsDemo2() throws Exception {
		
		//Launch a fresh Chrome window and launch the app at line 23
		String rootFolder = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", rootFolder + "//src//test//resources//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.speaklanguages.com");
		
		JavascriptExecutor jsObject = (JavascriptExecutor) driver;
		jsObject.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(4000);

		WebElement langElement  = driver.findElement(By.id("language_menu"));
		// Scrolling down the page till the element is found		
		jsObject.executeScript("arguments[0].scrollIntoView();", langElement);
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		action.moveToElement(langElement).build().perform(); //hovering the mouse on the button
		Thread.sleep(4000);
		
		
		driver.findElement(By.linkText("Sign up")).click();
		
		WebElement  monthDDElement  = driver.findElement(By.name("dob_month"));
		Select monthDD = new Select(monthDDElement);
		monthDD.selectByIndex(1);
		Thread.sleep(2000);
		monthDD.selectByValue("4");
		Thread.sleep(2000);
		monthDD.selectByVisibleText("June");
		Thread.sleep(2000);
		//monthDD.deselectAll();
		Thread.sleep(4000);
		driver.quit();
	}
}