package tests;
import static org.testng.Assert.assertEquals;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import data.ReadFromExcel;
import pages.BaseClass;
import pages.LoginPage;
public class LoginTestwithDDTandExcel {




	WebDriver driver;

	@BeforeTest
	public void setUp() {

		BaseClass TB = new BaseClass();
		TB.setUp();
		//driver = BaseClass.getwebdriver();

	}


	@DataProvider(name = "Exceldata")
	public Object[][] testlogin() throws IOException{

		ReadFromExcel ER = new ReadFromExcel();

		return ER.getExcelData();


	}

	@Test (dataProvider = "Exceldata")
	public void testlogin(String email , String Passw0rd) throws InterruptedException {

		LoginPage LP = new LoginPage();
		LP.login(email, Passw0rd);

		//PageBase.getwebdriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		//assertEquals(LP.geterrormessage(), "The password that you've entered is incorrect. Forgotten password?");
		//PageBase.getwebdriver().findElement(By.className("s45kfl79 emlxlaya bkmhp75w spb7xbtv i09qtzwb n7fi1qx3 b5wmifdl hzruof5a pmk7jnqg j9ispegn kr520xx4 c5ndavph art1omkt ot9fgl3s rnr61an3")).click();
		//PageBase.getwebdriver().findElement(By.xpath("//*[@id=\"mount_0_0_Zz\"]/div/div[1]/div/div[2]/div[4]/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[3]/div/div[5]/div/div[1]/div[2]/div/div/div/div/span")).click();
	}
	


	@AfterTest
	public void teardown() {

		BaseClass.getwebdriver().close();

	}

}
