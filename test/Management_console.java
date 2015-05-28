package test;
import org.testng.annotations.Test;

import utils.custom_util;
public class Management_console extends custom_util {
//Description: This script will verify the functionality of search at back end with different search criteria when all radio button is selected.
	@Test (groups={"regression"}, alwaysRun=true)
	public void testmanagementconsolesearchall() throws Exception
	{
	try{
		//utils.managementconsole.testmanagementconsolesearchall();
		utils.managementconsole.testscriptformgmtsrch();
	}
	catch (Error e) {					
	e.printStackTrace();	
	throw e;
	}
	}
	
//Description: This script will verify the functionality of search at back end with different search criteria when active radio button is selected.
		@Test (groups={"regression"}, alwaysRun=true)
		public void testmanagementconsolesearchactive() throws Exception
		{
		try{
			utils.managementconsole.testmanagementconsolesearchactive();
		}
		catch (Error e) {					
		e.printStackTrace();	
		throw e;
		}
		}
		
//Description: This script will verify the functionality of search at back end with different search criteria when inactive radio button is selected.
				@Test (groups={"regression"}, alwaysRun=true)
				public void testmanagementconsolesearchinactive() throws Exception
				{
				try{
					utils.managementconsole.testmanagementconsolesearchinactive();
				}
				catch (Error e) {					
				e.printStackTrace();	
				throw e;
				}
				}

//Description: This script will verify the create account functionality and it will also verify the presence of entries on profile tab.
				@Test (groups={"regression"}, alwaysRun=true)
				public void testcreateaccount() throws Exception
				{
				try{
					utils.managementconsole.testcreateaccount("Executive Plus");
					utils.managementconsole.testcreateaccount("Executive");
					utils.managementconsole.testcreateaccount("Associate");
					utils.managementconsole.testcreateaccount("Silver/Private Party");
					}
				catch (Error e) {					
				e.printStackTrace();	
				throw e;
				}
				}

}
