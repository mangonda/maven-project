import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ForgetPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Ashok\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//*[@id=\"forgotPasswordLink\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"btnCancel\"]")).click();
		String expectedResult = "Forgot your password?";
		String actualResult = driver.findElement(By.linkText("Forgot your password?")).getText();
		Assert.assertEquals(actualResult, expectedResult);

	}

}
