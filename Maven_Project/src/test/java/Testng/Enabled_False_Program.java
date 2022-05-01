
package Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Enabled_False_Program {
	@Test(enabled = false) // this test case dos not executed
	public void a() {
		System.out.println("Test Case-1");
	}

	@Test
	public void b() {
		System.out.println("Test Case-2");
	}

	@Test
	public void c() {
		System.out.println("Test Case-3");
	}

	public void d() {
		System.out.println("Test Case-4");
	}

	@Test
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
