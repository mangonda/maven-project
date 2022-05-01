import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDropdowm {

	public static void main(String[] args) {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();

		driver.get("https://www.hdfcbank.com/");
		driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();

		// productType
		List<WebElement> productType = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		System.out.println("Number of option=" + productType.size());
		// driver.findElement(By.xpath(
		// "//*[@id=\"main\"]/div[2]/div[12]/div[1]/div/div/div[2]/div[1]/div[3]/div/div/div/div/div/div[2]/div/ul/li[3]"))
		// .click();

		for (WebElement ptype : productType) {
			if (ptype.getText().equals("Accounts")) {
				ptype.click();
				break;
			}
		}
		// products
		driver.findElement(By.xpath("//div[@class='drp2']//div[@class='dropdown']")).click();
		List<WebElement> products = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
		System.out.println("Number of option=" + products.size());

		for (WebElement product : products) {
			if (product.getText().equals("Salary Accounts")) {
				product.click();
				break;
			}
		}
	}

}
