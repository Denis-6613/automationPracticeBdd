package com.automationpractice.pages.contact_us;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.automationpractice.pages.home.HomePage;
import com.automationpractice.utilities.Common;
import com.automationpractice.utilities.CommonPage;
import com.automationpractice.utilities.DriverHelper;
import com.automationpractice.utilities.TestDataGenerator;

/**
 * @author Denis
 * Nov 3, 2019
 */
public class ContactUsPage extends CommonPage{
	
	private static final int timeOutInSeconds = 15;
	private static final Logger logger = Logger.getLogger(ContactUsPage.class);
	
	private DriverHelper driverHelper = getDriverHelper();
	private By subjectHeadingDropDown=By.id("id_contact");
	private By emailInput=By.id("email");
	private By orderRefTextBox=By.id("id_order");
	private By attachFileTextBox=By.id("fileUpload");
	private By messageTextBox=By.id("message");
	private By sendButton=By.id("submitMessage");
	
//	private WebDriver driver;//no need as executeJS work with driverHelper

	public ContactUsPage(WebDriver driver) {
		super(driver);
//		this.driver=driver;//cool trick! not required 
	}
	
	/*
	 public void selectSubjectHeading(String subject) {
		// using WebDriver driver eliminates the need for implicit wait
		Select select = new Select(driver.findElement(subjectHeadingDropDown));
		select.selectByVisibleText(subject);
		
		logger.info("Selected subject heading: "+subject);
	}*/
	
	/*
	public void selectSubjectHeading_JS(String subject) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].setAttribute('class', '')", driverHelper.getElement(By.id("uniform-id_contact"), timeOutInSeconds));
	    Select select = new Select(driverHelper.getElement(subjectHeadingDropDown, timeOutInSeconds));
	//    select.selectByIndex(2); - ok
	    select.selectByValue("1");//1 - Webmaster - ok
	//    select.selectByVisibleText(subject); - ok
	//    Common.sleep(2);
	    logger.info("JS_Selected subject heading: "+subject);
	}*/
	
	public void selectSubjectHeading_JS_2(String subject) {
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//	    js.executeScript("arguments[0].setAttribute('class', '')", driverHelper.getElement(By.id("uniform-id_contact"), timeOutInSeconds));
	    
	    driverHelper.executeJS("arguments[0].setAttribute('class', '')", driverHelper.getElement(By.id("uniform-id_contact"), timeOutInSeconds));
	    
	    Select select = new Select(driverHelper.getElement(subjectHeadingDropDown, timeOutInSeconds));
//	    select.selectByIndex(2); - ok
	    select.selectByValue("1");//1 - Webmaster - ok
//	    select.selectByVisibleText(subject); - ok
//	    Common.sleep(2);
	    logger.info("JS_Selected subject heading: "+subject);
		}
	
	public void enterEmailAddress(String email) {
		driverHelper.sendKeys(emailInput, email, timeOutInSeconds);
		logger.info("Email entered - "+email);
	}
	
	public void enterOrderRef(String orderRef) {
		driverHelper.sendKeys(orderRefTextBox, orderRef, timeOutInSeconds);
		logger.info("Order Ref entered - "+orderRef);
	}
	
	public void enterAttachedFile(String filePath) {
//		option1
//		driver.findElement(attachFileTextBox).sendKeys(filePath); //why it's not working with driverHelper again?! - works
		
//		option2 - also working! 
//		So, it's the theme of the website - cover active element with dummy div with corresponding class - solution is below
		driverHelper.executeJS("arguments[0].setAttribute('class', '')", driverHelper.getElement(By.id("uniform-fileUpload"), timeOutInSeconds));
		driverHelper.sendKeys(attachFileTextBox, filePath, timeOutInSeconds); //- not working, not visible again!
		
		logger.info("File attached - "+filePath);
	}
	
	public void enterMessage(String message) {
		driverHelper.sendKeys(messageTextBox, message, timeOutInSeconds);
		logger.info("Message entered - "+message);
	}
	
	public void click_on_Send_Button() {
		driverHelper.click(sendButton, timeOutInSeconds);
		logger.info("Clicked on Send > button");
	}
	
	public String getMessageAfterSend() {
		String message = driverHelper.getText(By.cssSelector(".alert"), timeOutInSeconds);
		System.out.println("Message after Send It = "+message);
		logger.info("Message after Send It = "+message);
		return message;
	}
	

}
