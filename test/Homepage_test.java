package test;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.jasper.tagplugins.jstl.core.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import utils.custom_util;

@SuppressWarnings("all")
public class Homepage_test extends custom_util{
//This script will verify all the Links on menu
	@Test (groups={"regression"}, alwaysRun=true)
	public void testmenulinks() throws Exception
	{
		try {
		// Go to Homepage
		getWebDriver().navigate().to(URL);
		WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
		Reporter.log("Go to CHC Homepage", true);
		//Click on Search Link
		clickOn(locators.Homepage_loc.SRCHLINKLINK);
		WaitForElementPresent(locators.Homepage_loc.MANAGEROWNERLINK, timeout);
		Reporter.log("Clicking on search link", true);
		//Click on About Us Link
		clickOn(locators.Homepage_loc.ABOUTUSLINK);
		WaitForElementPresent(locators.Homepage_loc.COPYRIGHTHEADING, timeout);
		Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"aboutus");
		Assert.assertEquals(getWebDriver().getTitle(), "Short-Term Rentals and Furnished Apartments For Rent - CorporateHousing.com");
		Reporter.log("Clicking on About Us link", true);
		//Go to Homepage
		getWebDriver().navigate().to(URL);
		WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
		//Click on Advertise Link
		clickOn(locators.Homepage_loc.ADVERTISELINK);
		windowhandle(locators.Homepage_loc.GETINTOUCHNAME, "multifamily.forrent.com/corporatehousing/");
		Reporter.log("clicking on Advertise link", true);
		//Go to Homepage
		getWebDriver().navigate().to(URL);
		WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
		//Click on Managers and owners link
		clickOn(locators.Homepage_loc.MANAGEROWNERLINK);
		Assert.assertTrue(isElementPresent(locators.Backend_loc.USERNAME));
		Reporter.log("Click on Managers and Owners link and verify the page", true);
		}
		catch (Error e) {					
			e.printStackTrace();	
			throw e;
		}
	}
	//This script will send a query from Contact Us form at Contact Us page
		@Test (groups={"regression"}, alwaysRun=true)
		public void testcontactus() throws Exception
		{
			try {
				getWebDriver().navigate().to(URL+"/contactus");
				Thread.sleep(1000);
				Reporter.log("Go to Contact Us page");
				sendKeys(locators.Homepage_loc.CONTACT_FIRSTNAME, "Testing Firstname");
				Reporter.log("Enter First name");
				sendKeys(locators.Homepage_loc.CONTACT_LASTNAME, "Test Lastname");
				Reporter.log("Enter last name");
				sendKeys(locators.Homepage_loc.CONTACT_EMAIL, "test360.001@gmail.com");
				Reporter.log("Enter Email");
				sendKeys(locators.Homepage_loc.CONTACT_PHONE, "(222) 555-6666");
				Reporter.log("Enter phone number");
				String [] subject = {"Make changes to an online ad", "Forgot user id and password", "List an apartment community",
						"Having difficulty with the site", "Other"};
				int rand = new Random().nextInt(5);
				int random = rand - 1;
				selectDropDown(locators.Homepage_loc.CONTACT_SUBJECT, subject[random]);
				Reporter.log("Enter Select subject from drop down");
				sendKeys(locators.Homepage_loc.CONTACT_COMMENT, contactdesc);
				Reporter.log("Enter Description text");
				clickOn(locators.Homepage_loc.CONTACT_SENDBTN);
				Reporter.log("Click on Send Button");
				WaitForElementPresent(locators.Homepage_loc.CONTACT_THANKYOU, timeout);
				getWebDriver().getPageSource().contains("Thank you for your message");
				Reporter.log("verify Thank you message");
				Thread.sleep(1000);
			}
			catch (Error e) {					
				e.printStackTrace();	
				throw e;
			}
		}
			
	
