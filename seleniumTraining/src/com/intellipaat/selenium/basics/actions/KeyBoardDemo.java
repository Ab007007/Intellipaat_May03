package com.intellipaat.selenium.basics.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.intellipaat.selenium.basics.utils.ActiTimeUtils;

public class KeyBoardDemo {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ActiTimeUtils.getDriver();
		ActiTimeUtils.launchApp();
		
		Actions act = new Actions(driver);
		act.sendKeys("admin").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		act.sendKeys("manager").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		act.click(driver.findElement(By.id("logoutLink"))).perform();

		
		
	}

}
