package learningLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithPaytm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//img[@class='Dr08x']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='selectOrigin']")).sendKeys("delhi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(")).click();
		Thread.sleep(2000);
		
		
	
		
	}

}
