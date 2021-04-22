package pages;
import org.openqa.selenium.By;
public class LoginPage {


	


	public void login(String Username, String Password) {

	BaseClass.getwebdriver().findElement(By.id("email")).sendKeys(Username);
	BaseClass.getwebdriver().findElement(By.id("pass")).sendKeys(Password);
	BaseClass.getwebdriver().findElement(By.name("login")).click();


	}

	public String geterrormessage() {

	String invalidpassworderrormessage =BaseClass.getwebdriver().findElement(By.className("_9ay7")).getText();
	return invalidpassworderrormessage;
	}




	public void clickoncreateaccount() {

	BaseClass.getwebdriver().findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
	}

	}

