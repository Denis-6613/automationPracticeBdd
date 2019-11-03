package com.automationpractice.utilities;

import org.openqa.selenium.WebDriver;
/**
 * parent of all page object classes
 * @author Denis
 *
 */

public class CommonPage {

	private DriverHelper driverHelper;
	
	protected CommonPage(WebDriver driver) {
		if(driverHelper==null) {
				driverHelper=new DriverHelper(driver);
			}
	}
	
	protected DriverHelper getDriverHelper() {
		return driverHelper;
	}
	
}
