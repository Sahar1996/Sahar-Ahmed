package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
	
	
//	public void switchtopopup() {
//		
//		BaseClass.getwebdriver().findElement(By.className("_8ien"));
//	}
	
	

	public void choosefirstname(String FirstName, String SurName, String Mail, String CMail ,String Password) {

		BaseClass.getwebdriver().findElement(By.name("firstname")).sendKeys(FirstName);
		BaseClass.getwebdriver().findElement(By.name("lastname")).sendKeys(SurName);
		BaseClass.getwebdriver().findElement(By.name("reg_email__")).sendKeys(Mail);
		BaseClass.getwebdriver().findElement(By.name("reg_email_confirmation__")).sendKeys(CMail);
		BaseClass.getwebdriver().findElement(By.name("reg_passwd__")).sendKeys(Password);

	}

	public void selectday() {

		new Select(BaseClass.getwebdriver().findElement(By.id("day"))).selectByVisibleText("9");
	}

	public void selectmonth() {

		new Select(BaseClass.getwebdriver().findElement(By.id("month"))).selectByVisibleText("Apr");
	}

	public void selectyear() {

		new Select(BaseClass.getwebdriver().findElement(By.id("year"))).selectByVisibleText("2005");
	}

	
   public void choosegender() {
	   
	   BaseClass.getwebdriver().findElement(By.name("sex")).click();
	   
   }
	
	public void clickonSignUp() {
		
		BaseClass.getwebdriver().findElement(By.name("websubmit")).click();
		
	}
	
	public String sucessmssg () {
		return BaseClass.getwebdriver().findElement(By.className("uiHeaderTitle")).getText();
		
	}
	
}
