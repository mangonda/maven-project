import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HrmLogin {

	public static void main(String[] args) throws InterruptedException {
		// to launch the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Ashok\\chromedriver.exe");
		// String expectedResult = "Forgot your password";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// to launch web page
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();

		/*
		 * driver.findElement(By.xpath("//*[@id=\"menu_leave_viewLeaveModule\"]/b")).
		 * click();
		 * driver.findElement(By.xpath("//*[@id=\"menu_leave_assignLeave\"]")).click();
		 * 
		 * driver.findElement(By.name("assignleave[txtEmployee][empName]")).
		 * sendKeys("Orange Test"); Select s1 = new
		 * Select(driver.findElement(By.name("assignleave[txtLeaveType]")));
		 * s1.selectByValue("9");
		 * driver.findElement(By.name("assignleave[txtFromDate]")).click();
		 * driver.findElement(By.name("assignleave[txtFromDate]")).sendKeys("2022-04-01"
		 * ); driver.findElement(By.xpath(
		 * "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[5]/a")).click();
		 * 
		 * driver.findElement(By.id("assignleave_txtToDate")).clear();
		 * driver.findElement(By.name("assignleave[txtToDate]")).sendKeys("2022-05-01");
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"frmLeaveApply\"]/fieldset/ol/li[5]/img")).click();
		 * 
		 * WebElement element = driver.findElement(By.id("assignleave_partialDays"));
		 * Select dropdown = new Select(element); dropdown.selectByValue("start_end");
		 * 
		 * WebElement element1 =
		 * driver.findElement(By.id("assignleave_firstDuration_duration")); Select
		 * dropdown1 = new Select(element1); dropdown1.selectByValue("half_day");
		 * 
		 * WebElement element2 =
		 * driver.findElement(By.id("assignleave_firstDuration_ampm")); Select dropdown2
		 * = new Select(element2); dropdown2.selectByValue("PM");
		 * 
		 * WebElement element3 =
		 * driver.findElement(By.id("assignleave_secondDuration_duration")); Select
		 * dropdown3 = new Select(element3); dropdown3.selectByValue("half_day");
		 * 
		 * WebElement element4 =
		 * driver.findElement(By.id("assignleave_secondDuration_ampm")); Select
		 * dropdown4 = new Select(element4); dropdown4.selectByValue("PM");
		 * 
		 * driver.findElement(By.xpath("//*[@id=\"assignleave_txtComment\"]")).
		 * sendKeys("I AM ASHOK");
		 * 
		 * driver.findElement(By.xpath("//*[@id=\"assignBtn\"]")).click();
		 * driver.findElement(By.id("confirmOkButton")).click(); String expectedResult =
		 * "Overlapping Leave Requests Found"; String actualResult =
		 * driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[1]/h1")).getText
		 * (); Assert.assertEquals(actualResult, expectedResult);
		 */

		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a")).click();
	}
}
