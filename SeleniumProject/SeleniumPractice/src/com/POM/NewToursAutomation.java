package com.POM;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewToursAutomation 

{
	FirefoxDriver driver;
	
	@BeforeTest
	public void Setup()
	
	{
		 driver = new FirefoxDriver();
		 driver.get("http://newtours.demoaut.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
	}

	@Test
	public void SignonTesting()
	
	{
		WelcomeMercuryTours WMT = PageFactory.initElements(driver, WelcomeMercuryTours.class);
		WMT.signOn();
		
	}

}



