package Selenium.Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;

	@BeforeClass
	void meth1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Ashok\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		System.out.println("Login pass");
	}

	@Test
	void testCase1() {
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Odis");
		driver.findElement(By.id("searchBtn")).click();
		System.out.println("TestCase1 pass");
	}

	@Test
	void testCase2() {
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Odis");
		driver.findElement(By.id("empsearch_supervisor_name")).sendKeys("John Smith");
		driver.findElement(By.id("searchBtn")).click();
		System.out.println("TesCase2 pass");
	}

	@Test
	void testcase3() throws InterruptedException {
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a")).click();
		System.out.println("Logout is done");
	}

	@AfterClass
	void meth2() {

		driver.close();
		System.out.println("Program is successfully done");
	}

}
