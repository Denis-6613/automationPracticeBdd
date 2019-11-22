package com.automationpractice.utilities;

import org.apache.log4j.Logger;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.junit.ComparisonFailure;
import org.openqa.selenium.WebDriver;



public class CommonStep {
	
	private static final Logger LOGGER =Logger.getLogger(CommonStep.class); 
	private static SoftAssertions softAssertions = getSoftAssertions();

	private static SoftAssertions getSoftAssertions() {
		return softAssertions == null ? new SoftAssertions() : softAssertions;
	}

	public WebDriver getDriver() {
		return DriverFactory.getDriver();
	}

	public static void closeDriver() {
		DriverFactory.closeDriver();
	}
	
	protected void validateEquals(String actualStr, String expectedStr) {
		
		softAssertions.assertThat(actualStr).isEqualTo(expectedStr);
		
		try {
			Assert.assertEquals(expectedStr, actualStr);
		} catch (ComparisonFailure e) {
			LOGGER.error(e.getMessage());
			Common.takeScreenshotForReporting(getDriver());
			
			
		}
	}
	
	protected void validateAll() {
		softAssertions.assertAll();
	}

}
