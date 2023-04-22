package com.app.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AppTests {
	
	public static WebDriver driver = null;
	
	@BeforeMethod
	public void launchApp() {
		// Launch a fresh Chrome window and launch the app at line 23
				String rootFolder = System.getProperty("user.dir");
				System.setProperty("webdriver.chrome.driver", rootFolder + "//src//test//resources//chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				driver = new ChromeDriver(options);
				driver.manage().window().maximize();
				driver.get("https://www.speaklanguages.com");	
	}
	
	@Test
	public void verifySignup() {
		System.out.println("verifySignup success");
	}

	@Test
	public void verifyLogin() {
		System.out.println("verifyLogin success");
	}

	@Test
	public void verifyHomepage() {
		System.out.println("verifyHomepage success");
	}

	@Test
	public void verifyFooter() {
		System.out.println("verifyFooter success");
	}
	
	@AfterMethod
	public void closeApp() {
		driver.quit();
	}
}
