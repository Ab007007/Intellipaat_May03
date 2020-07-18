package com.intellipaat.selenium.basics.switchto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.intellipaat.selenium.basics.utils.ActiTimeUtils;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("---Create Customer Test ---");
		WebDriver driver = ActiTimeUtils.getDriver();
		
		ActiTimeUtils.launchApp();
		ActiTimeUtils.login("admin", "manager");
		
		ActiTimeUtils.selectModule("tasks");
		ActiTimeUtils.clickOnNewCustomerButton();
		ActiTimeUtils.type("id", "customerLightBox_nameField", "DummyData");
		Thread.sleep(2000);
		Actions act =  new Actions(driver);
		act.click(ActiTimeUtils.getElement("id", "customerLightBox_cancelBtn")).perform();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		//ActiTimeUtils.click("id", "customerLightBox_cancelBtn");
		act.click(ActiTimeUtils.getElement("id", "customerLightBox_cancelBtn")).perform();
		
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		
		
		
	}
}
