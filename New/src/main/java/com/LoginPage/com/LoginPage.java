package com.LoginPage.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath = "//a[@class='login']")
	private WebElement signin;

	public WebElement getSignin() {
		return signin;
	}

	@FindBy(xpath = "(//input[@name='email'])[1]")
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}

	@FindBy(xpath = "//input[@name='passwd']")
	private WebElement pass;

	public WebElement getPass() {
		return pass;
	}

	@FindBy(xpath = "//button[@name='SubmitLogin']")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}

	public static WebDriver driver;

	public LoginPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);

	}

}
