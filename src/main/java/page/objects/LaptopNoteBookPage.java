package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopNoteBookPage extends Base {

	public LaptopNoteBookPage() {
		PageFactory.initElements(driver, this);
	}

	//BackGround
@FindBy(xpath="//a[text()='Laptops & Notebooks']")
  private WebElement LaptopNoteBookTab;

@FindBy(xpath="//a[text()='Show All Laptops & Notebooks']")
  private WebElement ShowAllLaptopNoteBook;

@FindBy(tagName="img")
  private List<WebElement> items;

//@AddandRmoveMacBook
@FindBy(xpath="//img[@title='MacBook']")
 private WebElement MacBookItem;

@FindBy(xpath="//button[text()='Add to Cart']")
 private WebElement ClickonAddtoCart;

@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
private WebElement UserSeeSuccessMess;

@FindBy(xpath="//span[@id='cart-total']")
private WebElement  CartshowOneItem;

@FindBy(xpath="//span[@id='cart-total']")
private WebElement CartOption;

@FindBy(xpath="//button[@type='button' and@title='Remove']")
private WebElement  ClickRemove;

@FindBy(xpath="//span[@id='cart-total']")
private WebElement  CartsShowNoItem;

//@ProductComparison
@FindBy(xpath="//*[@id=\"content\"]/div[4]/div[2]/div/div[2]/div[2]/button[3]")
private WebElement MacbookComparisonIcon;

@FindBy(xpath="//*[@id=\"content\"]/div[4]/div[3]/div/div[2]/div[2]/button[3]")
private WebElement  MacbookAirComparisonIcon;

@FindBy(xpath="//*[@id=\"product-category\"]/div[1]")
private WebElement ComparisonMess;

@FindBy(xpath="//a[text()='product comparison']")
private WebElement ComparisonLink;

@FindBy(xpath="//div[@id=\"product-compare\"]")
private WebElement ComparisonChart;

//@AddingItemToWishList
@FindBy(xpath="//*[@id=\"content\"]/div[4]/div[5]/div/div[2]/div[2]/button[2]")
private WebElement AddtoWishList;

@FindBy(xpath="//*[@id=\"product-category\"]/div[1]")
private WebElement  AddtoWishListMessage;

//@ValidatePrice
@FindBy(xpath="//a[text()='MacBook Pro']")
private WebElement ClickonMacBookPro;

@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/ul[2]/li[1]/h2")
private WebElement ShouldSeePriceTag;


//Background
public void clickonLaptopNoteBook() {
	Actions action=new Actions(driver);
	action.moveToElement(LaptopNoteBookTab).build().perform();
}

public void clickonAllLaptopNoteBook() {
	ShowAllLaptopNoteBook.click();
}


//@AddandRmoveMacBook

public void clickOnMacBookItem() {
	MacBookItem.click();
}

public void clickonAddtoCart() {
	ClickonAddtoCart.click();
}

public void userSeeSuccessMess() {
	UserSeeSuccessMess.getText();
}

public void CartShowOneItem() {
	CartshowOneItem.getText();
}

public void clickonCartOption() {
	CartOption.click();
}

public void clickRemove() {
	ClickRemove.click();
}

public void cartShowNoItem() {
	CartsShowNoItem.getText();
}

//@ProductComparison
public void  ClickMacBookComparison() {
	MacbookComparisonIcon.click();
}

public void ClickMacBookAircomparison() {
	MacbookAirComparisonIcon.click();
}

public void comparisonmessage() {
	ComparisonMess.getText();
}

public void clickcomparisonlink() {
	ComparisonLink.click();
}

public void comparisonchartshow() {
	ComparisonChart.getText();
}

//@AddingItemToWishList
public void AddItemtoWishList() {
	AddtoWishList.click();
}

public void AddtoWishListMessage() {
	AddtoWishListMessage.getText();
}

//@ValidatePrice
public void ClickonMacBookPro() {
	ClickonMacBookPro.click();
}

public void ShouldSeePriceTag() {
	ShouldSeePriceTag.getText();
}
}
