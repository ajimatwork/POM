package com.pjm.TestScripts;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pjm.Pages.HomePage;

import utils.JyperionListener;

@Listeners(JyperionListener.class) // PDF reporting
public class ValidateHomePage extends BaseTest {// extends BaseTest

	@Test
	public void checkTitle() {
		HomePage lp = new HomePage(driver);
		// lp.applicationLogin("mercury", "mercury");
		// String actual= "a";
		// String expected= "a";
		// Assert.assertEquals(expected, actual);

		String actualResult = "PJM - Home";
		String expectedResult = driver.getTitle();
		Assert.assertEquals(expectedResult, actualResult);

	}

	@Test
	public void checkLink() {
		String actualResult = "b";
		String expectedResult = "b";
		Assert.assertEquals(expectedResult, actualResult);

	}

	@Test
	public void checkLink2() {
		String actualResult = "c";
		String expectedResult = "d";
		Assert.assertEquals(expectedResult, actualResult);

	}

}
