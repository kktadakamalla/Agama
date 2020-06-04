package com.testcase;

import java.io.IOException;

public class CallWrapper {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		
			WrapperMethods wm = new WrapperMethods();
			wm.insertapp("https://opensource-demo.orangehrmlive.com/");
			wm.enterbyid("txtUsername", "Admin");
			wm.enterbyid("txtPassword", "admin123");
			wm.clickbyxpath("//*[@id=\"btnLogin\"]");
			wm.clickbyxpath("//*[@id=\"menu_pim_viewPimModule\"]/b");
			
			wm.clickbyxpath("//*[@id=\'btnAdd\']");
			Thread.sleep(1000);
			System.out.println("after");
			wm.enterbyid("firstName", "krishna");
			wm.enterbyid("middleName", "Kumari");
			wm.enterbyid("lastName", "Tad");
			System.out.println("after1111");
			wm.Fileupload("photofile", "C:\\Users\\tvnag\\Documents\\Agama Solutions\\Screenshots\\orange3.png");
			wm.clickbyxpath("//*[@id=\'btnSave\']");
			Thread.sleep(1000);
			
			//wm.clickbyxpath("//*[@id=\'photofile\']");
			wm.takesnap("C:\\Users\\tvnag\\Documents\\Agama Solutions\\Screenshots\\orange5.png");

	}
}

	


