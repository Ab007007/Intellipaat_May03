package com.intellipaat.selenium.basics.dropdown;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.intellipaat.selenium.basics.utils.ActiTimeUtils;
import com.intellipaat.selenium.basics.utils.DriverUtils;

public class DDUsingCustomTag {

	public static void main(String[] args) {
		
		WebDriver driver  = DriverUtils.getDriver();
		ActiTimeUtils.launchApp("https://www.redbus.in/");
		
		driver.findElement(By.id("manageHeaderdd")).click();
		driver.findElement(By.xpath("//li[@data-label='Show My Ticket']")).click();
		
		String pageTxt = driver.findElement(By.xpath("//div[@class='header']")).getText();
		
		if(pageTxt.equals("PRINT TICKET"))
		{
			System.out.println("Print ticket page is displayed!!!");
		}
		else
		{
			System.out.println("PAge is wrong!!!");
		}
		
		
		
	}
}
