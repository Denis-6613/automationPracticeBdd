package warm_up;
/**
 * @author Denis
 */

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.utilities.CommonPage;

public class AutomationPracticeTablePage extends CommonPage{
	
	private static AutomationPracticeTablePage automationPracticeTablePage;
	
	public static AutomationPracticeTablePage getAutomationPracticeTablePage(WebDriver webDriver) {
		
		if (automationPracticeTablePage==null)
			automationPracticeTablePage=new AutomationPracticeTablePage(webDriver);
		return automationPracticeTablePage;
	}

//	private static final int timeOutInSeconds = 15;

	private AutomationPracticeTablePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
//	private By header = By.tagName("h1");
	
	@FindBy (tagName="h1")
	private WebElement header;
	
	@FindBy (css="#content [summary='Sample Table']")
	private WebElement tableElement;
	
	@FindBys ({
		@FindBy (how=How.CSS, using="#content [summary='Sample Table'] tr")
//		@FindBy (css="#content [summary='Sample Table'] tr") - same thing as line above
	}) private List<WebElement> rows;
	
	@FindAll({
		@FindBy (id=""),//one element with locator ID
		@FindBy (css=""), //the same element with locator css
		@FindBy (tagName="") //the same element with locator tagName
	})
	private WebElement columns1;
	
	@FindBys({ 
		@FindBy (id="hello"),//one element with locator ID
		//AND
		@FindBy (css="[value='smth value']"), //the same element with locator css
		//AND
		@FindBy (tagName="a") //the same element with locator tagName
	})
	private List<WebElement> columns2;
	
//	@FindBys({@FindBy (id = "")})
//	private WebElement columns;
	
	public String getHeader() {
		return header.getText();
	}
	
	public boolean isTableDisplayed () {
		return tableElement.isDisplayed();
	}
	
	public void printAllValues() {
		int rowNum = rows.size();
		
		for (int index=0;index<rowNum;index++) {
			int columns = rows.get(index).findElements(By.tagName("td")).size();
			
			for (int columnNumber = 0; columnNumber<columns; columnNumber++) {
				
			} 
		}
		
	}
	
	

}
