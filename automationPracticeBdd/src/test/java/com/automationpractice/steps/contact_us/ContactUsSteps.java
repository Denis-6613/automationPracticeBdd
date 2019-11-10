package com.automationpractice.steps.contact_us;

import static org.junit.Assert.*;

import com.automationpractice.pages.contact_us.ContactUsPage;
import com.automationpractice.utilities.CommonStep;
import com.automationpractice.utilities.TestDataGenerator;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
/**
 * 
 * @author Denis
 * Nov 3, 2019
 */
public class ContactUsSteps extends CommonStep{
	
	
	private ContactUsPage contactUsPage;
	public ContactUsSteps() { 
	if (contactUsPage==null)
		contactUsPage = new ContactUsPage(getDriver());
	}
	//now ContactUsPage will be called only once. check other pages
	
	@When("User populates Contact Us form")
	public void User_populates_Contact_Us_form() {
		
		String firstName=TestDataGenerator.getRandomFirstName();
		String lastName=TestDataGenerator.getRandomLastName();
		String email=TestDataGenerator.getRandomEmail(firstName, lastName);
		String orderRef=Integer.toString(TestDataGenerator.getRandomInt(1, 18000000));
		String filePath="C:\\Users\\Denis\\Desktop\\test.txt"; //check this maybe bad path
		String message = TestDataGenerator.getRandomText(80);
		
//		contactUsPage.selectSubjectHeading("Customer service");
//		contactUsPage.selectSubjectHeading_JS("Webmaster");
		contactUsPage.selectSubjectHeading_JS_2("Webmaster");
		contactUsPage.enterEmailAddress(email);
		contactUsPage.enterOrderRef(orderRef);
		contactUsPage.enterAttachedFile(filePath); 
		contactUsPage.enterMessage(message);
		
		System.out.println("2 - User populates Contact Us form");
//		Common.sleep(2);
	}
	@And ("User clicks on Send button")
	public void User_clicks_on_Send_button() {
		contactUsPage.click_on_Send_Button();
		System.out.println("3 - User clicks on Send button");
	}
	@Then ("User should view success message") 
	public void User_should_view_success_message() {
//		Common.failTest("testing failure");
		String expectedMessage=	"Your message has been successfully sent to our team.";
		String actualMessage = contactUsPage.getMessageAfterSend();
		assertEquals(expectedMessage, actualMessage);
		System.out.println("4 - User should view success message");
		System.out.println("ContactUs done!");
	}
}
