package com.New;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.LoginPage.com.POM;

public class Automate extends BaseClass {
	
	
	public static POM p = new POM(driver);
	
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kavin\\eclipse-examples\\Automation4\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		
		
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		
		signin.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement Email = driver.findElement(By.xpath("(//input[@name=\"email\"])[1]"));
		Email.sendKeys("kavinracer3@gmail.com");
		
		WebElement Password = driver.findElement(By.xpath("//input[@data-validate='isPasswd']"));
		Password.sendKeys("Kavin@123");
																																																			
		WebElement login = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		
		login.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement women = driver.findElement(By.xpath("(//a[@class=\"sf-with-ul\"])[1]"));
				
		Actions ac = new Actions(driver);
		
		ac.moveToElement(women).build().perform();
		
		WebElement Tshirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));
		
		Tshirt.click();
		
		WebElement size = driver.findElement(By.xpath("//input[@name='layered_id_attribute_group_1']"));
		
		size.click();
		
		WebElement compositions = driver.findElement(By.xpath("//input[@name='layered_id_feature_5']"));
		
		compositions.click();
		
		WebElement Sortby = driver.findElement(By.xpath("//select[@class='selectProductSort form-control']"));
		
		Select sc = new Select(Sortby);
		
		sc.selectByValue("price:desc");
		
		WebElement imag = driver.findElement(By.xpath("//a[@class='product_img_link']"));
		
		ac.moveToElement(imag).build().perform();
		
		WebElement quickview = driver.findElement(By.xpath("//a[@class='quick-view']"));
		
		quickview.click();
		
		Thread.sleep(5000);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\Kavin\\eclipse-examples\\Automation4\\Screenshot\\Automation.png");
		
		FileUtils.copyFile(source, dest);
		
		System.out.println("Screeshot Taken");
		
		driver.switchTo().frame(0);
		
		WebElement Addtocart = driver.findElement(By.xpath("//button[@name='Submit']"));
		
		Addtocart.click();
		
		driver.switchTo().defaultContent();
				
		WebElement Proceedtocheckout = driver.findElement(By.xpath("//a[@class=\"btn btn-default button button-medium\"]"));
		
		Proceedtocheckout.click();
		
		WebElement Proceed = driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
		
		Proceed.click();
		
		WebElement Pro = driver.findElement(By.xpath("//button[@name='processAddress']"));
		
		Pro.click();
		
		WebElement terms = driver.findElement(By.xpath("//input[@name='cgv']"));
		
		terms.click();
		
		WebElement proc = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		
		proc.click();
		
		WebElement Pay = driver.findElement(By.xpath("//a[@class='bankwire']"));
		
		Pay.click();
		
		Thread.sleep(3000);

		WebElement confirm = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));

		confirm.click();
		
		File source1 = ts.getScreenshotAs(OutputType.FILE);
		
		File dest1 = new File("C:\\Users\\Kavin\\eclipse-examples\\Automation4\\Screenshot\\Automation1.png");
		
		FileUtils.copyFile(source1, dest1);
		
		System.out.println("Screeshot Taken");
		
		
	}




}

