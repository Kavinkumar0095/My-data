package com.New;

import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test extends BaseClass {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kavin\\eclipse-mine\\New\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement entervalue = driver.findElement(By.xpath("//input[@type='text']"));
		entervalue.sendKeys("mobiles");
		clickEnter();
		
		
	}
	
	

}
