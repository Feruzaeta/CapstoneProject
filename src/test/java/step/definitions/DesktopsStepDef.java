package step.definitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.BaseForTek;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.object.DesktopsPageForTek;

public class DesktopsStepDef extends BaseForTek {
DesktopsPageForTek desktops = new DesktopsPageForTek();

@Given("User is on Retail home page")
public void user_is_on_retail_home_page() {
	Assert.assertTrue(desktops.isLogoDisplayed());
	logger.info("user is on Home Page");
}

@When("User Click on Desktops tab")
public void user_click_on_desktops_tab() {
	desktops.clickOnDesktopTab();
	logger.info("User clicked on Desktops tab");
}

@Then("User Click on Show all desktops")
public void user_click_on_show_all_desktops() {
	desktops.clickOnShowAllDesktops();
	logger.info("user clicked on Show all Desktops");
}

@Then("User should see all items are present in Desktops page")
public void user_should_see_all_items_are_present_in_desktops_page() {
	List<WebElement> items = desktops.elements();
	for (WebElement element : items) {
		Assert.assertTrue(element.isDisplayed());
		logger.info(element.getAttribute("alt") + "is present in this page");
	}
}

@And("User click  ADD TO CART option on ‘HP LP3065’ item")
public void user_click_add_to_cart_option_on_hp_lp3065_item() {
	desktops.clickOnCartOnHpLp3065();
	logger.info("user clicked on cart HP LP 3065");
}

@And("User select quantity {int}")
public void user_select_quantity() {
	desktops.clickOnSelectQuantityForHpDesktop();
	logger.info("User select quantity");
}

@And("User click on add to Cart button")
public void user_click_add_to_cart_button() {
	desktops.clickOnAddToCartButton();
	logger.info("user clicked on add to cart button");
}

@Then("User should see a message ‘Success: you have added HP LP {int} to your Shopping cart!’")
public void user_should_see_a_message_success_you_have_added_hp_lp_to_your_shopping_cart(Integer int1) {
	Assert.assertTrue(desktops.isSuccessMessageDisplayed());
	logger.info("Scuccess you have added Hp LP 3065");
}

@And("User click  ADD TO CART option on ‘Canon EOS 5D’ item")
public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
	desktops.clickOnCartOnCanonEos5D();
	logger.info("User clicked on add to cart Canon EOS 5D");
}

@And("User select color from dropdown ‘Red’")
public void user_select_color_from_dropdown_red() {
	desktops.selectColor();
	logger.info("User select color from dropdown 'Red'");
}
@And("User select quantity 1")
public void user_select_quantity_1() {
	desktops.selectQuantity();
	logger.info("User select quantity 1");
}

@Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() {
	Assert.assertTrue(desktops.successYouHaveAddedCanonEos5D());
	logger.info("User see Succes: you have added Canon EOS 5D to your shopping cart!");
}

@And("User click on Canon EOS 5D item")
public void user_click_on_canon_eos_5d_item() {
	desktops.clickOnCartOnCanonEos5D();
	logger.info("User clicked on Canon EOS 5D item");
}

@And("User click on write a review link")
public void user_click_on_write_a_review_link() {
	desktops.clickOnWriteReview();
	logger.info("User click on Write Review");;
}

@And("user fill the review information with below information")
public void user_fill_the_review_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {
	List<Map<String, String>> information = dataTable.asMaps(String.class, String.class);
	desktops.yourName(information.get(0).get("yourname"));
	desktops.yourReview(information.get(0).get("yourReview"));
	desktops.rating(information.get(0).get("Rating"));
	logger.info("User filled review information");
}

@And("User click on Continue Button")
public void user_click_on_continue_button() {
	desktops.clickOnContinue();
	logger.info("User clicked on continue button");
}

@Then("User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”")
public void user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval() {
	Assert.assertTrue(desktops.thankYouForYourReviewMessageisDisplayed());
	logger.info("User should see 'Thank you for your review'");
}
}

