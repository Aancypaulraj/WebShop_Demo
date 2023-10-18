
@tag
Feature: Desktop Application
  I want to purchase the desktop to the Demo application
 
  @tag2
  Scenario Outline: Desktop
    When user mouse over on computers
    And user clicks on Desktop
    And User sorts the desktop by name A to Z
    And User clicks on expensive computer
    And User clicks on add to compare list
    Then User clicks on logout button 
      
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

 @tag2
  Scenario: Gift Card
    Given I navigate to "https://demowebshop.tricentis.com/"
    When user click on login link
    And user enter email Id "aancy.paulraj@gmail.com"
    And user enter password "Christs@123"
    And user click on login button
    Then user should be able to login successfully
    And User clicks on Gift cards
    And user click on physical Gift card
    And User enters recipients name "Aancy"
    And User enters message "Hii"
    Then User clicks on email a friend button
    And User enters Friend's email "ask123@gmail.com"
    Then User clicks on send email button
    Then user verifys success message 
    
    @tag2
  Scenario Outline: Desktop
    When user mouse over on computers
    And user clicks on Desktop
    And User sorts the desktop by name A to Z
    And User clicks on expensive computer
    And User clicks on add to compare list
    Then User clicks on logout button
