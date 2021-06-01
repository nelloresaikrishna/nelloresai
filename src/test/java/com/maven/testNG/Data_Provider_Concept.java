package com.maven.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_Concept {
	@Test(dataProvider ="testData")
	private void credential(String username, String password) {

		System.out.println("Username = " + username +" "+ "Password =" + password);

	}

	@DataProvider
	private Object[][] testData() {
		return new Object[][] { 
			{ "saiCSE", "s@iCSE123" }, 
			{ "saiKrishna", "SAICSE1" }, 
			{ "Nellore12", "saiCSE1234" },
			{ "saiKRISHNA", "NELLORE123" }, 
			{ "NELLORE32", "NELLOREsai12" }, 
			{ "NSK123", "NSK@123" },

		};

	}

}
