
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

  
