package lec11.sami.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnDriver {

	public static void main(String[] args) throws Exception {

	
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.findElement(By.id("nav-search-submit-button")).click();
		WebElement passwordInputField = driver.findElement(By.xpath("//input[@name = 'password']"));
		WebElement submitButton = driver.findElement(By.linkText(" Login "));
		
		loginInputField.sendKeys("watches");
		
		submitButton.click();
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
