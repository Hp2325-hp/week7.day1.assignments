package testcases.week7.day1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.week7.day1.ProjectSpecificMethods;
import pages.week7.day1.LoginPage;

public class DuplicateLead extends ProjectSpecificMethods{

	@BeforeTest
	public void setFilename()
	{
		filename="DuplicateLeads";
	}
	
	@Test(dataProvider="data")
	public void duplicateLead(String mail) throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername().enterPassword().clickLogin().clickCRM_SFALink()
		.clickLeads().clickFindLeads().clickEmailTab().enterMailId(mail).clickFindLeadButton()
		.clickFirstResult().clickDuplicateLeadButton().clickCreateLeadButton();
		
	}
}
