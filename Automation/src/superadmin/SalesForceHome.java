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
	
	@FindBy(how = How.XPATH, using = ".//*[@id='hotlist']/table/tbody/tr/td[2]/input")
	WebElement btnBew;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='bottomButtonRow']/input[1]")
	WebElement btnContinue;
	
	@FindBy(how = How.ID, using = "acc2")
	WebElement txtAccountName;
	
	@FindBy(how = How.ID, using = "acc17street")
	WebElement txtCBillStreet;
	
	@FindBy(how=How.ID, using="acc17city")
	WebElement txtCBillCity;
	
	@FindBy(how=How.ID, using="acc17state")
	WebElement txtCBillState;
	
	@FindBy(how=How.ID,using="acc17zip")
	WebElement txtCBillZip;
	
	@FindBy(how=How.ID,using="acc17country")
	WebElement txtCBillCountry;
	
	@FindBy(how=How.ID,using="acc10")
	WebElement txtCBillPhone;
	
	@FindBy(how = How.ID, using = "acc18street")
	WebElement txtBillStreet;
	
	@FindBy(how=How.ID, using="acc18city")
	WebElement txtBillCity;
	
	@FindBy(how=How.ID, using="acc18state")
	WebElement txtBillState;
	
	@FindBy(how=How.ID,using="acc18zip")
	WebElement txtBillZip;
	
	@FindBy(how=How.ID,using="acc18country")
	WebElement txtBillCountry;
	
	@FindBy(how=How.ID,using="00N70000003eb8H")
	WebElement txtBillPhone;
	
	@FindBy(how=How.XPATH,using=".//*[@id='topButtonRow']/input[1]")
	WebElement btnSave;
	
	@FindBy(how=How.XPATH,using=".//*[@id='00N70000003FuoC_ileinner']")
	WebElement txtLeapsetID;
	
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
	
	public WebElement getBtnBew() {
		return btnBew;
	}
	
	public void setBtnBew(WebElement btnBew) {
		this.btnBew = btnBew;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public void setBtnContinue(WebElement btnContinue) {
		this.btnContinue = btnContinue;
	}

	public WebElement getTxtAccountName() {
		return txtAccountName;
	}

	public void setTxtAccountName(WebElement txtAccountName) {
		this.txtAccountName = txtAccountName;
	}

	public WebElement getTxtCBillStreet() {
		return txtCBillStreet;
	}

	public void setTxtCBillStreet(WebElement txtCBillStreet) {
		this.txtCBillStreet = txtCBillStreet;
	}

	public WebElement getTxtCBillCity() {
		return txtCBillCity;
	}

	public void setTxtCBillCity(WebElement txtCBillCity) {
		this.txtCBillCity = txtCBillCity;
	}

	public WebElement getTxtCBillState() {
		return txtCBillState;
	}

	public void setTxtCBillState(WebElement txtCBillState) {
		this.txtCBillState = txtCBillState;
	}

	public WebElement getTxtCBillZip() {
		return txtCBillZip;
	}

	public void setTxtCBillZip(WebElement txtCBillZip) {
		this.txtCBillZip = txtCBillZip;
	}

	public WebElement getTxtCBillCountry() {
		return txtCBillCountry;
	}

	public void setTxtCBillCountry(WebElement txtCBillCountry) {
		this.txtCBillCountry = txtCBillCountry;
	}

	public WebElement getTxtCBillPhone() {
		return txtCBillPhone;
	}

	public void setTxtCBillPhone(WebElement txtCBillPhone) {
		this.txtCBillPhone = txtCBillPhone;
	}

	public WebElement getTxtBillStreet() {
		return txtBillStreet;
	}

	public void setTxtBillStreet(WebElement txtBillStreet) {
		this.txtBillStreet = txtBillStreet;
	}

	public WebElement getTxtBillCity() {
		return txtBillCity;
	}

	public void setTxtBillCity(WebElement txtBillCity) {
		this.txtBillCity = txtBillCity;
	}

	public WebElement getTxtBillState() {
		return txtBillState;
	}

	public void setTxtBillState(WebElement txtBillState) {
		this.txtBillState = txtBillState;
	}

	public WebElement getTxtBillZip() {
		return txtBillZip;
	}

	public void setTxtBillZip(WebElement txtBillZip) {
		this.txtBillZip = txtBillZip;
	}

	public WebElement getTxtBillCountry() {
		return txtBillCountry;
	}

	public void setTxtBillCountry(WebElement txtBillCountry) {
		this.txtBillCountry = txtBillCountry;
	}

	public WebElement getTxtBillPhone() {
		return txtBillPhone;
	}

	public void setTxtBillPhone(WebElement txtBillPhone) {
		this.txtBillPhone = txtBillPhone;
	}

	public void clickonAccounts(){
		txtAccounts.click();
	}
	
	public void clickonNewButton(){
		btnBew.click();
	}
	
	public void clickonContinueButton(){
		btnContinue.click();
	}
	
	public WebElement getBtnSave() {
		return btnSave;
	}

	public void setBtnSave(WebElement btnSave) {
		this.btnSave = btnSave;
	}

	public WebElement getTxtLeapsetID() {
		return txtLeapsetID;
	}

	public void setTxtLeapsetID(WebElement txtLeapsetID) {
		this.txtLeapsetID = txtLeapsetID;
	}

	public void fillMerchantData(){
		txtAccountName.clear();
		txtAccountName.sendKeys(new Utilities().getMerchantName());
		System.out.println("Merchant Name: "+new Utilities().getMerchantName());
		txtCBillStreet.clear();
		txtCBillStreet.sendKeys("101 Redwood Shores Parkway,Suite 200");
		txtCBillCity.clear();
		txtCBillCity.sendKeys("Redwood City");
		txtCBillState.clear();
		txtCBillState.sendKeys("CA");
		txtCBillZip.clear();
		txtCBillZip.sendKeys("94065");
		txtCBillCountry.clear();
		txtCBillCountry.sendKeys("USA");
		txtCBillPhone.clear();
		txtCBillPhone.sendKeys("6502157777");
		
		txtBillStreet.clear();
		txtBillStreet.sendKeys("101 Redwood Shores Parkway,Suite 200");
		txtBillCity.clear();
		txtBillCity.sendKeys("Redwood City");
		txtBillState.clear();
		txtBillState.sendKeys("CA");
		txtBillZip.clear();
		txtBillZip.sendKeys("94065");
		txtBillCountry.clear();
		txtBillCountry.sendKeys("USA");
		txtBillPhone.clear();
		txtBillPhone.sendKeys("6502157777");
		
		btnSave.click();
	}
	
	public String getCRMID(WebDriver driver){
		String url = driver.getCurrentUrl();
		url = url.replace("https://cs1.salesforce.com/", "");
		Utilities.CRMID = url;
		//System.out.println("CRMID: "+Utilities.CRMID);
		return url;
	}
	
	public String getLeapsetID(){
		String id;
		id = getTxtLeapsetID().getText();
		Utilities.LeapsetID = id;
		return id;
	}
}
