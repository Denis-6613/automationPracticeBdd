package com.automationpractice.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features/login.feature"},
		glue= {"com.automationpractice.steps.login"},
		monochrome=true
//				,dryRun = true
		)
public class Runner {
	
	

}
