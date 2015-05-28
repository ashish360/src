package utils;

import java.io.File;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Set;

import net.sourceforge.htmlunit.corejs.javascript.tools.shell.Environment;

import org.apache.commons.jxpath.ri.compiler.Path;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

@SuppressWarnings("all")
public abstract class custom_util {
	    
			// Define objects
			private static WebDriver driver;
			//private static Selenium selenium;
			
			protected propertiesreader_util propertiesreader_util = new propertiesreader_util();
			
			//@Parameters({"browser"})
			@BeforeMethod (alwaysRun=true)
			public void setUp(){
				String driverType = utils.propertiesreader_util.readProperty("env.properties", "BROWSER");	
				System.out.println(driverType);
				//Check if desired browser is Firefox
				if (driverType.equalsIgnoreCase("firefox")) 
				{ 
					driver = new FirefoxDriver(); 
				} 
							
											
				//Check if desired browser is Internet Explorer
				else if (driverType.equalsIgnoreCase("ie")) 
				{ 
					DesiredCapabilities capabilities = new DesiredCapabilities();
					capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
					System.setProperty("webdriver.ie.driver", "C:\\iedriver\\IEDriverServer.exe");
					driver = new InternetExplorerDriver(); 
				}
				
				//Check if desired browser is Chrome
				else if (driverType.equalsIgnoreCase("chrome")) 
				{ 
					DesiredCapabilities capabilities = new DesiredCapabilities();
					capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
					//Here we have to set the path for chrome driver in our local machine
					System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
					driver = new ChromeDriver();
				} 
				
				// Check if desired browser is Safari
				else if (driverType.equalsIgnoreCase("safari"))
		        {
		              driver = new SafariDriver();
		        }
					
				//Maximize window
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();		
			}	
			
			@AfterMethod (alwaysRun=true)
			public void afterMainMethod() 
			{	
				//driver.quit();
			}

			// Return web driver object
			public static WebDriver getWebDriver() {
				return driver;
			}
			
			//Creating objects
			protected static String browser = utils.propertiesreader_util.readProperty("env.properties", "BROWSER");
			protected static String zipcode = utils.propertiesreader_util.readProperty("application.properties", "zipcode");
			protected static String superadminusername = utils.propertiesreader_util.readProperty("application.properties", "superadminusername");
			protected static String superadminpassword = utils.propertiesreader_util.readProperty("application.properties", "superadminpassword");
			protected static String username1 = utils.propertiesreader_util.readProperty("application.properties", "username1");
			protected static String username2 = utils.propertiesreader_util.readProperty("application.properties", "username2");
			protected static String username3 = utils.propertiesreader_util.readProperty("application.properties", "username3");
			protected static String username4 = utils.propertiesreader_util.readProperty("application.properties", "username4");
			protected static String username5 = utils.propertiesreader_util.readProperty("application.properties", "username5");
			protected static String password5 = utils.propertiesreader_util.readProperty("application.properties", "password5");
			protected static String username6 = utils.propertiesreader_util.readProperty("application.properties", "username6");
			protected static String username7 = utils.propertiesreader_util.readProperty("application.properties", "username7");
			protected static String username8 = utils.propertiesreader_util.readProperty("application.properties", "username8");
			protected static String userpassword = utils.propertiesreader_util.readProperty("application.properties", "userpassword");
			protected static String desc = utils.propertiesreader_util.readProperty("application.properties", "desc");
			protected static String Leasetermdesc = utils.propertiesreader_util.readProperty("application.properties", "Leasetermdesc");
			protected static String fpdesc = utils.propertiesreader_util.readProperty("application.properties", "fpdesc");
			protected static String contactdesc = utils.propertiesreader_util.readProperty("application.properties", "conactdesc");
			//URLS
			protected static String URL = utils.propertiesreader_util.readProperty("env.properties", "URL");
			protected static String LOGINURL = utils.propertiesreader_util.readProperty("env.properties", "LOGINURL");
			// Url for authentication
			protected static String AUTHURL = utils.propertiesreader_util.readProperty("env.properties", "AUTHURL");
			//Timeout
			protected static String timeoutStr = utils.propertiesreader_util.readProperty("application.properties", "TimeOut");
			protected static int timeout = Integer.parseInt(timeoutStr); 
			//Display on web site id
			protected static String siteid = utils.propertiesreader_util.readProperty("application.properties", "siteid");
			//Profile tab Backend
			protected static String tagline = utils.propertiesreader_util.readProperty("application.properties", "tagline");
			protected static String shortdesc = utils.propertiesreader_util.readProperty("application.properties", "shortdesc");
			protected static String longdesc = utils.propertiesreader_util.readProperty("application.properties", "longdesc");
			protected static String bp1 = utils.propertiesreader_util.readProperty("application.properties", "bp1");
			protected static String bp2 = utils.propertiesreader_util.readProperty("application.properties", "bp2");
			protected static String bp3 = utils.propertiesreader_util.readProperty("application.properties", "bp3");
			protected static String bp4 = utils.propertiesreader_util.readProperty("application.properties", "bp4");
			protected static String bp5 = utils.propertiesreader_util.readProperty("application.properties", "bp5");
			protected static String bp6 = utils.propertiesreader_util.readProperty("application.properties", "bp6");
			protected static String bp7 = utils.propertiesreader_util.readProperty("application.properties", "bp7");
			protected static String bp8 = utils.propertiesreader_util.readProperty("application.properties", "bp8");
			protected static String bp9 = utils.propertiesreader_util.readProperty("application.properties", "bp9");
			protected static String bp10 = utils.propertiesreader_util.readProperty("application.properties", "bp10");
			protected static String pmcname =utils.propertiesreader_util.readProperty("application.properties", "pmcname");
			//Management console fields
			protected static String propertyname = utils.propertiesreader_util.readProperty("application.properties", "propertyname");
			protected static String pmcnamemgmtconsole = utils.propertiesreader_util.readProperty("application.properties", "pmcnamemgmtconsole");
			protected static String phonenumber = utils.propertiesreader_util.readProperty("application.properties", "phonenumber");
			protected static String address = utils.propertiesreader_util.readProperty("application.properties", "address");
			protected static String accountnumber = utils.propertiesreader_util.readProperty("application.properties", "accountnumber");
			protected static String userid = utils.propertiesreader_util.readProperty("application.properties", "userid");
			protected static String vanityurl = utils.propertiesreader_util.readProperty("application.properties", "vanityurl");
			protected static String zipfield = utils.propertiesreader_util.readProperty("application.properties", "zipfield");
	
