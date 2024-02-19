package SeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


public class MultipleBrowsers {
	
	WebDriver driver = null;

	@Test
	public void Openbrowser() throws Exception {
		
		String browser1 = System.getProperty("browser");
		if (browser1.equalsIgnoreCase("firefox")) {
			 driver = new FirefoxDriver();
			driver.get("https://www.demoblaze.com/");
		} else if (browser1.equalsIgnoreCase("Chrome")) {
			 driver = new ChromeDriver();
			driver.get("https://www.demoblaze.com/");
		} else if (browser1.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
			driver.get("https://www.demoblaze.com/");
		} else {
			throw new Exception("Browser is not correct");
		}
		
		System.out.println("Page title = "+driver.getTitle());

	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
