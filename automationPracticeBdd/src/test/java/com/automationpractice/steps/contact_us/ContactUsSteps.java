package com.automationpractice.steps.contact_us;

import org.openqa.selenium.WebDriver;

import com.automationpractice.pages.contact_us.ContactUsPage;
import com.automationpractice.pages.home.HomePage;
import com.automationpractice.utilities.Common;
import com.automationpractice.utilities.CommonStep;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactUsSteps extends CommonStep{
	
	private WebDriver driver = getDriver();
	private static final int timeOutInSeconds = 15;
	private HomePage homePage = new HomePage(driver);
	
	private ContactUsPage contactUsPage;
	public ContactUsSteps() { 
	if (contactUsPage==null)
		contactUsPage = new ContactUsPage(getDriver());
	}
	//now ContactUsPage will be called only once. check other pages
	
	@When("User populates Contact Us form")
	public void User_populates_Contact_Us_form() {
		System.out.println("2 - User populates Contact Us form");
//		contactUsPage.selectSubjectHeading(1);
		
		Common.sleep(2);
	}
	@And ("User clicks on Send button")
	public void User_clicks_on_Send_button() {
		contactUsPage.click_on_Send_Button();
		System.out.println("3 - User clicks on Send button");
	}
	@Then ("User should view success message") 
	public void User_should_view_success_message() {
		System.out.println("4 - User should view success message");
		System.out.println("done");
	}
}
