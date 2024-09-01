package learningwebdrivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGet {

public static void main(String[] args) {
	
//to launch the browser
		
WebDriver driver = new ChromeDriver();
//to maximize the window
driver.manage().window().maximize();
// to launch the application
driver.get("https://www.flipkart.com");
		
//to fetch the title
String actual_title = driver.getTitle();
String expected_title = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		
if(actual_title.equals(expected_title))
System.out.println("Title is correct");
else
System.out.println("Title is wrong");

//to fetch the url

String actual_Url = driver.getCurrentUrl();
String expectedUrl ="https://www.flipkart.com/";

if(actual_Url.equals(expectedUrl))
System.out.println("Url is correct");
else
System.out.println("Url is wrong");


	}

}
