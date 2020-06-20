package com.intellipaat.selenium.basics.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.intellipaat.selenium.basics.utils.ActiTimeUtils;

public class DDUsingSelectClass {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  ActiTimeUtils.getDriver();
		ActiTimeUtils.launchApp("http://formy-project.herokuapp.com/form");
		
		Select sel = new Select(driver.findElement(By.id("select-menu")));
		sel.selectByIndex(3);
		Thread.sleep(3000);
		sel.selectByValue("0");
		Thread.sleep(3000);
		sel.selectByVisibleText("10+");
		
	}
}
