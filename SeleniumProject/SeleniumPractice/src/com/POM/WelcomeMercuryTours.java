package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//This is an ObjectRepository class for POM to list out elements and operations on those elements 
public class WelcomeMercuryTours

{
	@FindBy(linkText="SIGN-ON")
	WebElement signon; 
	
	public void signOn()
	{
		
		signon.click();
		
	}	
	
			
}
