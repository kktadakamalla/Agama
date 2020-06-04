package com.testng;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WrapperMethods {

	
	WebDriver driver;
	public void insertapp(String url)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tvnag\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		//Maximize  the window
		//driver.manage().window().maximize();
		//Implicit Wait 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
	}

		public void enterbyid(String val,String name)
	{
			driver.findElement(By.id(val)).sendKeys(name);
	}
			
		public void clickbyxpath(String val1)
	{
			driver.findElement(By.xpath(val1)).click();
	}
		public void selectdropdown1(String text) {
			  
			Select UserRole = new Select(driver.findElement(By.id("searchSystemUser_userType")));
			 
			  UserRole.selectByVisibleText(text);
			  
		  }
		public void closeapp() 
	{
			driver.close();
	}
		public void takesnap(String path) throws IOException 
	{
			TakesScreenshot ts =(TakesScreenshot)driver;
		    File source = ts.getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(source,new File((path)));
	}
		
		    public void Fileupload(String id,String path) 
		    {
		    	
		    	driver.findElement(By.id(id)).sendKeys(path);
		    }
		    
		    
}



