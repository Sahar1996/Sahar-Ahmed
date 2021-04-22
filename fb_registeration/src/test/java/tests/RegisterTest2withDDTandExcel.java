package tests;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ExcelReader;
import pages.BaseClass;
import pages.RegisterPage;
import pages.LoginPage;

public class RegisterTest2withDDTandExcel {

	WebDriver driver;

	@BeforeTest
	public void setUp() {

		BaseClass BC = new BaseClass();
		BC.setUp();
		driver = BaseClass.getwebdriver();
	}

	@DataProvider(name = "Exceldata")
	public Object[][] testregistertion() throws IOException {

		ExcelReader ER = new ExcelReader();

		return ER.getExcelData();

	}

	@Test(dataProvider = "Exceldata")
	public void testregister(String fname, String lname, String Mail, String ConMail, String Password) {

		LoginPage LP = new LoginPage();
		LP.clickoncreateaccount();

		RegisterPage RS = new RegisterPage();
		// RS.switchtopopup();
		RS.choosefirstname(fname, lname, Mail, ConMail, Password);
		RS.selectday();
		RS.selectmonth();
		RS.selectyear();
		RS.choosegender();
		RS.clickonSignUp();

	}

	@AfterTest
	public void teardown() {

		BaseClass.getwebdriver().close();

	}

}