//This script will verify the Links under East Region
		@Test (groups={"regression"}, alwaysRun=true)
		public void testeastregion() throws Exception
		{
			try {
//Go to Homepage
getWebDriver().navigate().to(URL);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
Reporter.log("Go to CHC homepage", true);	
//Click on Alexandria Apartments and Verify the searchg result page
clickOn(locators.Homepage_loc.ALEXENDRIAAPT);
WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
Assert.assertTrue(isElementPresent(locators.Homepage_loc.ALEXANDRIAHEADING));
Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/va/metro-washington-dc/alexandria");
Reporter.log("Search Result page Alexandris Apartment", true);
//Go to Homepage
getWebDriver().navigate().to(URL);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
Reporter.log("Go to CHC homepage", true);		
//Click On Arlington Apartments and Verify the searchg result page
clickOn(locators.Homepage_loc.ARLINGTONAPT);
WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
Assert.assertTrue(isElementPresent(locators.Homepage_loc.ARLINGTONHEADING));
Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/va/metro-washington-dc/arlington");
Reporter.log("Search Result Page Arlington Apartment", true);
//Go to Homepage
getWebDriver().navigate().to(URL);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
Reporter.log("Go to CHC homepage", true);	
//Click on Baltimore Apartment and Verify the searchg result page
clickOn(locators.Homepage_loc.BALTIMOREAPT);
WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
Assert.assertTrue(isElementPresent(locators.Homepage_loc.BALTIMOREHEADING));
Assert.assertEquals(getWebDriver().getCurrentUrl(),  URL+"find/md/metro-baltimore/baltimore");
Reporter.log("Search Result Page Baltimore", true);
//Go to Homepage
getWebDriver().navigate().to(URL);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
Reporter.log("Go to CHC homepage", true);	
//Click on Bethesda and Verify the search result page
clickOn(locators.Homepage_loc.BETHESDAAPT);
WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
Assert.assertTrue(isElementPresent(locators.Homepage_loc.BETHESHEADING));
Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/md/metro-washington-dc/bethesda");
Reporter.log("Search Result Page Bethesda", true);
//Go to Homepage
getWebDriver().navigate().to(URL);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
Reporter.log("Go to CHC homepage", true);		
//Click On Boston and Verify the search results page
clickOn(locators.Homepage_loc.BOSTONAPT);
WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
Assert.assertTrue(isElementPresent(locators.Homepage_loc.BOSTONHEADING));
Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/ma/metro-boston/boston");
Reporter.log("Search Result Page Boston", true);
//Go to Homepage
getWebDriver().navigate().to(URL);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
Reporter.log("Go to CHC homepage", true);					 	
//Click On Fairfax and Verify the search results page
clickOn(locators.Homepage_loc.FAIRFAXAPT);
WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
Assert.assertTrue(isElementPresent(locators.Homepage_loc.FAIRFAXHEADING));
Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/va/metro-washington-dc/fairfax");
Reporter.log("Search Result Page Fairfax", true);
//Go to Homepage
getWebDriver().navigate().to(URL);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
Reporter.log("Go to CHC homepage", true);			 	
//Click On Hartford and Verify the search results page
clickOn(locators.Homepage_loc.HARTFORDAPT);
WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
Assert.assertTrue(isElementPresent(locators.Homepage_loc.HARTFORDHEADING));
Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/ct/metro-central-ct/hartford");
Reporter.log("Search Result Page Hartford", true);
//Go to Homepage
getWebDriver().navigate().to(URL);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
Reporter.log("Go to CHC homepage", true);
//Click On New York and Verify the search results page
clickOn(locators.Homepage_loc.NEWYORKAPT);
WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
Assert.assertTrue(isElementPresent(locators.Homepage_loc.NEWYORKHEADING));
Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/ny/metro-nyc/new-york");
Reporter.log("Search Result Page New York", true);
//Go to Homepage
getWebDriver().navigate().to(URL);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
Reporter.log("Go to CHC homepage", true);		
//Click On New Haven and Verify the search results page
clickOn(locators.Homepage_loc.NEWHAVENAPT);
WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
Assert.assertTrue(isElementPresent(locators.Homepage_loc.NEWHAVENHEADING));
Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/ct/metro-central-ct/new-haven");
Reporter.log("Search Result Page New Haven", true);		
//Go to Homepage
getWebDriver().navigate().to(URL);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
Reporter.log("Go to CHC homepage", true);
//Click On Norfolk and Verify the search results page
clickOn(locators.Homepage_loc.NORFOLKAPT);
WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
Assert.assertTrue(isElementPresent(locators.Homepage_loc.NORFOLKHEADING	));
Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/va/metro-hampton-roads/norfolk");
Reporter.log("Search Result Page Norfolk", true);				
//Go to Homepage
getWebDriver().navigate().to(URL);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
Reporter.log("Go to CHC homepage", true);				
//Click On Philadelphia and Verify the search results page
clickOn(locators.Homepage_loc.PHILADELPHIAAPT);
WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
Assert.assertTrue(isElementPresent(locators.Homepage_loc.PHILADELPHIAHEADING	));
Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/pa/metro-philadelphia/philadelphia");
Reporter.log("Search Result Page Philadelphia", true);		
//Go to Homepage
getWebDriver().navigate().to(URL);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
Reporter.log("Go to CHC homepage", true);	
//Click On Pittsburgh and Verify the search results page
clickOn(locators.Homepage_loc.PITTSBURGHAPT);
WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
Assert.assertTrue(isElementPresent(locators.Homepage_loc.PITTSBURGHHEADING	));
Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/pa/metro-pittsburgh/pittsburgh");
Reporter.log("Search Result Page Pittsburgh", true);
//Go to Homepage
getWebDriver().navigate().to(URL);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
Reporter.log("Go to CHC homepage", true);		
//Click On Richmond and Verify the search results page
clickOn(locators.Homepage_loc.RICHMONDAPT);
WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
Assert.assertTrue(isElementPresent(locators.Homepage_loc.RICHMONDHEADING));
Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/va/metro-richmond/richmond");
Reporter.log("Search Result Page Richmond", true);
//Go to Homepage
getWebDriver().navigate().to(URL);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
Reporter.log("Go to CHC homepage", true);
//Click On Somerset and Verify the search results page
clickOn(locators.Homepage_loc.SOMERSETAPT);
WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
Assert.assertTrue(isElementPresent(locators.Homepage_loc.SOMERSETHEADING));
Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/nj/metro-central-new-jersey/somerset");
Reporter.log("Search Result Page Somerset", true);
//Go to Homepage
getWebDriver().navigate().to(URL);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
Reporter.log("Go to CHC homepage", true);
//Click On Virginia Beach and Verify the search results page
clickOn(locators.Homepage_loc.VIRGINIABEACHAPT);
WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
Assert.assertTrue(isElementPresent(locators.Homepage_loc.VIRGINIAHEADING));
Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/va/metro-hampton-roads/virginia-beach");
Reporter.log("Search Result Page Virginia Beach", true);
//Go to Homepage
getWebDriver().navigate().to(URL);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
Reporter.log("Go to CHC homepage", true);
//Click On Washington and Verify the search results page
clickOn(locators.Homepage_loc.WASHINGTONDCAPT);
WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
Assert.assertTrue(isElementPresent(locators.Homepage_loc.WASHINGTONHEADING));
Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/dc/metro-washington-dc/washington");
Reporter.log("Search Result Page Washington", true);
			}
			catch (Error e) {					
			e.printStackTrace();	
			throw e;
			}
			}
			
