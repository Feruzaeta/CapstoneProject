package page.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.BaseForTek;

public class LaptopsPageForTek extends BaseForTek{

	public LaptopsPageForTek() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement logo;
	
	@FindBy (xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopAndNoteBooktab;
	
	@FindBy (xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsAndNotebooks;
	
	@FindBy (xpath = "//a[text()='MacBook']")
	private WebElement clickOnMackBook;
	
	@FindBy (xpath = "//button[@id=\"button-cart\"]")
	private WebElement mackBookAddToCart;//click
	
	@FindBy (id=("cart-total"))
	private WebElement cartTotal;//is displayed
	
	@FindBy (id= ("cart-total"))
	private WebElement clickOnCart;
	
	@FindBy (xpath = "//button[@class='btn btn-danger btn-xs']")
	private WebElement clickOnRedXButton;
	
	@FindBy (id = "cart-total")
	private WebElement cartTotal0Displayed;// isdisplayed
	
	
	
	
	
}
