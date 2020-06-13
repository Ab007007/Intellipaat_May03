package com.intellipaat.selenium.basics.autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartAutoSuggestions {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.flipkart.com/");

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		driver.findElement(By.name("q")).sendKeys("mobiles");
		
		Thread.sleep(3000);
		
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//ul/li[@class='_1va75j']"));
		
		for (WebElement suggestion : autoSuggestions) {
			
			System.out.println(suggestion.getText());
		}
	}

}
