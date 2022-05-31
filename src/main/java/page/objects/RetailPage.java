package page.objects;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPage extends Base {
	public RetailPage() {
		PageFactory.initElements(driver, this);
	}

	//Background
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement ClickonMyAccount;
	
	@FindBy(linkText="Login")
	private WebElement ClickonLogin;
	
	@FindBy(id="input-email")
	private WebElement InputEmail;
	
	@FindBy(id="input-password")
	private WebElement InputPassword;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement  ClickonLoginButton;
	
	@FindBy(id="content")
	private WebElement LoginDashBoard;
	
	//@RegisterAffiliate
	@FindBy(linkText="Register for an affiliate account")
	private WebElement ClickOnRegister;
	
	@FindBy(id="input-company")
	private WebElement InputCompany;
	
	@FindBy(id="input-website")
	private WebElement InputWebsite;
	
	@FindBy(id="input-tax")
	private WebElement InputTax;
	
	@FindBy(xpath="//input[@value='cheque']")
	private WebElement SelectCheque;
	
	@FindBy(xpath="//input[@value='paypal']")
	private WebElement SelectPaypal;
	
	@FindBy(xpath="//input[@value='bank']")
	private WebElement Selectbank;
	
	@FindBy(id="input-cheque")
	private WebElement InputCheque;
	
	@FindBy(xpath="//input[@name='agree']")
	private WebElement SelectCheckBox;
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement clickContinueButton;
	
	@FindBy(xpath="//*[@id=\"account-account\"]/div[1]")
	private WebElement ShouldSeeMessage;
	
	//@EditAffiliate
	@FindBy(linkText="Edit your affiliate information")
	private WebElement EdityourAffiliate;
	
	@FindBy(xpath="//input[@value='bank']")
	private WebElement  ClickonBank;
	
	@FindBy(id="input-bank-name")
	private WebElement  InputBankInfo;
	
	@FindBy(id="input-bank-branch-number")
	private WebElement  InputAbsInfo;
	
	@FindBy(id="input-bank-swift-code")
	private WebElement InputSwiftCodeInfo;
	
	@FindBy(id="input-bank-account-name")
	private WebElement InputBankAccountName;
	
	@FindBy(id="input-bank-account-number")
	private WebElement InputAccountNumber;
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement clickonContinue2Button;
	
	@FindBy(xpath="//*[@id=\"account-account\"]/div[1]")
	private WebElement CanSeeMessage;
	
	//@EditYourAccount
	@FindBy(linkText="Edit your account information")
	private WebElement EdityourAccount;
	
	@FindBy(id="input-firstname")
	private WebElement FirstnameField;
	
	@FindBy(id="input-lastname")
	private WebElement LastnameField;
	
	@FindBy(id="input-email")
	private WebElement EmailField;
	
	@FindBy(id="input-telephone")
	private WebElement TelephoneField;
	
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div[2]/input")
	private WebElement ClickOnContinue3Button;
	
	@FindBy(xpath="//*[@id=\"account-account\"]/div[1]")
	private WebElement CanseeSuccessMess;
	
//Background
	public void ClickonMyAccount() {
		ClickonMyAccount.click();
	}
	
	public void ClickonLogin() {
		ClickonLogin.click();
	}

   public void UserInputEmail(String email) {
	   InputEmail.sendKeys(email);
   }

   public void UserInputPassword(String pass) {
	   InputPassword.sendKeys(pass);
   }

   public void UserClickonLoginButton() {
	   ClickonLoginButton.click();
   }

   public void LoginDashBoard() {
	   LoginDashBoard.isDisplayed();
   }
   
  // @RegisterAffiliate
   public void ClickOnRegister() {
	   ClickOnRegister.click();
   }
   
   public void InputCompany(String CompanyValue) {
	   InputCompany.sendKeys(CompanyValue);;
   }
   
   public void InputWebsite(String WebsiteValue) {
	   InputWebsite.sendKeys(WebsiteValue);;
	   
   }
   
   public void InputTax(String TaxValue) {
	   InputTax.sendKeys(TaxValue);;
	   
   }
   public void SelectPaymentMethod(String option) {
	   
	   if(option.equalsIgnoreCase("Bank") && !Selectbank.isSelected()) {
		   Selectbank.click();
		   }else if(option.equalsIgnoreCase("PayPal") && !SelectPaypal.isSelected()){
			   SelectPaypal.click();
		   }else SelectCheque.click();
	  
   }

   public void InputCheque(String ChequeValue) {
	   InputCheque.sendKeys(ChequeValue);;
   }
   
   public void SelectCheckBox() {
	   SelectCheckBox.click();
   }
 
   public void clickContinueButton() {
	   clickContinueButton.click();
   }
   
   public void ShouldSeeMessage() {
	   System.out.println(ShouldSeeMessage.getText());
	   
   }
  
   //@EditAffiliate
   public void EdityourAffiliate() {
	   EdityourAffiliate.click();
   }
   public void ClickonBank() {
	   ClickonBank.click();
   }
   
   public void InputBankInfo(String bankName) {
	   InputBankInfo.clear();
	   InputBankInfo.sendKeys(bankName);
   }
   
   public void InputAbsInfo(String abaNumber) {
	   InputAbsInfo.clear();
	   InputAbsInfo.sendKeys(abaNumber);
   }
   
   public void InputSwiftCodeInfo(String swiftCode) {
	   InputSwiftCodeInfo.clear();
	   InputSwiftCodeInfo.sendKeys(swiftCode);
	 
   }
   
   public void InputBankAccountName(String accountName) {
	   InputBankAccountName.clear();
	   InputBankAccountName.sendKeys(accountName);
   }
   
   public void InputAccountNumber(String accountNumber) {
	   InputAccountNumber.clear();
	   InputAccountNumber.sendKeys(accountNumber);
   }
   
   public void clickonContinue2Button() {
	   clickonContinue2Button.click();
   }
   
  public void CanSeeMessage() {
	 CanSeeMessage.getText();
  }
  
  //@EditYourAccount
  public void EdityourAccount() {
	  EdityourAccount.click();
  }
  
  public void FirstnameField(String firstname) {
	  FirstnameField.clear();
	  FirstnameField.sendKeys(firstname);
  }
  
  public void LastnameField(String lastName) {
	  LastnameField.clear();
	  LastnameField.sendKeys(lastName);
  }

 public void EmailField(String email) {
	 EmailField.clear();
	 EmailField.sendKeys(email);
 }

 public void TelephoneField(String telephone) {
	 TelephoneField.clear();
	 TelephoneField.sendKeys(telephone);
 }

 public void ClickOnContinue3Button() {
	 ClickOnContinue3Button.click();
 }
 
 public void CanseeSuccessMess() {
	 System.out.println(CanseeSuccessMess.getText());
 }
 

}
