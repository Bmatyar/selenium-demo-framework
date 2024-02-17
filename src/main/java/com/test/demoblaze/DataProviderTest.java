package com.test.demoblaze;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@DataProvider(name="userData")
	public Object[][] getUserData() throws IOException{
		ExcelReader reader = new ExcelReader();
		Object[][] data = reader.getUserInfoDataAsObjectArray();
		
		return data;
	}
	
	@Test(dataProvider="userData")
	public void loginTest(String userNanme, String password) {
		
	}

}
