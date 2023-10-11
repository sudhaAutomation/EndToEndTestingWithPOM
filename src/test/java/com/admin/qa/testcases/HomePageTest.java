package com.admin.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.admin.qa.base.TestBase;
import com.admin.qa.pages.CategoryListPage;
import com.admin.qa.pages.DashboardPage;
import com.admin.qa.pages.LoginPage;
import com.admin.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	DashboardPage homePage;
	TestUtil testUtil;
	CategoryListPage contactsPage;

	public HomePageTest() {
		super();
	}

	// test cases should be separated -- independent with each other
	// before each test case -- launch the browser and login
	// @test -- execute test case
	// after each test case -- close the browser

	@BeforeMethod
	public void setUp() {
		testUtil = new TestUtil();
		contactsPage = new CategoryListPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
