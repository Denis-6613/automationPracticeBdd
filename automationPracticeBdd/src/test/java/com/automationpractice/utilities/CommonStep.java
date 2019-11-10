package com.automationpractice.utilities;

import org.openqa.selenium.WebDriver;

public class CommonStep {
	
	public WebDriver getDriver() {
		return DriverFactory.getDriver();
	}
	
	public static void closeDriver() {
		DriverFactory.closeDriver();
	}

}
