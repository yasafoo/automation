package superadmin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SuperAdminLogin {
	private WebDriver driver;
	
	@FindBy(how=How.ID,using="login")
	private WebElement txtLogin;
	
	@FindBy(how=How.ID, using="password")
	private WebElement txtPassword;
	
	@FindBy(how=How.XPATH, using=".//*[@id='login-form']/fieldset/input[3]")
	private WebElement btnLogin;
	
	public SuperAdminLogin(WebDriver driver){
		this.driver = driver;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getTxtLogin() {
		return txtLogin;
	}

	public void setTxtLogin(WebElement txtLogin) {
		this.txtLogin = txtLogin;
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
	
	
}
