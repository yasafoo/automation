package superadmin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SalesForceLogin {
	private WebDriver driver;
	private SalesForceHome sfh;
	
	@FindBy(how=How.ID,using="username")
	private WebElement txtUserName;
	
	@FindBy(how=How.ID,using="password")
	private WebElement txtPassword;
	
	@FindBy(how=How.ID,using="Login")
	private WebElement btnLogin;
	
	public SalesForceLogin(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public void setTxtUserName(WebElement txtUserName) {
		this.txtUserName = txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public void setTxtPassword(WebElement txtPassword) {
		this.txtPassword = txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(WebElement btnLogin) {
		this.btnLogin = btnLogin;
	}
	
	public SalesForceHome loginToSalesForceHome(String username,String password){
		this.getTxtUserName().clear();
		this.getTxtUserName().sendKeys(username);
		this.getTxtPassword().clear();
		this.getTxtPassword().sendKeys(password);
		this.getBtnLogin().click();
		return sfh;
	}
}
