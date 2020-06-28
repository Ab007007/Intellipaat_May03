package com.intellipaat.selenium.basics.switchto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.intellipaat.selenium.basics.utils.ActiTimeUtils;

public class FrameDemo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ActiTimeUtils.getDriver("ff");
		
		
		ActiTimeUtils.launchApp("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_date_obj");
		ActiTimeUtils.click("xpath"	, "//button[contains(text(),'Run')]");
		
		driver.switchTo().frame("iframeResult");
		System.out.println(driver.findElement(By.id("demo")).getText());
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		ActiTimeUtils.click("xpath"	, "//button[contains(text(),'Run')]");
		driver.switchTo().frame("iframeResult");
		System.out.println(driver.findElement(By.id("demo")).getText());
		
		
	}
}
