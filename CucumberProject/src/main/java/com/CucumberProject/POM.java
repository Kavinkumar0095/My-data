package com.CucumberProject;

import javax.servlet.annotation.WebListener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {

	public POM(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getUrl() {
		return url;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNoofroom() {
		return noofroom;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdultsperroom() {
		return adultsperroom;
	}

	public WebElement getChildperroom() {
		return childperroom;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getConti() {
		return conti;
	}

	public WebElement getFirst() {
		return first;
	}

	public WebElement getLast() {
		return last;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCard() {
		return card;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	@FindBy(xpath = "https://adactinhotelapp.com/index.php")
	private WebElement url;

	@FindBy(xpath = "(//input[@class='login_input'])[1]")
	private WebElement username;

	@FindBy(xpath = "(//input[@class='login_input'])[2]")
	private WebElement password;

	@FindBy(xpath = "//input[@class='login_button']")
	private WebElement login;

	@FindBy(xpath = "(//select[@class='search_combobox'])[1]")
	private WebElement location;

	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement hotels;

	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement roomtype;

	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement noofroom;

	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement checkin;

	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement checkout;

	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement adultsperroom;

	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement childperroom;

	@FindBy(xpath = "//input[@name='Submit']")
	private WebElement search;

	@FindBy(xpath = "//input[@name='radiobutton_1']")
	private WebElement radio;

	@FindBy(xpath = "//input[@name='continue']")
	private WebElement conti;

	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement first;

	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement last;

	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement address;

	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement card;

	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement cardtype;

	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement month;

	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement year;

	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement cvv;

	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement booknow;

	@FindBy(xpath = "//input[@name='my_itinerary']")
	private WebElement itinerary;

	public WebElement getLogout() {
		return logout;
	}

	@FindBy(xpath = "//input[@name='logout']")
	private WebElement logout;

	public WebElement getItinerary() {
		return itinerary;
	}

	public void setItinerary(WebElement itinerary) {
		this.itinerary = itinerary;
	}

	public static WebDriver driver;

}
