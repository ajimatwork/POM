package com.pjm.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage { // fields; constructor; methods;
	private WebDriver driver;

	// @FindBy(name = "userName") //driver.findElement(By.id("name")).sendKeyes("");
	// @CacheLookup
	// private WebElement User;
	//
	// @FindBy(name = "password")
	// @CacheLookup
	// private WebElement Pass;
	//
	// @FindBy(name = "login")
	// @CacheLookup
	// private WebElement Submit;
	@FindBy(linkText = "training")
	@CacheLookup
	private WebElement aboutPJM;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void applicationLogin() {
		// User.sendKeys(username);
		// Pass.sendKeys(password);
		// Submit.click();
		aboutPJM.click();

	}
}
