package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependenceuponMethods {

@Test
	public void login() {
		  System.out.println("Login");
		    }
@Test(dependsOnMethods="login")
	  public void Search() {
		  System.out.println("Search");
		  Assert.assertEquals("xyz", "abc");
}
		 @Test(dependsOnMethods="search",alwaysRun=true)
	  
	  public void logout() {
		  System.out.println("Logout");
	  }

}