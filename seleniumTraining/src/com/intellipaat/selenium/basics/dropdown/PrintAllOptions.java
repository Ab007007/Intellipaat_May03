package com.intellipaat.selenium.basics.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.intellipaat.selenium.basics.utils.ActiTimeUtils;

public class PrintAllOptions {

	public static void main(String[] args) {
		WebDriver driver =  ActiTimeUtils.getDriver();
		ActiTimeUtils.launchApp("http://formy-project.herokuapp.com/form");
		
		Select sel = new Select(driver.findElement(By.id("select-menu")));
		
		List<WebElement> options = sel.getOptions();
		
		for(WebElement option: options)
		{
			String value = null;
			value = option.getText();
			
			if(value.equals("5-9"))
			{
				System.out.println(value);
				sel.selectByVisibleText(value);
				break;
			}
			
		}
		
	}
}
