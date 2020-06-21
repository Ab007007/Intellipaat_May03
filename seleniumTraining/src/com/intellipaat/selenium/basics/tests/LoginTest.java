package com.intellipaat.selenium.basics.tests;

import org.openqa.selenium.WebDriver;

import com.intellipaat.selenium.basics.utils.ActiTimeUtils;

public class LoginTest {

	public static void main(String[] args) {
		
		WebDriver driver = ActiTimeUtils.getDriver();
		ActiTimeUtils.launchApp("http://localhost/login.do");
		ActiTimeUtils.login("admin", "manager");
		ActiTimeUtils.logout();
		
		driver.close();
		
	}
}
