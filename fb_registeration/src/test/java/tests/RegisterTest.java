package tests;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.BaseClass;
import pages.RegisterPage;
import pages.LoginPage;

public class RegisterTest {

	WebDriver driver;

	@BeforeTest
	public void setUp() {

		BaseClass BC = new BaseClass();
		BC.setUp();
		driver = BaseClass.getwebdriver();
	}

	@Test
	public void testregister() {

		LoginPage LP = new LoginPage();
		LP.clickoncreateaccount();

		// driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();

		BaseClass.getwebdriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		RegisterPage RS = new RegisterPage();
		// RS.switchtopopup();
		RS.choosefirstname("Amany", "Hassan", "saharasi@hotmail.com","saharasi@hotmail.com", "P@ssw0rd123");
		RS.selectday();
		RS.selectmonth();
		RS.selectyear();
		RS.choosegender();
		RS.clickonSignUp();

		BaseClass.getwebdriver().manage().timeouts().implicitlyWait(18, TimeUnit.SECONDS);

		
		assertEquals(RS.sucessmssg(), "Enter security code");

	}

	@AfterTest
	public void teardown() {

		BaseClass.getwebdriver().close();

	}

}