			//create account fields
			protected static String username = utils.propertiesreader_util.readProperty("application.properties", "username");
			protected static String password = utils.propertiesreader_util.readProperty("application.properties", "password");
			protected static String Propertyname = utils.propertiesreader_util.readProperty("application.properties", "Propertyname");
			protected static String address1 = utils.propertiesreader_util.readProperty("application.properties", "address1");
			protected static String address2 = utils.propertiesreader_util.readProperty("application.properties", "address2");
			protected static String Zipcode = utils.propertiesreader_util.readProperty("application.properties", "Zipcode");
			protected static String Phonenumber = utils.propertiesreader_util.readProperty("application.properties", "Phonenumber");						
			
			// Handle locator type
			public static By ByLocator(String locator) {
				By result = null;

				if (locator.startsWith("//")) {
					result = By.xpath(locator);
				} else if (locator.startsWith("css=")) {
					result = By.cssSelector(locator.replace("css=", ""));
				} else if (locator.startsWith("name=")) {
					result = By.name(locator.replace("name=", ""));
				} else if (locator.startsWith("link=")) {
					result = By.linkText(locator.replace("link=", ""));
				} else {
					result = By.id(locator);
				}
				return result;
			}
			
			// Handle click action
			public static void clickOn(String locator) {
				WaitForElementPresent(locator, timeout);
				WebElement el = getWebDriver().findElement(ByLocator(locator));
				el.click();
			}
			
			// Handle send keys action
			public static void sendKeys(String locator, String text) {
			    WaitForElementPresent(locator, timeout);
			    WebElement el = getWebDriver().findElement(ByLocator(locator));
			    el.clear();
			    el.sendKeys(text);
			}
			
