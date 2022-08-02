Feature: Check the Booking functionality of the Adactin Hotel Application


Scenario: Check the login is working fine
Given application launched successfully
When User enter the username in the username field
And User enter the password in the password field
Then click the login button


Scenario: Check the hotel location and room type
Given login is successfully done
When select the location 
And search the hotel
And select the room type
And choose the number of rooms what we want
When mention the check in date in the given field
And mention the check out date in the given field
And choose the adults per room in the given drop down
And if you have a children mention it in the given field
Then click the search button

Scenario: Check the radio button is enabled or not
Given hotel location and room type is correctly filled
When radio button is enabled or not 

Scenario: Check the given data is correct or not
Given hotel location and room type and radio button is correctly enabled
When enter your first name
And the last name
Then enter your Billing address
But your 16 digit credit card number is mandatory for booking
Then select the credit card type
And mention your card expiry month and year
Then enter your CVV number
And click the book now option
But you need to check the given data is correct or not 
Then click my itinerary button
And logout