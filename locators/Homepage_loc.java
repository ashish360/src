package locators;

//locator class is public static final which means it can be accessed by all and cannot be changed.

public class Homepage_loc {
	public final static String SEARCHTEXTBOX = "citystateorzipcode";
	public final static String SEARCHBUTTON = "//div[@id='search-container']//form[@id='commonsearchheader']/button";
	public final static String ARRIVALDATE = "//*[@id='datearrival']";
	public final static String NEXTICON = "//table[@class=' table-condensed']/thead//th[3]";
	public final static String SELECTARRIVALDATE = "//div[@class='datepicker-days']//td[text()='12']";
	public final static String SELECTDEPARTUREDATE = "//div[@class='datepicker-days']//td[text()='13']";
	public final static String DEPARTUREDATE = "//*[@id='datedepart']";
	public final static String SRCHLINKLINK = "//*[@id='navigation']//a[text()='search']";
	public final static String ABOUTUSLINK = "//*[@id='navigation']//a[text()='about us']";
	public final static String ADVERTISELINK = "//*[@id='navigation']//a[text()='advertise']";
	public final static String MANAGEROWNERLINK = "//*[@id='navigation']//a[text()='managers & owners']";
	public final static String RIBBONIMAGE = "//*[@id='jSmallImg']";
	public final static String RIBBONVIEWMORE = "//*[@id='jSpUrl']";
	public final static String SEARCHBYSTATELINK = "//*[@id='popular-stay']//a[text()='Search Corporate Housing by State']";
	
	//Locators for About Us page
	public final static String COPYRIGHTHEADING = "//div[@class='row']//h1[text()='About CorporateHousing.com']";
	
	//Locator for Advertise Page
	public final static String GETINTOUCHNAME = "//*[@id='name']";
	
