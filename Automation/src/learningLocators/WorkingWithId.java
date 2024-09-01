package learningLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithId {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		// identify the email text field
		WebElement emailTextField = driver.findElement(By.id("email"));
		emailTextField.sendKeys("88yieuy");
		
		// identify the password text field
		driver.findElement(By.name("pass")).sendKeys("Aman");
	}

}
