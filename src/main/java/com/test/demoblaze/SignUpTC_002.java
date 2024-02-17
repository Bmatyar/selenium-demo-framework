package com.test.demoblaze;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class SignUpTC_002 {

	@Test
	void signup2() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("signin2")).click();
		
		//FakerClass
		Faker fake=new Faker();
		String username=fake.name().username();
		String password=fake.internet().password();
		
		Thread.sleep(2000);
		driver.findElement(By.id("sign-username")).sendKeys(username);
		driver.findElement(By.id("sign-password")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[@onclick='register()']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();		
		alert.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@id='login2']")).click();
		driver.findElement(By.xpath("//Input[@id='loginusername']")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("loginpassword")).sendKeys(password);
		driver.findElement(By.xpath("//button[@onclick='logIn()']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'galaxy s6')]")).click();

		
	}
}
