package com.intellipaat.selenium.basics.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.intellipaat.selenium.basics.utils.ActiTimeUtils;

public class MouseMovementDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = ActiTimeUtils.getDriver();
		ActiTimeUtils.launchApp("https://www.flipkart.com/");
		
		WebDriverWait wait  = new WebDriverWait(driver, 20);
		WebElement loginPrompt = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"))));
		loginPrompt.click();
		
		WebElement LoginButton = driver.findElement(By.linkText("Login"));
		WebElement moreLink = driver.findElement(By.xpath("//div[text()='More']"));
		
		WebElement electronicsTab = driver.findElement(By.xpath("//span[text()='Electronics']/parent::li"));
		WebElement babyTab = driver.findElement(By.xpath("//span[text()='Baby & Kids']/parent::li"));
		WebElement menTab = driver.findElement(By.xpath("//span[text()='Men']/parent::li"));
		WebElement womenTab = driver.findElement(By.xpath("//span[text()='Women']/parent::li"));
		WebElement homeTag = driver.findElement(By.xpath("//span[text()='Home & Furniture']/parent::li"));
		
		Actions act  =  new Actions(driver);
		
		act.moveToElement(womenTab).perform();
		Thread.sleep(2000);
		act.moveToElement(homeTag).perform();
		Thread.sleep(2000);
		act.moveToElement(LoginButton).perform();
		Thread.sleep(2000);
		act.moveToElement(moreLink).perform();
		Thread.sleep(2000);
		act.moveToElement(menTab).perform();
		Thread.sleep(2000);
		act.moveToElement(babyTab).perform();
		Thread.sleep(2000);
		act.moveToElement(electronicsTab).perform();
		Thread.sleep(2000);
		act.moveToElement(womenTab).perform();
		Thread.sleep(2000);
		
		
		
		
		
		
	}
}
