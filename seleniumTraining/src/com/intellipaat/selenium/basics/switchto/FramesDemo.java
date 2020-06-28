package com.intellipaat.selenium.basics.switchto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.intellipaat.selenium.basics.utils.ActiTimeUtils;

public class FramesDemo {

	public static void main(String[] args) {

		WebDriver driver =  ActiTimeUtils.getDriver();
		ActiTimeUtils.launchApp("https://jqueryui.com/droppable/");
		//driver.switchTo().frame(0);
		driver.switchTo().frame(ActiTimeUtils.getElement("xpath", "//iframe[@class='demo-frame']"));
		Actions act = new Actions(driver);
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dest = driver.findElement(By.id("droppable"));
		System.out.println(dest.getText());
		act.dragAndDrop(src,dest).perform();
		System.out.println(dest.getText());
	}
	
}
