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
	
	@Before
	public void setUp(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://test.salesforce.com/");
		//driver.get("https://corpadmin:monpass321@tst2-super.leapset.com/login.php");
	}
	
	@Test
	public void setupAMerchant(){
		sfl = new SalesForceLogin(driver);
		sfl.getTxtUserName().clear();
		sfl.getTxtUserName().sendKeys("alerts-qatwo@leapset.com.full");
		sfl.getTxtPassword().clear();
		sfl.getTxtPassword().sendKeys("qwertyu1");
		sfl.getBtnLogin().click();
		//driver.close();
		driver.get("https://corpadmin:monpass321@tst2-super.leapset.com/login.php");
		sal = new SuperAdminLogin(driver);
		sal.getTxtLogin().clear();
		sal.getTxtLogin().sendKeys("admin");
		sal.getTxtPassword().clear();
		sal.getTxtPassword().sendKeys("admin");
		sal.getBtnLogin().click();
		sah = new SuperAdminHome(driver);
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}
}
