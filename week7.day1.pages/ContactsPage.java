package pages.week7.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.week7.day1.ProjectSpecificMethods;

public class ContactsPage extends ProjectSpecificMethods{

	public ContactsPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	//CreateContact
	public CreateContactPage clickCreateConatact()
	{
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		return new CreateContactPage(driver);
	}

}
