package pages.week7.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.week7.day1.ProjectSpecificMethods;

public class FindLeadsPage extends ProjectSpecificMethods{
	
	public FindLeadsPage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	//EditLead
	public FindLeadsPage enterFirstName(String fname)
	{
		driver.findElement(By.xpath("//div[contains(@class,'x-tab-item')]//input[@name='firstName']"))
		.sendKeys(fname);
		return this;
	}
	
	
	//DuplicateLead
	public FindLeadsPage clickEmailTab() throws InterruptedException
	{
		driver.findElement(By.xpath("//em[@class='x-tab-left']//span[text()='Email']")).click();
		Thread.sleep(2000);
		return this;
	}
	//DuplicateLead
	public FindLeadsPage enterMailId(String mail)
	{
		driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name='emailAddress']"))
		.sendKeys(mail);
		return this;
	}
	
	//DeleteLead
	public FindLeadsPage clickPhoneTabAndEnterMobileNo(String phoneno)
	{
		driver.findElement(By.xpath("//span/span[text()='Phone']")).click();
		driver.findElement(By.xpath("//div/input[@name='phoneNumber']")).sendKeys(phoneno);
		return this;
	}
	
	
	//EditLead
	//DuplicateLead
	//DeleteLead
	public FindLeadsPage clickFindLeadButton() throws InterruptedException
	{
		driver.findElement(By.xpath("//em/button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		return this;
	}
	
	//EditLead
	//DuplicateLead
	public ViewLeadPage clickFirstResult() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-partyId')]/a[1]")).click();
		Thread.sleep(2000);
		return new ViewLeadPage(driver);
	}
	
	//DeleteLead
	public ViewLeadPage clickFirstResultOfDeleteLeadSearch() throws InterruptedException
	{
		String firstIdLink = driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-partyId')]/a[1]"))
				.getText();
		driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-partyId')]/a[1]")).click();
		Thread.sleep(2000);
		return new ViewLeadPage(driver,firstIdLink);
	}
	
	
	
	
	
	
}
