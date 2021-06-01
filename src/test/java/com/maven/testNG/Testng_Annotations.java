package com.maven.testNG;

import org.testng.annotations.*;

public class Testng_Annotations {

	@BeforeSuite
	private void setUp() {
		System.out.println("Set Up");

	}

	@BeforeTest
	private void BrowserLaunch() {
		System.out.println("Browser launch");

	}

	@BeforeClass
	private void setUrl() {
		System.out.println("URL");

	}

	@BeforeMethod
	private void login() {
		System.out.println("Enter credentials");

	}

	@Test
	private void searchMobiles() {
		System.out.println("Search Mobiles");
	}

	@Test
	private void searchLaptops() {
		System.out.println("search Laptops");

	}

	@AfterMethod
	private void logOut() {
		System.out.println("Log Out");
	}

	@AfterClass
	private void tearDown() {
		System.out.println("Close Browser");

	}

	@AfterTest
	private void verification() {
		System.out.println("Verification");

	}

	@AfterSuite
	private void clearCookies() {
		System.out.println("clear cookies");
	}

}
