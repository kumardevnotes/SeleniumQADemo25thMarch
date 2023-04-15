package com.testng.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FacebookTests { // 5, 5 ==> 5

	@Test (priority =2)
	public void facebookValidLoginCheck() {
		System.out.println("Validated facebook login with valid logins");
	}

	@Test (priority =1)
	public void facebookInValidLoginCheck() {
		System.out.println("Validated facebook login with invalid logins");
		Assert.fail("Failed intentionally");
	}
}
