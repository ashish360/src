package utils;


public class search_util extends custom_util{

	//This method will submit the check availability form from any property profile page
			public static void CheckAvailability() throws Exception
			{
				{
				WaitForElementPresent(locators.Searchresults_loc.CHECKAVAILABILITY_SENDBTN, timeout);
				sendKeys(locators.Searchresults_loc.CHECKAVAILABILITY_FNAME, "TEST");
				sendKeys(locators.Searchresults_loc.CHECKAVAILABILTY_LNAME, "USER");
				sendKeys(locators.Searchresults_loc.CHECKAVAILABILITY_EMAIL, "ankitk@360logica.com");
				sendKeys(locators.Searchresults_loc.CHECKAVAILABILITY_PHN, "2222222222");
				clickOn(locators.Searchresults_loc.CHECKAVAILABILITY_ARRIVALDATE);
				Thread.sleep(2000);
				clickOn(locators.Searchresults_loc.DATEPICKERNEXTICON);
				clickOn(locators.Searchresults_loc.DATEPICKERDATE7);
				Thread.sleep(2000);
				clickOn(locators.Searchresults_loc.CHECKAVAILABILITY_DEPARTUREDATE);
				clickOn(locators.Searchresults_loc.DATEPICKERNEXTICON);
				clickOn(locators.Searchresults_loc.DATEPICKERDATE15);
				selectDropDown(locators.Searchresults_loc.CHECHAVAILABILITY_BEDROOM, "2");
				Thread.sleep(2000);
				sendKeys(locators.Searchresults_loc.CHECKAVAILABILITY_COMMENTS, "desc");
				clickOn(locators.Searchresults_loc.CHECKAVAILABILITY_SENDBTN);
				WaitForElementPresent(locators.Searchresults_loc.THANKYOUMESSAGE, timeout);
				}	
		
				
				
}
}




