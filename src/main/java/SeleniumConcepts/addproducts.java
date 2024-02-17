package SeleniumConcepts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class addproducts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoblaze.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@id='login2']")).click();

		driver.findElement(By.xpath("//Input[@id='loginusername']")).sendKeys("beant123");
		Thread.sleep(2000);
		driver.findElement(By.id("loginpassword")).sendKeys("bpass123");
		driver.findElement(By.xpath("//button[@onclick='logIn()']")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@onclick='addToCart(1)']")).click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Home '] ")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Nokia lumia 1520']")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@onclick='addToCart(2)']")).click();
		Thread.sleep(1000);
		// Alert alert=driver.switchTo().alert();
		alert.accept();
	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Cart']")).click();
		// Get the header rows
		List<WebElement> ths = driver.findElements(By.xpath("//thead/tr/th"));
		int headerIndex = 1;
		for (WebElement th : ths) {
			System.out.println("header text = " + th.getText());
			if (th.getText().equals("Price")) 
			{
				// headerIndex ++;
				break;
			} else 
			{
				headerIndex++;
			}
		}

		// How to navigate the web table
		List<WebElement> tablecontent = driver.findElements(By.xpath("//tbody[@id='tbodyid']/tr"));
		for (WebElement ele : tablecontent) {
			List<WebElement> tds = ele.findElements(By.xpath("//tbody[@id='tbodyid']/tr"));
			for (WebElement data : tds) {
				System.out.println(data.getText());

			}
		}
		String prodPrice;
		int number=0;
		List<WebElement> price = driver.findElements(By.xpath("//tbody/tr/td[" + headerIndex + "]"));
		for (WebElement list : price) {
			prodPrice=list.getText();
			number = number+Integer.parseInt(prodPrice);
			
			
		}
		System.out.println(number);
		//String.valueOf(number);
		String totalp=driver.findElement(By.xpath("//h3[@id='totalp']")).getText();
		System.out.println(totalp);
		if(number==Integer.parseInt(totalp))
		{
			System.out.println("Total is fine");
		}
		// driver.close();
	}

}
