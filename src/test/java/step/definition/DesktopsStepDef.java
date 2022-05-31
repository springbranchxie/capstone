package step.definition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.DesktopsPage;
import utilities.Util;

public class DesktopsStepDef extends Base  {
 DesktopsPage desktopsPage=new DesktopsPage();
 
 //Scenario:User verify all items are present in Desktops tab
	@When("user click on Desktops tab")
	public void user_click_on_Destops_tab() {
		desktopsPage.clickOnDesktopTab();
		logger.info("user clicked on Desktops tab");
	}
	
	@And("user click on Show all desktops")
	public void user_click_on_Show_all_desktops() {
		desktopsPage.clickOnShowAllDesktops();
		logger.info("user clicked on Show all Desktops");
	}
	
	@Then("user should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_Desktop_page() {
	  List<WebElement> items=desktopsPage.elements();	
		for(WebElement element:items) {
		Assert.assertTrue(element.isDisplayed());	
		logger.info(element.getAttribute("alt")+"is present in this page");
		}
		Util.takeScreenShot();
	}
	
	//Scenario: User add HP LP 3065  from Desktops tab to the cart
	@When("User click  ADD TO CART option on ‘HP LP3065’ item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() throws InterruptedException {
		Thread.sleep(3000);
		desktopsPage.AddHP3065();
	   logger.info("User click  ADD TO CART option on ‘HP LP3065’ item");
	}
	@When("User select quantity {int}")
	public void user_select_quantity(Integer int1) throws InterruptedException {
		Thread.sleep(5000);
		desktopsPage.UserSelectQuantity();
		logger.info("User select quantity {int}");
		
	}
	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() throws InterruptedException {
		Thread.sleep(3000);
		desktopsPage.AddtoCartButton();
		logger.info("User click add to Cart button");
	}
	@Then("User should see a message ‘Success: you have added HP LP {int} to your Shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_hp_lp_to_your_shopping_cart(Integer int1) throws InterruptedException {
		Thread.sleep(3000);
		desktopsPage.UserShouldSeeMessage();
		logger.info("User should see a message ‘Success: you have added HP LP {int} to your Shopping cart!’");
	}

	//Scenario: User add Canon EOS 5D from Desktops tab to the cart
	@When("User click ADD TO CART option on ‘Canon EOS 5D’ item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() throws InterruptedException {
		Thread.sleep(3000);
		desktopsPage.AddCanonEOS5DCamera();
		logger.info("User click ADD TO CART option on ‘Canon EOS 5D’ item");
	    
	}
	@When("User select color from dropdown ‘Red’")
	public void user_select_color_from_dropdown_red() throws InterruptedException {
		Thread.sleep(3000);
		desktopsPage.SelectColorRed();
		logger.info("User select color from dropdown ‘Red’");
	}
	@And("User select Canon quantity 1")
	public void user_select_Canon_quantity_1() throws InterruptedException {
		Thread.sleep(3000);
		desktopsPage.UserSelectCanonQuantity();
		logger.info("User select Canon quantity 1");
		
	}
	@And("User click Add to Cart button")
	public void User_click_Add_to_Cart_button() throws InterruptedException {
		Thread.sleep(3000);
		desktopsPage.AddCanontoCartButton();
		logger.info("User click Add to Cart button");
		
	}
	
	@Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() throws InterruptedException {
		Thread.sleep(5000);
		desktopsPage.UserSeeMessage();
		logger.info("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’");
	    
	}
//Scenario: User add a review to Canon EOS 5D item in Desktops tab
	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() throws InterruptedException {
		Thread.sleep(3000);
		desktopsPage.ClickOnCanonEOS5DItem();
		logger.info("User click on Canon EOS 5D item");
	    
	}
	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() throws InterruptedException {
		Thread.sleep(3000);
		desktopsPage.ClickonWriteReviweLink();
		logger.info("User click on write a review link");
		
	   }
	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information() throws InterruptedException {
		Thread.sleep(3000);
		desktopsPage.EnterYourName("james1");
		desktopsPage.EnterYourReview("this is very good item and I am really like it and have it ,thanks");
		desktopsPage.RatingOption("notbad");
		logger.info("user fill the review information with below information");
	}
	@When("User click on Continue Button")
	public void user_click_on_continue_button() throws InterruptedException {
	    Thread.sleep(3000);
		desktopsPage.Continue();
		logger.info("User click on Continue Button");
	    
	}
	@Then("User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”")
	public void user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval() throws InterruptedException {
	    Thread.sleep(4000);
		desktopsPage.UserSeeReviewMess();
		logger.info("User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”");
			
		
	}
}
