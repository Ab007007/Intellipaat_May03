package com.intellipaat.selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FormyAutoSuggestion {

 public static void main(String[] args) throws InterruptedException {
  
  System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  
  driver.get("https://formy-project.herokuapp.com/");
  driver.findElement(By.xpath("//a[@class='btn btn-lg' and text()='Autocomplete']")).click();
  Actions act = new Actions(driver);
  act.sendKeys(driver.findElement(By.id("autocomplete")), "Raja").perform();
  Thread.sleep(3000);
  act.sendKeys(Keys.SPACE).perform();
  
  
  
  

 }

}