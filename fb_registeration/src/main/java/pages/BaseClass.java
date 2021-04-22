package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	static WebDriver driver;
	
public void setUp() {
		
//	    driver = new ChromeDriver();
//		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Sources\\chromedriver.exe");
	driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
	}


   public static WebDriver getwebdriver() {
	   
	   return driver;
	   
   }
	
	
}
