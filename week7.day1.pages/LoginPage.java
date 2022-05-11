package pages.week7.day1;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import base.week7.day1.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{

	public LoginPage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	//common page
	public LoginPage enterUsername()
	{
		driver.findElement(By.id("username")).sendKeys();
		return this;
	}
	//common page
	public LoginPage enterPassword()
	{
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}
	//common page
	public HomePage clickLogin()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage(driver);
	}
	
}
