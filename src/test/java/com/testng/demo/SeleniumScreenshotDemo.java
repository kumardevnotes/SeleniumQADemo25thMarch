package com.testng.demo;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumScreenshotDemo {

	public static WebDriver driver = null;

	@Test
	public void verifyPageTitle() throws Exception {

		// Launch a fresh Chrome window and launch the app at line 23
		String rootFolder = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", rootFolder + "//src//test//resources//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		String pageTitleExpected = "Rediffmail_Invalid";
		String pageTitleActual = driver.getTitle();

		Thread.sleep(2000);

		if (pageTitleExpected.equals(pageTitleActual)) { // Rediffmail_Invalid != Rediffmail
			System.out.println("Page title verified");
			driver.quit();
		} else {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File destination = new File(rootFolder + "//Screenshots//myImage.png");
			FileHandler.copy(src, destination);
			driver.quit();
			Assert.fail("Page title verification failed");
		}
	}
}