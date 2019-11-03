package com.automationpractice.pages.contact_us;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.automationpractice.pages.home.HomePage;
import com.automationpractice.utilities.CommonPage;
import com.automationpractice.utilities.DriverHelper;
import com.automationpractice.utilities.TestDataGenerator;

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
	
	private final String firstName=TestDataGenerator.getRandomFirstName();
	private final String lastName=TestDataGenerator.getRandomLastName();
	private final String email=TestDataGenerator.getRandomEmail(firstName, lastName);
	
	String orderRef="123456789";
	
	String filePath="C:\\Users\\Denis\\Desktop\\test.txt";
	String message = TestDataGenerator.getRandomText(80);
	

	public ContactUsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void selectSubjectHeading(int index) {
//		WebDriver driver=;
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].setAttribute('class', '')", driverHelper.getElement(By.id("uniform-id_contact"), timeOutInSeconds));
        //cannot click on drop-down
        
		/*driverHelper.clickById("id_contact", 15);
		System.out.println("click");
		WebElement dropdown = driverHelper.getElement(subjectHeadingDropDown, timeOutInSeconds);
		System.out.println("element");
		Select select = new Select(dropdown);
		System.out.println("Select");
		select.selectByIndex(index);
		logger.info("Selected subject heading, option - "+index);
		*/
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
		driverHelper.sendKeys(attachFileTextBox, filePath, timeOutInSeconds);
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
	
	

}
