package com.automationpractice.pages.home;
/**
 * Oct 27, 2019
 * @author Denis
 *
 */

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automationpractice.utilities.CommonPage;

import com.automationpractice.utilities.DriverHelper;

public class HomePage extends CommonPage{
	//http://automationpractice.com/index.php
	
	private static final int timeOutInSeconds = 15;
	private static final Logger logger = Logger.getLogger(HomePage.class);
	private By singInLink=By.linkText("Sign in");
	private By contactUsLink=By.linkText("Contact us");
	private DriverHelper driverHelper = getDriverHelper();
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public void clickSignInLink() {
		driverHelper.click(singInLink, timeOutInSeconds);
		logger.info("Clicked on Sign In link");
	}
	
	public void clickContactUsLink() {
		driverHelper.click(contactUsLink, timeOutInSeconds);
		logger.info("Clicked on Contact us link");
	}


	

}
