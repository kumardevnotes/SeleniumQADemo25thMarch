package com.testng.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumDemo2 {

	@Parameters({ "browser", "username", "password" })
	@Test (groups = { "Smoke"})
	public void verifyUserLogin(String browser, String username, String password) throws Exception {
		String rootFolder  = System.getProperty("user.dir");
		WebDriver driver = null ;
		
		switch(browser) { 
		
		case "Chrome":
		System.setProperty("webdriver.chrome.driver", rootFolder+"//src//test//resources//chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(chromeOptions);
		break;
		
		case "Edge":
	    System.setProperty("webdriver.edge.driver", rootFolder+"//src//test//resources//msedgedriver.exe");
		//to launch browser
		EdgeOptions  edgeOptions = new EdgeOptions ();
		edgeOptions.addArguments("--remote-allow-origins=*");
		driver = new EdgeDriver(edgeOptions);
		break;
		
		default:
			Assert.fail("Please pass valid browser name as parameter");
		}

		driver.manage().window().maximize();
		
		//Speak Languages — Learn a new language online
		//Launching app
		driver.get("https://speaklanguages.com");
		Thread.sleep(2000);
		
		//clicking on login link using selenium methods
		//driver.findElement(By.id("nav_login")).click(); //id is called selenium locator
		
		driver.findElement(By.linkText("Log in")).click(); //linkText is called selenium locator
		
		//entering email address and passwords into text fields on login page
		driver.findElement(By.id("email_input")).sendKeys(username);
		driver.findElement(By.id("password_input")).sendKeys(password);
		
		//clicking on login button
		driver.findElement(By.id("login_button")).click();
		Thread.sleep(4000);
		
		String loggedInUser = driver.findElement(By.id("nav_user")).getText();
		System.out.println(loggedInUser);
		
		if(loggedInUser.equals("nitesh")) {
			System.out.println("Login is success");
		}
		else {
			Assert.fail("Login is failed. Please check the logins");
		}
		
		driver.quit();
		
	}

}
