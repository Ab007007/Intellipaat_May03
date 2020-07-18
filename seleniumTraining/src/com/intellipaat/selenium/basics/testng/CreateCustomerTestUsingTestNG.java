package com.intellipaat.selenium.basics.testng;

import java.io.IOException;

import org.junit.BeforeClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.intellipaat.selenium.basics.utils.ActiTimeUtils;

public class CreateCustomerTestUsingTestNG {

	

	@Parameters({"un" , "pwd"})
	@BeforeMethod
	public void launch(String username, String password)
	{
		ActiTimeUtils.getDriver("chrome");
		ActiTimeUtils.launchApp();
		ActiTimeUtils.login(username, password);
	}
	
	@AfterMethod
	public void logout(ITestResult result)
	{
		try {
			ActiTimeUtils.captureScreenshot(result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ActiTimeUtils.logout();
	}
	
	@Test(dataProviderClass = TestData.class , dataProvider = "createCustomer")
	public void createCustomerTest(String name, String desc)
	{
		ActiTimeUtils.selectModule("tasks");
		ActiTimeUtils.clickOnNewCustomerButton();
		ActiTimeUtils.createCustomer(name, desc);
	}
	
	@Test
	public void createProjectTest()
	{
		
	}
}
