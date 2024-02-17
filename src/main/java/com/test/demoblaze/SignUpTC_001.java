package com.test.demoblaze;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.Duration;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignUpTC_001
{
	@Test
	public void Signup() throws InterruptedException, FileNotFoundException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("signin2")).click();
		RandomString randomstr=new RandomString();
		//String uname=randomstr.RandGeneratedStr();
		Thread.sleep(2000);
		driver.findElement(By.id("sign-username")).sendKeys(randomstr.RandGeneratedStr());
		driver.findElement(By.id("sign-password")).sendKeys(randomstr.RandGeneratedStr());
		driver.findElement(By.xpath("//button[@onclick='register()']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		alert.accept();
		Thread.sleep(2000);
		WebElement closebutton = driver.findElement(By.xpath("//div[@id='signInModal']//button[text()='Close']"));
		closebutton.click();
		
	}
}