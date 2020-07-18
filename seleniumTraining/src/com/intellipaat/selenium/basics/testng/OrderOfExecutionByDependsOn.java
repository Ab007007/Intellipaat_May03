package com.intellipaat.selenium.basics.testng;

import org.testng.annotations.Test;

public class OrderOfExecutionByDependsOn 
{
  @Test
  public void launchTest() 
  {
	  System.out.println("Launch Test");
  }
  
  @Test(dependsOnMethods = "launchTest")
  public void loginTest() 
  {
	  System.out.println("Login Test");
  }
  
  @Test(dependsOnMethods = {"launchTest" , "loginTest"})
  public void createCustomerTest() 
  {
	  System.out.println("CreateCustomer Test");
  }  
  
  @Test(dependsOnMethods = "createCustomerTest")
  public void logoutTest() 
  {
	  System.out.println("Logout Test");
  }
}
