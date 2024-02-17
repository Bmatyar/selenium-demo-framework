package SeleniumConcepts;

import java.time.Duration;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AxesXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.amazon.in/");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     // Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("moblies");
      driver.findElement(By.xpath("//input[@type='submit']")).click();
      Thread.sleep(20000);
     WebDriverWait cwait= new WebDriverWait(driver,Duration.ofSeconds(20));
      
    	WebElement checkbox=cwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Get It by Tomorrow']//preceding-sibling::div//i")));
    	checkbox.click();
      
      driver.close();
	}

}
