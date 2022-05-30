@retail
Feature: Rtail
Background:

Given User is on Retail website 
And User click  on MyAccount
When  User click on Login 
And User enter username "feryme1@gmail.com" and password "feruza6624" 
And User click on Login button
Then User should be logged in to MyAccount dashboard

Scenario: Register as an Affiliate user with Cheque Payment Method
When User click on ‘Register for an Affiliate Account’ link 
And User fill affiliate form with below information
|company|website|taxID|paymentMethod|chequePayeeName|
|JohnSam|www.johnsam.com|2256|Cheque|John Sam|
And User check on About us check box 
And User click on Continue button 
Then User should see a success message 

Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
When User click on ‘Edit your affiliate informationlink' 
And user click on Bank Transfer radio button
And User fill Bank information with below information
|bankName       |abaNumber|swiftCode|accountName|accountNumber|
|Bank of America|0258 |00258 |    checking   |  123456789123|
And User click on Continue button for edited affiliate
Then User should see a success message for edited affiliate 


Scenario: Edit your account Information 
When User click on ‘Edit your account information’ link 
And User modify below information 
|firstname|lastName|email|telephone|
|John3  |Sam3    |john4_sam@gmail.com|4045520001|
And User click on continue button 
Then User should see a message ‘Success: Your account has been successfully updated.’

