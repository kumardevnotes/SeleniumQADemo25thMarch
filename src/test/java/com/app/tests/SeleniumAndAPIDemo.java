package com.app.tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class SeleniumAndAPIDemo {

	String rootFolder = "";

	public static WebDriver driver = null;

	@BeforeMethod
	public void launchApp() {

		rootFolder = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", rootFolder + "//src//test//resources//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.get("https://www.speaklanguages.com");
	}

	@Test 
	public void seleniumAPIIntegration() throws Exception {
		 RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .when()
                .get("/posts")
                .then()
                .extract().response();
		
		int statusCode  = response.statusCode();
		int statusCode2  = response.statusCode();

        Assert.assertEquals(200, response.statusCode());
        System.out.println("API Selenium integration is success");
	}


	@AfterMethod
	public void closeApp() {
		driver.quit();
	}
}
