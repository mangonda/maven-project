import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiKeys {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://text-compare.com");

		WebElement input1 = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		WebElement input2 = driver.findElement(By.xpath("//textarea[@id='inputText2']"));

		input1.sendKeys("Welcome to Selenium");

		Actions act = new Actions(driver);

		// control+a
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();

		// ctrl+c
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();

		// TAB-shift to input2
		act.sendKeys(Keys.TAB);
		act.perform();

		// ctrl+v
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();

		// compare
		if (input1.getAttribute("value").equals(input2.getAttribute("value")))

			System.out.println("Text is Copy");

		else

			System.out.println("Text is not Copy");

	}

}
