package com.intellipaat.selenium.basics.validation;

import org.openqa.selenium.WebDriver;

import com.intellipaat.selenium.basics.utils.ActiTimeUtils;

public class ValidateElement {

	public static void main(String[] args) {
		WebDriver driver = ActiTimeUtils.getDriver();
		ActiTimeUtils.launchApp("http://formy-project.herokuapp.com/enabled");
		
		ActiTimeUtils.validateAndType("id", "disabledInput", "heloo");
		ActiTimeUtils.validateAndType("id", "input"	, "hellooooo");
		
		
	}
	
	
	
}
