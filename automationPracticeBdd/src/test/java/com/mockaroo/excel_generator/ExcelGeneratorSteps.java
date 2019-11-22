package com.mockaroo.excel_generator;
/**
 * @author Denis
 */

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.automationpractice.utilities.Common;
import com.automationpractice.utilities.CommonStep;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

//import static 

public class ExcelGeneratorSteps extends CommonStep{
	 
	private final ExcelGeneratorPage excelGeneratorPage=
			ExcelGeneratorPage.getExcelGeneratorPage(getDriver());
	
	@Given("User should be able to read excel file")
	public void user_should_be_able_to_read_excel_file() throws IOException {
		String filePath=Common.USER_HOME_DIR+"/Downloads/MOCK_DATA.xlsx";
		excelGeneratorPage.printExcelContent(filePath);

	}
	
	@Given("User navigates to {string} website")
	public void user_navigates_to_website(String url) {
	  getDriver().get(url);
	}
	
	@When("add field")
	public void add_field() {
	    excelGeneratorPage.clickAddAnotherFieldButton();
//	    Common.sleep(2);
	}

	@When("User add field name and type")
	public void user_add_field_name_and_type(DataTable dataTable) {
	    List <Map<String, String>> dataTableList = dataTable.asMaps(String.class, String.class);
	    
	    int numberOfRows = excelGeneratorPage.getNumberOfRows();
	    if (numberOfRows>dataTableList.size()) 
	    	excelGeneratorPage.deleteRows(numberOfRows - dataTableList.size());
	    
	    for (int index=0; index<dataTableList.size();index++) {
	    	String fieldName=dataTableList.get(index).get("field name");
	    	String type=dataTableList.get(index).get("type");
	    	
	    	excelGeneratorPage.enterFieldName(index, fieldName);
	    	excelGeneratorPage.chooseType(index, type);
	    }
//    	Common.sleep(2);	    	
	    
	}
	
	@When("User adds {int} rows with file format {string}")
	public void user_adds_rows_with_file_format(Integer rows, String format) {
	excelGeneratorPage.addRows(rows);
	excelGeneratorPage.selectFileFormat(format);
	
	}
	
	@When("User click download button")
	public void user_click_download_button() {
	    excelGeneratorPage.clickDownloadButton();
//	    Common.sleep(2);
	}
	
	@Then("User validates the file is downloaded successfully")
	public void user_validates_the_file_is_downloaded() throws IOException {
	    //assert
		String filePath = Common.USER_HOME_DIR + "/Downloads/MOCK_DATA.xlsx";
		boolean isFileDownloaded=Common.isFile(filePath);
		assertTrue("File is not downloaded", isFileDownloaded);
		excelGeneratorPage.printExcelContent(filePath);
		
	}

}
