package com.intellipaat.selenium.basics.switchto;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.intellipaat.selenium.basics.utils.ActiTimeUtils;

public class ChildBrowserDemo {

	

	public static void main(String[] args) {
		
		//https://www.irctc.co.in/eticketing/errors.html#
		
		WebDriver driver = ActiTimeUtils.getDriver();
		ActiTimeUtils.launchApp("https://www.irctc.co.in/eticketing/errors.html#");
		ActiTimeUtils.click("linktext","Contact Us");
		
		Set<String> windowIds = driver.getWindowHandles();
		Iterator<String> it = windowIds.iterator();
		
		String parentID = it.next();
		String childID = it.next();
		System.out.println("Parent ID" + parentID);
		System.out.println("Child ID" + childID);
		
		driver.switchTo().window(childID);
		
		List<WebElement> emailIds = driver.findElements(By.tagName("a"));
		for (WebElement emailID : emailIds)
		{
			System.out.println(emailID.getText());
		}
		
		driver.close();
		driver.switchTo().window(parentID);
		String sorryText = driver.findElement(By.xpath("//h3[contains(text(),'Sorry')]")).getText();
		
		System.out.println(sorryText);
		driver.close();
		
	}
}
