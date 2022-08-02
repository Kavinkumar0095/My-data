package com.TestNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Annotation {
	public static WebDriver driver;
	@Test(priority = 1)
	private void setProperty() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kavin\\eclipse-mine\\TestNG\\Driver\\chromedriver.exe");
	}
	@Test(priority = 2)
	private void driverInitialize() {
		driver = new ChromeDriver();
	}
	@Test(priority = 3)
	private void getUrl() {
		driver.get("https://www.amazon.in/");
	}
	@Test(priority = 4)
	private void maximize() {
		driver.manage().window().maximize();
	}
	@Test(priority = 5)
	private void search() {
		WebElement search = driver.findElement(By.xpath("//input[@name='field-keywords']"));
		search.sendKeys("iphone13");
	}
	@Test(priority = 6)
	private void robot() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

}
