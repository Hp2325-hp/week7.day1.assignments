package pages.week7.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import base.week7.day1.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods{
	
	
	  public CreateLeadPage(ChromeDriver driver) { this.driver=driver; }
	 
	//CreateLead
	public CreateLeadPage enterFirstName(String fname)
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		return this;
		
	}
	//CreateLead
	public CreateLeadPage enterLastName(String lname)
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		return this;
	}
	//CreateLead
	public CreateLeadPage enterCompanyName(String cname)
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		return this;
	}
	//CreateLead
	public CreateLeadPage enterDepartDescAndMail(String depart,String desc,String mail)
	{
		//depart
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys(depart);
		// description
		driver.findElement(By.id("createLeadForm_description")).sendKeys(desc);
		// mail id
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(mail);
		return this;
	}
	//CreateLead
	public CreateLeadPage selectCountry(String country)
	{
		WebElement we = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select s = new Select(we);
		s.selectByVisibleText(country);
		return this;
	}
	//CreateLead
	public ViewLeadPage clickCreateLeadButton()
	{
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}

}
