import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://omayo.blogspot.com/");

		// How many row in table
		int rows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr")).size();
		System.out.println("total number of row=" + rows);

		// How many rows in table
		int cols = driver.findElements(By.xpath("//table[@id='table1']//thead/tr/th")).size();
		System.out.println("Total number of column=" + cols);

		// find specific row/column data
		String valus = driver.findElement(By.xpath("//table[@id='table1']//tr[3]/td[1]")).getText();
		System.out.println("The value is=" + valus);

		// find all data from the table
		for (int r = 1; r <= rows; r++)

		{
			for (int c = 1; c <= cols; c++) {

				String data = driver.findElement(By.xpath("//table[@id='table1']//tr[" + r + "]/td[" + c + "]"))
						.getText();

				System.out.println(data + "");
			}
			System.out.println(" ");
		}

	}

}
