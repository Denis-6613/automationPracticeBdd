package com.automationpractice.steps.warm_up;

import com.automationpractice.utilities.CommonStep;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import warm_up.HtmlFormPage;

public class HTMLFormSteps extends CommonStep{
	
	private HtmlFormPage htmlFormPage=HtmlFormPage.getHtmlFormPage(getDriver());
	
	@Given("User navigates to TOOLS QA home page")
	public void user_navigates_to_TOOLS_QA_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("User clicks HTML form link")
	public void user_clicks_HTML_form_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("User enters {string} first name")
	public void user_enters_first_name(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("User enters {string} last name")
	public void user_enters_last_name(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("User enters {string} country")
	public void user_enters_country(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("User enters {string} subject")
	public void user_enters_subject(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("User clicks submit button")
	public void user_clicks_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("user should see successful page")
	public void user_should_see_successful_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

}
