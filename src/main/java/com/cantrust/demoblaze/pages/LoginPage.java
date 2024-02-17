package com.cantrust.demoblaze.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cantrust.core.framework.SeleniumUtils;

public class LoginPage extends SeleniumUtils {
	
	// All the elements 
	@FindBy(id = "login2")
	WebElement loginLinkEle;
	
	@FindBy(xpath ="//Input[@id='loginusername']")
	WebElement userNameTxtBox;
	
	@FindBy(id="loginpassword")
	WebElement passwordTxtBox;
	
	@FindBy(xpath="//button[@onclick='logIn()']")
	WebElement clkloginbtn;
	
	public LoginPage(WebDriver driver){ 
		webDriver = driver;
		PageFactory.initElements(webDriver,this); 
	}
	 
	
	public boolean loginaction()
	{
		clickOnElement(loginLinkEle);
		typeText(userNameTxtBox, "Bpass");
		typeText(passwordTxtBox,"bpass123");
		clickOnElement(clkloginbtn);
		String expectedAlertMsg = "invaildpassword";
		boolean flag = validateAlertMsg(expectedAlertMsg);
		return flag;
	 }
	

}
