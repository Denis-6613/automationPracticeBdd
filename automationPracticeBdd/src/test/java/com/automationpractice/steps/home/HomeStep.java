package com.automationpractice.steps.home;


import com.automationpractice.pages.home.HomePage;
import com.automationpractice.utilities.CommonStep;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomeStep extends CommonStep{
	
	private HomePage homePage = new HomePage(getDriver());
	
	@Given("^User clicks on Contact Us link$")
	public void User_clicks_on_Contact_Us_link() {
		homePage.clickContactUsLink();
	}
	
	@When("User clicks on sigh in link")
	public void user_clicks_on_sigh_in_link() {
		homePage.clickSignInLink();
	}
	
	

}
