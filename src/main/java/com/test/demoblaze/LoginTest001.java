package com.test.demoblaze;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest001 {
	
	// Dataprovider
	
	@DataProvider(name="loginData")
	public Object[][] getLoginData() {
		
		// Number of paramerts = 2
		// Two sets of data = 3
		
		Object[][] data = new Object[3][2];
		
		data[0][0] = "beant123";
		data[0][1] = "test";
		
		data[1][0] = "xyz23";
		data[1][1] = "abc";
		

		data[2][0] = "xyz23";
		data[2][1] = "abc";
		
		return data;
		
		
	}
	
	
	@Test(dataProvider="loginData")
	public void loginTest(String userName, String password) {
		// TestData - userName, password
		
		System.out.println("user name = "+userName);
		System.out.println("password = "+password);
	}
	

}
