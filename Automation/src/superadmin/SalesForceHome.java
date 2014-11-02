package superadmin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SalesForceHome {
	private WebDriver driver;
	
	@FindBy(how = How.ID,using = "Account_Tab")
	WebElement txtAccounts;
	
	public SalesForceHome(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getTxtAccounts() {
		return txtAccounts;
	}

	public void setTxtAccounts(WebElement txtAccounts) {
		this.txtAccounts = txtAccounts;
	}
	
	public void clickonAccounts(){
		txtAccounts.click();
	}
}
