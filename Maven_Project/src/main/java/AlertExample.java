import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame("login_page");
		driver.findElement(By.xpath("//a[contains(text(),'CONTINUE')]")).click();
		Thread.sleep(1000);
		Alert HdfcAlert = driver.switchTo().alert();
		String alertText = HdfcAlert.getText();
		HdfcAlert.accept();
		// HdfcAlert.dismiss();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();

		System.out.println(alertText);

	}

}
