package step.definition;





import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.LaptopNoteBookPage;


public class LaptopNoteBookStepDef extends Base {
	
	LaptopNoteBookPage LaptopPage=new LaptopNoteBookPage();

	//BackGround
	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
	    
	}
	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		LaptopPage.clickonLaptopNoteBook();
	    logger.info("User click on Laptop &NoteBook tab");
	}
	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		LaptopPage.clickonAllLaptopNoteBook();
		logger.info("User click on Show all Laptop &NoteBook option");
	    
	}
	//Scenario: Add and Remove a Mac book from Cart 
	@When("User click on MacBook  item")
	public void user_click_on_mac_book_item()  {
		
		LaptopPage.clickOnMacBookItem();
		logger.info("User click on MacBook  item");
	    
	}
	
	@When("User click on add to Cart button")
	public void user_click_on_add_to_cart_button()  {
		
		LaptopPage.clickonAddtoCart();
		logger.info("User click on add to Cart button");
		
	}
	
	@Then("User should see a message ‘Success: You have added MacBook to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_to_your_shopping_cart()  {
		
		LaptopPage.userSeeSuccessMess();
		logger.info("User should see a message ‘Success: You have added MacBook to your shopping cart!’");
	}
	@Then("User should see ‘one item’ showed to the cart")
	public void user_should_see_tem_s_showed_to_the_cart()  {
		
		LaptopPage.CartShowOneItem();
		logger.info("User should see ‘one item’ showed to the cart");
	    
	}
	@Then("User click on cart option")
	public void user_click_on_cart_option()  {
		
		LaptopPage.clickonCartOption();
		logger.info("User click on cart option");
	    
	}
	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart()  {
		
		LaptopPage.clickRemove();
		logger.info("user click on red X button to remove the item from cart");
	    
	}
	@Then("item should be removed and cart should show ‘no item’")
	public void item_should_be_removed_and_cart_should_show_no_item()  {
		
		LaptopPage.cartShowNoItem();
		logger.info("item should be removed and cart should show ‘no item’");
	}
//Scenario: Product Comparison
    @When("User click on product comparison icon on ‘MacBook’")
     public void User_click_on_product_comparison_icon_on_MacBook() {
    
    	LaptopPage.ClickMacBookComparison();
    	logger.info("User click on product comparison icon on ‘MacBook’");
	}
   
    @When("User click on product comparison icon on ‘MacBook Air")
   public void User_click_on_product_comparison_icon_on_MacBookAir() {
    	
	   LaptopPage.ClickMacBookAircomparison();
	   logger.info("User click on product comparison icon on ‘MacBook Air");
   }
	
    @Then("User should see a message ‘Success: You have added MacBook Air to your product comparison!’")
    public void user_should_see_a_message_success_you_have_added_mac_book_air_to_your_product_comparison()  {
     
    	LaptopPage.comparisonmessage();
    	logger.info("User should see a message ‘Success: You have added MacBook Air to your product comparison!’");
    }
   
    @When("User click on Product comparison link")
    public void User_click_on_Product_comparison_link() throws InterruptedException {
    	Thread.sleep(1000);
    	LaptopPage.clickcomparisonlink();
    	logger.info("User click on Product comparison link");
    }
	
    @Then("User should see Product Comparison Chart")
    public void User_should_see_Product_Comparison_Chart() {
    	LaptopPage.comparisonchartshow();
    	logger.info("User should see Product Comparison Chart");
    }
    
//Scenario: Adding an item to Wish list
    @When("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
    public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list()  {
    	
       LaptopPage.AddItemtoWishList();
       logger.info("User click on heart icon to add ‘Sony VaIO’ laptop to wish list");
    }
    @Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!")
    public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list()  {
      LaptopPage.AddtoWishListMessage();
      logger.info("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!");
    }

//Scenario: Validate the price of MacBook Pro is 2000 
    @When("User click on ‘MacBook Pro’ item")
    public void user_click_on_mac_book_pro_item() {
        LaptopPage.ClickonMacBookPro();
        logger.info("User click on ‘MacBook Pro’ item");
    }
    @Then("User should see  ‘${double}’ price tag is present on UI.")
    public void user_should_see_$_price_tag_is_present_on_ui(Double double1) {
       LaptopPage.ShouldSeePriceTag();
       logger.info("User should see  ‘${double}’ price tag is present on UI.");
    }



}



