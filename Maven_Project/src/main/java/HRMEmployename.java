import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HRMEmployename {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/");

		// driver.findElement(By.name("txtUsername")).clear();
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		// driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Odis");
		driver.findElement(By.id("searchBtn")).click();

		driver.findElement(By.id("empsearch_supervisor_name")).sendKeys("John Smith");
		driver.findElement(By.id("searchBtn")).click();

		String expectedResult = "odis";
		String actualResult = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[3]/a")).getText();
		Assert.assertEquals(actualResult, expectedResult);

		/*
		 * String expectedResult = "John Smith"; String actualResult =
		 * driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[1]/td[8]")).
		 * getText(); Assert.assertEquals(actualResult, expectedResult);
		 */

	}

}
