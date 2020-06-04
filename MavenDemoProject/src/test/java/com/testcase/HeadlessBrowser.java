package com.testcase;


import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessBrowser {

	public static void main(String[] args) {
		//WebDriver driver = new HtmlUnitDriver();
		HtmlUnitDriver driver = new HtmlUnitDriver();
		driver.get("https://www.google.com/");
		//System.out.println(driver.getTitle());
		System.out.println("Title of the page is " + driver.getTitle());


	}

}
