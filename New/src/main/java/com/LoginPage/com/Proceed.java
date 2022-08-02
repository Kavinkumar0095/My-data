package com.LoginPage.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed {
	
	public WebElement getWomen() {
		return women;
	}

	public WebElement getTshirt() {
		return Tshirt;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getCompositions() {
		return compositions;
	}

	public WebElement getSortBy() {
		return sortBy;
	}

	public WebElement getImag() {
		return imag;
	}

	public WebElement getQuickview() {
		return quickview;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getProceedtocheckout() {
		return Proceedtocheckout;
	}

	public WebElement getProceed() {
		return Proceed;
	}

	public WebElement getPro() {
		return pro;
	}

	public WebElement getTerms() {
		return terms;
	}

	public WebElement getProc() {
		return proc;
	}

	public WebElement getPay() {
		return pay;
	}

	public WebElement getConfirm() {
		return confirm;
	}

	public WebDriver getDriver() {
		return driver;
	}

	@FindBy(xpath="(//a[@class=\"sf-with-ul\"])[1]")
	private WebElement women;
	
	@FindBy(xpath="(//a[@title='T-shirts'])[1]")
	private WebElement Tshirt;
	
	@FindBy(xpath="//input[@name='layered_id_attribute_group_1']")
	private WebElement size;
	
	@FindBy (xpath= "//input[@name='layered_id_feature_5']")
	private WebElement compositions;
	
	//@FindBy (xpath="//select[@class='selectProductSort form-control']")
	private WebElement sortBy;
	
	@FindBy (xpath="//a[@class='product_img_link']")
	private WebElement imag;
	
	@FindBy (xpath="//a[@class='quick-view']")
	private WebElement quickview;
	
	@FindBy (xpath="//button[@name='Submit']")
	private WebElement addtocart;
	
	@FindBy (xpath="//a[@class=\"btn btn-default button button-medium\"]")
	private WebElement Proceedtocheckout;
	
	@FindBy (xpath="//a[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement Proceed;
	
	@FindBy (xpath= "//button[@name='processAddress']")
	private WebElement pro;
	
	@FindBy (xpath="//input[@name='cgv']")
	private WebElement terms;
	
	@FindBy (xpath="//button[@name='processCarrier']")
	private WebElement proc;
	
	@FindBy (xpath="//a[@class='bankwire']")
	private WebElement pay;
	
	@FindBy (xpath= "//button[@class='button btn btn-default button-medium']")
	private WebElement confirm;
	
	
	
	public WebDriver driver;
	
	public Proceed(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}
	

}
