package com.intellipaat.selenium.basics.utils;

public class ActiTimeUtils extends DriverUtils
{

	/**
	 * 
	 * @param url
	 */
	public static void launchApp(String url)
	{
		driver.get(url);
		validateTitle("actiTIME - Login");
	}
	
	public static void login(String un,String pwd)
	{
		ActiTimeUtils.type("id", "username", un);
		ActiTimeUtils.type("name", "pwd", pwd);
		ActiTimeUtils.click("id", "loginButton");
		try 
		{
			Thread.sleep(5000);
		} catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		validateTitle("actiTIME - Enter Time-Track");
	}
	
	
	public static void logout()
	{
		ActiTimeUtils.click("linktext", "Logout");
		validateTitle("actiTIME - Login");
	}
}
