package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePage2 extends Base {
	
	public HomePage2() {
		PageFactory.initElements(driver,this);
	}
	
	//Scenario: User verify currency values change
	@FindBy(xpath="//span[text()='Currency']")
	private WebElement ClickOnCurrency;
	
	@FindBy(xpath="//button[@name='EUR']")
	private WebElement ChoseEuro;
	
	@FindBy(xpath="//*[@id=\"form-currency\"]/div/button/strong")
	private WebElement ValueChangetoEuro;
	
	//Scenario: User empty Shopping cart message displays
	@FindBy(xpath="//a[@title='Shopping Cart']")
	private WebElement  ClickOnShoppingCart;
	
	@FindBy(xpath="//*[@id=\"content\"]/p")
	private WebElement YourShoppingCartMess;
	
	
	public void ClickOnCurrency() {
		ClickOnCurrency.click();
	}
	
	public void ChoseEuro() {
		ChoseEuro.click();
	}

	public boolean iscurrencyChange() {
		if(ValueChangetoEuro.isDisplayed())
			return true;
		else 
			return false;
		}
   
	public void ClickOnShoppingCart() {
		ClickOnShoppingCart.click();
	
	}	

	public void YourShoppingCartMess() {
		YourShoppingCartMess.getText();  
	
	}
	
	







}
