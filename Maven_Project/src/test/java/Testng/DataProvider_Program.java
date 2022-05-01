package Testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider_Program {
	WebDriver driver;

	@DataProvider(name = "myTest")
	public Object[][] createData() {
		return new Object[][] { { "India" }, { "Brazil" }, { "Canada" }, { "Sri Lanka" }, { "England" },
				{ "United Kingdom" }, { "United States" }, };
	}

	@BeforeMethod
	public void setup() {
		// driver=new ChromeDriver();
	}

	@Test(dataProvider = "myTest")
	public void testSearchCountry(String country) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.wikipedia.org/wiki/main_page");

		driver.findElement(By.id("searchInput")).clear();
		driver.findElement(By.id("searchInput")).sendKeys(country);
		driver.findElement(By.id("searchButton")).click();
		Thread.sleep(1000);

		String actualResult = driver.findElement(By.id("firstHeading")).getText();
		Assert.assertTrue(country.equals(actualResult.trim()));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
