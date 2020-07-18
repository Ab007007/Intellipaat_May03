package com.intellipaat.selenium.basics.testng;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class DataProviderDemo 

{

  @Parameters("tester")
  @BeforeMethod
  public void testerName(String name)
  {
	  System.out.println("Executed by  --" + name);
  }
  
  @AfterMethod
  public void tearDown()
  {
	  System.out.println("---------------------------------");
  }
	
  @Test(dataProvider = "dp", dataProviderClass = TestData.class)
  public void login(Integer n, String s) {
	  System.out.println(n + " - - - - " + s);
  }

  
  
}
