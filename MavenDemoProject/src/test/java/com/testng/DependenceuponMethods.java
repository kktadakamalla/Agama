package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependenceuponMethods {

	@Test()
	public void login(){
		System.out.println("login");
		}

	@Test(dependsOnMethods="login")
	public void search(){
		System.out.println("search");
		Assert.assertEquals("abc", "abc");
		}

	@Test(dependsOnMethods="search", alwaysRun=true)
	public void logout(){
		System.out.println("logout");
		}

}