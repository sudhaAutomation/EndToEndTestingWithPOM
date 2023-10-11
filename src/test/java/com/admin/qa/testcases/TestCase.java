package com.admin.qa.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.admin.qa.base.TestBase;

public class TestCase extends TestBase {

	@BeforeClass
	public void setUp() {
		initialization();
	}

	@Test
	public void test() {
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		System.out.println(driver.findElement(By.id("username")).getText());
		System.out.println(driver.findElement(By.name("username")).getText());
	}

}
