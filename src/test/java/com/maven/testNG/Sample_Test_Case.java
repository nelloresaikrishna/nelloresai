package com.maven.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample_Test_Case {


	@Test(retryAnalyzer = MyRetryAnalyzer.class)
	private void data1() {
		
		Assert.assertEquals("Sai", "SAI");

	}

}
