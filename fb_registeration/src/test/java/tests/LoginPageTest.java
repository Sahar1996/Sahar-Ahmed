package tests;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.BaseClass;
import pages.LoginPage;

public class LoginPageTest {

	WebDriver driver;

	@BeforeTest
	public void setUp() {

		BaseClass BC = new BaseClass();
		BC.setUp();
		//driver = BaseClass.getwebdriver();

	}

	@Test (priority=1)
	public void validusernameAndinvalidpassword() throws InterruptedException {

		LoginPage LP = new LoginPage();
		LP.login("sahar_ahmed1996@hotmail.co.uk", "3372473tyuty");

		BaseClass.getwebdriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		assertEquals(LP.geterrormessage(), "The password that you've entered is incorrect. Forgotten password?");

	}
	
//	
//	@Test (priority=2)
//	public void validusernameAndvalidpassword() throws InterruptedException {
//
//		LoginPage LP = new LoginPage();
//		LP.login("ronayagzpt_1619004697@tfbnw.net", "P@ssw0rd123");
//
//		BaseClass.getwebdriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//		
//		String welcomemssg = BaseClass.getwebdriver().findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div[2]/div/div/div[1]/span")).getText();
//
//		assertEquals(welcomemssg, "Welcome to Facebook, Ruth");
//
//	}


	@AfterTest
	public void teardown() {

		BaseClass.getwebdriver().close();

	}

}
