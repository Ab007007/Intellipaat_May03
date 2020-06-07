package com.intellipaat.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {
	
	public static void main(String[] args) {
		
		System.out.println("--- Welcome to Selenium Automation ----");
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost/login.do");
		
		WebElement userNameTextBox = driver.findElement(By.id("username"));
		WebElement passwordTextBox = driver.findElement(By.name("pwd"));
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		
		userNameTextBox.sendKeys("admin");
		passwordTextBox.sendKeys("manager");
		loginButton.click();
		
		driver.close();
		driver = null;
		
	}

}
