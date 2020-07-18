package com.intellipaat.selenium.basics.testng;

import org.testng.Assert;
import org.testng.annotations.Test;


public class OrderOfExecutionByPriority 
{
 
  
  @Test(priority = 3)
  public void createCustomerTest() 
  {
	  System.out.println("CreateCustomer Test");
	  Assert.assertFalse(true);
  }  
  
  @Test(priority = 4)
  public void logoutTest() 
  {
	  System.out.println("Logout Test");
  }
  
  
  @Test(priority = 1)
  public void launchTest() 
  {
	  System.out.println("Launch Test");
  }
  
  @Test(priority = 2)
  public void loginTest() 
  {
	  System.out.println("Login Test");
  }
}
