package base.tutorialsNinja;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BasePage {

	public static final String URL  = "https://tutorialsninja.com/demo/";
	public static WebDriver driver;
	public static WebDriverWait webDriverWait;
	
	@Parameters("browser")
	@BeforeMethod
	public void driverSetup(@Optional ("chrome")String browser) {
		driverInit(browser);
		driver.get(URL);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	public void driverInit(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}else if(browser.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
			driver.manage().window().maximize();
		}else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}else {
			System.out.println("Browser not matching");
		}
		webDriverWait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
	}
}
