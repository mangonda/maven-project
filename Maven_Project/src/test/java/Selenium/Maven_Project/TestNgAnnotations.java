package Selenium.Maven_Project;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {
	@Test
	void testCase1() {
		System.out.println("Inside test case 1");
	}

	@Test
	void testCase2() {
		System.out.println("Inside test case 2");
	}

	@BeforeSuite
	void beforesuite() {
		System.out.println("Inside before suite");
	}

	@AfterSuite
	void aftersuite() {
		System.out.println("Inside after suite");
	}

	@BeforeClass
	void beforeclass() {
		System.out.println("Inside before class");
	}

	@AfterClass
	void afterclass() {
		System.out.println("Inside after class;");
	}

	@BeforeTest
	void beforeTest() {
		System.out.println("Inside before test");
	}

	@AfterTest
	void afterTest() {
		System.out.println("Inside after test");
	}

	@BeforeMethod
	void beforeMethod() {
		System.out.println("Inside before method");
	}

	@AfterMethod
	void aftermehod() {
		System.out.println("Inside after method");
	}

	@BeforeGroups
	void beforeGroup() {
		System.out.println("Inside before group");
	}

	@AfterGroups
	void afterGroup() {
		System.out.println("Inside after group");
	}

}
