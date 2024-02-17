package SeleniumConcepts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int rowsize=rows.size();
		System.out.println(rowsize);
		
		List<WebElement> cols=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		int colsize=cols.size();
		System.out.println(colsize);
		String cell1=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]/td[1]")).getText();
		
		System.out.println("particular Cell "+cell1);
		
		// read all the retrieve all data
		for(int r=1;r<=rowsize;r++)
		{
			for(int c=1;c<=colsize;c++)
			{
				
				String data=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.print(data+"   ");
			}
			System.out.println();
		}
		
		
		
	}

}
