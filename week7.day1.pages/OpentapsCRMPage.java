package pages.week7.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.week7.day1.ProjectSpecificMethods;

public class OpentapsCRMPage extends ProjectSpecificMethods{

	public OpentapsCRMPage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	//EditLead
	public OpentapsCRMPage changeCompanyDetail(String cname)
	{
		driver.findElement(By.xpath("//td/input[@id='updateLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//td/input[@id='updateLeadForm_companyName']")).sendKeys(cname);
		return this;
	}
	//EditLead
	public ViewLeadPage clickUpdateButton()
	{
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}
	
	//CreateContact
	//Editing the important notes
	public ViewContactPage updatingTheDescription(String newdesc)
	{
		driver.findElement(By.id("updateContactForm_description")).clear();
		
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys(newdesc);
		
		driver.findElement(By.xpath("//tr//input[@name='submitButton']")).click();
		
		return new ViewContactPage(driver);
	}
	
}
