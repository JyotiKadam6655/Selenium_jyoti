package com.ShopperStack.GenericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener_Utility implements ITestListener,ISuiteListener{
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		TakesScreenshot ts=(TakesScreenshot)BaseTest.ListenerDriver;   //as it is overridden method so we can't take input from user inside method signature
	    File temp=ts.getScreenshotAs(OutputType.FILE);                 //that's why we can't use driver while doing downCasting,so we use--> className.ListenerDriver;
	    File dest=new File("");
	    
	    try {                                // as it is overRidden method ..we use try and catch block to handle exception
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	
}
