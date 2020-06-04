package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testngexample {

	//WebDriver driver;
	
	//@BeforeClass
	//public void setup() {
		
		
	WrapperMethods wm = new WrapperMethods();
	  @Test(priority=1)
	  public void loginPage() {
		  wm.enterbyid("txtUsername", "admin");
		  wm.enterbyid("txtPassword", "admin123");
		  wm.clickbyxpath("//*[@id=\'btnLogin\']");
	  }
	  @Test(priority=2)
	  public void adminPage() {
		  wm.clickbyxpath("//*[@id=\"menu_admin_viewAdminModule\"]/b");
		  //wm.clickbyxpath("menu_admin_UserManagement");
		  wm.enterbyid("searchSystemUser_userName", "Krishna");
		  wm.clickbyxpath("//*[@id=\"searchSystemUser_userType\"]");
		  wm.selectdropdown1("Admin");
		  wm.enterbyid("searchSystemUser_employeeName_empName", "Kumari");
		  wm.clickbyxpath("//*[@id=\"searchBtn\"]");
		  }
	  
	  
	  @BeforeClass
	  public void openPage() {
		  wm.insertapp("https://opensource-demo.orangehrmlive.com/");
	
	  }
}
