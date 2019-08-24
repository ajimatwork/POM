package com.newtours.demoaur.MavenDemo;

public class Login {
	private WebDriver driver;
	@FindBy(name = "userName")
	@CacheLookup
	private WebElement User;

	@FindBy(name = "passWord")
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
