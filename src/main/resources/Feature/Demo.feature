
@tag
Feature: Demo Login
  I want to Login to the Demo application
 
  @tag2
  Scenario Outline: Registering on the Demo Webshop
    Given User Navigate Demo Webshop homepage "https://demowebshop.tricentis.com/"
    When  User click on the Register button
    Then Use enter the  details "<First Name>","<Last name>","<Email>","<Password>","<Confirm password>"
    And Click on Register button and Continue
    Then Verify Sucess message

    Examples: 
      | First Name|Last name | Email  |Password |Confirm password|
      | Aancy | P | aancy.paulraj@gmail.com|Christs@123|Christs@123|
      
   @taglogin   
   Scenario Outline: login  to demo
    And Click on the  login 
    Then Use enter the  details "<Emailaddress>","<Password>"
    #And User Clicks on Addtocart
    Then User Clicks on Loginbutton     
      
@tagadd

  Scenario Outline: add products on the Demo Webshop
  And Click on Electronics
    Then User Clicks on CellPhones
    #And User Clicks on Addtocart
    Then User Clicks on Addtocart1

  
