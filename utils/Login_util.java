package utils;

public class Login_util extends custom_util {
	//This method perform login for the entered user credentials
		public static void login(String username, String password)
		{
			getWebDriver().navigate().to(LOGINURL);
			WaitForElementPresent(locators.Backend_loc.LOGINBTN, timeout);
			sendKeys(locators.Backend_loc.USERNAME, username);
			sendKeys(locators.Backend_loc.PASSWORD, password);
			clickOn(locators.Backend_loc.LOGINBTN);
			WaitForElementPresent(locators.Backend_loc.LOGOUTBTN, timeout);
}
		//This Method performs Log Out functionality
		public static void Logout()
		{
			WaitForElementPresent(locators.Backend_loc.LOGOUTBTN, timeout);
			clickOn(locators.Backend_loc.LOGOUTBTN);
			WaitForElementPresent(locators.Backend_loc.LOGINBTN, timeout);
			getWebDriver().manage().deleteAllCookies();
			
			
		}
}	
		

