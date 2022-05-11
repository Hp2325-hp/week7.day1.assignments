package pages.week7.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.week7.day1.ProjectSpecificMethods;

public class ViewContactPage extends ProjectSpecificMethods{

	public ViewContactPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	//CreateContact
	//update the description
	public OpentapsCRMPage clickEditButton()
	{
		driver.findElement(By.xpath("//div/a[text()='Edit']")).click();
		
		return new OpentapsCRMPage(driver);
	}

}
