package com.intellipaat.selenium.basics.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HelloWorld 
{

	@BeforeMethod
	public void percondition()
	{
		System.out.println("-----------------------------------------------");
	}
	@AfterMethod
	public void postCondition()
	{
		System.out.println("*************************************************");
	}
	
  @Test
  public void launchTest() 
  {
	  System.out.println("Launch Test");
  }
  
  @Test
  public void loginTest() 
  {
	  System.out.println("Login Test");
  }
  
  @Test
  public void createCustomerTest() 
  {
	  System.out.println("CreateCustomer Test");
  }  
  
  @Test
  public void logoutTest() 
  {
	  System.out.println("Logout Test");
  }
}
