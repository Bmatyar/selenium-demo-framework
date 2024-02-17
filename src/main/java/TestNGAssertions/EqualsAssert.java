package TestNGAssertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EqualsAssert {
	
	@Test
	public void Equalsassert()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		String Expectedtitle= driver.getTitle();
		String Actualtitle="DEMOQA";
		Assert.assertEquals(Actualtitle, Expectedtitle);
		System.out.println(Expectedtitle);
		String Actualtext= driver.findElement(By.xpath("//h5[normalize-space()='Elements']")).getText();
	    String Expectedtext="Elements";
		
	    Assert.assertEquals(Actualtext,Expectedtext,"Welcom message Text is not matched");
	    System.out.println(Actualtext);  
	    driver.close();
	}

}
