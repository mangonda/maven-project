package Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priority_program {
	@Test(priority = 1)
	public void a() {
		System.out.println("Test Case-1");
	}

	@Test(priority = 3)
	public void b() {
		System.out.println("Test Case-2");
	}

	@Test(priority = 2)
	public void c() {
		System.out.println("Test Case-3");
	}

	@Test(priority = 5)
	public void d() {
		System.out.println("Test Case-4");
	}

	@Test(priority = 4)
	public void e() {
		System.out.println("Test Case-5");
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
