package pages.week7.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.week7.day1.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods{
	
	
	private String fid;
	public MyLeadsPage(ChromeDriver driver) { this.driver=driver; }
	 
	public MyLeadsPage(ChromeDriver driver, String fid) {
		this.driver=driver;
		this.fid=fid;
	}

	//CreateLead
	public CreateLeadPage clickCreateLead()
	{
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);
	}
	//EditLead
	//DuplicateLead
	//DeleteLead
	public FindLeadsPage clickFindLeads() throws InterruptedException
	{
		driver.findElement(By.xpath("//div//a[text()='Find Leads']")).click();
		Thread.sleep(2000);
		return new FindLeadsPage(driver);
	}
	
	//DeleteLead
	//Check the Lead is deleted or not
	public void checkTheLeadIsDeleted() throws InterruptedException
	{
		driver.findElement(By.xpath("//div//a[text()='Find Leads']")).click();
		Thread.sleep(2000);
		//searching the lead
		driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name='id']")).sendKeys(fid);
		driver.findElement(By.xpath("//em/button[text()='Find Leads']")).click();
		Thread.sleep(2000);

		String result = driver
				.findElement(By.xpath("//div[contains(@class,'x-small-editor')]//div[@class='x-paging-info']"))
				.getText();
		Thread.sleep(2000);

		System.out.println(result);
		//record deleted confirmation
		if (result.equals("No records to display"))
			System.out.println(fid + " Id is deleted");
		else
			System.out.println("Id is not deleted");
	}

}
