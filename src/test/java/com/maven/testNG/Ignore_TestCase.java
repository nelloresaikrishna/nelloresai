package com.maven.testNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_TestCase {
	
	@Test
	private void setUp() {
		System.out.println("Set Up");

	}

	@Test //(enabled = false)
	@Ignore
	private void BrowserLaunch() {
		System.out.println("Browser launch");

	}

	@Test
	private void setUrl() {
		System.out.println("URL");

	}

	@Test
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

	@Test
	private void logOut() {
		System.out.println("Log Out");
	}

	@Test
	private void tearDown() {
		System.out.println("Close Browser");

	}

	@Test
	private void verification() {
		System.out.println("Verification");

	}

	@Test
	private void clearCookies() {
		System.out.println("clear cookies");
	}

}
