package com.automationpractice.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
			"html:target/cucumber_report",
			"json:target/cucumber_report/cucumber.json"
				
		},
//		features = {"src/test/resources/features/login.feature","/src/test/resources/features/contact_us.feature"},
		features = {"src/test/resources/features"},
		glue= {"com.automationpractice.steps"},
//		tags= {
//				"@smokeTest", "~@contactUs"//tilde to skip
//				},
		tags= {	"@smokeTest"},
		monochrome=true
//				,dryRun = true
		/*
		 * dryRun = true --> get step implementations 
		 * for unimplemented steps in feature file
		 */
		)
public class Runner {}
