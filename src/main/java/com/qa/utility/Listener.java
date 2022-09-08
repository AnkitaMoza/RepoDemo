package com.qa.utility;


import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.TestBase.TestBase;

public class Listener extends TestBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		logger.info("Test case started");
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		logger.info("Test case success");
		
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		logger.info("Test case Failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		logger.info("Test case Skipped");
		
	}

	
	

	
	

	

}
