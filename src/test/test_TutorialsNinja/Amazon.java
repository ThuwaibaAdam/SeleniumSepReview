package test_TutorialsNinja;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Amazon {

	@Test
	public void setUp() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(29));
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//input[@name = 'search']")).sendKeys("Watches");
		driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
		
		String expectedResult = "There is no product that matches the search criteria.";
		String actualResult = driver.findElement(By.partialLinkText("There is no product that matches the search criteria.")).getText();
		Assert.assertEquals(actualResult,expectedResult);
		
	}
}
