package testcases.week7.day1;

import org.testng.annotations.Test;

import base.week7.day1.ProjectSpecificMethods;
import pages.week7.day1.LoginPage;

public class Login extends ProjectSpecificMethods{
	
	@Test
	public void loginTesting()
	{
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername().enterPassword().clickLogin();
	}

}
