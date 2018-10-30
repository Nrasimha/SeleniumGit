package com.HybridFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewToursHybrid
{

	FirefoxDriver driver; 
	Properties pr; 
	FileInputStream file1;
	FileInputStream file2;
		
	@Test(priority=1)
	
	public void Launch()
	{
	driver = new FirefoxDriver();
	driver.get("http://newtours.demoaut.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@Test(priority=2)
	public void signin() throws IOException
	{
	file1= new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\HybridFramework\\Properities1");
	file2= new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\HybridFramework\\Narasimha.xlsx");
	XSSFWorkbook workBook= new XSSFWorkbook(file2);
	XSSFSheet sheet1 = workBook.getSheet("sheet1");
	Row r = sheet1.getRow(1);
	String UN = r.getCell(0).getStringCellValue();
	String PW = r.getCell(1).getStringCellValue();
			
	Properties pr = new Properties(); 
	pr.load(file1);
	driver.findElement(By.name(pr.getProperty("userName"))).sendKeys(UN);
	driver.findElement(By.name(pr.getProperty("password"))).sendKeys(PW);
	driver.findElement(By.name(pr.getProperty("SignIn"))).click();
	driver.navigate().back();
	
	} 
	
	@Test(priority=3)
	public void Register() throws IOException
	{
		file1= new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\HybridFramework\\Properities1");
		Properties pr = new Properties(); 
		pr.load(file1);
		driver.findElement(By.linkText("REGISTER")).click();
		file2= new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\HybridFramework\\Narasimha.xlsx");
		XSSFWorkbook workBook= new XSSFWorkbook(file2);
		XSSFSheet sheet3 = workBook.getSheet("sheet2");
			
			Row r = sheet3.getRow(1);
			driver.findElement(By.name(pr.getProperty("FirstName"))).sendKeys(r.getCell(0).getStringCellValue());
			//driver.findElement(By.name(pr.getProperty("FirstName"))).sendKeys("Narasimha");
			driver.findElement(By.name(pr.getProperty("LastName"))).sendKeys(r.getCell(1).getStringCellValue());
			//driver.findElement(By.name(pr.getProperty("phone"))).sendKeys(r.getCell(2).getNumericCellValue());
			driver.findElement(By.name(pr.getProperty("Email"))).sendKeys(r.getCell(3).getStringCellValue());
			driver.findElement(By.name(pr.getProperty("Address"))).sendKeys(r.getCell(4).getStringCellValue());
			driver.findElement(By.name(pr.getProperty("City"))).sendKeys(r.getCell(5).getStringCellValue());
			driver.findElement(By.name(pr.getProperty("State"))).sendKeys(r.getCell(6).getStringCellValue());
			driver.findElement(By.name(pr.getProperty("PostalCode"))).sendKeys(r.getCell(7).getStringCellValue());
			driver.findElement(By.name(pr.getProperty("Country"))).sendKeys(r.getCell(8).getStringCellValue());
			driver.findElement(By.name(pr.getProperty("UserName"))).sendKeys(r.getCell(9).getStringCellValue());
			driver.findElement(By.name(pr.getProperty("Password"))).sendKeys(r.getCell(10).getStringCellValue());
			driver.findElement(By.name(pr.getProperty("ConfirmPassword"))).sendKeys(r.getCell(11).getStringCellValue());
			driver.findElement(By.name(pr.getProperty("Sumbit"))).click();
						
	}
	
}	