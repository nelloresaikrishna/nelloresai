package com.maven.testNG;

import org.testng.annotations.Test;

public class Group_Test {

	@Test(groups = "Browser")
	private void chrome() {
		System.out.println("Chrome Browser");

	}

	@Test(groups = "Mobiles")
	private void onePlus() {
		System.out.println("Oneplus Mobiles");

	}

	@Test(groups = "Browser")
	private void firefox() {
		System.out.println("Firefox Browser");

	}

	@Test(groups = "Mobiles")
	private void iphone() {
		System.out.println("Iphone Mobiles");
	}

	@Test(groups = "Browser")
	private void edge() {
		System.out.println("Edge Browser");

	}

	@Test(groups = "Mobiles")
	private void realMe() {
		System.out.println("Realme Mobiles");

	}

	@Test(groups = "OS")
	private void windows() {
		System.out.println("Windows OS");

	}
	
	@Test(groups = "Laptops")
	private void hp() {
		System.out.println("Hp Laptops");

	}
	@Test(groups = "Laptops")
	private void lenovo() {
		System.out.println("Lenovo Laptops");

	}
	@Test(groups = "OS")
	private void ios() {
		System.out.println("Ios OS");

	}
	@Test(groups = "OS")
	private void Linux() {
		System.out.println("Linux OS");

	}
	@Test(groups = "Laptops")
	private void ASUS() {
		System.out.println(" Asus Laptops");

	}

}
