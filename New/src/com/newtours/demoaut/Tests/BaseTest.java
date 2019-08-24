package com.newtours.demoaut.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
WebDriver driver;
@BeforeTest
public void OpenBrowser() {
	System.getProperty("webdriver.gecko.driver","geckodriver.exe");
	driver= new FirefoxDriver();
		
}
@AfterTest
public void closeBrowser() {
	driver.close();
}
}
