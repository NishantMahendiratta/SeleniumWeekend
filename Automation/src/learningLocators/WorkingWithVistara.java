package learningLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithVistara {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.airvistara.com/in/en/travel-information/vistara-exclusives/vistara-direct?gclid=Cj0KCQjwzby1BhCQARIsAJ_0t5NqeyjTMCZY6xdg06pTgV1yvKZyCB0DDRtSh52RbY_wlijeYZysS2AaAvWyEALw_wcB&utm_source=google&utm_medium=Search&utm_campaign=PMX_Brand_Dom_Search_Nov_22&ef_id=Cj0KCQjwzby1BhCQARIsAJ_0t5NqeyjTMCZY6xdg06pTgV1yvKZyCB0DDRtSh52RbY_wlijeYZysS2AaAvWyEALw_wcB:G:s&s_kwcid=AL!596!3!659805002549!p!!g!!vistara&s_kwcid=AL!596!3!659805002549!p!!g!!vistara&gad_source=1");
		
		//Thread.sleep(2000);
		
		driver.findElement(By.id("onewaytrip")).click();
		/*Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[placeholder='Select Departure City']")).sendKeys("goa");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='airports'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='flightSearchTo']")).sendKeys("delhi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='airports'])[1]")).click();*/
		
			
	}

}
