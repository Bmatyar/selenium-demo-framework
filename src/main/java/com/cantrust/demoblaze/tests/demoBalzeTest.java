package com.cantrust.demoblaze.tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.cantrust.demoblaze.pages.LoginPage;

public class demoBalzeTest {

	@Test
	public void blazeTest() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.demoblaze.com/");
		System.out.println("hello");
		// call loginAcation
		LoginPage lg = new LoginPage(driver);
		lg.loginaction();
		driver.close();
	}
}
