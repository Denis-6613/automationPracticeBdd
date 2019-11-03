package com.automationpractice.pages.my_account;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automationpractice.pages.login.LoginPage;
import com.automationpractice.utilities.CommonPage;
import com.automationpractice.utilities.DriverHelper;

/**
 * page object for My Account web page
 * Oct 27, 2019
 * @author Denis
 *
 */

public class MyAccountPage extends CommonPage{
	
	private static final int timeOutInSeconds = 15;
	private static final Logger logger = Logger.getLogger(MyAccountPage.class);
	private DriverHelper driverHelper = getDriverHelper();
	
	private By header = By.tagName("h1");


	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	public String getHeader() {
		return driverHelper.getText(header, timeOutInSeconds);
	}
		
		
	
	

}
