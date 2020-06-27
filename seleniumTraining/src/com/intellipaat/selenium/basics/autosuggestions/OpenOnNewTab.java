package com.intellipaat.selenium.basics.autosuggestions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.intellipaat.selenium.basics.utils.ActiTimeUtils;

public class OpenOnNewTab {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  ActiTimeUtils.getDriver();
		ActiTimeUtils.launchApp("https://www.flipkart.com/");
		
		WebDriverWait wait  = new WebDriverWait(driver, 20);
		WebElement loginPrompt = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"))));
		loginPrompt.click();
		
		Actions act = new Actions(driver);
		act.contextClick(driver.findElement
				(By.xpath("//p[text()='Mobiles & Tablets']/parent::a"))).perform();
		act.sendKeys(Keys.ARROW_LEFT).perform();
		//act.keyDown(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		
	}
}
