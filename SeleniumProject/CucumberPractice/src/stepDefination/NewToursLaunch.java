package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewToursLaunch 

{  
	    FirefoxDriver driver; 
	@Given("^LaunchNewTours$")
	public void LaunchNewTours()
	{
	    // Express the Regexp above with the code you wish you had
	    driver = new FirefoxDriver();
	    driver.get("http://newtours.demoaut.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);    
	    
	}

	@When("^LogInNewTours$")
	public void LogInNewTours() 
	{
	    // Express the Regexp above with the code you wish you had
	    driver.findElement(By.name("userName")).sendKeys("tutorial");
	    driver.findElement(By.name("password")).sendKeys("tutorial");
	    driver.findElement(By.name("login")).click();	
	}

	@Then("^LogoutNewTours$")
	public void LogoutNewTours() 
	{
	    // Express the Regexp above with the code you wish you had
		
		
		
	}


}
