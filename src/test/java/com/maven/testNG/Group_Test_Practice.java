package com.maven.testNG;

import org.testng.annotations.Test;

public class Group_Test_Practice {

	@Test(groups = "browser")
	private void edge() {
		System.out.println("edge browser");
	}

	@Test(groups = "browser")
	private void chrome() {
		System.out.println("chrome browser");

	}

	@Test(groups = "browser")
	private void firefox() {
		System.out.println("firefox browser");

	}

	@Test(groups = "mobile")
	private void oppo() {
		System.out.println("Oppo Mobile");

	}

	@Test(groups = "mobile")
	private void onePlus() {
		System.out.println("onePlus Mobile");

	}

	@Test(groups = "laptops")
	private void hp() {
		System.out.println("Hp Laptops");
	}

	@Test(groups = "laptops")
	private void dell() {
		System.out.println("Dell laptop ");

	}

	@Test(groups = "laptops")
	private void lenovo() {
		System.out.println("lenovo laptop");
	}

}
