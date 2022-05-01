package Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Groups_Program {
	@Test(groups = { "smoke" })
	public void a() {
		System.out.println("Test Case-1");
	}

	@Test(groups = { "reggretion" })
	public void b() {
		System.out.println("Test Case-2");
	}

	@Test(groups = { "sanity" })
	public void c() {
		System.out.println("Test Case-3");
	}

	@Test(groups = { "re-test" })
	public void d() {
		System.out.println("Test Case-4");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method executed");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method executed");
	}

}
