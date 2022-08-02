package org.stepdefinetion.com;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.runner.Runner;

import com.CucumberProject.BaseClass;
import com.CucumberProject.FileReaderManager;
import com.CucumberProject.POM;

import io.cucumber.java.en.*;
import junit.framework.Assert;

public class StepDefenition extends BaseClass {

	public static WebDriver driver = Runner.driver;

	POM p = new POM(driver);

	@Given("application launched successfully")
	public void application_launched_successfully() throws IOException {
		browserLaunch("chrome");
		String url = FileReaderManager.getInstanceFR().getInstance_CR().getUrl();
		getUrl(url);
		driver.manage().window().maximize();
		String actual = driver.getTitle();
		String expected = "Adactin.com - Hotel Reservation System";
		Assert.assertEquals(expected, actual);

	}

	@When("User enter the username in the username field")
	public void user_enter_the_username_in_the_username_field() {
		setValues(p.getUsername(), "Username");

	}

	@When("User enter the password in the password field")
	public void user_enter_the_password_in_the_password_field() {
		setValues(p.getPassword(), "Password");

	}

	@Then("click the login button")
	public void click_the_login_button() {
		clickOnElement(p.getLogin());

	}

	@Given("login is successfully done")
	public void login_is_successfully_done() {
		String actual = driver.getTitle();
		String expected = "Adactin.com - Search Hotel";
		Assert.assertEquals(expected, actual);

	}

	@When("select the location")
	public void select_the_location() {
		singleDrop(p.getLocation(), "value", "Melbourne");

	}

	@When("search the hotel")
	public void search_the_hotel() {
		singleDrop(p.getHotels(), "value", "Hotel Cornice");

	}

	@When("select the room type")
	public void select_the_room_type() {
		singleDrop(p.getRoomtype(), "value", "Standard");

	}

	@When("choose the number of rooms what we want")
	public void choose_the_number_of_rooms_what_we_want() {
		singleDrop(p.getNoofroom(), "value", "1");

	}

	@When("mention the check in date in the given field")
	public void mention_the_check_in_date_in_the_given_field() {
		setValues(p.getCheckin(), "01/01/2023");

	}

	@When("mention the check out date in the given field")
	public void mention_the_check_out_date_in_the_given_field() {
		setValues(p.getCheckout(), "02/01/2023");

	}

	@When("choose the adults per room in the given drop down")
	public void choose_the_adults_per_room_in_the_given_drop_down() {
		singleDrop(p.getAdultsperroom(), "value", "1");

	}

	@When("if you have a children mention it in the given field")
	public void if_you_have_a_children_mention_it_in_the_given_field() {
		singleDrop(p.getChildperroom(), "value", "1");

	}

	@Then("click the search button")
	public void click_the_search_button() {
		clickOnElement(p.getSearch());

	}

	@Given("hotel location and room type is correctly filled")
	public void hotel_location_and_room_type_is_correctly_filled() {
		String actual = driver.getTitle();
		String expected = "Adactin.com - Select Hotel";
		Assert.assertEquals(expected, actual);

	}

	@When("radio button is enabled or not")
	public void radio_button_is_enabled_or_not() {
		clickOnElement(p.getRadio());
		clickOnElement(p.getConti());

	}

	@Given("hotel location and room type and radio button is correctly enabled")
	public void hotel_location_and_room_type_and_radio_button_is_correctly_enabled() {
		String actual = driver.getTitle();
		String expected = "Adactin.com - Book A Hotel";
		Assert.assertEquals(expected, actual);

	}

	@When("enter your first name")
	public void enter_your_first_name() {
		setValues(p.getFirst(), "kavin");

	}

	@When("the last name")
	public void the_last_name() {
		setValues(p.getLast(), "kumar");

	}

	@Then("enter your Billing address")
	public void enter_your_Billing_address() {
		setValues(p.getAddress(), "123, tiruppur, tamilnadu, india");

	}

	@Then("your {int} digit credit card number is mandatory for booking")
	public void your_digit_credit_card_number_is_mandatory_for_booking(Integer int1) {
		setValues(p.getCard(), "1234123412341234");

	}

	@Then("select the credit card type")
	public void select_the_credit_card_type() {
		singleDrop(p.getCardtype(), "value", "MAST");

	}

	@Then("mention your card expiry month and year")
	public void mention_your_card_expiry_month_and_year() {
		singleDrop(p.getMonth(), "value", "12");
		singleDrop(p.getYear(), "value", "2022");

	}

	@Then("enter your CVV number")
	public void enter_your_CVV_number() {
		setValues(p.getCvv(), "007");

	}

	@Then("click the book now option")
	public void click_the_book_now_option() {
		clickOnElement(p.getBooknow());

	}

	@Then("you need to check the given data is correct or not")
	public void you_need_to_check_the_given_data_is_correct_or_not() {
		String actual = driver.getTitle();
		String expected = "Adactin.com - Hotel Booking Confirmation";
		Assert.assertEquals(expected, actual);

	}

	@Then("click my itinerary button")
	public void click_my_itinerary_button() throws IOException {
		clickOnElement(p.getItinerary());
		TakeScreenshot("kavin.ong");

	}

	@Then("logout")
	public void logout() {
		clickOnElement(p.getLogout());

	}

}
