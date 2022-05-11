package pages.week7.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.week7.day1.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods{

	
	  public MyHomePage(ChromeDriver driver) { this.driver=driver; }
	 
	//CreateLead
	public MyLeadsPage clickLeads() throws InterruptedException
	{
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(3000);
		return new MyLeadsPage(driver);
	}
	
	//CreateContact
	public ContactsPage clickContacts()
	{
		driver.findElement(By.xpath("//div/a[text()='Contacts']")).click();
		return new ContactsPage(driver);
		
	}
}
