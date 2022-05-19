package page.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.BaseForTek;

public class LaptopsPageForTek extends BaseForTek{

	public LaptopsPageForTek() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")//done
	private WebElement logo;
	
	@FindBy (xpath = "//a[text()='Laptops & Notebooks']")//done
	private WebElement laptopAndNoteBooktab;
	
	@FindBy (xpath = "//a[text()='Show All Laptops & Notebooks']")//done
	private WebElement showAllLaptopsAndNotebooks;
	
	@FindBy (xpath = "//a[text()='MacBook']")//done
	private WebElement clickOnMackBook;
	
	@FindBy (xpath = "//button[@id=\"button-cart\"]")//done
	private WebElement mackBookAddToCart;//click
	@FindBy (xpath = "//div [@class = 'alert alert-success alert-dismissible']")
	private WebElement successYouHaveAddedMacBook;
	@FindBy (id=("cart-total"))
	private WebElement cartTotaldisplayed;//is displayed
	
	@FindBy (id= ("cart-total"))
	private WebElement clickOnCart;//done
	
	@FindBy (xpath = "//button[@class='btn btn-danger btn-xs']")
	private WebElement clickOnRedXButton;//done
	
	@FindBy (id = "cart-total")
	private WebElement cartTotal0Displayed;// isdisplayed done
	
	@FindBy (xpath = "//*[@id=\"content\"]/div[4]/div[1]/div/div[2]/div[2]/button[3]")
	private WebElement clickComparisionMackBook;
	
	@FindBy (xpath = "//*[@id=\"content\"]/div[4]/div[3]/div/div[2]/div[2]/button[3]")
	private WebElement clickComparisonMackBookAir;
	
	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessageComparision;//is displayed
	
	@FindBy (xpath = "//a[@id='compare-total']")
	private WebElement clickOnComaprisonLink;
	
	@FindBy (xpath = "//a[text()='Product Comparison']")
	private WebElement comparisionPageIsDisplayed; //dispalyed
	
	@FindBy (xpath = "//*[@id=\"content\"]/div[4]/div[5]/div/div[2]/div[2]/button[2]")
	private WebElement clickOnHeartIconSonyVaio;
	
	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement mustLoginMessagedisplayed; //is displayed
	
	@FindBy (xpath= "//img[@alt='MacBook Pro']")
	private WebElement clickOnMacBookPro;
	
	@FindBy (xpath = "//*[@id=\"content\"]/div/div[2]/ul[2]/li[1]/h2")
	private WebElement validateMacBookProPrice;
	
	public boolean logoDisplayed() {
		if(logo.isDisplayed())
			return true;
		else
			return false;
	}
	public void clickOnLaptopsAndNoteBookTab() {
		Actions action = new Actions(driver);
		action.moveToElement(laptopAndNoteBooktab).build().perform();
	}
	public void clickOnAllLaptopsAndNoteBooks() {
		showAllLaptopsAndNotebooks.click();
	}
	public void clickOnMacBooks() {
		clickOnMackBook.click();
	}
	public void clickOnAddToCartMacBook() {
		mackBookAddToCart.click();
	}
	public boolean successMacBookAddedToCart() {
		if(successYouHaveAddedMacBook.isDisplayed())
			return true;
			else 
			return false;
	}
	public boolean cartTotalIsDisplayed () {
		if (cartTotaldisplayed.isDisplayed())
			return true;
		else
			return false;
	}
	public void clickOnCart () {
		clickOnCart.click();
	}
	 public void removeMacBookFromCart() {
		 clickOnRedXButton.click();
	 }
	public boolean cartTotal0isDisplayed() {
		if(cartTotal0Displayed.isDisplayed())
			return true;
		else 
			return false;
	}
	public void clickonComparisonMackBook() {
		clickComparisionMackBook.click();
	}
	public void clickOnComaprisionOnMackBookAir() {
		clickComparisonMackBookAir.click();
	}
	public boolean successMessageDispalayed() {
		if (successMessageComparision.isDisplayed())
			return true;
		else
			return false;
	}
	public void clickOnComparisionLink() {
		clickOnComaprisonLink.click();
	}
	public boolean comparisionLinkDisplayed() {
		if(comparisionPageIsDisplayed.isDisplayed())
			return true;
		else
			return false;
	}
	public void clickOnHeartIconSonyVaIo() {
	
		clickOnHeartIconSonyVaio.click();
	}
	
	public boolean mustLoginMessageDisplayed() {
	if (mustLoginMessagedisplayed.isDisplayed())
		return true;
	else
		return false;
}
	public void clickOnMacBokPro() {
		clickOnMacBookPro.click();
	}
	public boolean MacBookprice2000() {
		if (validateMacBookProPrice.isDisplayed())
			return true;
		else 
			return false;
	}
}

