package testcases.week7.day1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.week7.day1.ProjectSpecificMethods;
import pages.week7.day1.LoginPage;

public class DeleteLead extends ProjectSpecificMethods{

	@BeforeTest
	public void setFileName()
	{
		filename="DeleteLeads";
	}
	
	@Test(dataProvider="data")
	public void deleteLead(String mobile) throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername().enterPassword().clickLogin().clickCRM_SFALink().clickLeads()
		.clickFindLeads().clickPhoneTabAndEnterMobileNo(mobile)
		.clickFindLeadButton().clickFirstResultOfDeleteLeadSearch().clickDeleteButton()
		.checkTheLeadIsDeleted();
	}
	
}
