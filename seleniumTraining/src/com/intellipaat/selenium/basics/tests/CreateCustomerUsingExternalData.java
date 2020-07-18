package com.intellipaat.selenium.basics.tests;

import org.openqa.selenium.WebDriver;
import com.intellipaat.selenium.basics.utils.ActiTimeUtils;
import com.intellipaat.selenium.basics.utils.ExcelUtils;
import com.intellipaat.selenium.basics.utils.FileReaderUtils;

public class CreateCustomerUsingExternalData 
{
	public static void main(String[] args) 
	{
		String browser = FileReaderUtils.getPropertyValue("browser");
		String username = FileReaderUtils.getPropertyValue("username");
		String password = FileReaderUtils.getPropertyValue("password");
		int rowCount;
		String sheetName = "customerdata";
		String customername = null ,customerdesc = null;
		System.out.println("---Create Customer Test ---");
		WebDriver driver = ActiTimeUtils.getDriver(browser);
		
		ActiTimeUtils.launchApp();
		ActiTimeUtils.login(username, password);
		ActiTimeUtils.selectModule("tasks");
		
		rowCount = ExcelUtils.getRowCount(sheetName);
		for (int i = 1; i < rowCount; i++) 
		{
			customername = ExcelUtils.getCellData(sheetName, i, 0);
			customerdesc = ExcelUtils.getCellData(sheetName, i, 1);
			
			ActiTimeUtils.clickOnNewCustomerButton();
			ActiTimeUtils.createCustomer(customername, customerdesc);
			
		}
		
		
		ActiTimeUtils.logout();
		
		
	}

	
}
