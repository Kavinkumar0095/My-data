package com.LoginPage.com;

import org.openqa.selenium.WebDriver;

public class POM {
	
	public WebDriver driver;	
	
	public POM(WebDriver driver2) {
		
		this.driver = driver2;
	}
	
	public LoginPage getLp() {
		
		LoginPage lp = new LoginPage(driver);
		return lp;

	}
	
	public Proceed getpp() {
		
		Proceed pp = new Proceed(driver);
		return pp;

	}

}
