package com.maven.data.Maven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTestCase {

	@Test(retryAnalyzer = RetryAnalyzer.class)
	private void data() {
		Assert.assertEquals("SAI", "sai");
	}
}
