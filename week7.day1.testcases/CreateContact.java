package testcases.week7.day1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.week7.day1.ProjectSpecificMethods;
import pages.week7.day1.LoginPage;

public class CreateContact extends ProjectSpecificMethods{

	@BeforeTest
	public void setFilename()
	{
		filename="CreateContact";
	}
	
	@Test(dataProvider="data")
	public void createContact(String fname,String lname,String contactfname	,String contactlname, String depart,String desc,
			String mail, String city, String newdesc
			) throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername().enterPassword().clickLogin().clickCRM_SFALink()
		.clickContacts().clickCreateConatact()
		.enterRequiredAllContactDetails(fname, lname,contactfname, contactlname, depart, desc, mail, city)
		.clickCreateContactButton().clickEditButton().updatingTheDescription(newdesc);
		
	}
}