//This script will verify the Links under Midwest Region
		@Test (groups={"regression"}, alwaysRun=true)
		public void testmidwestregion() throws Exception
		{
			try {
//Go to Homepage
getWebDriver().navigate().to(URL);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
Reporter.log("Go to CHC homepage", true);	
//Click On Midwest Region
clickOn(locators.Homepage_loc.MIDWESTREGION);
WaitForElementPresent(locators.Homepage_loc.SRCHLINKLINK, timeout);
//Click on Ann Arbor
clickOn(locators.Homepage_loc.ANNARBORAPT);
WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
Assert.assertTrue(isElementPresent(locators.Homepage_loc.ANNARBORHEADING));
Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/mi/metro-detroit/ann-arbor");
//go to home page
getWebDriver().navigate().to(URL);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
Reporter.log("Go to home page", true);
//click on midwest region
clickOn(locators.Homepage_loc.MIDWESTREGION);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
//click on chicago 
clickOn(locators.Homepage_loc.CHICAGOAPT);
WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
Assert.assertTrue(isElementPresent(locators.Homepage_loc.CHICAGOHEADING));
Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/il/metro-chicago/chicago");
//go to home page
getWebDriver().navigate().to(URL);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
Reporter.log("Go to home page", true);
//click on midwest region
clickOn(locators.Homepage_loc.MIDWESTREGION);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
//click on cincinnati
clickOn(locators.Homepage_loc.CINCINNATIAPT);
WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
Assert.assertTrue(isElementPresent(locators.Homepage_loc.CINCINNATIHEADING));
Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/oh/metro-cincinnati/cincinnati");
//go to home page
getWebDriver().navigate().to(URL);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
Reporter.log("Go to home page", true);
//click on midwest region
clickOn(locators.Homepage_loc.MIDWESTREGION);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
//Click on cleveland
clickOn(locators.Homepage_loc.CLEVELANDAPT);
WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
Assert.assertTrue(isElementPresent(locators.Homepage_loc.CLEVELANDHEADING));
Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/oh/metro-cleveland/cleveland");
//go to home page
getWebDriver().navigate().to(URL);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
Reporter.log("Go to home page", true);
//click on midwest region
clickOn(locators.Homepage_loc.MIDWESTREGION);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
//Click on Columbus
clickOn(locators.Homepage_loc.COLUMBUSAPT);
WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
Assert.assertTrue(isElementPresent(locators.Homepage_loc.COLUMBUSHEADING));
Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/oh/metro-columbus/columbus");
//go to home page
getWebDriver().navigate().to(URL);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
Reporter.log("Go to home page", true);
//click on midwest region
clickOn(locators.Homepage_loc.MIDWESTREGION);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
//click on Detroit
clickOn(locators.Homepage_loc.DETROITAPT);
WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
Assert.assertTrue(isElementPresent(locators.Homepage_loc.DETROITHEADING));
Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/mi/metro-detroit/detroit");
//go to home page
getWebDriver().navigate().to(URL);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
Reporter.log("Go to home page", true);
//click on midwest region
clickOn(locators.Homepage_loc.MIDWESTREGION);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
//click on Fort wayne
clickOn(locators.Homepage_loc.FORTWAYNEAPT);
WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
Assert.assertTrue(isElementPresent(locators.Homepage_loc.FORTWAYNEHEADING));
Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/in/metro-fort-wayne/fort-wayne");
//go to home page
getWebDriver().navigate().to(URL);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
Reporter.log("Go to home page", true);
//click on midwest region
clickOn(locators.Homepage_loc.MIDWESTREGION);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
//click on Grand Rapids
clickOn(locators.Homepage_loc.GRANDRAPIDSAPT);
WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
Assert.assertTrue(isElementPresent(locators.Homepage_loc.GRANDRAPIDSHEADING));
Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/mi/metro-grand-rapids/grand-rapids");
//go to home page
getWebDriver().navigate().to(URL);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
Reporter.log("Go to home page", true);
//click on midwest region
clickOn(locators.Homepage_loc.MIDWESTREGION);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
//click on Indianapolis
clickOn(locators.Homepage_loc.INDIANAPOLISAPT);
WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
Assert.assertTrue(isElementPresent(locators.Homepage_loc.INDIANAPOLISHEADING));
Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/in/metro-indianapolis/indianapolis");
//go to home page
getWebDriver().navigate().to(URL);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
Reporter.log("Go to home page", true);
//click on midwest region
clickOn(locators.Homepage_loc.MIDWESTREGION);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
//click on Kansas city
clickOn(locators.Homepage_loc.KANSASCITYAPT);
WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
Assert.assertTrue(isElementPresent(locators.Homepage_loc.KANSASCITYHEADING));
Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/ks/metro-kansas-city/kansas-city");
//go to home page
getWebDriver().navigate().to(URL);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
Reporter.log("Go to home page", true);
//click on midwest region
clickOn(locators.Homepage_loc.MIDWESTREGION);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
//click on Lafayetee
clickOn(locators.Homepage_loc.LAFAYETTEAPT);
WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
Assert.assertTrue(isElementPresent(locators.Homepage_loc.LAFAYETTEHEADING));
Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/in/metro-lafayette/lafayette");
//go to home page
getWebDriver().navigate().to(URL);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
Reporter.log("Go to home page", true);
//click on midwest region
clickOn(locators.Homepage_loc.MIDWESTREGION);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
//click on Lansing
clickOn(locators.Homepage_loc.LANSINGAPT);
WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
Assert.assertTrue(isElementPresent(locators.Homepage_loc.LANSINGHEADING));
Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/mi/metro-lansing/lansing");
//go to home page
getWebDriver().navigate().to(URL);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
Reporter.log("Go to home page", true);
//click on midwest region
clickOn(locators.Homepage_loc.MIDWESTREGION);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
//click on Lincon
clickOn(locators.Homepage_loc.LINCONAPT);
WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
Assert.assertTrue(isElementPresent(locators.Homepage_loc.LINCONHEADING));
Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/il/metro-bloomington/lincoln");
//go to home page
getWebDriver().navigate().to(URL);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
Reporter.log("Go to home page", true);
//click on midwest region
clickOn(locators.Homepage_loc.MIDWESTREGION);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
//click on Milwaukee
clickOn(locators.Homepage_loc.MILWAUKEEAPT);
WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
Assert.assertTrue(isElementPresent(locators.Homepage_loc.MILWAUKEEHEADING));
Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/wi/metro-milwaukee/milwaukee");
//go to home page
getWebDriver().navigate().to(URL);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
Reporter.log("Go to home page", true);
//click on midwest region
clickOn(locators.Homepage_loc.MIDWESTREGION);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
//click on Minneapolis
clickOn(locators.Homepage_loc.MINNEAPOLISAPT);
WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
Assert.assertTrue(isElementPresent(locators.Homepage_loc.MINNEAPOLISHEADING));
Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/mn/metro-minneapolis/minneapolis");
//go to home page
getWebDriver().navigate().to(URL);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
Reporter.log("Go to home page", true);
//click on midwest region
clickOn(locators.Homepage_loc.MIDWESTREGION);
WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
//click on Omaha
clickOn(locators.Homepage_loc.OMAHAAPT);
WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
Assert.assertTrue(isElementPresent(locators.Homepage_loc.OMAHAHEADING));
Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/ne/metro-omaha/omaha");				
}
			
catch (Error e) {					
e.printStackTrace();	
throw e;
}
}
		
		//This script will verify the Links under South Region
				@Test (groups={"regression"}, alwaysRun=true)
				public void testSouthregion() throws Exception
				{
					try {
						//Go to Homepage
						getWebDriver().navigate().to(URL);
						WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
						Reporter.log("Go to CHC homepage", true);	
						//Click On South Region
						clickOn(locators.Homepage_loc.SOUTHREGION);
						WaitForElementPresent(locators.Homepage_loc.SRCHLINKLINK, timeout);
						//Click on Atlanta
						clickOn(locators.Homepage_loc.ATLANTAPAT);
						WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
						Assert.assertTrue(isElementPresent(locators.Homepage_loc.ATLANTAHEADING));
						Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/ga/metro-atlanta/atlanta");
						//Go to Homepage
						getWebDriver().navigate().to(URL);
						WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
						Reporter.log("Go to CHC homepage", true);	
						//Click On South Region
						clickOn(locators.Homepage_loc.SOUTHREGION);
						WaitForElementPresent(locators.Homepage_loc.SRCHLINKLINK, timeout);
						//Click on Atlanta
						clickOn(locators.Homepage_loc.BRANDENTONAPT);
						WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
						Assert.assertTrue(isElementPresent(locators.Homepage_loc.BRANDENTONHEADING));
						Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/fl/metro-bradenton-sarasota/bradenton");
						//Go to Homepage
						getWebDriver().navigate().to(URL);
						WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
						Reporter.log("Go to CHC homepage", true);	
						//Click On South Region
						clickOn(locators.Homepage_loc.SOUTHREGION);
						WaitForElementPresent(locators.Homepage_loc.SRCHLINKLINK, timeout);
						//Click on Chapel hill
						clickOn(locators.Homepage_loc.CHAPELHILLAPT);
						WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
						Assert.assertTrue(isElementPresent(locators.Homepage_loc.CHAPELHILLHEADING));
						Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/nc/metro-raleigh-durham/chapel-hill");
						//Go to Homepage
						getWebDriver().navigate().to(URL);
						WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
						Reporter.log("Go to CHC homepage", true);	
						//Click On South Region
						clickOn(locators.Homepage_loc.SOUTHREGION);
						WaitForElementPresent(locators.Homepage_loc.SRCHLINKLINK, timeout);
						//Click on Charlotte
						clickOn(locators.Homepage_loc.CHARLOTTEAPT);
						WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
						Assert.assertTrue(isElementPresent(locators.Homepage_loc.CHARLOTTEHEADING));
						Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/nc/metro-charlotte/charlotte");
						//Go to Homepage
						getWebDriver().navigate().to(URL);
						WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
						Reporter.log("Go to CHC homepage", true);	
						//Click On South Region
						clickOn(locators.Homepage_loc.SOUTHREGION);
						WaitForElementPresent(locators.Homepage_loc.SRCHLINKLINK, timeout);
						//Click on Durham
						clickOn(locators.Homepage_loc.DURHAMAPT);
						WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
						Assert.assertTrue(isElementPresent(locators.Homepage_loc.DURHAMHEADING));
						Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/nc/metro-raleigh-durham/durham");
						//Go to Homepage
						getWebDriver().navigate().to(URL);
						WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
						Reporter.log("Go to CHC homepage", true);	
						//Click On South Region
						clickOn(locators.Homepage_loc.SOUTHREGION);
						WaitForElementPresent(locators.Homepage_loc.SRCHLINKLINK, timeout);
						//Click on Fort Lauderdale
						clickOn(locators.Homepage_loc.FORTLAUDERDALEAPT);
						WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
						Assert.assertTrue(isElementPresent(locators.Homepage_loc.FORTLAUDERDALHEADING));
						Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/fl/metro-miami/fort-lauderdale");
						//Go to Homepage
						getWebDriver().navigate().to(URL);
						WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
						Reporter.log("Go to CHC homepage", true);	
						//Click On South Region
						clickOn(locators.Homepage_loc.SOUTHREGION);
						WaitForElementPresent(locators.Homepage_loc.SRCHLINKLINK, timeout);
						//Click on Fort Myers
						clickOn(locators.Homepage_loc.FORTMAYERSAPT);
						WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
						Assert.assertTrue(isElementPresent(locators.Homepage_loc.FORTMAYERSHEADING));
						Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/fl/metro-fort-myers/fort-myers");
						//Go to Homepage
						getWebDriver().navigate().to(URL);
						WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
						Reporter.log("Go to CHC homepage", true);	
						//Click On South Region
						clickOn(locators.Homepage_loc.SOUTHREGION);
						WaitForElementPresent(locators.Homepage_loc.SRCHLINKLINK, timeout);
						//Click on Greensboro
						clickOn(locators.Homepage_loc.GREENSBOROAPT);
						WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
						Assert.assertTrue(isElementPresent(locators.Homepage_loc.GREENSBOROHEADING));
						Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/nc/metro-greensboro-triad/greensboro");
						//click on home page
						getWebDriver().navigate().to(URL);
						WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
						Reporter.log("Go to CHC homepage", true);
						//Click on South Region
						clickOn(locators.Homepage_loc.SOUTHREGION);
						WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
						//click on Homestead
						clickOn(locators.Homepage_loc.HOMESTEADAPT);
						WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
						Assert.assertTrue(isElementPresent(locators.Homepage_loc.HOMESTEADHEADING));
						Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/fl/metro-miami/homestead");
						//click on home page
						getWebDriver().navigate().to(URL);
						WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
						Reporter.log("Go to CHC homepage", true);
						//Click on South Region
						clickOn(locators.Homepage_loc.SOUTHREGION);
						WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
						//click on Jacksonville
						clickOn(locators.Homepage_loc.JAKSONVILLEAPT);
						WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
						Assert.assertTrue(isElementPresent(locators.Homepage_loc.JAKSONVILLEHEADING));
						Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/fl/metro-jacksonville/jacksonville");
						//click on home page
						getWebDriver().navigate().to(URL);
						WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
						Reporter.log("Go to CHC homepage", true);
						//Click on South Region
						clickOn(locators.Homepage_loc.SOUTHREGION);
						WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
						//click on Lexington
						clickOn(locators.Homepage_loc.LEXINGTONAPT);
						WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
						Assert.assertTrue(isElementPresent(locators.Homepage_loc.LEXINGTONHEADING));
						Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/ky/metro-lexington/lexington");
						//click on home page
						getWebDriver().navigate().to(URL);
						WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
						Reporter.log("Go to CHC homepage", true);
						//Click on South Region
						clickOn(locators.Homepage_loc.SOUTHREGION);
						WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
						//click on Memphis
						clickOn(locators.Homepage_loc.MEMPHISAPT);
						WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
						Assert.assertTrue(isElementPresent(locators.Homepage_loc.MEMPHISHEADING));
						Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/tn/metro-memphis/memphis");
						//click on home page
						getWebDriver().navigate().to(URL);
						WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
						Reporter.log("Go to CHC homepage", true);
						//Click on South Region
						clickOn(locators.Homepage_loc.SOUTHREGION);
						WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
						//click on Miami
						clickOn(locators.Homepage_loc.MIAMIAPT);
						WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
						Assert.assertTrue(isElementPresent(locators.Homepage_loc.MIAMIHEADING));
						Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/fl/metro-miami/miami");
						//click on home page
						getWebDriver().navigate().to(URL);
						WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
						Reporter.log("Go to CHC homepage", true);
						//Click on South Region
						clickOn(locators.Homepage_loc.SOUTHREGION);
						WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
						//click on Naples
						clickOn(locators.Homepage_loc.NAPLESAPT);
						WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
						Assert.assertTrue(isElementPresent(locators.Homepage_loc.NAPLESHEADING));
						Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/fl/metro-fort-myers/naples");
						//click on home page
						getWebDriver().navigate().to(URL);
						WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
						Reporter.log("Go to CHC homepage", true);
						//Click on South Region
						clickOn(locators.Homepage_loc.SOUTHREGION);
						WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
						//click on Nashville
						clickOn(locators.Homepage_loc.NASHVILLEAPT);
						WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
						Assert.assertTrue(isElementPresent(locators.Homepage_loc.NASHVILLEHEADING));
						Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/tn/metro-nashville/nashville");
						//click on home page
						getWebDriver().navigate().to(URL);
						WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
						Reporter.log("Go to CHC homepage", true);
						//Click on South Region
						clickOn(locators.Homepage_loc.SOUTHREGION);
						WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
						//click on New Orleans
						clickOn(locators.Homepage_loc.NEWORLEANSAPT);
						WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
						Assert.assertTrue(isElementPresent(locators.Homepage_loc.NEWORLEANSHEAING));
						Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/la/metro-new-orleans/new-orleans");
					}
			catch (Error e) {					
				e.printStackTrace();	
				throw e;
			}
}

