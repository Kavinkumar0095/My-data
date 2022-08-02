package org.runner;

import java.io.IOException;

import org.junit.*;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.CucumberProject.BaseClass;
import com.CucumberProject.FileReaderManager;

//import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\Kavin\\eclipse-mine\\CucumberProject\\Script.feature",

		glue = "com.StepDefenition.com")

public class Runner {
	public static WebDriver driver;

	@BeforeClass
	public static void setUp() throws IOException {
		System.out.println("Chrome is opening");

		String browser = FileReaderManager.getInstanceFR().getInstance_CR().getBrowser();
		driver = BaseClass.browserLaunch(browser);

	}

	@AfterClass
	public static void close() {

		BaseClass.closeTheBrowser();

	}

}
