package com.pjm.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tranning {
	private WebDriver driver;
	@FindBy(xpath = "//pass/@fhffj")
	@CacheLookup
	private WebElement link2;

	public void Tranning(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void pjmAbout() {
		link2.click();
	}
}
