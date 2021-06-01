package com.maven.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Concept {

	@Test
	private void assertConcept() {
		String actual = "NELLORE SAIKRISHNA";
		String expected = "nellore saikrishna";
		int actual1 = 23;
		int expected1 = 23;
		double actual2 = 23.45;
		double expected2 = 24.5;

		//Assert.assertEquals(actual, expected);
		//Assert.assertSame(actual1, expected1);
		//Assert.assertNotEquals(actual, expected);
		//Assert.assertNull(expected);
		//Assert.assertNotNull(expected);
		//Assert.assertTrue(actual == expected);
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, expected);
		sa.assertAll();

	}

}
