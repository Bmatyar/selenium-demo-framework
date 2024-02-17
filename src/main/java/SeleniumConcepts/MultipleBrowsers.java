package SeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultipleBrowsers {

	@Test
	//@Parameters("browser")
	public void Openbrowser(String browser) throws Exception
	{
		String browser1 = System.getProperty("browser");
		if(browser1.equalsIgnoreCase("firefox"))
		{
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.demoblaze.com/");
		}
		else if(browser1.equalsIgnoreCase("Chrome"))
		{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		}
		else if(browser1.equalsIgnoreCase("Edge"))
		{
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.demoblaze.com/");
		}
		else
		{
			throw new Exception("Browser is not correct");
		}
		
			
		
	}
	
}
