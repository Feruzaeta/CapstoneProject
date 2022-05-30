package page.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.BaseForTek;

public class RetailPageForTek extends BaseForTek {
 public RetailPageForTek() {
	PageFactory.initElements(driver, this);
 }
 
 @FindBy (xpath = "//a[text()='TEST ENVIRONMENT']")
 private WebElement logo;
 
 @FindBy (xpath = "//span[text()='My Account']")
 private WebElement myAccount;
 
 @FindBy (xpath= "//a[text()='Login']") 
 private WebElement accountLogin;
 
 @FindBy (id = "input-email")
 private WebElement emailAddress;
 
 @FindBy (id = "input-password")
 private WebElement password;
 
 @FindBy (xpath = "//input[@value='Login']")
 private WebElement login;
 
 @FindBy (xpath = "//h2[text()='My Account']")//displayed
 private WebElement myAccountDisplayed;
 
@FindBy (xpath = "//a [text()= 'Register for an affiliate account']")
 private WebElement myAffilateAccount;
 @FindBy (id = "input-company")
 private WebElement company;
 
 @FindBy (xpath = "//input[@id = 'input-website']")
 private WebElement website;
 
 @FindBy (id = "input-tax")
 private WebElement taxId;
 
 @FindBy (xpath = "(//div[@class='radio']) [1]")
 private WebElement chequeButton;
 
 @FindBy (id = "input-cheque")
 private WebElement checkPayeeName;
 
 @FindBy (xpath = "//input[@value='1']")
private WebElement agreeCheckBox;
 @FindBy (xpath = "//input[@value='Continue']")
 private WebElement continueButton;
 
 @FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
 private WebElement successMessage;//displayed
 
 @FindBy (xpath = "//a[text()='Edit your affiliate information']")
 private WebElement editAffilateInfo;
 
 @FindBy(xpath = "(//div[@class='radio']) [3]")
 private WebElement bankTransferButton;
 
 @FindBy (id ="input-bank-name")
 private WebElement bankName;
 
 @FindBy (id = "input-bank-branch-number")
 private WebElement bankBranchNumber;
 
 @FindBy (id ="input-bank-swift-code")
 private WebElement switfCode;
 
 @FindBy (id = "input-bank-account-name")
 private WebElement bankAccoutName;
 
 @FindBy (id = "input-bank-account-number")
 private WebElement bankAccountNumber;
 
 @FindBy (xpath="//input[@class='btn btn-primary']")
 private WebElement continueForEditAff;
 
 @FindBy (xpath = "//div[@class = 'alert alert-success alertible']-dismiss")
 private WebElement successMessageForEdit;
 
 @FindBy (xpath = "//a[text()='Edit Account']")
 private WebElement editAccount;
 
 @FindBy (xpath ="//input[@id='input-firstname']" )
 private WebElement editName;
 
 @FindBy (xpath="//input[@id='input-lastname']")
 private WebElement editLastName;
 
 @FindBy (xpath = "//input[@id='input-email']")
 private WebElement editEmail;
 
@FindBy (xpath = "//input[@id='input-telephone']")
private WebElement editTelephone;

@FindBy (xpath ="//input[@value='Continue']" )
private WebElement continueButtonforEdit;

@FindBy (xpath="//div[@class='alert alert-success alert-dismissible']")
private WebElement successMessageForEditAccount;

public boolean isLogoDisplayed() {
	if (logo.isDisplayed())
		return true;
	else
		return false;
}
public void clickOnMyAccount() {
	myAccount.click();
}
public void clickOnAccountLogin() {
	accountLogin.click();
}
public void emailAddress(String emailValue) {
	emailAddress.sendKeys(emailValue);
}
public void password(String passwordValue) {
	password.sendKeys(passwordValue);
}
public void clickOnLoginButton() {
	login.click();
}
public boolean myAccountDisplayed() {
	if(myAccountDisplayed.isDisplayed())
		return true;
	else 
		return false;
}
public void myAffilate() {
	myAffilateAccount.click();
}
public void companyField(String companyValue) {
	company.sendKeys(companyValue);
}
public void webSiteField(String wbesiteValue) {
	website.sendKeys(wbesiteValue);
}
public void taxIdField (String taxIdValue) {
	taxId.sendKeys(taxIdValue);
}
public boolean checqButton (String checquePayment) {
	chequeButton.click();
	if(chequeButton.isSelected())
		return true;
	else 
		return false;
}
public void chequePayeeName(String chequPayeeNameValue) {
		checkPayeeName.sendKeys(chequPayeeNameValue);
	}
public boolean agreeCheckBoxisSelected () {
	agreeCheckBox.click();
	if (agreeCheckBox.isSelected())
		return true;
	else
		return false;
}
public void clickOnContinue() {
	continueButton.click();
}
public boolean successMessageisDisplayed() {
	if (successMessage.isDisplayed())
		return true;
	else 
		return false;
}
public void clickOnEditAffilation() {
	editAffilateInfo.click();
}
public boolean bankTransfer() {
	bankTransferButton.click();
	if (bankTransferButton.isSelected())
		return true;
	else 
		return false;
}
public void bankName(String bankNameValue) {
	bankName.sendKeys(bankNameValue);
}
public void bankBranchN(String branchNumberValue) {
	bankBranchNumber.sendKeys(branchNumberValue);
}
public void swiftCodeN(String swiftCodeValue) {
	switfCode.sendKeys(swiftCodeValue);
}
public void bankAcctName(String bankAcctNameValue) {
	bankAccoutName.sendKeys(bankAcctNameValue);
}
public void bankAcctNumber(String bankAcctNumberValue) {
	bankAccountNumber.sendKeys(bankAcctNumberValue);
}
public void clicOnContinue() {
	continueForEditAff.click();
}
public boolean succssesMessageforEditedAffiliate() {
if (successMessageForEdit.isDisplayed())
	return true;
else
	return false;
}
public void clickOneditAccount() {
	editAccount.click();
}
public void editName (String editNameValue) {
	editName.clear();
	editName.sendKeys(editNameValue);
}
public void editLastName(String editLastNameValue) {
	editLastName.clear();
	editLastName.sendKeys(editLastNameValue);
}
public void editEmail(String editEmailValue) {
	editEmail.clear();
	editEmail.sendKeys(editEmailValue);
}
public void editTelephone(String editTelephoneValue) {
	editTelephone.clear();
	editTelephone.sendKeys(editTelephoneValue);
}
public void clickOnContinueButton() {
	continueButtonforEdit.click();
}
public boolean successForEditAccount() {
	if (successMessageForEditAccount.isDisplayed())
		return true;
		else
			return false;
}
}


