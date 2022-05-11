package pages.week7.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.week7.day1.ProjectSpecificMethods;

public class DuplicateLeadPage extends ProjectSpecificMethods{

	public DuplicateLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	//DuplicateLead
	public ViewLeadPage clickCreateLeadButton() throws InterruptedException
	{
		driver.findElement(By.xpath("//td/input[@value='Create Lead']")).click();
		Thread.sleep(2000);
		return new ViewLeadPage(driver);
	}

}
