package com.testng.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class SeleniumLocatorsDemo {

	@Test (groups = { "Regression"})
	public void launchFacebook() throws Exception {
		String rootFolder  = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", rootFolder+"//src//test//resources//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		
		driver.get("https://speaklanguages.com");
		driver.findElement(By.id("nav_login")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
