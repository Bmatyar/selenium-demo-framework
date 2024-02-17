package com.test.demoblaze;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestCast1 {

	@Test
	public void loginC() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@id='login2']")).click();

	
		driver.findElement(By.xpath("//Input[@id='loginusername']")).sendKeys("beant123");
		Thread.sleep(2000);
		driver.findElement(By.id("loginpassword")).sendKeys("bpass123");
		driver.findElement(By.xpath("//button[@onclick='logIn()']")).click();

		WebElement userval = (new WebDriverWait(driver, Duration.ofSeconds(20)))
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser")));

		String Actualresult = userval.getText();
		String Expectedresult="Welcome beant1234";
		System.out.println("actual result = " + Actualresult);

		Assert.assertEquals(Actualresult,Expectedresult,"Welcome message don't match");

		driver.close();

	}
}
