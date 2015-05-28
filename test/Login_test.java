package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.custom_util;

public class Login_test extends custom_util{

	//Description: This script covers login/logout functionality for 150,120,80 and 10 level users in CHC
	@DataProvider(name="users")
	public Object[][] testdata(){
		return new Object[][]{
				{superadminusername,superadminpassword, true},
				{username1,userpassword, true},
				{username2,userpassword, true},
				{username3,userpassword, true},
				{username4,userpassword, true},
				{username5,userpassword, true},
				{username6,userpassword, true},
				{username7,userpassword, true},
				{username8,userpassword, true}
				
				};
	}
	@Test (alwaysRun=true, dataProvider="users")
	public void testloginlogout(String username ,String password, boolean users) throws Exception
	{
		try {
			if(users)
			{
			   //Login
			   utils.Login_util.login(username, password);
			   //Logout
			   utils.Login_util.Logout();
			}   
		
		}
		catch (Error e) {					
			captureScreenshot("testloginlogout");	
			throw e;
		}
	}

	//This script will verify the User Active (YES OR NO) functionality
	@Test (groups={"regression"}, alwaysRun=true)
	public void testuseractive() throws Exception
	{
		try {
			 utils.Backend_util.useractive();
		}
		catch (Error e) {					
			captureScreenshot("testloginlogout");	
			throw e;
		}
	}
}
