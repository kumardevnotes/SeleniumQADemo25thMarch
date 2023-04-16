package com.testng.demo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SeleniumMethodsDemo1 {
	public static ChromeDriver driver = null;

	@Test
	public void selMethodsDemo1() throws Exception {
		launchBrowser();
		launchApp();
		Thread.sleep(2000);
		/*
		 * driver.findElement(By.id("nav_login")).click(); Thread.sleep(1000);
		 * driver.navigate().back(); Thread.sleep(1000); driver.navigate().forward();
		 * Thread.sleep(1000); driver.navigate().refresh(); Thread.sleep(3000);
		 */
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept(); //to click on OK button on the Alert box
		//alert.dismiss(); //to click on Cancel button on the Alert box
		Thread.sleep(3000);
		
		driver.get("https://www.speaklanguages.com");
		List<WebElement> languageElements  = driver.findElements(By.xpath("//p[@class='site_link']//a"));
		
		List<String> languageUrls = new ArrayList<String>();
		
		for(WebElement element : languageElements) {
			String langUrl = element.getAttribute("href");
			languageUrls.add(langUrl);
		}
		String parentWindow = driver.getWindowHandle();
		for(String link : languageUrls) {
			driver.switchTo().newWindow(WindowType.TAB);
			driver.get(link);
			Thread.sleep(1000);
			driver.close();
			driver.switchTo().window(parentWindow);
		}
		
		
		
		
		driver.get("https://www.speaklanguages.com/login");
		driver.findElement(By.id("nav_login")).click();
		Thread.sleep(3000);
		
		Actions action = new Actions(driver);
		WebElement loginButton = driver.findElement(By.id("login_button"));
		action.moveToElement(loginButton).build().perform(); //hovering the mouse on the button
		Thread.sleep(6000);
		
		/*
		WebElement sourceElement = driver.findElement(By.id("login_button"));
		WebElement destElement = driver.findElement(By.id("login_button"));
		action.dragAndDrop(sourceElement, destElement);
		*/
		
		// entering email address and passwords into text fields on login page
		driver.findElement(By.id("email_input")).sendKeys("kumar@gmail.com");
		driver.findElement(By.id("password_input")).sendKeys("pwd1122");
		driver.findElement(By.id("login_button")).click();
		Thread.sleep(6000);
		
		String textOnPage = driver.findElement(By.xpath("//li[@class='error_message']")).getText();
		System.out.println("Text on the screen: " + textOnPage);
		
		String attributeValue = driver.findElement(By.id("email_input")).getAttribute("type");
		System.out.println("Attribute value: " + attributeValue);
		
		String pageTilte = driver.getTitle();
		System.out.println("pageTilte is: " + pageTilte);

		/*
		 * driver.switchTo().newWindow(WindowType.TAB);
		 * driver.get("https:facebook.com"); Thread.sleep(1000);
		 * 
		 * Dimension dimension = new Dimension(500, 500);
		 * driver.manage().window().setSize(dimension); Thread.sleep(4000);
		 * 
		 * driver.close();
		 */

		// close all the opened tabs or windows of the browser
		Thread.sleep(1000);
		driver.quit();
	}

	public static void launchApp() {
		driver.get("https://speaklanguages.com");
	}

	public static void launchBrowser() {
		String rootFolder = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", rootFolder + "//src//test//resources//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
	}
}