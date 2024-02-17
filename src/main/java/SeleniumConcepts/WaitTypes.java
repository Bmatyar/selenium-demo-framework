package SeleniumConcepts;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WaitTypes {
//	@SuppressWarnings("deprecation")
	@Test
	public void waits() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		
		//driver.manage().timeouts().implicitlyWait(10, null)
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[1]")).click();
		
		
		driver.findElement(By.xpath("//h5[text()='Elements']")).click();
		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
