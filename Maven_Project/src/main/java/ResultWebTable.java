import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ResultWebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);

		driver.get("http://www.aitsteam.com/Diploma/ViewReport/index.php");

		driver.findElement(By.id("RegNumber")).sendKeys("AITS/A/1236/19");
		driver.findElement(By.id("StudName")).sendKeys("NAINIKA RAJ");
		driver.findElement(By.name("submit")).click();

		String valus = driver.findElement(By.xpath("//table[@class='table1']/tbody/tr[3]/td[2]")).getText();
		System.out.println("The value is=" + valus);

		int rows = driver.findElements(By.xpath("//table[@class='table1']//tbody/tr")).size();
		System.out.println("total number of row=" + rows);

		int cols = driver.findElements(By.xpath("//table[@class='table1']/tbody/tr/th")).size();
		System.out.println("total number of column=" + cols);

		for (int r = 1; r <= rows; r++)

		{
			for (int c = 1; c <= cols; c++) {

				String data = driver.findElement(By.xpath("//table[@class='table1']/tbody/tr[" + r + "]/td[" + c + "]"))
						.getText();

				System.out.println(data + "");
			}
			System.out.println(" ");
		}

	}

}
