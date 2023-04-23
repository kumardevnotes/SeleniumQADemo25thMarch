package com.app.tests;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.app.pages.*;

public class AppTests {

	LandingPage landingPage = null;
	LoginPage loginPage = null;
	SignupPage signUpPage = null;
	HomePage homePage = null;
	FooterPage footerPage = null;
	String rootFolder = "";

	public static WebDriver driver = null;

	@BeforeMethod
	public void launchApp() {

		rootFolder = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", rootFolder + "//src//test//resources//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);

		landingPage = new LandingPage(driver);
		loginPage = new LoginPage(driver);
		signUpPage = new SignupPage(driver);
		homePage = new HomePage(driver);
		footerPage = new FooterPage(driver);

		driver.manage().window().maximize();
		driver.get("https://www.speaklanguages.com");
	}

	@Test (invocationCount = 4)
	public void verifySignup() throws Exception {
		landingPage.launchSignupPage();
		String successMessageExpected  = "Thank you — now activate your account!";
		String successMessageActual  = signUpPage.signUpAsNewUser();
		if(successMessageExpected.equals(successMessageActual)) {
			System.out.println("Success with Signup process");
		}
		else {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File destination = new File(rootFolder + "//Screenshots//signUpFailed.png");
			FileHandler.copy(src, destination);
			Assert.fail("Failed to complete Signup process. Please check");
		}
	}

	@Test (enabled = true)
	public void verifyLogin() throws InterruptedException, IOException {
		landingPage.launchLoginPage();
		loginPage.loginIntoApp("johnnitesh2@gmail.com", "Testing@123");
		String pageTitleNotExpected  = "Log in to Speak Languages";
		String pageTitleActual  = loginPage.getLoginPageTitle();
		if(!pageTitleNotExpected.equals(pageTitleActual)) {
			System.out.println("Login Success");
		}
		else {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File destination = new File(rootFolder + "//Screenshots//signUpFailed.png");
			FileHandler.copy(src, destination);
			Assert.fail("Failed to login. Please check");
		}
	}

	@Test (enabled = true)
	public void verifyHomepage() throws InterruptedException {
		landingPage.launchLoginPage();
		loginPage.loginIntoApp("johnnitesh2@gmail.com", "Testing@123");
		boolean isHomePageLoaded = homePage.isHomePageLoaded();
		Assert.assertEquals(isHomePageLoaded, true, "Homepage not loaded properly. Please check");
	}

	@Test (enabled = true)
	public void verifyFooter() throws InterruptedException, IOException {
		landingPage.navigateToFooterSection();
		boolean isFooterSectionLoaded = footerPage.isFooterLoaded();
		Assert.assertEquals(isFooterSectionLoaded, true, "Footer section not loaded properly. Please check");
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destination = new File(rootFolder + "//Screenshots//footerSection.png");
		FileHandler.copy(src, destination);
	}

	@AfterMethod
	public void closeApp() {
		driver.quit();
	}
}
