package com.testng.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GmailTests {

	@Test (priority =2)
	public void gmailValidLoginCheck() {
		System.out.println("Validated gmail login with valid logins");
	}

	@Test (priority =1)
	public void gmailInValidLoginCheck() {
		System.out.println("Validated gmail login with invalid logins");
		Assert.fail("Failed intentionally");
	}
}
