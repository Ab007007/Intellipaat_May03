package com.intellipaat.selenium.basics.testng;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.intellipaat.selenium.basics.utils.ActiTimeUtils;

public class ScreenShotDemo {

	
	
	@AfterMethod
	public void logout(ITestResult result)
	{
		if(result.getStatus() == ITestResult.FAILURE)
		{
			try {
				ActiTimeUtils.captureScreenshot(result);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			ActiTimeUtils.logout();
		}
		
		
	}
	
	@Test
	public void validLogin()
	{
		ActiTimeUtils.getDriver("chrome");
		ActiTimeUtils.launchApp();
		ActiTimeUtils.login("admin", "manager");
	}	
	@Test
	public void inValidLogin()
	{
		ActiTimeUtils.getDriver("chrome");
		ActiTimeUtils.launchApp();
		ActiTimeUtils.login("admin1", "manager1");
	}
}

