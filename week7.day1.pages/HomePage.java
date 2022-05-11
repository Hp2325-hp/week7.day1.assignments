package pages.week7.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.week7.day1.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{

	
	  public HomePage(ChromeDriver driver) { this.driver=driver; }
	 
	//common page
	public MyHomePage clickCRM_SFALink()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
	}
}
