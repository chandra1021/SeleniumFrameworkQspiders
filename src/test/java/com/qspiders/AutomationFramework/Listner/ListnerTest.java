package com.qspiders.AutomationFramework.Listner;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.qspiders.AutomationFramework.Generic.WebDriverUtil;

public class ListnerTest extends WebDriverUtil implements ITestListener {

	@Override
	public void onFinish(ITestContext context) {
	}

	@Override
	public void onStart(ITestContext context) {
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onTestFailure(ITestResult result){
		//File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		TakesScreenshot take = (TakesScreenshot) driver;
		File photo = take.getScreenshotAs(OutputType.FILE);
		try 
		{
			FileUtils.copyFile(photo, new File("./screenshots/" + "photo1.png"));
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	}

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("test started",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	}
	
	
}