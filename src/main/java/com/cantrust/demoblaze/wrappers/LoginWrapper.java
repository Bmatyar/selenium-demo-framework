package com.cantrust.demoblaze.wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.cantrust.core.framework.BrowserUtils;

public class LoginWrapper extends BrowserUtils {
	
	String username;
	String password;
	public void signupdata(String uname, String pwd)
	{
		 username=uname;
		 password=pwd;
		 System.out.println(username);
		 System.out.println(password);
		
	}
	public void clickOnLoginLink() throws InterruptedException {
		
			
		
		WebElement loginLink = webDriver.findElement(By.id("login2"));
		loginLink.click();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("//Input[@id='loginusername']")).sendKeys(username);
		webDriver.findElement(By.id("loginpassword")).sendKeys(password);
		webDriver.findElement(By.xpath("//button[@onclick='logIn()']")).click();

	}

}
