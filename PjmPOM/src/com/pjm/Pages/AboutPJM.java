package com.pjm.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutPJM {
	private WebDriver driver;
	@FindBy(css = "input[values='about pjm']")
	@CacheLookup
	private WebElement link1;

	public void AboutPJM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void pjmAbout() {
		link1.click();
	}
}