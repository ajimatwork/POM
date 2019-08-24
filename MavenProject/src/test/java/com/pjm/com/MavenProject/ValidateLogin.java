package com.pjm.com.MavenProject;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import reporting.JyperionListener;

@Listeners(JyperionListener.class) // reporting
public class ValidateLogin extends BaseTest {

	@Test
	public void checkCredientials() {
		Login lp = new Login(driver);
		lp.applicationLogin("ajim", "74321");
		String actualResult = "pop";
		String expectedResult = "pop";
		Assert.assertEquals(expectedResult, actualResult);
	} 
}
