package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroups {	
	@Test(groups= {"smoketesting", "sanitytesting"})
	public void login() {
		  System.out.println("Login");
		    }
@Test(groups= {"smoketesting", "regressiontesting"})
	  public void Search() {
		  System.out.println("Search");
		  Assert.assertEquals("abc", "abc");
}
		 @Test(groups= {"regressiontesting", "retesting"})
	  
	  public void logout() {
		  System.out.println("Logout");
	  }
	
}

