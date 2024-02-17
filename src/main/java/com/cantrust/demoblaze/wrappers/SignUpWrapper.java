package com.cantrust.demoblaze.wrappers;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.cantrust.core.framework.BrowserUtils;
import com.cantrust.core.framework.SeleniumUtils;
import com.cantrust.demoblaze.utils.DataUtils;
import com.github.javafaker.Faker;

public class SignUpWrapper extends SeleniumUtils {

	@Test
	public void clickSignUp() throws InterruptedException {
		webDriver.findElement(By.id("signin2")).click();
		// FakerClass

		Thread.sleep(2000);
		//typeText(By.id("sign-username"), DataUtils.getRandomUserName());
		//webDriver.findElement(By.id("sign-username")).sendKeys(DataUtils.getRandomUserName());
		//typeText(By.id("sign-password"), DataUtils.getRandomPassword());
		//webDriver.findElement(By.id("sign-password")).sendKeys(DataUtils.getRandomPassword());

		webDriver.findElement(By.xpath("//button[@onclick='register()']")).click();
		Thread.sleep(2000);
		SeleniumUtils.alerthandle("Accept","Null");
		//Alert alert = webDriver.switchTo().alert();
		//alert.accept();
		// Add a validation to verify the singup successful message
		//LoginWrapper login = new LoginWrapper();
		//login.signupdata(username, password);
	}
}
