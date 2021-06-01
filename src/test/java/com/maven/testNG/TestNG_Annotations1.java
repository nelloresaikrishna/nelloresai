package com.maven.testNG;

import org.testng.annotations.*;

public class TestNG_Annotations1 {

	@Test (timeOut =3000)
	private void setUp() {
		System.out.println("Set Up");

	}

	@Test(priority = -20)
	private void BrowserLaunch() {
		System.out.println("Browser launch");

	}

	@Test(invocationCount =10)
	private void setUrl() {
		System.out.println("URL");

	}

	@Test(priority = 10)
	private void login() {
		System.out.println("Enter credentials");

	}

	@Test(priority = 20)
	private void searchMobiles() {
		System.out.println("Search Mobiles");
	}

	@Test(priority = -46)
	private void searchLaptops() {
		System.out.println("search Laptops");

	}

	@Test(priority = 58)
	private void logOut() {
		System.out.println("Log Out");
	}

	@Test(priority = -2)
	private void tearDown() {
		System.out.println("Close Browser");

	}

	@Test(priority = -7)
	private void verification() {
		System.out.println("Verification");

	}

	@Test
	private void clearCookies() {
		System.out.println("clear cookies");
	}

}
