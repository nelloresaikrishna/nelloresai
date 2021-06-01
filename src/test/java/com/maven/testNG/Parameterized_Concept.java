package com.maven.testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Concept {
	
	@Test 
	@Parameters({"username","password"})
	private void credential(String username, String password)  {
		
		System.out.println("Username = "+username+"Password ="+password);

	}

}
