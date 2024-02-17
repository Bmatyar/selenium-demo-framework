package com.cantrust.demoblaze.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cantrust.core.framework.SeleniumUtils;

public class SignUpPage extends SeleniumUtils{

	@FindBy(id = "signin2")
	WebElement signuplink;
	
	@FindBy(id="sign-username")
	WebElement signTxtBox;
	
	@FindBy(id="sign-password")
	WebElement passtxtBox;
	
	@FindBy(xpath="//button[@onclick='register()']")
	WebElement signupbtnClick;
	
	public SignUpPage(WebDriver webDriver){
		PageFactory.initElements(webDriver, LoginPage.class);
		
	}
	
	public void SignupAction()
	{
		clickOnElement(signuplink);
		typeText(signTxtBox, "Bpass");
		typeText(passtxtBox,"bpass123");
		clickOnElement(signupbtnClick);	
	}
}
