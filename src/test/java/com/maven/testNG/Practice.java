package com.maven.testNG;

import org.testng.annotations.*;

public class Practice {

	@Test(invocationCount = 10)
	private void setProperty() {
		System.out.println("System.setproperty");
	}

	@Test(timeOut=3000)
	private void browserLaunch() {
		System.out.println("Launch Browser");

	}

	@Test(priority = -5)
	private void setURL() {
		System.out.println("Amazon");

	}

	@Test(priority = -2)
	private void logIn() {
		System.out.println("Login");

	}

	@Test(priority = 2)
	private void searchMobiles() {
		System.out.println("oppo mobile");
	}

	@Test(priority = 19)
	private void searchLaptops() {
		System.out.println("Hp Laptop");
	}

	@Test(priority = 26)
	private void logOut() {
		System.out.println("LogOut");
	}

	@Test(priority = 27)
	private void closeBrowser() {
		System.out.println("Close browser");

	}

	@Test(priority = 35)
	private void clearHistory() {
		System.out.println("verficationr");

	}

	@Test
	private void clearCookies() {
		System.out.println("clear cookies");

	}

}
