package com.automationpractice.steps.login;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.automationpractice.pages.home.HomePage;
import com.automationpractice.pages.login.LoginPage;
import com.automationpractice.pages.my_account.MyAccountPage;
import com.automationpractice.utilities.CommonStep;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
 

//import static org.junit.Assert;

public class LoginSteps extends CommonStep {
	
	private WebDriver driver = getDriver();
	private static final int timeOutInSeconds = 15;
	private HomePage homePage = new HomePage(driver);
	private LoginPage loginPage = new LoginPage(driver);
	private MyAccountPage myAccountPage = new MyAccountPage(driver);
	
	
	
	@Given("^User navigates to home page$")
	public void userNavigatesToHomePage() {
//		all done in @Before in Hooks
	}

	@When("User input email address and password")
	public void user_input_email_address_and_password() {
		String email="abc213@mailinator.com";
		String password="abc1234";
		loginPage.enterEmail(email);
		loginPage.enterPassword(password);
	}

	@When("User clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
		loginPage.clickSignInButton();
	}

	@Then("User is on account page")
	public void user_is_on_account_page() {
//		Common.sleep(2);
		String actualHeader = myAccountPage.getHeader();
        assertEquals("MY ACCOUNT", actualHeader);
	}
	
//	for negative
	
	@When("User input {string} email and {string} password")
	public void user_input_and(String email, String password) {
		loginPage.enterEmail(email);
	    loginPage.enterPassword(password);
	}

	@Then("User should see error message {string}")
	public void user_should_see_error_message(String errorMessage) {
		String actualMessage=loginPage.getErrorMessage();
		assertTrue("Error message", actualMessage.contains(errorMessage));
	}
	
	@When("User input email, password and clicks on sign in button and validate error message")
	public void user_input_email_password_and_clicks_on_sign_in_button_and_validate_error_message(DataTable dataTable) {
		List<Map<String, String>> listOfRows = dataTable.asMaps(String.class, String.class);
		
		for ( int row = 0; row < listOfRows.size(); row++ ) {
			String email = listOfRows.get(row).get("email");
		
			user_input_and(email, listOfRows.get(row).get("password"));
			user_clicks_on_sign_in_button();
			user_should_see_error_message(listOfRows.get(row).get("Error message"));
		}
	}


}
