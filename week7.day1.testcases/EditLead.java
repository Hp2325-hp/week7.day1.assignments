package testcases.week7.day1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.week7.day1.ProjectSpecificMethods;
import pages.week7.day1.LoginPage;

public class EditLead extends ProjectSpecificMethods{

	@BeforeTest
	public void setFilename()
	{
		filename="EditLeads";
	}
	
	@Test(dataProvider="data")
	public void editLead(String fname,String cname) throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername().enterPassword().clickLogin().clickCRM_SFALink()
		.clickLeads().clickFindLeads().enterFirstName(fname).clickFindLeadButton()
		.clickFirstResult().clickOnEditButton().changeCompanyDetail(cname).clickUpdateButton()
		.confirmingCompanyNameChange(cname);
		
	}
	
}
