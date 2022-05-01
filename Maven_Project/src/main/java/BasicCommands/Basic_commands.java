package BasicCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_commands {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SE_ChromeDriver\\chromedriver.exe");
		// WebDriverManager.chromedriver().setup();//OR
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();// maximize mode
		// driver.manage().window().fullscreen();//fullscreen mode
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// 10 sec wait for open the page
		driver.get("http://adactinhotelapp.com");// lounch URL
		// driver.navigate().to("http://adactinhotelapp.com");//OR

		// name locator :
		driver.findElement(By.name("username")).sendKeys("Shubham1911");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("123456789");
		Thread.sleep(1000);// wait for 1 second
		driver.findElement(By.name("login")).click();

		// id locator
		/*
		 * driver.findElement(By.id("username")).sendKeys("Shubham1911");
		 * driver.findElement(By.id("password")).sendKeys("123456789");
		 * driver.findElement(By.id("login")).click();
		 */

		// className locator :
		/*
		 * driver.findElement(By.className("login_input")).sendKeys("Shubham1911");
		 * driver.findElement(By.id("password")).sendKeys("123456789");
		 * driver.findElement(By.className("login_button")).click();
		 */

		// Relative xpath OR partial xpath :
		/*
		 * driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Shubham1911")
		 * ;
		 * driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456789");
		 * driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		 */

		// Absolute xpath OR full xpath :
		/*
		 * driver.findElement(By.xpath(
		 * "/html/body/table[2]/tbody/tr/td[2]/form/table/tbody/tr[2]/td[2]/input")).
		 * sendKeys("Shubham1911"); driver.findElement(By.xpath(
		 * "/html/body/table[2]/tbody/tr/td[2]/form/table/tbody/tr[3]/td[2]/input")).
		 * sendKeys("123456789"); driver.findElement(By.xpath(
		 * "/html/body/table[2]/tbody/tr/td[2]/form/table/tbody/tr[6]/td[2]/input")).
		 * click();
		 */

		// Tag&ID cssSelector :
		/*
		 * driver.findElement(By.cssSelector("input#username")).sendKeys("Shubham1911");
		 * //OR #username
		 * driver.findElement(By.cssSelector("input#password")).sendKeys("123456789");//
		 * OR #password driver.findElement(By.cssSelector("input#login")).click();//OR
		 * #login
		 */

		// Tag&Class cssSelector :
		/*
		 * driver.findElement(By.cssSelector("input.login_input")).sendKeys(
		 * "Shubham1911");//OR .login_input
		 * driver.findElement(By.cssSelector("input.login_input")).sendKeys("123456789")
		 * ;//OR .login_input
		 * driver.findElement(By.cssSelector("input.login_button")).click();//OR
		 * .login_button
		 */

		// Tag&Attribute :
		/*
		 * driver.findElement(By.cssSelector("input[id=\"username\"]")).sendKeys(
		 * "Shubham1911");//OR [id=\"username\"]
		 * driver.findElement(By.cssSelector("input[id=\"password\"]")).sendKeys(
		 * "123456789");//OR [id=\"password\"]
		 * driver.findElement(By.cssSelector("input[id=\"login\"]")).click();//OR
		 * [id=\"login\"]
		 */

		// Tag,class&attribute :
		/*
		 * driver.findElement(By.cssSelector("input.login_input[id=\"username\"]")).
		 * sendKeys("Shubham1911");//OR .login_input[id=\"username\"]
		 * driver.findElement(By.cssSelector("input.login_input[id=\"password\"]")).
		 * sendKeys("123456789");//OR .login_input[id=\"password\"]
		 * driver.findElement(By.cssSelector("input.login_button[id=\"login\"]")).click(
		 * );//OR .input_button[id=\"login\"]
		 */

		// Dropdown :
		/*
		 * WebElement a1=driver.findElement(By.name("location")); Select A1=new
		 * Select(a1); A1.selectByValue("London");
		 */

		/*
		 * WebElement a1=driver.findElement(By.name("location")); Select A1=new
		 * Select(a1); A1.selectByVisibleText("Brisbane");
		 */

		/*
		 * WebElement a1=driver.findElement(By.name("location")); Select A1=new
		 * Select(a1); A1.selectByIndex(2);
		 */

		// HyperLink :
		/*
		 * driver.findElement(By.linkText("Book Itinerary")).click();
		 * driver.findElement(By.partialLinkText("Itinerary")).click();
		 */

		// count all images in web page by using findElements :
		/*
		 * int image=driver.findElements(By.tagName("img")).size();
		 * System.out.println(image);
		 */

		// count all links in web page by using findElements :
		/*
		 * int link=driver.findElements(By.tagName("a")).size();
		 * System.out.println(link);
		 */

		/*
		 * driver.navigate().back(); driver.navigate().forward();
		 * driver.navigate().refresh();
		 */

		// driver.findElement(By.name("datepick_in")).clear();//clear data in text

		// Title of web page :
		/*
		 * String title=driver.getTitle(); System.out.println(title);
		 */

		// Display text of web element :
		/*
		 * String text=driver.findElement(By.className("login_title")).getText();
		 * System.out.println(text);
		 */

		// All web page HTML code displayed :
		/*
		 * String A1=driver.getPageSource(); System.out.println(A1);
		 */

		// get.Text() Command :
		/*
		 * String getText = driver.findElement(By.className("welcome_menu")).getText();
		 * System.out.println(getText);
		 */

		// Assertion :
		/*
		 * String expectedResult="Existing User Login - Build 1"; String
		 * actualResult=driver.findElement(By.className("login_title")).getText();
		 * Assert.assertEquals(expectedResult,actualResult);
		 * System.out.println("The Test Case Is Pass");
		 */

		// Right click commands :
		/*
		 * WebElement A1=driver.findElement(By.id("location")); Actions action=new
		 * Actions(driver); action.contextClick(A1).perform();
		 */

		// Double click Commands :
		/*
		 * WebElement A1=driver.findElement(By.className("welcome_menu")); Actions
		 * action=new Actions(driver); action.doubleClick(A1).perform();
		 */

		System.out.println("The Basic Of Selenium Webdriver");

		// driver.close();//will only close the current browser window opened
		// driver.quit();//will close all the currently browser windows opened

	}

}
