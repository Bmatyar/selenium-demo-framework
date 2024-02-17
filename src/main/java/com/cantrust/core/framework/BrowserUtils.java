package com.cantrust.core.framework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtils {
	
	public static WebDriver webDriver = null;
	
	public static WebDriver launchBrowser() {
		
		// I need to read the browser paramater from the user
		String browserType = System.getProperty("browser");
		System.out.println("Running the Test cases in = "+browserType);
		
		switch (browserType) 
		{
		 
        // Case1
        case "chrome":
           webDriver= new ChromeDriver();
            break;
            
        case "firefox":
            webDriver= new FirefoxDriver();
             break;   
            
        case "edge":
            webDriver= new EdgeDriver();
             break; 
        default:
        	System.out.println("Invalid browser type");
        	System.exit(0);
		}
		
		webDriver.manage().window().maximize();
		webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		return webDriver;
		
	}

}
