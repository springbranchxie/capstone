package step.definition;

import java.util.List;
import java.util.Map;
import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.RetailPage;

public class RetailStepDef extends Base {
 RetailPage retailpage=new RetailPage();

 @When("User click  on MyAccount")
 public void User_click_on_MyAccount() {
	 retailpage.ClickonMyAccount();
	 logger.info("User click  on MyAccount");
	 
 }
 //Background
 @When("user click on Login")
 public void user_click_on_login() throws InterruptedException {
	 Thread.sleep(2000);
	 retailpage.ClickonLogin();
	 logger.info("user click on Login");
 }
 @When("user enter username and password")
 public void user_enter_username_and_password() throws InterruptedException {
	 Thread.sleep(2000);
	 retailpage.UserInputEmail("John1@tekschool.us");
	 Thread.sleep(2000);
	 retailpage.UserInputPassword("JamesBond007");
	 logger.info("user enter username and password");
 }
 @When("user click on Login button")
 public void user_click_on_login_button() throws InterruptedException {
	 Thread.sleep(2000);
	 retailpage.UserClickonLoginButton();
	 logger.info("user click on Login button");
 }
 @Then("user should be logged into MyAccount dashboard")
 public void user_should_be_logged_into_my_account_dashboard() throws InterruptedException {
	 Thread.sleep(2000);
	 retailpage.LoginDashBoard();
	 logger.info("user should be logged into MyAccount dashboard");
 }

 //Scenario: Register as an Affiliate user with Cheque Payment Method
 @When("User click on ‘Register for an Affiliate Account’ link")
 public void user_click_on_register_for_an_affiliate_account_link() {
    retailpage.ClickOnRegister();
    logger.info("User click on ‘Register for an Affiliate Account’ link");
 }
 @When("User fill affiliate form with below information")
 public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
	 List<Map<String,String>> information=dataTable.asMaps(String.class,String.class);
	 retailpage.InputCompany(information.get(0).get("company"));
	 retailpage.InputWebsite(information.get(0).get("website"));
	 retailpage.InputTax(information.get(0).get("taxID"));
	 retailpage.SelectPaymentMethod(information.get(0).get("paymentMethod"));
	 retailpage.InputCheque(information.get(0).get("checkpayeeName"));
	 logger.info("User fill affiliate form with below information");
   
 }
 @When("User check on About us check box")
 public void user_check_on_about_us_check_box() {
     retailpage.SelectCheckBox();
     logger.info("User check on About us check box");
 }
 @When("User click on Continue1 button")
 public void user_click_on_continue1_button() {
	 retailpage.clickContinueButton();
	 logger.info("User click on Continue1 button");
     
 }
 @Then("User should see a success message")
 public void user_should_see_a_success_message() {
     retailpage.ShouldSeeMessage();
     logger.info("User should see a success message");
 }

 //Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
 @When("User click on ‘Edit your affiliate informationlink")
 public void user_click_on_edit_your_affiliate_informationlink() throws InterruptedException {
	 Thread.sleep(2000);
     retailpage.EdityourAffiliate();
     logger.info("User click on ‘Edit your affiliate informationlink");
 }
 @When("user click on Bank Transfer radio button")
 public void user_click_on_bank_transfer_radio_button() {
     retailpage.ClickonBank();
     logger.info("user click on Bank Transfer radio button");
 }
 @When("User fill Bank information with below information")
 public void user_fill_bank_information_with_below_information(DataTable dataTable) {
	 List<Map<String,String>> information1=dataTable.asMaps(String.class,String.class);
	 retailpage.InputBankInfo(information1.get(0).get("bankName"));
	 retailpage.InputAbsInfo(information1.get(0).get("abaNumber"));
	 retailpage.InputSwiftCodeInfo(information1.get(0).get("swiftCode"));
	 retailpage.InputBankAccountName(information1.get(0).get("accountName"));
	 retailpage.InputAccountNumber(information1.get(0).get("accountNumber"));
	 logger.info("User fill Bank information with below information"); 
 
 }
 @When("User click on Continue button")
 public void user_click_on_continue2_button() throws InterruptedException {
	 Thread.sleep(2000);
	 retailpage.clickonContinue2Button();
	 logger.info("User click on Continue button");
     
 }
 @Then("User can see a success message")
 public void user_can_see_a_success_message()  {
	 retailpage.CanSeeMessage();
	 logger.info("User can see a success message");
 }

 
 //Scenario: Edit your account Information 
 @When("User click on ‘Edit your account information’ link")
 public void user_click_on_edit_your_account_information_link() {
	 retailpage.EdityourAccount();
     logger.info("User click on ‘Edit your account information’ link");
 }
 @When("User modify below information")
 public void user_modify_below_information(io.cucumber.datatable.DataTable dataTable) {
	 List<Map<String,String>> information2=dataTable.asMaps(String.class,String.class);
	 retailpage.FirstnameField(information2.get(0).get("firstname"));
	 retailpage.LastnameField(information2.get(0).get("lastName"));
	 retailpage.EmailField(information2.get(0).get("email"));
	 retailpage.TelephoneField(information2.get(0).get("telephone"));
	 logger.info("User modify below information");
	 }
 @When("User click on continue3 button")
 public void user_click_on_continue3_button() throws InterruptedException {
	Thread.sleep(3000);
     retailpage.ClickOnContinue3Button();
     logger.info("User click on continue3 button");
 }
 @Then("User should see a message ‘Success: Your account has been successfully updated.’")
 public void user_should_see_a_message_success_your_account_has_been_successfully_updated() {
     retailpage.CanseeSuccessMess();
     logger.info("User should see a message ‘Success: Your account has been successfully updated.");
 }
 
 
 
 
}