			/***
			 * Wait for the locator presents and return the element object
			 * @param locator
			 * @param timeout
			 * @return element
			 */
			public static WebElement WaitForElementPresent(String locator, int timeout) {
				
				WebDriverWait wait = new WebDriverWait(utils.custom_util.getWebDriver(), timeout);
				WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(ByLocator(locator)));
				return element;
			}
			
			/***
			 * Wait for the page title present
			 * @param pagetitle
			 * @param timeout
			 * @return element
			 */
			public static boolean WaitForPageTitlePresent(String pagetitle, int timeout) {
				
				WebDriverWait wait = new WebDriverWait(utils.custom_util.getWebDriver(), timeout);
				Boolean element = wait.until(ExpectedConditions.titleContains(pagetitle));
				return element;
			}
			
			// Assert element present
			public static Boolean isElementPresent(String locator) {
				Boolean result = false;
				try {
					getWebDriver().findElement(ByLocator(locator));
					result = true;
				} catch (Exception ex) {
				}
				return result;
			}
			
			// Select value from drop down
			/***
			 * Select dropdown by text
			 * @param locator
			 * @param targetValue
			 */
			public static void selectDropDown(String locator, String targetValue) {
				Assert.assertTrue(isElementPresent(locator), "Element Locator :"
						+ locator + " Not found");
				custom_util.WaitForElementPresent(locator, 60);
				new Select(getWebDriver().findElement(ByLocator(locator)))
						.selectByVisibleText(targetValue);

			}
			
			//Wait for element visible
			public void WaitForElementVisible(String locator, int timeout) 
			{
				int i = 0;
				for (; i < timeout; i++) 
				{
					if (isElementPresent(locator)) 
					{ if (getWebDriver().findElement(ByLocator(locator)).isDisplayed()) break; }
					try 
					{ Thread.sleep(1000); } 
					catch (InterruptedException e) 
					{ e.printStackTrace(); }
				}
				if (i == timeout) Assert.fail(locator + " is not visible in given wait time.");		
			}
			
			//Get absolute path
			public String getPath()
			{
				String path ="";		
				File file = new File("");
				String absolutePathOfFirstFile = file.getAbsolutePath();
				path = absolutePathOfFirstFile.replaceAll("\\\\+", "/");		
				return path;
			}
			
			//capturing screenshot 
			public void captureScreenshot(String fileName) {
		        try {
					String screenshotName = this.getFileName(fileName);
		            FileOutputStream out = new FileOutputStream("screenshots//" + screenshotName + ".jpg");
		            out.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
		            out.close();
		            String path = getPath();
		            String  screen = "file://"+path+"/screenshots/"+screenshotName + ".jpg";
		            Reporter.log("<a href= '"+screen+  "'target='_blank' >" + screenshotName + "</a>");
		        } catch (Exception e) {
		 
		        }
			}
			
			//Creating file name
			public  String getFileName(String file){
				 DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				 Calendar cal = Calendar.getInstance();		 
				 String fileName = file+dateFormat.format(cal.getTime());
				 return fileName;
			 }
			
			//Print message on screen
			public void Log(String logMsg)
			{ System.out.println(logMsg); }
			
			//Wait for Text present within specified timeout
			public static void WaitForTextPresent(String text, int timeout) {
		    for (int i = 0; i < timeout; i++) {
			if (driver.getPageSource().contains(text))
			break;
			try {
			Thread.sleep(1000);
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
		   } 
		 }
		
		  // Handle mouse over action
		  public static void mouseOver(String locator) {
		  WaitForElementPresent(locator, 50);
		  WebElement el = getWebDriver().findElement(ByLocator(locator));
		  // build and perform the mouseOver with Advanced User Interactions API
		   Actions builder = new Actions(getWebDriver());
		   builder.moveToElement(el).build().perform();
		 }
		 
		  // Assert text present
		  public static boolean isTextPresent(String locator, String str) {
		  Assert.assertTrue(isElementPresent(locator), "Element Locator :"
			 + locator + " Not found");
		  String message = getWebDriver().findElement(ByLocator(locator))
			 .getText();
		  if (message.contains(str)) {
		  return true;
		  } else {
		  return false;
		   }
		}
		  
		 // Store text from a locator
		 public static String getText(String locator) {
		 WaitForElementPresent(locator, 20);
		 Assert.assertTrue(isElementPresent(locator), "Element Locator :"
			 + locator + " Not found");
		 String text = getWebDriver().findElement(ByLocator(locator)).getText();
		  return text;
		}

		  // Assert check box selected
		  public static boolean isChecked(String locator) {
		   boolean checkStatus = false;
		   WaitForElementPresent(locator, 20);
		   Assert.assertTrue(isElementPresent(locator), "Element Locator :"
			 + locator + " Not found");
		   WebElement el = getWebDriver().findElement(ByLocator(locator));
		   checkStatus = el.isSelected();
		   return checkStatus;
		 }

		  // Get attribute value
		  public String getAttribute(String locator, String attribute) {
		   WaitForElementPresent(locator, 20);
		   Assert.assertTrue(isElementPresent(locator), "Element Locator :"
			 + locator + " Not found");
		   String text = getWebDriver().findElement(ByLocator(locator))
			 .getAttribute(attribute);
		   return text;
		 }
		  
		public static String GetRandomValue() 
		{
			JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
			String value = js.executeScript("return new Date().getTime()").toString();
			return value;
		}
		
		// Store value from a locator
		  public static String getValue(String locator) {
		  WaitForElementPresent(locator, 20);
		  Assert.assertTrue(isElementPresent(locator), "Element Locator :"
		  + locator + " Not found");
		  String text = getWebDriver().findElement(ByLocator(locator)).getAttribute("value");
		  return text;
		  }
		
		
		private static boolean isAlertPresent() {
			try {
				getWebDriver().switchTo().alert();
				return true;
			} catch (NoAlertPresentException e) {
				return false;
			}
		}

		public static void acceptAlert(int sec) throws Exception {
			for (int i = 0; i < sec; i++) {
				if (isAlertPresent()) {
					Alert alert = getWebDriver().switchTo().alert();
					alert.accept();
					break;
				}
				Thread.sleep(1000);
			}
		}
		
		public static void AcceptAlert(int sec) throws Exception {
			  for (int i = 0; i < sec; i++) {
			   if (isAlertPresent()) {
			    Alert alert = getWebDriver().switchTo().alert();
			    alert.accept();
			    break;
			   }
			   Thread.sleep(1000);
			  }
			 }
		

         
         //Check if text is present
         public Boolean TextPresent(String text)
         {
             Boolean result = false;
             String message = driver.findElement(By.cssSelector("BODY")).getText();

             if (message.contains(text))
             { result = true; }

             return result;
         }
         
    public static void windowhandle(String waitelement, String url) throws InterruptedException
     {
      //Focus on the new window opened
   	  Set<String> windows = getWebDriver().getWindowHandles();
   	  String parent = null;
   	  String child = null;
   	  Iterator<String> it = windows.iterator();
   	   while(it.hasNext())
   	   {
   	       parent = (String) it.next();
   	       child = (String) it.next();
   	   }
   	  getWebDriver().switchTo().window(child);
   	  WaitForElementPresent(waitelement, timeout);
   	  Thread.sleep(5000);
   	  if(!getWebDriver().getCurrentUrl().contains(url)){
	  Assert.fail("User is redirected to incorrect url");}
   	  getWebDriver().close();
   	  
   	  //Switch back to main window
   	  getWebDriver().switchTo().window(parent);
   	
   }
    
  //Assert element present
  public Boolean isElementVisible(String locator) 
  	{
  		if(getWebDriver().findElement(ByLocator(locator)).isDisplayed())
  		{return true;}	
  		else{return false;} 		
  	}
  
//Switch frame
 public void switchFrame(String frameId) {
 getWebDriver().switchTo().frame(frameId);
}

 // Check if frames are present
 public boolean isFramePresent() {
  boolean result = false;
  try {
        driver.findElement(By.tagName("iframe"));
        result = true;
      } catch (Exception e) {
      }
      return result;
 }
 
 // Wait for frame to appear
 public void waitForFramePresent(int timeout) {
  int i = 0;
  for (; i < timeout; i++) {
  if (isFramePresent())
  break;
  try {
  Thread.sleep(1000);
  } catch (InterruptedException e) {
  e.printStackTrace();
 }
 }
 if (i == timeout)
  Assert.fail("No frame is present");
 }

 // Wait for frame not appear
 public void waitForFrameNotPresent(int timeout) {
  int i = 0;
  for (; i < timeout; i++) {
  if (!isFramePresent())
  break;
  try {
  Thread.sleep(1000);
  } catch (InterruptedException e) {
  e.printStackTrace();
  }
  }
  if (i == timeout)
  Assert.fail("Frame is present");
 }


//Handle focus action
public static void focusOnElement(String locator) {
		Actions action = new Actions(getWebDriver());
		WebElement el = getWebDriver().findElement(ByLocator(locator));
		WaitForElementPresent(locator, timeout);
		action.moveToElement(el).perform();
	}        

}
