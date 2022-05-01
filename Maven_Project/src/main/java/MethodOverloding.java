import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodOverloding {
	public WebDriver driver;

	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Ashok\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		// Thread.sleep(1000);
	}

	public void login() {

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		// Thread.sleep(1000);
		// driver.findElement(By.linkText("PIM")).click();
	}

	public void search(String s) {
		// bobj.HRMLogin();
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Odis");
		driver.findElement(By.id("searchBtn")).click();
		// Thread.sleep(1000);
	}

	public void search(String s, String e) {
		// bobj.HRMLogin();
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Odis");
		driver.findElement(By.id("empsearch_supervisor_name")).sendKeys("John Smith");
		driver.findElement(By.id("searchBtn")).click();
		// Thread.sleep(1000);
	}

	public void closure() {
		driver.close();
	}

	public static void main(String[] args) {

		MethodOverloding obj = new MethodOverloding();
		obj.setup();
		obj.login();
		obj.search("Odis");
		obj.search("Odis", "John Smith");
		obj.closure();

		// CommonFunction bobj = new CommonFunction();
		// bobj.HRMLogin();

	}

}
