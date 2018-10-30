package com.DataDrivenNewTours;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataDriven 
{

	FirefoxDriver driver;
	
	@BeforeTest
		public void LaunchNewTours1()
		
	{
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@Test 
		public void SignIn()
	
	{
		driver.findElement(By.name("userName")).sendKeys("tutor");
		driver.findElement(By.name("password")).sendKeys("tutor");
		driver.findElement(By.name("login")).click();		
				
	}
	
	
	
}
