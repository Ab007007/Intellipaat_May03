package com.intellipaat.selenium.basics.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.intellipaat.selenium.basics.utils.ActiTimeUtils;

public class MultiSelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver  = ActiTimeUtils.getDriver();
		ActiTimeUtils.launchApp("file:///D:/Intellipaat/Intellipaat_08_June/html/multiSelect.html");
		
		Select sel = new Select(driver.findElement(By.tagName("select")));
		
		sel.selectByIndex(0);
		Thread.sleep(2000);
		sel.selectByValue("mercedes");
		Thread.sleep(2000);
		sel.selectByVisibleText("Audi");
		Thread.sleep(2000);
		
		sel.deselectByIndex(0);
		Thread.sleep(2000);
		sel.deselectByValue("mercedes");
		Thread.sleep(2000);
		sel.deselectByVisibleText("Audi");
		Thread.sleep(2000);
		
		sel.selectByIndex(0);
		Thread.sleep(2000);
		sel.selectByValue("mercedes");
		Thread.sleep(2000);
		sel.selectByVisibleText("Audi");
		Thread.sleep(2000);
		
		sel.deselectAll();
		
		
		
		
		
		
	}
	
}
