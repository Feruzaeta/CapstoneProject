package page.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.BaseForTek;

public class HomePageForTek extends BaseForTek {

	public HomePageForTek() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath ="//span[text()='Currency']")
	private WebElement clickOnCurrency;
	
	@FindBy(xpath="//button[@name='EUR']")
	private WebElement euroButton;
	
	@FindBy (xpath = "//*[@id=\"form-currency\"]/div/button/strong")
	private WebElement euroSignDisplayed;
	
	@FindBy (id = "cart-total")
	private WebElement cartTotal;
	
	@FindBy(xpath ="//p[text()='Your shopping cart is empty!']")
	private WebElement shoppingCartEmpty;

public void clickOnCurrency() {
	clickOnCurrency.click();
}
public void selectEuro() {
	euroButton.click();
}
public boolean signDisplayed() {
	if (euroSignDisplayed.isDisplayed())
		return true;
		else 
			return false;
}
public void clickOnShoppingCart() {
	cartTotal.click();
}
public boolean shoppingCartEmptyMessage() {
	if (shoppingCartEmpty.isDisplayed())
		return true;
	else
		return false;
}
}