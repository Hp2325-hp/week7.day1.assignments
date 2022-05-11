package testcases.week7.day1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.week7.day1.ProjectSpecificMethods;
import pages.week7.day1.LoginPage;

public class CreatingLead extends ProjectSpecificMethods{

	@BeforeTest
	public void setFilename()
	{
		filename="leadsDetails";
	}
	
	@Test(dataProvider="data")
	public void createLead(String cname,String fname,String lname,String depart,String desc
			,String mail) throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername().enterPassword().clickLogin().clickCRM_SFALink().clickLeads()
		.clickCreateLead().enterLastName(lname).enterFirstName(fname).enterCompanyName(cname)
		.enterDepartDescAndMail(depart,desc,mail).selectCountry("New York")
		.clickCreateLeadButton();
	}
	
	
}
