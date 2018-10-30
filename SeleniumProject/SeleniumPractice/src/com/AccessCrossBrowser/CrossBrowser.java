package com.AccessCrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CrossBrowser

{
	@Test(priority=1)
	
	public void FirefoxDriver1()
	
	{		
		FirefoxDriver driver1 = new FirefoxDriver();
		driver1.get("http://newtours.demoaut.com");
		driver1.close();
	}
	
	
	@Test(priority=2)
	public void GoogleChrome()
	
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\CrossBrowsers\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver",System.getProperty("C:\\Users\\narsi\\Desktop\\Practice\\SeleniumProject\\SeleniumPractice\\CrossBrowsers\\chromedriver.exe"));
		ChromeDriver driver2= new ChromeDriver();
		driver2.get("http://facebook.com");
		driver2.quit();
			
	}

	@Test(priority=3)
	public void EdgeBrowser()
	
	{
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+ "\\CrossBrowsers\\MicrosoftWebDriver.exe");
		EdgeDriver driver3= new EdgeDriver();
		driver3.get("http://gmail.com");
		driver3.quit();
		
	}
	
}




