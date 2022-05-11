package pages.week7.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.week7.day1.ProjectSpecificMethods;


public class ViewLeadPage extends ProjectSpecificMethods {

	String fid;
	public ViewLeadPage(ChromeDriver driver)
	{
		this.driver=driver;
		
	}
	
	public ViewLeadPage(ChromeDriver driver, String firstIdLink) {
		this.driver=driver;
		this.fid=firstIdLink;
	}

	//EditLead
	public OpentapsCRMPage clickOnEditButton() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[text()='Edit']")).click();
		Thread.sleep(2000);
		return new OpentapsCRMPage(driver);
	}
	//EditLead
	//Verify company change done
	public void confirmingCompanyNameChange(String newcompanyname)
	{
		String company_name = driver.findElement(By.xpath("//td/span[@id='viewLead_companyName_sp']")).getText();
		System.out.println(company_name);

		int length = newcompanyname.length();
		String temp = company_name.substring(0, length);
		company_name = temp;
		//verify the company is same or not
		if (company_name.equals(newcompanyname))
			System.out.println("Company name updated");
		else
			System.out.println("Company name not updated");
	}
	
	//DuplicateLead
	public DuplicateLeadPage clickDuplicateLeadButton() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[text()='Duplicate Lead']")).click();
		Thread.sleep(2000);
		return new DuplicateLeadPage(driver);
	}
	
	//DeleteLead
	public MyLeadsPage clickDeleteButton() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[text()='Delete']")).click();
		Thread.sleep(2000);
		return new MyLeadsPage(driver,fid);
	}
	
	
}
