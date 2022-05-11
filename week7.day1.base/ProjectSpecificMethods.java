package base.week7.day1;

import java.io.IOException;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.week7.day1.day2.ReadExcel;

public class ProjectSpecificMethods {

	public ChromeDriver driver;
	public String filename;

	@DataProvider(name = "data")
	public String[][] getData() throws IOException {
		return ReadExcel.readExcel(filename);
	}

	@BeforeMethod
	public void preCondition() throws IOException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@AfterMethod(enabled = false)
	public void postCondition() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();

	}

}
