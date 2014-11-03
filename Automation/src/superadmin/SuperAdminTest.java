package superadmin;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SuperAdminTest {
	WebDriver driver;
	SuperAdminLogin sal;
	SuperAdminHome sah;
	SalesForceLogin sfl;
	SalesForceHome sfh;
	
	@Before
	public void setUp(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://test.salesforce.com/");
	}
	
	@Test
	public void setupAMerchant(){
		sfl = new SalesForceLogin(driver);
		sfl.loginToSalesForceHome("alerts-qatwo@leapset.com.full", "qwertyu1");
		sfh = new SalesForceHome(driver);
		sfh.clickonAccounts();
		sfh.clickonNewButton();
		sfh.clickonContinueButton();
		sfh.fillMerchantData();
		driver.get("https://corpadmin:monpass321@tst2-super.leapset.com/login.php");
		sal = new SuperAdminLogin(driver);
		sal.loginToSuperAdmin("admin", "admin");
		sah = new SuperAdminHome(driver);
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}
}
