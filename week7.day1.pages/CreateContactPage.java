package pages.week7.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import base.week7.day1.ProjectSpecificMethods;

public class CreateContactPage extends ProjectSpecificMethods{

	public CreateContactPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	//CreateContact
	public CreateContactPage enterRequiredAllContactDetails(String fname,String lname,String localfname,String locallname
			,String depart,String desc, String mail, String country)
	{
		//provide first name
		driver.findElement(By.id("firstNameField")).sendKeys(fname);
		//providing last name
		driver.findElement(By.id("lastNameField")).sendKeys(lname);
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys(localfname);
		//providing last local name
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys(locallname);
		//Department
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys(depart);
		//Description
		driver.findElement(By.id("createContactForm_description")).sendKeys(desc);
		//mail id 
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys(mail);
		//state selection
		WebElement we=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		
		Select s=new Select(we);
		s.selectByVisibleText(country);
		
		return this;
	}
	
	//CreateContact
	public ViewContactPage clickCreateContactButton()
	{
		driver.findElement(By.xpath("//td/input[@name='submitButton']")).click();
		
		return new ViewContactPage(driver);
	}

}
