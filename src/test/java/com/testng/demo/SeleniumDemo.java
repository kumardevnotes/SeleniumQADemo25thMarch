package com.testng.demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class SeleniumDemo {

	@Test (groups = { "Regression"})
	public void launchFacebook() throws Exception {
		
		System.out.println("Launching the app in Chrome");
		
		//To Get root folder 
		String rootFolder  = System.getProperty("user.dir");
		
		//to set the path of the Chrome driver file
		System.setProperty("webdriver.chrome.driver", rootFolder+"//src//test//resources//chromedriver.exe");
		
		//to launch browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
	
		
		//to maximize the browser
		driver.manage().window().maximize();
		
		//to launch app in the browser
		driver.get("https://facebook.com");
		
		//to wait for 3 seconds
		Thread.sleep(3000);
		
		//to close the browser
		driver.quit();
		
		System.out.println("App closed which is opened in Chrome");
	}

	@Test (groups = { "Smoke"})
	public void launchGamil() throws Exception {

		System.out.println("Launching the app in Edge");
		
		//To Get root folder 
		String rootFolder  = System.getProperty("user.dir");
		
		//to set the path of the Chrome driver file
		System.setProperty("webdriver.edge.driver", rootFolder+"//src//test//resources//msedgedriver.exe");
		
		//to launch browser
		EdgeOptions  options = new EdgeOptions ();
		options.addArguments("--remote-allow-origins=*");
		EdgeDriver driver = new EdgeDriver(options);
	
		
		//to maximize the browser
		driver.manage().window().maximize();
		
		//to launch app in the browser
		driver.get("https://gmail.com");
		
		//to wait for 3 seconds
		Thread.sleep(3000);
		
		//to close the browser
		driver.quit();
		
		System.out.println("App closed which is opened in Chrome");
	}
}