//This script will verify all the Links on menu
		@Test (groups={"regression"}, alwaysRun=true)
		public void testSouthwestregion() throws Exception
		{
			try {
			// Go to Homepage
			getWebDriver().navigate().to(URL);
			WaitForElementPresent(locators.Homepage_loc.SEARCHBUTTON, timeout);
			Reporter.log("Go to CHC homepage", true);
			//Click on SouthWest Tab
			clickOn(locators.Homepage_loc.SOUTHWESTREGION);
			Thread.sleep(2000);
			//Click Albuquerque
			clickOn(locators.Homepage_loc.ALBUQUERQUE);
			WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
			Assert.assertTrue(isElementPresent(locators.Homepage_loc.ALBUQUERQUEHEADING));
			Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/nm/metro-albuquerque/albuquerque");
			// Go to Homepage
			getWebDriver().navigate().to(URL);
			WaitForElementPresent(locators.Homepage_loc.SEARCHBUTTON, timeout);
			Reporter.log("Go to CHC homepage", true);
			//Click on SouthWest Tab
			clickOn(locators.Homepage_loc.SOUTHWESTREGION);
			Thread.sleep(2000);
			//Click Albuquerque
			clickOn(locators.Homepage_loc.AUSTIN);
			WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
			Assert.assertTrue(isElementPresent(locators.Homepage_loc.AUSTINEHEADING));
			Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/tx/metro-austin/austin");
			// Go to Homepage
			getWebDriver().navigate().to(URL);
			WaitForElementPresent(locators.Homepage_loc.SEARCHBUTTON, timeout);
			Reporter.log("Go to CHC homepage", true);
			//Click on SouthWest Tab
			clickOn(locators.Homepage_loc.SOUTHWESTREGION);
			Thread.sleep(2000);
			//Click Dallas
			clickOn(locators.Homepage_loc.DALLAS);
			WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
			Assert.assertTrue(isElementPresent(locators.Homepage_loc.DALLASEHEADING));
			Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/tx/metro-dallas/dallas");
			// Go to Homepage
			getWebDriver().navigate().to(URL);
			WaitForElementPresent(locators.Homepage_loc.SEARCHBUTTON, timeout);
			Reporter.log("Go to CHC homepage", true);
			//Click on SouthWest Tab
			clickOn(locators.Homepage_loc.SOUTHWESTREGION);
			Thread.sleep(2000);
			//Click Denton
			clickOn(locators.Homepage_loc.DENTON);
			WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
			Assert.assertTrue(isElementPresent(locators.Homepage_loc.DENTONHEADING));
			Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/tx/metro-dallas/denton");
			// Go to Homepage
			getWebDriver().navigate().to(URL);
			WaitForElementPresent(locators.Homepage_loc.SEARCHBUTTON, timeout);
			Reporter.log("Go to CHC homepage", true);
			//Click on SouthWest Tab
			clickOn(locators.Homepage_loc.SOUTHWESTREGION);
			Thread.sleep(2000);
			//Click Fort Worth
			clickOn(locators.Homepage_loc.FORTWORTH);
			WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
			Assert.assertTrue(isElementPresent(locators.Homepage_loc.FORTWORTHHEADING));
			Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/tx/metro-dallas/fort-worth");
			// Go to Homepage
			getWebDriver().navigate().to(URL);
			WaitForElementPresent(locators.Homepage_loc.SEARCHBUTTON, timeout);
			Reporter.log("Go to CHC homepage", true);
			//Click on SouthWest Tab
			clickOn(locators.Homepage_loc.SOUTHWESTREGION);
			Thread.sleep(2000);
			//Click Houston
			clickOn(locators.Homepage_loc.HOUSTON);
			WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
			Assert.assertTrue(isElementPresent(locators.Homepage_loc.HOUSTONHEADING));
			Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/tx/metro-houston/houston");
			// Go to Homepage
			getWebDriver().navigate().to(URL);
			WaitForElementPresent(locators.Homepage_loc.SEARCHBUTTON, timeout);
			Reporter.log("Go to CHC homepage", true);
			//Click on SouthWest Tab
			clickOn(locators.Homepage_loc.SOUTHWESTREGION);
			Thread.sleep(2000);
			//Click Oklahoma
			clickOn(locators.Homepage_loc.OKLAHOMA);
			WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
			Assert.assertTrue(isElementPresent(locators.Homepage_loc.OKLAHOMAHEADING));
			Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/ok/metro-oklahoma-city/oklahoma-city");
			// Go to Homepage
			getWebDriver().navigate().to(URL);
			WaitForElementPresent(locators.Homepage_loc.SEARCHBUTTON, timeout);
			Reporter.log("Go to CHC homepage", true);
			//Click on SouthWest Tab
			clickOn(locators.Homepage_loc.SOUTHWESTREGION);
			Thread.sleep(2000);
			//Click Phoenix
			clickOn(locators.Homepage_loc.PHOENIX);
			WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
			Assert.assertTrue(isElementPresent(locators.Homepage_loc.PHOENIXHEADING));
			Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/az/metro-phoenix/phoenix");
			// Go to Homepage
			getWebDriver().navigate().to(URL);
			WaitForElementPresent(locators.Homepage_loc.SEARCHBUTTON, timeout);
			Reporter.log("Go to CHC homepage", true);
			//Click on SouthWest Tab
			clickOn(locators.Homepage_loc.SOUTHWESTREGION);
			Thread.sleep(2000);
			//Click Plano
			clickOn(locators.Homepage_loc.PLANO);
			WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
			Assert.assertTrue(isElementPresent(locators.Homepage_loc.PLANOHEADING));
			Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/tx/metro-dallas/plano");
			// Go to Homepage
			getWebDriver().navigate().to(URL);
			WaitForElementPresent(locators.Homepage_loc.SEARCHBUTTON, timeout);
			Reporter.log("Go to CHC homepage", true);
			//Click on SouthWest Tab
			clickOn(locators.Homepage_loc.SOUTHWESTREGION);
			Thread.sleep(2000);
			//Click San Antonio
			clickOn(locators.Homepage_loc.SANANTONIO);
			WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
			Assert.assertTrue(isElementPresent(locators.Homepage_loc.SANANTONIOHEADING));
			Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/tx/metro-san-antonio/san-antonio");
			// Go to Homepage
			getWebDriver().navigate().to(URL);
			WaitForElementPresent(locators.Homepage_loc.SEARCHBUTTON, timeout);
			Reporter.log("Go to CHC homepage", true);
			//Click on SouthWest Tab
			clickOn(locators.Homepage_loc.SOUTHWESTREGION);
			Thread.sleep(2000);
			//Click Scottsdale
			clickOn(locators.Homepage_loc.SCOTTSDALE);
			WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
			Assert.assertTrue(isElementPresent(locators.Homepage_loc.SCOTTSDALEHEADING));
			Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/az/metro-phoenix/scottsdale");
			// Go to Homepage
			getWebDriver().navigate().to(URL);
			WaitForElementPresent(locators.Homepage_loc.SEARCHBUTTON, timeout);
			Reporter.log("Go to CHC homepage", true);
			//Click on SouthWest Tab
			clickOn(locators.Homepage_loc.SOUTHWESTREGION);
			Thread.sleep(2000);
			//Click Tempe
			clickOn(locators.Homepage_loc.TEMPE);
			WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
			Assert.assertTrue(isElementPresent(locators.Homepage_loc.TEMPEHEADING));
			Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/az/metro-phoenix/tempe");
			// Go to Homepage
			getWebDriver().navigate().to(URL);
			WaitForElementPresent(locators.Homepage_loc.SEARCHBUTTON, timeout);
			Reporter.log("Go to CHC homepage", true);
			//Click on SouthWest Tab
			clickOn(locators.Homepage_loc.SOUTHWESTREGION);
			Thread.sleep(2000);
			//Click Tucson
			clickOn(locators.Homepage_loc.TUCSON);
			WaitForElementPresent(locators.Searchresults_loc.FOOTERTEXT, timeout);
			Assert.assertTrue(isElementPresent(locators.Homepage_loc.TUCSONHEADING));
			Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"find/az/metro-tucson/tucson");
			// Go to Homepage
			getWebDriver().navigate().to(URL);
			WaitForElementPresent(locators.Homepage_loc.SEARCHBUTTON, timeout);
			Reporter.log("Go to CHC homepage", true);
			}
			catch (Error e) {					
				e.printStackTrace();	
				throw e;
			}
		}
		//This script will verify all the Links on Footer
		@Test (groups={"regression"}, alwaysRun=true)
		public void testFooterlinks() throws Exception
		{
			try {
				// Go to Homepage
				getWebDriver().navigate().to(URL);
				WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
				Reporter.log("Go to CHC Homepage", true);
				clickOn(locators.Homepage_loc.FTRHOME);
				// Go to Homepage
				getWebDriver().navigate().to(URL);
				WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
				Reporter.log("Go to CHC Homepage", true);
				//click on managers and owners link
				clickOn(locators.Homepage_loc.FTRMANAGERSANDOWNER);
				Assert.assertTrue(isElementPresent(locators.Backend_loc.USERNAME));
				Reporter.log("Click on Managers and Owners link and verify the page", true);
				// Go to Homepage
				getWebDriver().navigate().to(URL);
				WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
				Reporter.log("Go to CHC Homepage", true);
				//click on advertise link
				clickOn(locators.Homepage_loc.FTRADVERTISE);
				windowhandle(locators.Homepage_loc.GETINTOUCHNAME, "http://multifamily.forrent.com/corporatehousing/");
				Reporter.log("Click on advertise link", true);
				// Go to Homepage
				getWebDriver().navigate().to(URL);
				WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
				Reporter.log("Go to CHC Homepage", true);
				//Click on About us
				clickOn(locators.Homepage_loc.ABOUTUSLINK);
				WaitForElementPresent(locators.Homepage_loc.COPYRIGHTHEADING, timeout);
				Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"aboutus");
				Assert.assertEquals(getWebDriver().getTitle(), "Short-Term Rentals and Furnished Apartments For Rent - CorporateHousing.com");
				Reporter.log("Clicking on About Us link", true);
				// Go to Homepage
				getWebDriver().navigate().to(URL);
				WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
				Reporter.log("Go to CHC Homepage", true);
				//Click on visitors agreement
				clickOn(locators.Homepage_loc.FTRVISITORSAGREEMENT);
				windowhandle(locators.Homepage_loc.TERMSOFUSEHEADING, "http://www.dominionenterprises.com/terms-of-use/");
				Reporter.log("Click on Visitors Agreemant", true);
				// Go to Homepage
				getWebDriver().navigate().to(URL);
				WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
				Reporter.log("Go to CHC Homepage", true);
				//click on privacy policy
				clickOn(locators.Homepage_loc.FTRPRIVACYPOLICY);
				windowhandle(locators.Homepage_loc.PRIVACYPOLICTFOOTER, "http://www.dominionenterprises.com/privacy/");
				Reporter.log("Click on Privacy policy link", true);
				// Go to Homepage
				getWebDriver().navigate().to(URL);
				WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
				Reporter.log("Go to CHC Homepage", true);
				//Click on ad choices link
				clickOn(locators.Homepage_loc.Adchoices);
				windowhandle(locators.Homepage_loc.Adchoicespage, "http://www.networkadvertising.org/choices/");
				Reporter.log("go to ad choices page");
				//Back to home page
				getWebDriver().navigate().to(URL);
				WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
				Reporter.log("Back to home page");
				//click on contact us
				clickOn(locators.Homepage_loc.FTRCONTACTUS);
				WaitForElementPresent(locators.Homepage_loc.CONTACTUSH1, timeout);
				Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"contactus");
				Assert.assertEquals(getWebDriver().getTitle(), "Short-Term Rentals and Furnished Apartments For Rent - CorporateHousing.com");
				Reporter.log("Clicking on Contact Us link", true);
				// Go to Homepage
				getWebDriver().navigate().to(URL);
				WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
				Reporter.log("Go to CHC Homepage", true);
				//click on ForRent.com
				clickOn(locators.Homepage_loc.FTRFORRENTLINK);
				windowhandle(locators.Homepage_loc.Forrentpage, "http://www.forrent.com/");
				//Thread.sleep(5000);
				//WaitForElementPresent(locators.Homepage_loc.Forrentpage, timeout);
				Reporter.log("Click on ForRent.com", true);
				// Go to Homepage
				getWebDriver().navigate().to(URL);
				WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
				Reporter.log("Go to CHC Homepage", true);
				//Click on ForRentUniversity.com
				clickOn(locators.Homepage_loc.FTRFORRENTUNIVLINK);
				windowhandle(locators.Homepage_loc.FORRENTUNIVSEARCHBOX, "http://www.forrentuniversity.com/");
				//WaitForElementPresent(locators.Homepage_loc.Forrentuniv, timeout);
				Reporter.log("Clicking on ForRentUniversity.com", true);
				// Go to Homepage
				getWebDriver().navigate().to(URL);
				WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
				Reporter.log("Go to CHC Homepage", true);
				//click on After55.com
				clickOn(locators.Homepage_loc.FTRAFTER55LINK);
				windowhandle(locators.Homepage_loc.AFTER55SEARCHBOX, "http://www.after55.com/");
				//WaitForElementPresent(locators.Homepage_loc.after55page,timeout);
				Reporter.log("Clicking on After55.com", true);
				// Go to Homepage
				getWebDriver().navigate().to(URL);
				WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
				Reporter.log("Go to CHC Homepage", true);
				//Click on copyright link
				clickOn(locators.Homepage_loc.FTRCOPYRIGHTLINK);
				windowhandle(locators.Homepage_loc.COPYRIGHTH1, "http://www.dominionenterprises.com/copyright/");
				Reporter.log("Click on copyright link", true);
				// Go to Homepage
				getWebDriver().navigate().to(URL);
				WaitForElementPresent(locators.Homepage_loc.SEARCHBYSTATELINK, timeout);
				Reporter.log("Go to CHC Homepage", true);
				//click on equal oppertunity housing link
				clickOn(locators.Homepage_loc.FTREQUALOPPERTUNITY);
				WaitForElementPresent(locators.Homepage_loc.EQUALOPPHOUSINGH1, timeout);
				Assert.assertEquals(getWebDriver().getCurrentUrl(), URL+"fair-housing");
				Assert.assertEquals(getWebDriver().getTitle(), "Short-Term Rentals and Furnished Apartments For Rent - CorporateHousing.com");
				Reporter.log("Clicking on Contact Us link", true);
				
			}
			catch (Error e) {					
				e.printStackTrace();	
				throw e;
			}
		}
}
	