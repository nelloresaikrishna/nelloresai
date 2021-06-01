package com.maven.testNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetryAnalyzer implements IRetryAnalyzer {

	int count = 0;
	int limit = 6;

	@Override
	public boolean retry(ITestResult result) {

		if (count < limit) {

			count++;
			return true;
		}

		return false;
	}

}
