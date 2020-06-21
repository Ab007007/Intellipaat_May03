package com.intellipaat.selenium.basics.browser;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;

import com.intellipaat.selenium.basics.utils.ActiTimeUtils;
import com.intellipaat.selenium.basics.utils.DriverUtils;

public class BrowserOperationsDemo {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =  ActiTimeUtils.getDriver();
		ActiTimeUtils.launchApp("http://localhost/login.do");
		
		driver.manage().window().maximize();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().to("http://www.google.com");
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		
	
	}
}
