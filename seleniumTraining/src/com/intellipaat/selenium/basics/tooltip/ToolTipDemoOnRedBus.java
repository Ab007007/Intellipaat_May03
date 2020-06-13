package com.intellipaat.selenium.basics.tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipDemoOnRedBus {

	public static void main(String[] args) {
		
		System.out.println("--- Welcome to Red Bus Application ----");
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		String rPoolToolTip = driver.findElement(By.id("cars")).getAttribute("title");
		String busHireToolTip = driver.findElement(By.id("redBus Bus Hire")).getAttribute("title");
		String pilgrimagesToolTip = driver.findElement(By.id("pilgrimages")).getAttribute("title");

		System.out.println(rPoolToolTip);
		System.out.println(busHireToolTip);
		System.out.println(pilgrimagesToolTip);
		
		driver.close();
		driver = null;
	
	
	
	}
}