	//Locators for Popular Extended Stay locations
	public final static String EASTREGION = "//*[@id='myTab']//a[contains(text(), 'East Region')]";
	//Locators for Alexandria Apartment and its search result page heading
	public final static String ALEXENDRIAAPT = "//*[@id='eastRegion']//a[contains(text(), 'Alexandria Apartments')]";
	public final static String ALEXANDRIAHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Properties in Alexandria, VA')]";
	//Locator for Arlington
	public final static String ARLINGTONAPT = "//*[@id='eastRegion']//a[contains(text(), 'Arlington Apartments')]";
	public final static String ARLINGTONHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Properties in Arlington, VA')]";
	//Baltimore
	public final static String BALTIMOREAPT = "//*[@id='eastRegion']//a[contains(text(), 'Baltimore Apartments')]";
	public final static String BALTIMOREHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Properties in Baltimore, MD')]";
	//Bethes
	public final static String BETHESDAAPT = "//*[@id='eastRegion']//a[contains(text(), 'Bethesda Apartments')]";
	public final static String BETHESHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Properties in Bethesda, MD')]";
	//Boston
	public final static String BOSTONAPT = "//*[@id='eastRegion']//a[contains(text(), 'Boston Apartments')]";
	public final static String BOSTONHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Properties in Boston, MA')]";
	//Fairfax
	public final static String FAIRFAXAPT = "//*[@id='eastRegion']//a[contains(text(), 'Fairfax Apartments')]";
	public final static String FAIRFAXHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Properties in Fairfax, VA')]";
	//Hartford
	public final static String HARTFORDAPT = "//*[@id='eastRegion']//a[contains(text(), 'Hartford Apartments')]";
	public final static String HARTFORDHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Properties in Hartford, CT')]";
	//New York
	public final static String NEWYORKAPT = "//*[@id='eastRegion']//a[contains(text(), 'New York Apartments')]";
	public final static String NEWYORKHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Properties in New York, NY')]";
	//New Haven
	public final static String NEWHAVENAPT = "//*[@id='eastRegion']//a[contains(text(), 'New Haven Apartments')]";
	public final static String NEWHAVENHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Properties in New Haven, CT')]";
	//Norfolk
	public final static String NORFOLKAPT = "//*[@id='eastRegion']//a[contains(text(), 'Norfolk Apartments')]";
	public final static String NORFOLKHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Properties in Norfolk, VA')]";
	//Philadelphia
	public final static String PHILADELPHIAAPT = "//*[@id='eastRegion']//a[contains(text(), 'Philadelphia Apartments')]";
	public final static String PHILADELPHIAHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Properties in Philadelphia, PA')]";
	//Pittsburgh
	public final static String PITTSBURGHAPT = "//*[@id='eastRegion']//a[contains(text(), 'Pittsburgh Apartments')]";
	public final static String PITTSBURGHHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Properties in Pittsburgh, PA')]";
	//Richmond
	public final static String RICHMONDAPT = "//*[@id='eastRegion']//a[contains(text(), 'Richmond Apartments')]";
	public final static String RICHMONDHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Properties in Richmond, VA')]";
	//Somerset
	public final static String SOMERSETAPT = "//*[@id='eastRegion']//a[contains(text(), 'Somerset Apartments')]";
	public final static String SOMERSETHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Properties in Somerset, NJ')]";
	//Virgnia Beach
	public final static String VIRGINIABEACHAPT = "//*[@id='eastRegion']//a[contains(text(), 'Virginia Beach Apartments')]";
	public final static String VIRGINIAHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Properties in Virginia Beach, VA')]";
	//WashingtonDC
	public final static String WASHINGTONDCAPT = "//*[@id='eastRegion']//a[contains(text(), 'Washington D.C. Apartments')]";
	public final static String WASHINGTONHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Properties in Washington, DC')]";
	
	
	//Locators for midwest region
public final static String MIDWESTREGION = "//*[@id='myTab']//a[contains(text(), 'Midwest Region')]";
//Locator for Ann Arbor apartments
public final static String ANNARBORAPT = "//*[@id='midwestRegion']//a[contains(text(), 'Ann Arbor Apartments')]";
public final static String ANNARBORHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Ann Arbor, MI')]";
//Locator for Chicago apartments
public final static String CHICAGOAPT = "//*[@id='midwestRegion']//a[contains(text(), 'Chicago Apartments')]";
public final static String CHICAGOHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Chicago, IL')]";
//Locator for Cincinnati apartments
public final static String CINCINNATIAPT = "//*[@id='midwestRegion']//a[contains(text(), 'Cincinnati Apartments')]";
public final static String CINCINNATIHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Cincinnati, OH')]";
//Locator for Cleveland apartments
public final static String CLEVELANDAPT = "//*[@id='midwestRegion']//a[contains(text(), 'Cleveland Apartments')]";
public final static String CLEVELANDHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Cleveland, OH')]";
//Locator for Columbus apartments
public final static String COLUMBUSAPT = "//*[@id='midwestRegion']//a[contains(text(), 'Columbus Apartments')]";
public final static String COLUMBUSHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Columbus, OH')]";
//Locator for Detroit apartments
public final static String DETROITAPT = "//*[@id='midwestRegion']//a[contains(text(), 'Detroit Apartments')]";
public final static String DETROITHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Detroit, MI')]";
//Locator for Fort Wayne apartments
public final static String FORTWAYNEAPT = "//*[@id='midwestRegion']//a[contains(text(), 'Fort Wayne Apartments')]";
public final static String FORTWAYNEHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Fort Wayne, IN')]";	
//Locator for Grand rapids apartments
public final static String GRANDRAPIDSAPT = "//*[@id='midwestRegion']//a[contains(text(), 'Grand Rapids Apartments')]";
public final static String GRANDRAPIDSHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Grand Rapids, MI')]";
//Locator forIndianapolis apartments
public final static String INDIANAPOLISAPT = "//*[@id='midwestRegion']//a[contains(text(), 'Indianapolis Apartments')]";
public final static String INDIANAPOLISHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Indianapolis, IN')]";
//Locator for Kansas city apartments
public final static String KANSASCITYAPT = "//*[@id='midwestRegion']//a[contains(text(), 'Kansas City Apartments')]";
public final static String KANSASCITYHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Kansas City, KS')]";
//Locator for Lafayette apartments
public final static String LAFAYETTEAPT = "//*[@id='midwestRegion']//a[contains(text(), 'Lafayette Apartments')]";
public final static String LAFAYETTEHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Lafayette, IN')]";
//Locator for lansing apartments
public final static String LANSINGAPT = "//*[@id='midwestRegion']//a[contains(text(), 'Lansing Apartments')]";
public final static String LANSINGHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Lansing, MI')]";
//Locator for lincon apartments
public final static String LINCONAPT = "//*[@id='midwestRegion']//a[contains(text(), 'Lincoln Apartments')]";
public final static String LINCONHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Lincoln, IL')]";
//Locator for Milwaukee apartments
public final static String MILWAUKEEAPT = "//*[@id='midwestRegion']//a[contains(text(), 'Milwaukee Apartments')]";
public final static String MILWAUKEEHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Milwaukee, WI')]";
//Locator for Minneapolis apartments
public final static String MINNEAPOLISAPT = "//*[@id='midwestRegion']//a[contains(text(), 'Minneapolis Apartments')]";
public final static String MINNEAPOLISHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(),'Minneapolis, MN')]";
//Locator for Omaha apartments
public final static String OMAHAAPT = "//*[@id='midwestRegion']//a[contains(text(), 'Omaha Apartments')]";
public final static String OMAHAHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Omaha, NE')]";	


    //Locators of South region
     public final static String SOUTHREGION = "//*[@id='myTab']//a[contains(text(), 'South Region')]";
     //locators for Atlanta
     public final static String ATLANTAPAT = "//*[@id='SouthRegion']//a[contains(text(), 'Atlanta Apartments')]";
     public final static String ATLANTAHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), ' Properties in Atlanta, GA')]";
     //locators for Brandenton
     public final static String BRANDENTONAPT = "//*[@id='SouthRegion']//a[contains(text(), 'Bradenton Apartments')]";
     public final static String BRANDENTONHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), ' Property in Bradenton, FL')]";
     //locators for chapel hill
     public final static String CHAPELHILLAPT = "//*[@id='SouthRegion']//a[contains(text(), 'Chapel Hill Apartments')]";
     public final static String CHAPELHILLHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Property in Chapel Hill, NC')]";
     //locators for Charlotte
     public final static String CHARLOTTEAPT = "//*[@id ='SouthRegion']//a[contains(text(), 'Charlotte Apartments')]";
     public final static String CHARLOTTEHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Properties in Charlotte, NC')]";
     //locators for Durham
     public final static String DURHAMAPT = "//*[@id='SouthRegion']//a[contains(text(), 'Durham Apartments')]";
     public final static String DURHAMHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Properties in Durham, NC')]";
     //locators for Fort Lauderdale
     public final static String FORTLAUDERDALEAPT = "//*[@id='SouthRegion']//a[contains(text(), 'Lauderdale Apartments')]";
     public final static String FORTLAUDERDALHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Properties in Fort Lauderdale, FL')]";
     //locators for Fort Myers
     public final static String FORTMAYERSAPT = "//*[@id='SouthRegion']//a[contains(text(), 'Fort Myers Apartments')]";
     public final static String FORTMAYERSHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Property in Fort Myers, FL')]";
     //locators for Greensboro
     public final static String GREENSBOROAPT = "//*[@id='SouthRegion']//a[contains(text(), 'Greensboro Apartments')]";
     public final static String GREENSBOROHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Properties in Greensboro, NC')]";
     //locators for Homestead
     public final static String HOMESTEADAPT = "//*[@id='SouthRegion']//a[contains(text(), 'Homestead Apartments')]";
     public final static String HOMESTEADHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Properties in Homestead, FL')]";
     //locators for Jacksonville
     public final static String JAKSONVILLEAPT = "//*[@id='SouthRegion']//a[contains(text(), 'Jacksonville Apartments')]";
     public final static String JAKSONVILLEHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Properties in Jacksonville, FL')]";
     //locators for Lexington
     public final static String LEXINGTONAPT = "//*[@id='SouthRegion']//a[contains(text(), 'Lexington Apartments')]";
     public final static String LEXINGTONHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Properties in Lexington, KY')]";
     //locators for Memphis
     public static final String MEMPHISAPT = "//*[@id='SouthRegion']//a[contains(text(), 'Memphis Apartments')]";
     public final static String MEMPHISHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Properties in Memphis, TN')]";
     //locators for Miami
     public final static String MIAMIAPT = "//*[@id='SouthRegion']//a[contains(text(), 'Miami Apartments')]";
     public final static String MIAMIHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Properties in Miami, FL')]";
     //locators for Naples
     public final static String NAPLESAPT = "//*[@id='SouthRegion']//a[contains(text(), 'Naples Apartments')]";
     public final static String NAPLESHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Property in Naples, FL')]";
     //locators for NASHVILLE
     public final static String NASHVILLEAPT = "//*[@id='SouthRegion']//a[contains(text(), 'Nashville Apartments')]";
     public final static String NASHVILLEHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Properties in Nashville, TN')]";
     //locators for New Orleans 
     public final static String NEWORLEANSAPT = "//*[@id='SouthRegion']//a[contains(text(), 'New Orleans Apartments')]";
     public final static String NEWORLEANSHEAING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Properties in New Orleans, LA')]";     
  
     //Locators for SouthEast Region
     public final static String SOUTHWESTREGION = "//*[@id='myTab']//a[text()='Southwest Region']";
     public final static String ALBUQUERQUE = "//*[@id='southwestRegion']//a[contains(text(), 'Albuquerque Apartments')]";
     public final static String ALBUQUERQUEHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Short Term Housing Properties in Albuquerque')]";
     public final static String AUSTIN = "//*[@id='southwestRegion']//a[contains(text(), 'Austin Apartments')]";
     public final static String AUSTINEHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Short Term Housing Properties in Austin')]";
     public final static String DALLAS = "//*[@id='southwestRegion']//a[contains(text(), 'Dallas Apartments')]";
     public final static String DALLASEHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Short Term Housing Properties in Dallas')]";
     public final static String DENTON = "//*[@id='southwestRegion']//a[contains(text(), 'Denton Apartments')]";
     public final static String DENTONHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Short Term Housing Properties in Denton')]";
     public final static String FORTWORTH = "//*[@id='southwestRegion']//a[contains(text(), 'Fort Worth Apartments')]";
     public final static String FORTWORTHHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Short Term Housing Properties in Fort Worth')]";
     public final static String HOUSTON = "//*[@id='southwestRegion']//a[contains(text(), 'Houston Apartments')]";
     public final static String HOUSTONHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Short Term Housing Properties in Houston')]";
     public final static String OKLAHOMA = "//*[@id='southwestRegion']//a[contains(text(), 'Oklahoma City Apartments')]";
     public final static String OKLAHOMAHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Short Term Housing Properties in Oklahoma')]";
     public final static String PHOENIX = "//*[@id='southwestRegion']//a[contains(text(), 'Phoenix Apartments')]";
     public final static String PHOENIXHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Short Term Housing Properties in Phoenix')]";
     public final static String PLANO = "//*[@id='southwestRegion']//a[contains(text(), 'Plano Apartments')]";
     public final static String PLANOHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Short Term Housing Properties in Plano')]";
     public final static String SANANTONIO = "//*[@id='southwestRegion']//a[contains(text(), 'San Antonio Apartments')]";
     public final static String SANANTONIOHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Short Term Housing Properties in San Antonio')]";
     public final static String SCOTTSDALE = "//*[@id='southwestRegion']//a[contains(text(), 'Scottsdale Apartments')]";
     public final static String SCOTTSDALEHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Short Term Housing Properties in Scottsdale')]";
     public final static String TEMPE = "//*[@id='southwestRegion']//a[contains(text(), 'Tempe Apartments')]";
     public final static String TEMPEHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Short Term Housing Properties in Tempe')]";
     public final static String TUCSON = "//*[@id='southwestRegion']//a[contains(text(), 'Tucson Apartments')]";
     public final static String TUCSONHEADING = "//*[@id='jFeatureBlock']//h1[contains(text(), 'Short Term Housing Properties in Tucson')]";
     
     //Locators for Contact Us page
     public final static String CONTACTUSHEADING = "//*[@id='containerdata']//h1[text()='Contact Us']";
     public final static String CONTACT_FIRSTNAME = "firstname";
     public final static String CONTACT_LASTNAME = "lastname";
     public final static String CONTACT_EMAIL = "email";
     public final static String CONTACT_PHONE = "phone";
     public final static String CONTACT_SUBJECT = "subject";
     public final static String CONTACT_COMMENT = "comments";
     public final static String CONTACT_SENDBTN = "add";
     public final static String SUBJECT1 = "//*[@id='subject']//option[@value='1']";
     public final static String SUBJECT2 = "//*[@id='subject']//option[@value='2']";
     public final static String SUBJECT3 = "//*[@id='subject']//option[@value='3']";
     public final static String SUBJECT4 = "//*[@id='subject']//option[@value='4']";
     public final static String SUBJECT5 = "//*[@id='subject']//option[@value='5']";
     public final static String CONTACT_THANKYOU = "//div[@id='containerdata']/div/div[contains(text(),'Thank you for your message. We will respond to you within 1-2 business days!')]";
   
     //locators for footer links
     public final static String FTRHOME = "//*[@id='copyrights']//a[contains(text(), 'Home')]";
     public final static String FTRMANAGERSANDOWNER = "//*[@id='copyrights']//a[contains(text(), 'Managers & Owners')]";
     public final static String	FTRADVERTISE = "//*[@id='copyrights']//a[contains(text(), 'Advertise')]";	 
     public final static String FTRABOUTUS = "//*[@id='copyrights']//a[contains(text(), 'About Us')]";
     public final static String FTRVISITORSAGREEMENT = "//*[@id='visitor']//a[contains(text(), 'Visitor Agreement')]";
     public final static String FTRPRIVACYPOLICY = "//*[@id='visitor']//a[contains(text(), 'Privacy Policy')]";
     public final static String FTRCONTACTUS = "//*[@id='visitor']//a[contains(text(), 'Contact Us')]";
     public final static String FTRFORRENTLINK = "//*[@id='copyrights']//a[contains(text(), 'ForRent.com')]";
     public final static String FTRFORRENTUNIVLINK = "//*[@id='copyrights']//a[contains(text(), 'ForRentUniversity.com')]";
     public final static String FTRAFTER55LINK = "//*[@id='copyrights']//a[contains(text(), 'After55.com')]";
     public final static String FTRCOPYRIGHTLINK = "css=div[class*='col-md-4 col-sm-6']>p>a";
     public final static String FTREQUALOPPERTUNITY = "css=div[class*='col-md-3 col-sm-6']>p>a";
     public final static String TERMSOFUSEHEADING = "//*[@id='post-main-2802']/div/h1";
     public final static String PRIVACYPOLICTFOOTER = "//*[@id='footer']//a[contains(text(), 'Dominion Enterprises')]";
     public final static String CONTACTUSH1= "css=div[class*='col-md-12']>h1";
     public final static String FORRENTSEARCHBOX = "//*[@id='cityState']";
     public final static String FORRENTUNIVSEARCHBOX = "//*[@id='searchInput']";
     public final static String AFTER55SEARCHBOX = "//*[@id='citystateorzipcode']";
     public final static String COPYRIGHTH1 = "//*[@id='post-main-12262']/div/h1";
     public final static String EQUALOPPHOUSINGH1 = "css=div[class='container']>h1";
     public final static String Forrentpage = "//*[@id='txtHomepageSearch']";
     public final static String Forrentuniv = "//*[@id='d-query']";
     public final static String after55page = "//*[@id='citystateorzipcode']";
     public final static String Adchoices = "//*[@id='visitor']/ul//a[contains(text(), 'Ad Choices')]";
     public final static String Adchoicespage = "//*[@id='footer-message']";
}
