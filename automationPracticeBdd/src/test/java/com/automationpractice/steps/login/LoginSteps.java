package com.automationpractice.steps.login;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Sleeper;

import com.automationpractice.pages.home.HomePage;
import com.automationpractice.pages.login.LoginPage;
import com.automationpractice.pages.my_account.MyAccountPage;
import com.automationpractice.utilities.AppProperties;
import com.automationpractice.utilities.Common;
import com.automationpractice.utilities.CommonStep;
import com.automationpractice.utilities.TestDataGenerator;

import cucumber.api.java.en.*;

//import static org.junit.Assert;

public class LoginSteps extends CommonStep {
	
	private WebDriver driver = getDriver();
	private static final int timeOutInSeconds = 15;
	private HomePage homePage = new HomePage(driver);
	private LoginPage loginPage = new LoginPage(driver);
	private MyAccountPage myAccountPage = new MyAccountPage(driver);
	
	
	
	@Given("^User navigates to home page$")
	public void userNavigatesToHomePage() {
		String s=TestDataGenerator.getRandomText(800);
		System.out.println(s);
		System.out.println(s.length());
	}
	
	@When("User clicks on sigh in link")
	public void user_clicks_on_sigh_in_link() {
		homePage.clickSignInLink();
//		Common.sleep(2);
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
        Assert.assertEquals("MY ACCOUNT", actualHeader);
	}
	
	@Then("New feature validation")
	public void new_feature_validation() {
		
		System.out.println("I am in New feature validation");
	}

}
