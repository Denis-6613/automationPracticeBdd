package com.mockaroo.excel_generator;
/**
 * @author Denis
 */

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.automationpractice.utilities.Common;
import com.automationpractice.utilities.CommonStep;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

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
	    Common.sleep(2);
	}

	@When("User add field name and type")
	public void user_add_field_name_and_type(DataTable dataTable) {
	    List <Map<String, String>> dataTableList = dataTable.asMaps(String.class, String.class);
	    
	    int numberOfRows = excelGeneratorPage.getNumberOfRows();
	    if (numberOfRows>dataTableList.size()) 
	    	excelGeneratorPage.deleteRows(numberOfRows - dataTableList.size());
	    
	    for (int index=0; index<dataTableList.size();index++) {
	    	String fieldName=dataTableList.get(index).get("field name");
//	    	String type=dataTableList.get(index).get("type");
	    	
	    	excelGeneratorPage.enterFieldName(index, fieldName);
	    	
	    }
	    	
	    
	}

}
