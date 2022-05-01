import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);

		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();

		WebElement user_name = driver.findElement(By.id("input-username"));
		user_name.clear();
		user_name.sendKeys("demo");

		WebElement password = driver.findElement(By.id("input-password"));
		password.clear();
		password.sendKeys("demo");

		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

		driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();

		// find the total number of pages in table
		String text = driver.findElement(By.xpath("//div[@class='col-sm-6 text-right']")).getText();
		System.out.println("Total no of pages=" + text);

		int total_pages = Integer.valueOf(text.substring(text.indexOf("(") + 1, text.indexOf("pages") - 1));
		System.out.println("Total pages=" + total_pages);

	}

}
