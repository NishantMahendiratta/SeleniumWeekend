package learningLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class WorkingWithSpotify {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://open.spotify.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("login-username")).sendKeys("nishant1699@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("login-password")).sendKeys("nishantisgr8");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(@class,'ButtonInner-sc-14ud5tc-0 liTfRZ encore-bright-accent-set')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(@role,'img']")).click();
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//input[@class='encore-text encore-text-body-small NtkAQg9R1r5CjuP0XHwl']")).sendKeys("Haryana Hood");
		//Thread.sleep(1000);
	}

}
