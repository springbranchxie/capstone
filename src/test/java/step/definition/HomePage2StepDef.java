package step.definition;
import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePage2;

public class HomePage2StepDef extends Base {
	HomePage2 homepage2= new HomePage2();
	
	//Scenario: User verify currency values change
	@When("User click on Currency")
	public void user_click_on_currency() {
		
	    homepage2.ClickOnCurrency();
	    logger.info("User click on Currency");
	}
	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown()  {
		
		homepage2.ChoseEuro();
		logger.info("User Chose Euro from dropdown");
	   
	    }
	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
	
		homepage2.iscurrencyChange();
		logger.info("currency value should change to Euro");
	}

	//Scenario: User empty Shopping cart message displays
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		homepage2.ClickOnShoppingCart();
		logger.info("User click on shopping cart");
	    
	}
	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() {
		homepage2.YourShoppingCartMess();
	    logger.info("Your shopping cart is empty!” message should display");
	}
	
	
	
	
	
	
	
}
