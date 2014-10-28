package superadmin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SuperAdminHome {
	private WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//div[2]/div/div/div/em/button")
	private WebElement btnAdd;
	
	public SuperAdminHome(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
