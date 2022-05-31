package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopsPage extends Base {

	public DesktopsPage() {
		PageFactory.initElements(driver, this);
	}
	//BackGround
	@FindBy(xpath="//a[text()='Desktops']")
	private WebElement desktopTab;
	
	@FindBy(xpath="//a[text()='Show All Desktops']")
	private WebElement showAllDesktops;
	
	//@desktopTest
	@FindBy(tagName="img")
	private List<WebElement> items;
	
	//@AddHP3065 
	@FindBy(xpath="//img[@title='HP LP3065']")
	private WebElement AddHP3065;
	
	@FindBy(id="input-quantity")
	private WebElement UserSelectQuantity;
	
	@FindBy(id="button-cart")
	private WebElement AddtoCartButton;
	
	@FindBy(xpath="//div[text()='Success: You have added ']")
	private WebElement UserShouldSeeMessage;
	
	//@AddCanonEOS5D 
	@FindBy(xpath="//img[@alt='Canon EOS 5D Camera']")
	private WebElement  AddCanonEOS5DCamera;
	
	@FindBy(xpath="//select[@name='option[226]']//option[@value='15']")
	private WebElement SelectColorRed;
	
	@FindBy(id="input-quantity")
	private WebElement UserSelectCanonQuantity;
	
	@FindBy(id="button-cart")
	private WebElement AddCanontoCartButton;
	
	@FindBy(xpath="//div[text()='Success: You have added ']")
	private WebElement UserSeeMessage;
	
	//@AddReview
	@FindBy(xpath="//img[@alt='Canon EOS 5D Camera']")
	private WebElement ClickOnCanonEOS5DItem;
	
	@FindBy(xpath="//a[text()='Write a review']")
	private WebElement ClickonWriteReviweLink;
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement YourNameField;
	
	@FindBy(xpath="//textarea[@name='text']")
	private WebElement YourReviewField;
	
	@FindBy(xpath="//input[@type='radio' and @name='rating' and @value='1']")
	private WebElement BadRating;
	
	@FindBy(xpath="//input[@type='radio' and @name='rating' and @value='5']")
	private WebElement GoodRating;
	
	@FindBy(xpath="//button[text()='Continue']")
	private WebElement ContinueButton;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement UserSeeReviewMessage;
	
	//@desktopTest
	public void clickOnDesktopTab() {
	  Actions action=new Actions(driver);
	  action.moveToElement(desktopTab).build().perform();
	}
	
	public void clickOnShowAllDesktops() {
		showAllDesktops.click();
	}
	
	public List<WebElement> elements() {
		List<WebElement> DesktopsItems=items;
		return DesktopsItems;
		}
	
	//@AddHP3065 
	public void AddHP3065()  {
	    AddHP3065.click();
		}
	
	public void UserSelectQuantity()  {
		UserSelectQuantity.clear();
		UserSelectQuantity.sendKeys("1");
		}
	
	public void AddtoCartButton()   {
	    AddtoCartButton.click();
		}
	
	public void UserShouldSeeMessage() {
		UserShouldSeeMessage.getText();
	}
	
	//Scenario: User add Canon EOS 5D from Desktops tab to the cart
	public void AddCanonEOS5DCamera() {
		AddCanonEOS5DCamera.click();
	}
   
	public void SelectColorRed() {
		SelectColorRed.click();
	}

    public void UserSelectCanonQuantity() {
    	UserSelectCanonQuantity.clear();
    	UserSelectCanonQuantity.sendKeys("1");
    }

    public void AddCanontoCartButton() {
    	AddCanontoCartButton.click();
    }

    public void UserSeeMessage() {
    	UserSeeMessage.getText();

    }
    
    //Scenario: User add a review to Canon EOS 5D item in Desktops tab
   public void ClickOnCanonEOS5DItem() {
	  
	   ClickOnCanonEOS5DItem.click();
   }
    
   public void  ClickonWriteReviweLink()  {
	
	   ClickonWriteReviweLink.click();
   }
   
   public void  EnterYourName(String yournamevalue)  {
	   
	   YourNameField.sendKeys(yournamevalue);
	   
   }
   
   public void EnterYourReview(String yourReviewValue)  {
	   
	   
	   YourReviewField.sendKeys(yourReviewValue);
   }
   
   public void RatingOption(String Option)  {
	  
	   
	   if(Option.equalsIgnoreCase("Bad")) {
		   BadRating.click();
	   }else {
		   GoodRating.click();
	   }
   }
   
  public void Continue()  {
	
	  ContinueButton.click();
	  
  }
   
   public void UserSeeReviewMess()  {
	   
	  
	   UserSeeReviewMessage.getText();
	  
	  
   }
   
}
