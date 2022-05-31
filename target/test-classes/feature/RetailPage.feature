Feature:Retail Page
  For this feature you have to have an existing account

Background:
Given User is on Retail website 
And User click  on MyAccount
When user click on Login
And user enter username and password
And user click on Login button
Then user should be logged into MyAccount dashboard

@RegisterAffiliate
 Scenario: Register as an Affiliate user with Cheque Payment Method
When User click on ‘Register for an Affiliate Account’ link 
And User fill affiliate form with below information
|company|website|taxID|paymentMethod|checkpayeeName|
|ABC|ABC.com|123|Cheque|James|
And User check on About us check box 
And User click on Continue button 
Then User should see a success message 

@EditAffiliate
Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
When User click on ‘Edit your affiliate informationlink 
And user click on Bank Transfer radio button
And User fill Bank information with below information
|bankName|abaNumber|swiftCode|accountName|accountNumber|
|NavyFederal|168998|4898998|James|6670988|
And User click on Continue button 
Then User can see a success message 

@EditYourAccount
Scenario: Edit your account Information 
When User click on ‘Edit your account information’ link 
And User modify below information 
|firstname|lastName|email|telephone|
|John1|Lee|John1@tekschool.us|2023457890|
And User click on continue3 button 
Then User should see a message ‘Success: Your account has been successfully updated.’
 
