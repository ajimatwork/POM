package monarch;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Web {
	WebDriver driver;

	@BeforeTest
	public void openBrowser() throws IOException {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://pjm.com");

		// Runtime.getRuntime().exec("QC.exe");

	}

	@Test
	public void verifyTitle() {
		String expectedResult = "PJM - Home";
		String actualResult = driver.getTitle();
		Assert.assertEquals(expectedResult, actualResult);

	}

	@Test
	public void verifyLink() {
		driver.findElement(By.linkText("training"));
		String expectedResult = "PJM - Training";
		String actualResult = driver.getTitle();
		Assert.assertEquals(expectedResult, actualResult);

	}

	@Test
	public void verifyAboutPjm() {
		driver.findElement(By.linkText("about pjm")).click();
		String expectedResult = "PJM - About PJM";
		String actualResult = driver.getTitle();
		Assert.assertEquals(expectedResult, actualResult);
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

}
