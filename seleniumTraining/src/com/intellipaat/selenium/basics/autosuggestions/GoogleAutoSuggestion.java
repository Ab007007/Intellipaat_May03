package com.intellipaat.selenium.basics.autosuggestions;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutoSuggestion {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("--- Welcome to Google Auto Suggestions ---");
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Intellipaat");
		
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//ul/li//div[@class='sbtc']"));
		
		System.out.println(autoSuggestions.size());
		
		for (WebElement suggestion : autoSuggestions) {
			System.out.println(suggestion.getText());
			
		}
		
			
	}

}
