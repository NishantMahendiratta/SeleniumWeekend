package learningLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCssSelector {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']")).sendKeys("nishu");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("nishu");
		driver.findElement(By.cssSelector("button[value='1']")).click();
	}

}