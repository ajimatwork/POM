package com.pjm.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login { // fields; constructor; methods;
	private WebDriver driver;
	@FindBy(name = "userName")
	@CacheLookup
	private WebElement User;

	@FindBy(name = "password")
	@CacheLookup
	private WebElement Pass;

	@FindBy(name = "login")
	@CacheLookup
	private WebElement Submit;

	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void applicationLogin(String username, String password) {
		User.sendKeys(username);
		Pass.sendKeys(password);
		Submit.click();

	}
}
