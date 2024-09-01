package learningAssignmentSynchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.makemytrip.com/?srsltid=AfmBOorQYPJb-Hog4rzJFMTWDRw7dYoToAJiCxVA9tLNIE24I4X0XFsY");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		
		driver.findElement(By.xpath("(//span[@class='headerIconTextAlignment chNavText darkGreyText'])[5]")).click();
		
	driver.findElement(By.id("fromCity")).click();
	driver.findElement(By.cssSelector("[type='text']")).sendKeys("delhi");
	driver.findElement(By.xpath("(//div[@class='makeFlex'])[1]")).click();
	driver.findElement(By.id("toCity")).click();
	driver.findElement(By.cssSelector("[type='text'")).sendKeys("gurgaon");
	driver.findElement(By.xpath("//span[@class='sr_city blackText'])[1]")).click();
	}

}
