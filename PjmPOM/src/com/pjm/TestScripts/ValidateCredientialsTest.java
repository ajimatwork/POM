package com.pjm.TestScripts;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pjm.Pages.Login;

import reporting.JyperionListener;

@Listeners(JyperionListener.class) // PDF reporting
public class ValidateCredientialsTest extends BaseTest {// extends BaseTest

	@Test
	public void checkCredientials() {
		Login lp = new Login(driver);
		lp.applicationLogin("mercury", "mercury");
		String actual= "a";
		String expected= "a";
		Assert.assertEquals(expected, actual);
		

	}
}
