package com.automationpractice.steps.warm_up;

/**
 * @author Denis
 */

import com.automationpractice.utilities.CommonStep;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import warm_up.AutomationPracticeTablePage;

import static org.junit.Assert.*;

public class AutomationPracticeSteps extends CommonStep{
	
	private AutomationPracticeTablePage automationPracticeTablePage = 
			AutomationPracticeTablePage.getAutomationPracticeTablePage(getDriver());
	
	
	
	@Given("User navigates to {string}")
	public void user_navigates_to(String url) {
		getDriver().get(url);
		
	    String header = automationPracticeTablePage.getHeader();
	    validateEquals(header, "Automation Practice Table");
//	    assertEquals("Automation Practice Table", header);
	    
	}

	@When("User is able to view Sample table")
	public void user_is_able_to_view_Sample_table() {
	    assertTrue(automationPracticeTablePage.isTableDisplayed());
	}

	@Then("User should be able to print values to console")
	public void user_should_be_able_to_print_values_to_console() {
	     automationPracticeTablePage.printAllValues();
	}

	
	
	
}
