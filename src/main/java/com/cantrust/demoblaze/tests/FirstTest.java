package com.cantrust.demoblaze.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.cantrust.core.framework.SeleniumUtils;
import com.cantrust.demoblaze.pages.LoginPage;
import com.cantrust.demoblaze.pages.SignUpPage;

public class FirstTest extends SeleniumUtils {
	
	
	public WebDriver driver = null;
	
	@Test(priority=1)
	public void singupTest() throws InterruptedException, IOException 
	{
		// Launch browse
		driver = new ChromeDriver();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\Properties\\config.properties");
		Properties pro=new Properties();
		pro.load(fis);
		
		
		driver.get(pro.getProperty("url"));
		
		//call loginAcation
		LoginPage lg=new LoginPage(driver);
		lg.loginaction();		
		
		//call SignUp
		SignUpPage snup=new SignUpPage(driver);
		snup.SignupAction();
		
		
		
		/*SignUp with correct username and password
		SignUpWrapper signup=new SignUpWrapper();
		signup.clickSignUp();
		Thread.sleep(2000);
		
		// Click on Login link
		LoginWrapper login = new LoginWrapper();
		login.clickOnLoginLink();*/
	
	}
	/*@Test
		public void cleanup() 
		{
			driver.close();
		}*/
		


}
