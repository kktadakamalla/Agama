package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyboardHandling {

	@Test
	public void login() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tvnag\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
	Actions action=new Actions(driver);
	action.sendKeys(Keys.TAB).perform();
	action.sendKeys("abcd").perform();
	action.sendKeys(Keys.ENTER).perform();

	}
}
