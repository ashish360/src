package locators;

public class Searchresults_loc {
	//FOOTER At search result page
	public final static String FOOTERTEXT = "//*[@id='copyrights']//p[contains(text(), 'CorporateHousing.com is part of the Homes.com and ForRent.com Network.')]";
	
	//Locators for fields @check availability modal
	public final static String CHECKAVAILABILITYBTN = "checkavailability";
	public final static String CHECKAVAILABILITY_FNAME = "first_name";
	public final static String CHECKAVAILABILTY_LNAME = "last_name";
	public final static String CHECKAVAILABILITY_EMAIL = "emailId";
	public final static String CHECKAVAILABILITY_PHN = "phonenumber";
	public final static String CHECKAVAILABILITY_ARRIVALDATE = "arrival_date";
	public final static String CHECKAVAILABILITY_DEPARTUREDATE = "departure_date";
	public final static String CHECHAVAILABILITY_BEDROOM = "bedrooms";
	public final static String CHECKAVAILABILITY_COMMENTS = "comments_question";
	public final static String CHECKAVAILABILITY_SENDBTN = "//*[@id='buttonhide']/button";
	public final static String DATEPICKERNEXTICON = "css=div[class*='datepicker'] th.next";
	public final static String DATEPICKERDATE7 = "//div[contains(@class, 'datepicker')]//td[text()='7']";
	public final static String DATEPICKERDATE15 = "//div[contains(@class, 'datepicker')]//td[text()='15']";
	public final static String THANKYOUMESSAGE = "//*[@id='buttonhide']//strong[contains(text(), 'Thank you! Your message')]";
	
	//First search result locator
	public final static String FIRSTSEARCHRESULT = "//*[@id='itemContainer']/li//button[@id='checkavailability']";
	
	//Additional Locations
	public final static String PORTSMOUTH = "//*[@id='collapseTwo']//a[text()='Portsmouth']";
	public final static String NORFOLK = "//*[@id='collapseTwo']//a[text()='Norfolk']";
	public final static String PUNGOTEAGUE = "//*[@id='collapseTwo']//a[text()='Pungoteague']";
	//Nearby ZIP codes on search results of Virginia Beach, VA
	public final static String ZIP1 = "//*[@id='collapseThree']//a[text()='23704']";
	public final static String ZIP2 = "//*[@id='collapseThree']//a[text()='23508']";
	public final static String ZIP3 = "//*[@id='collapseThree']//a[text()='23510']";
	public final static String ZIP4 = "//*[@id='collapseThree']//a[text()='23422']";
	
}
