package com.testng.demo;


import java.util.Set;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SeleniumWindowHandlingDemo {
	
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
	    String parentID  = driver.getWindowHandle();
	    Thread.sleep(2000);
		
		//Launch new tab and switch to it. Then launch ap at line 27
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(2000);
		 String childID  = driver.getWindowHandle();
		Thread.sleep(2000);
		//driver.close();
		
//		driver.switchTo().window(parentID);
//		Thread.sleep(2000);
//		driver.switchTo().window(childID);
//		Thread.sleep(2000);
//		driver.switchTo().window(parentID);
//		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String> allWindowIds = driver.getWindowHandles();
		
		for(String window : allWindowIds) {
			driver.switchTo().window(window);
			Thread.sleep(1000);
			if(driver.getTitle().contains("Speak Languages")) {
				System.out.println("I am in Speak Languages tab and you can perform the required Ops");
			}
			else if(driver.getTitle().contains("Rediffmail")) {
				System.out.println("I am in Rediffmail login page and you can perform the required Ops");
			}
			else {
				System.out.println("Unable to match the given title");
			}
			
			Thread.sleep(2000);
		}
		
		
		driver.quit();
	}
}