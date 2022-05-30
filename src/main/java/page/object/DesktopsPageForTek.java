package page.object;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.BaseForTek;

public class DesktopsPageForTek extends BaseForTek {
	
	public DesktopsPageForTek() {

	PageFactory.initElements(driver, this);
	
}
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement logo;
	
	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopTab;
	
	@FindBy (xpath = "//a[text()= 'Show All Desktops']")
	private WebElement showAllDesktops;
	
	@FindBy (tagName = "img")
	private List<WebElement> items;
	
	@FindBy (xpath = "(//button[@type='button']) [15]")
	
	private WebElement addToCartOnHpLp3065; 
	
	@FindBy (xpath = "//input[@id = 'input-quantity']")
	private WebElement selectQuantityHp3065;
	
	@FindBy(xpath= "//button [@id='button-cart']")
	private WebElement addToCartLp3065;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;
	
	@FindBy(xpath = "(//button[@type='button']) [12]")
	private WebElement addToCartEos5d;
	
	@FindBy (xpath = "//select[@id='input-option226']")
	private WebElement Color;
	
	@FindBy (xpath = "//input[@id='input-quantity']")
	private WebElement selectQuantityForCamera;
	
	@FindBy (xpath = "//button[@id='button-cart']")
	private WebElement clickOnAddToCartCamera;
	
	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessageCamera;
	
	 @FindBy (xpath = "//img[@title='Canon EOS 5D Camera']")
	 private WebElement clickOnCanonEos5D;
	 
	 @FindBy (xpath = "//a[text()='Write a review']")
	 private WebElement writeAreview;
	 
	 @FindBy (xpath ="//input [@id= 'input-name']" )
	 private WebElement yourNameField;

	 @FindBy (xpath = "//textarea [@id='input-review']")
	 private WebElement yourReviewField;
	 
	@FindBy (xpath = "//input[@value='5']")
	private WebElement ratingOption5;
	
	@FindBy (xpath = "//button [@id='button-review']")
	private WebElement continueButton;
	
	@FindBy (xpath = "//div[@class = 'alert alert-success alert-dismissible']")
	private WebElement thankYouForYourReview;
	
	public boolean isLogoDisplayed() {
		if (logo.isDisplayed())
			return true;
		else
			return false;
	}
	public void clickOnDesktopTab() {
		Actions action = new Actions(driver);
		action.moveToElement(desktopTab).build().perform();
	}
	public void clickOnShowAllDesktops() {
		showAllDesktops.click();
	}
	public List <WebElement>elements (){
		List<WebElement>DesktopsItems = items;
		return DesktopsItems;
	}
	public void clickOnCartOnHpLp3065() {
		addToCartOnHpLp3065.click();
	}
	public void SelectQuantityForHpDesktop() {
		selectQuantityHp3065.clear();
		selectQuantityHp3065.sendKeys("1");
		
	}
	public void clickOnAddToCartButton() {
		addToCartLp3065.click();
	}
	public boolean isSuccessMessageDisplayed() {
		if(successMessage.isDisplayed())
			return true;
		else 
			return false;
	}
	public void clickOnCartOnCanonEos5D() {
		addToCartEos5d.click();
		
	}
	public void selectColor() {
		Select select = new Select(Color);
		select.selectByVisibleText("Red");
	}
	public void selectQuantity () {
		selectQuantityForCamera.click();
	}
	public void clickOnAddToCartCamera() {
		clickOnAddToCartCamera.click();
	}
	public boolean successYouHaveAddedCanonEos5D() {
		if (successMessageCamera.isDisplayed())
			return true;
		else 
			return false;
	}
	public void clickOnCanonEos5DCamera() {
		clickOnCanonEos5D.click();
	}
	public void clickOnWriteReview() {
		writeAreview.click();
	}
	public void yourName(String nameValue) {
		yourNameField.sendKeys(nameValue);
	}
	public void yourReview (String reviewValue) {
		 yourReviewField.sendKeys(reviewValue);
	}
	public boolean rating(String ratingValue) {
		ratingOption5.click();
		if(ratingOption5.isSelected())
		return true;
		else 
			return false;
	}
	
	public void clickOnContinue() {
		continueButton.click();
	}
	public boolean thankYouForYourReviewMessageisDisplayed() {
		if (thankYouForYourReview.isDisplayed())
			return true;
		else 
			return false;
	}
}
