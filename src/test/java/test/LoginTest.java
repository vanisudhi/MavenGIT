package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest 
{
	public static WebDriver driver;
	
	@BeforeMethod
	public void preCondition()
	{
		System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@Test
	public void Open()
	{
		driver.get("http://www.gmail.com");
	}
	
	@AfterMethod
	public void PostCondition()
	{
		driver.quit();
	}
	

}
