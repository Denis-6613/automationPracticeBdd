package com.automationpractice.steps.login;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.automationpractice.utilities.AppProperties;
import com.automationpractice.utilities.CommonStep;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends CommonStep{
	
	private static final Logger logger = Logger.getLogger(Hook.class);
	private WebDriver driver = getDriver();
	
	@Before
	public void setUp() {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get(AppProperties.AUTOMATION_PRACTICE_BASE_URL);
	}
	
	@After
	public void tearDown() {
		closeDriver();
	}

}
