package LaunchApplication;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
//import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LaunchNewTours {

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
	
		public void Naviback()
		
	{
			driver.navigate().back();
			
	}
	
				
	/* @Test
	
		public void feedExcel() throws IOException
		
	{
		FileInputStream file1 = new FileInputStream(System.getProperty("user.dir")+"\\src\\LaunchApplication\\Narasimha.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file1);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		int Rowcount =  sheet.getLastRowNum();
		
		for (int j=0; j<Rowcount; j++)
			
		{
			Row r = sheet.getRow(j);
			int Cellcount = r.getLastCellNum();
			
			for (int k=0; k<Cellcount; k++)
				
			{
				String data = r.getCell(k).getStringCellValue();
				System.out.println(data);
				
				
			}
			
		}
		
		
	} */
	
	@AfterTest
		public void Cloermi()
	{
		
		driver.close();
		
	}
	
	
}
