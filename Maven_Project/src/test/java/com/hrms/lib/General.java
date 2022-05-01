package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class General extends ApplicationOpenClose {
	public void login() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		System.out.println("Login successfully Done");
	}

	public void logout() throws InterruptedException {
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a")).click();
		System.out.println("Logout is done");
	}

	public void searchEmpName() {
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Odis");
		driver.findElement(By.id("searchBtn")).click();
		System.out.println("Search Employee Name");
	}

	public void searchSupName() {
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.id("empsearch_supervisor_name")).sendKeys("John Smith");
		driver.findElement(By.id("searchBtn")).click();
		System.out.println("Search Supervioser Name");
	}

	public void searchEmpId() {
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.id("empsearch_id")).sendKeys("0345");
		driver.findElement(By.id("searchBtn")).click();
		System.out.println("Search Empolyee ID");
	}

	public void searchEmployeementStatus() {
		driver.findElement(By.linkText("PIM")).click();
		WebElement A1 = driver.findElement(By.id("empsearch_employee_status"));
		Select a1 = new Select(A1);
		a1.selectByIndex(3);

		driver.findElement(By.id("searchBtn")).click();
		System.out.println("Search Empolyeement Status");
	}

	public void selectInclude() {
		driver.findElement(By.linkText("PIM")).click();
		WebElement A1 = driver.findElement(By.id("empsearch_termination"));
		Select a1 = new Select(A1);
		a1.selectByIndex(2);

		driver.findElement(By.id("searchBtn")).click();
		System.out.println("Select Include");
	}

	public void selectJobTitle() {
		driver.findElement(By.linkText("PIM")).click();
		WebElement A1 = driver.findElement(By.id("empsearch_job_title"));
		Select a1 = new Select(A1);
		a1.selectByIndex(2);

		driver.findElement(By.id("searchBtn")).click();
		System.out.println("Select Job Title");
	}

	public void selectSubUnit() {
		driver.findElement(By.linkText("PIM")).click();
		WebElement A1 = driver.findElement(By.id("empsearch_sub_unit"));
		Select a1 = new Select(A1);
		a1.selectByIndex(2);

		driver.findElement(By.id("searchBtn")).click();
		System.out.println("Select SubUnit");
	}

}
