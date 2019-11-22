package com.automationpractice.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.automationpractice.utilities.CommonStep;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
			features = {"src/test/resources/features/warm_up/table.feature"},
			glue= {"com.automationpractice.steps"},
			plugin = {
				"html:target/cucumber_report",
			},
			tags= {	"@sampleTable"},
			monochrome=true
//					,dryRun = true
			/*
			 * dryRun = true --> get step implementations 
			 * for unimplemented steps in feature file
			 */
			)
public class TableRunner extends CommonStep{
	
	@AfterClass
	public static void after() {
		closeDriver();
	}
	
	
}
