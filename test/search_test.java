package test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import utils.custom_util;

public class search_test extends custom_util {
	
	//This script will execute search through ZIP code from Homepage
		@Test (groups={"regression"}, alwaysRun=true)
		public void testsearchbyzip() throws Exception
		{
			try {
			// Execute search from homepage
			utils.Homepage_util.ExecuteSearch("12345");
			Reporter.log("Execute search with keyword 12345", true);
			}
			catch (Error e) {					
				e.printStackTrace();	
				throw e;
			}
		}

		//This Script will execute search through City, ST from Homepage
		@Test (groups={"regression"}, alwaysRun=true)
		public void testsearchbystate() throws Exception
		{
			try {
			// Execute search from homepage
			utils.Homepage_util.ExecuteSearch("Virginia Beach, VA");
			Reporter.log("Execute search with keyword Virginia Beach, VA", true);
			}
			catch (Error e) {					
				e.printStackTrace();	
				throw e;
			}
		}
		//Verify the Nearby locations after Executing search from Virginia Beach, VA
		@Test (groups={"regression"}, alwaysRun=true)
		public void testnearbylocations() throws Exception
		{
			try {
		// Execute search from Home page
			utils.Homepage_util.ExecuteSearch("Virginia Beach, VA");
			Reporter.log("Execute search with keyword Virginia Beach, VA", true);
		//Verify the Nearby Cities
			Assert.assertTrue(isElementPresent(locators.Searchresults_loc.PORTSMOUTH));
			Reporter.log("Verify the location PORTSMOUTH");
			Assert.assertTrue(isElementPresent(locators.Searchresults_loc.NORFOLK));
			Reporter.log("Verify the location NORFOLK");
			Assert.assertTrue(isElementPresent(locators.Searchresults_loc.PUNGOTEAGUE));
			Reporter.log("Verify the location PUNGOTEAGUE");
		//verify the Nearby ZIP codes
			Assert.assertTrue(isElementPresent(locators.Searchresults_loc.ZIP1));
			Reporter.log("Verify the location 23704");
			Assert.assertTrue(isElementPresent(locators.Searchresults_loc.ZIP2));
			Reporter.log("Verify the location 23508");
			Assert.assertTrue(isElementPresent(locators.Searchresults_loc.ZIP3));
			Reporter.log("Verify the location 23510");
			Assert.assertTrue(isElementPresent(locators.Searchresults_loc.ZIP4));
			Reporter.log("Verify the location 23422");
			}
			catch (Error e) {					
				e.printStackTrace();	
				throw e;
			}
		}
	//Verify the Guest card lead sent from Check availability modal at search results page.
	@Test (alwaysRun=true)
	public void testguestcardlead() throws Exception
	{
		try {
			//perform search using Keyword
	utils.Homepage_util.ExecuteSearch("Virginia Beach, VA");
	Reporter.log("Execute search with keyword Virginia Beach, VA", true);
	clickOn(locators.Searchresults_loc.FIRSTSEARCHRESULT);
	WaitForElementPresent(locators.Searchresults_loc.CHECKAVAILABILITY_SENDBTN, timeout);
	utils.search_util.CheckAvailability();	
		}
		catch (Error e) {					
			captureScreenshot("testvanityURL");	
			throw e;
		}
	
}
}