package utils;

import java.util.concurrent.TimeUnit;

import org.testng.Reporter;

public class Homepage_util extends custom_util {

	
	/** 
	 * This method is used to perform search from homepage
	*/
	public static void ExecuteSearch(String keyword) throws Exception{
		// Open application url
		getWebDriver().navigate().to(URL);
		Reporter.log("Open application url", true);
		// Wait for Search button
		WaitForElementPresent(locators.Homepage_loc.SEARCHBUTTON, timeout);
		Reporter.log("Wait for Search button", true);
		// Enter search keyword
		sendKeys(locators.Homepage_loc.SEARCHTEXTBOX, keyword);
		Reporter.log("Enter search keyword", true);
		//Select Arrival and Departure Date from Calendar
		clickOn(locators.Homepage_loc.ARRIVALDATE);
		Reporter.log("click on the Arrival Date field", true);
		clickOn(locators.Homepage_loc.NEXTICON);
		Reporter.log("click on next icon", true);
		clickOn(locators.Homepage_loc.SELECTARRIVALDATE);
		Reporter.log("select arrival date", true);
		clickOn(locators.Homepage_loc.DEPARTUREDATE);
		Reporter.log("click on depart date", true);
		clickOn(locators.Homepage_loc.NEXTICON);
		Reporter.log("click on next icon from depart date", true);
		clickOn(locators.Homepage_loc.SELECTDEPARTUREDATE);
		Reporter.log("select departure date", true);
		// Click Search button
		clickOn(locators.Homepage_loc.SEARCHBUTTON);
		Reporter.log("Click Search button", true);
		WaitForElementPresent(locators.Searchresults_loc.FIRSTSEARCHRESULT, timeout);
		getWebDriver().manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
	}	
	
		
	
}
