package step.definitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.BaseForTek;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.object.RetailPageForTek;

public class RetailStepDef extends BaseForTek {
RetailPageForTek retailPage = new RetailPageForTek();


@Given("user is on Retail home Page")
public void userIsOnRuser_is_on_retail_home_pageetailHomePage() {
Assert.assertTrue(retailPage.isLogoDisplayed()); 
logger.info("user is on Home Page");
}

	@And("User click  on MyAccount")
	public void user_click_on_my_account() {
	    retailPage.clickOnMyAccount();
	    logger.info ("User click  on MyAccount");
	}

	@When("User click on Login")
	public void user_click_on_login() {
	   retailPage.clickOnAccountLogin();
	   logger.info("User click on Login");
	}

	@And("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String email, String password) {
		retailPage.emailAddress(email);
		logger.info("user enter the userName " + email);
		retailPage.password(password);
		logger.info("user enter the password  " + password);
	}

	@And("User click on Login button")
	public void user_click_on_login_button() {
	    retailPage.clickOnLoginButton();
	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
	    Assert.assertTrue(retailPage.myAccountDisplayed());
	    logger.info("User should be logged in to MyAccount dashboard");
	}

	@When("User click on ‘Register for an Affiliate Account’ link")
	public void user_click_on_register_for_an_affiliate_account_link() {
	    retailPage. myAffilate();
	    logger.info("User click on ‘Register for an Affiliate Account’ link");
	}

	@And("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String,String>> information = dataTable.asMaps(String.class,String.class);
		retailPage.companyField(information.get(0).get("company"));
		retailPage.webSiteField(information.get(0).get("website"));
		retailPage.taxIdField(information.get(0).get("taxId"));
		retailPage.checqButton(information.get(0).get("paymentMethod"));
		retailPage.chequePayeeName(information.get(0).get("chequPayeeName"));
		
	}

	@And("User check on About us check box")
	public void user_check_on_about_us_check_box() {
	    Assert.assertTrue(retailPage.agreeCheckBoxisSelected());
	    logger.info("User check on About us check box");
	}

	@And("User click on Continue button")
	public void user_click_on_continue_button1() {
	    retailPage.clickOnContinue();
	   logger.info("User click on Continue button");
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
	    Assert.assertTrue(retailPage.successMessageisDisplayed());
	}

	@When("User click on ‘Edit your affiliate informationlink'")
	public void user_click_on_edit_your_affiliate_informationlink() {
	    retailPage.clickOnEditAffilation();
	    logger.info("User click on 'Edit your affilate information");
	}

	@And("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
	    Assert.assertTrue(retailPage.bankTransfer());
	    logger.info("user click on Bank Transfer radio button");
	}

	@And("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String,String>> bankinformation = dataTable.asMaps(String.class,String.class);
		retailPage.bankName(bankinformation.get(0).get("bankName"));
		retailPage.bankBranchN(bankinformation.get(0).get("abaNumber"));
		retailPage.swiftCodeN(bankinformation.get(0).get("swiftCode"));
		retailPage.bankAcctName(bankinformation.get(0).get("accountName"));
		retailPage.bankAcctNumber(bankinformation.get(0).get("accountNumber"));
		
	}
	@And("User click on Continue button for edited affiliate" )
	public void user_click_on_continue_button_edited_affiliate() {
		retailPage.clicOnContinue();
	}
		
	@Then("User should see a success message for edited affiliate")
	public void user_should_see_a_success_message_for_edited_affiliate() {
		Assert.assertTrue(retailPage.succssesMessageforEditedAffiliate());
		logger.info("user should see a success message for edited affiliate");
	
	}

	@When("User click on ‘Edit your account information’ link")
	public void user_click_on_edit_your_account_information_link() {
	   retailPage.clickOneditAccount();
	   logger.info("User click on ‘Edit your account information’ link");   
	}

	@And("User modify below information")
	public void user_modify_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String,String>> editinformation = dataTable.asMaps(String.class,String.class);
		retailPage.editName(editinformation.get(0).get("firstname"));
		retailPage.editLastName(editinformation.get(0).get("lastName"));
		retailPage.editEmail(editinformation.get(0).get("email"));
		retailPage.editTelephone(editinformation.get(0).get("telephone"));
	}

	@And("User click on continue button")
	public void user_click_on_continue_button() {
	    retailPage.clickOnContinueButton();
	    logger.info("User click on continue button");
	}

	@Then("User should see a message ‘Success: Your account has been successfully updated.’")
	public void user_should_see_a_message_success_your_account_has_been_successfully_updated() {
	  Assert.assertTrue(retailPage.successForEditAccount());
	  logger.info("User should see a message ‘Success: Your account has been successfully updated");
	}

}
