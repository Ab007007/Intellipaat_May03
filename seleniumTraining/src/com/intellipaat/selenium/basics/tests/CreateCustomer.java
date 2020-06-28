package com.intellipaat.selenium.basics.tests;

import org.openqa.selenium.WebDriver;
import com.intellipaat.selenium.basics.utils.ActiTimeUtils;

public class CreateCustomer 
{
	public static void main(String[] args) 
	{
		System.out.println("---Create Customer Test ---");
		WebDriver driver = ActiTimeUtils.getDriver("ff");
		
		ActiTimeUtils.launchApp();
		ActiTimeUtils.login("admin", "manager");
		
		ActiTimeUtils.selectModule("tasks");
		ActiTimeUtils.clickOnNewCustomerButton(driver);
		ActiTimeUtils.createCustomer("May-Batch-Customer3", "May-Batch-Customer3-Desc");
		
		ActiTimeUtils.logout();
		
		
	}

	
}
