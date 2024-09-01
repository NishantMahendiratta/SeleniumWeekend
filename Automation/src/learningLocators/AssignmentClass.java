package learningLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentClass {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.className("_6lti")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("nishant");
		driver.findElement(By.name("lastname")).sendKeys("nishant");
		driver.findElement(By.name("reg_email__")).sendKeys("848779");
		
		
	}

}
