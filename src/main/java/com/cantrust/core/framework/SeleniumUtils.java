package com.cantrust.core.framework;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtils extends BrowserUtils {

	// CLick
	public static void clickOnElement(WebElement loginLinkEle) {
		WebDriverWait webwait = new WebDriverWait(webDriver,Duration.ofSeconds(20));
		WebElement elements=null;
		elements = webwait.until(ExpectedConditions.elementToBeClickable(loginLinkEle));
		elements.click();
	}

	// alert
	public static String alerthandle(String action, String data) {
		String s1 = null;
		Alert alert = webDriver.switchTo().alert();
		switch (action) {
		case "Dismiss":
			alert.dismiss();
			break;
		case "Accept":
			alert.accept();
			break;
		case "gettext":
			s1 = alert.getText();
			break;
		case "sentdata":
			alert.sendKeys(data);
			break;
		default:
			System.out.println("invaild parameter");
			break;
		}

		return s1;
	}

	// sendkey method
	public void typeText(WebElement TxtBoxurl, String data) {
		TxtBoxurl.click();
		TxtBoxurl.clear();
		TxtBoxurl.sendKeys(data);
	}

	// Selecting value from the Drop down
	public static void selectdpdlist(WebElement ele, String value) {
		Select drp = new Select(ele);
		drp.selectByValue(value);
	}

	// Validating the page title
	public static boolean validatetitle(String expectedTitle) 
	{
		String Actualtitle = webDriver.getTitle();
		if (Actualtitle.equals(expectedTitle))
		{
			return true;
		}else
			return false;
	}
	
	public static boolean validateAlertMsg(String expectedAlertMsg) {
		String actualAlertMsg = alerthandle("gettext", "");
		boolean flag = (actualAlertMsg.equals(expectedAlertMsg)) ? true : false;
		return flag;
	}

	// Get the Page title
	public static void getTitle()
	{
		webDriver.getTitle();
	}

	// Get the current page url
	public static void getcurrentURL() {
		webDriver.getCurrentUrl();
	}
	// File upload

	// Tables

	// Explicit waits
	public void explicitwait(By by)
	{
		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	//add product
	public void addproduct(WebElement product, WebElement addtocart)
	{
		product.click();
		addtocart.click();
	}
	
	
	
}
