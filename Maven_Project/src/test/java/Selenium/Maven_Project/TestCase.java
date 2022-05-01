package Selenium.Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestCase {
	WebDriver driver;

	@BeforeMethod
	void meth1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Ashok\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	}

	void TestCase1() {
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Odis");
		driver.findElement(By.id("searchBtn")).click();
	}

	void TestCase2() {
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Odis");
		driver.findElement(By.id("empsearch_supervisor_name")).sendKeys("John Smith");
		driver.findElement(By.id("searchBtn")).click();
	}

	@AfterMethod
	void meth2() {
		driver.close();
	}
}
