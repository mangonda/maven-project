import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();

		WebElement drpCountryEle = driver.findElement(By.id("input-country"));
		Select drpCountry = new Select(drpCountryEle);

		// By using select methods
		// country.selectByVisibleText("Bahrain");
		// country.selectByValue("17");
		// country.selectByIndex(17);

		// selecting option from dropdown without using methods

		List<WebElement> allOptions = drpCountry.getOptions();

		for (WebElement option : allOptions) {
			if (option.getText().equals("Cuba")) {
				option.click();
				break;
			}
		}

	}

}
