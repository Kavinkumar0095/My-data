package com.New;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;

import com.LoginPage.com.POM;

public class RunnerPage extends BaseClass {

	public static WebDriver driver = browserLaunch("Chrome");

	public static POM p = new POM(driver);

	public static void main(String[] args) throws InterruptedException, IOException {

		// login page

		get("http://automationpractice.com/index.php");

		Thread.sleep(2000);
		clickOnElement(p.getLp().getSignin());

		//implicitlyWait();
		Thread.sleep(5000);

		enterValue(p.getLp().getEmail(), "kavinracer3@gmail.com");

		enterValue(p.getLp().getPass(), "Kavin@123");

		clickOnElement(p.getLp().getLogin());

		// implicitlyWait();
		Thread.sleep(5000);

		System.out.println("login successfully");

		// proceed to checkout page

		moveToElement(p.getpp().getWomen());

		clickOnElement(p.getpp().getTshirt());

		clickOnElement(p.getpp().getSize());

		clickOnElement(p.getpp().getCompositions());

		WebElement Sortby = driver.findElement(By.xpath("//select[@class='selectProductSort form-control']"));

		Select sc = new Select(Sortby);

		sc.selectByValue("price:desc");

		//clickOnElement(p.getpp().getImag());

		moveToElement(p.getpp().getImag());

		clickOnElement(p.getpp().getQuickview());

		Thread.sleep(5000);

		TakesScreenshot("kavin");

		System.out.println("Screeshot Taken");

		frame(0);

		clickOnElement(p.getpp().getAddtocart());

		frameexit();
		
		Thread.sleep(5000);

		clickOnElement(p.getpp().getProceedtocheckout());

		clickOnElement(p.getpp().getProceed());

		clickOnElement(p.getpp().getPro());

		clickOnElement(p.getpp().getTerms());

		clickOnElement(p.getpp().getProc());

		clickOnElement(p.getpp().getPay());

		Thread.sleep(3000);

		clickOnElement(p.getpp().getPay());

		TakesScreenshot("kavin1");

		System.out.println("successfully ordered");

	}

}
