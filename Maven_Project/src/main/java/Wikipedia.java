import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Wikipedia {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://en.wikipedia.org/wiki/India");
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.name("search")).sendKeys("India");
		driver.findElement(By.name("go")).click();

		String expectedResult = "India";
		String actualResult = driver.findElement(By.xpath("//*[@id=\"firstHeading\"]")).getText();
		Assert.assertEquals(expectedResult, actualResult);

		System.out.println("The Test case is pass");

	}

}
