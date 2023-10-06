#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@purchase
Feature: Add products to the cart

  @purchaseProducts    
    Scenario: I add three products to the cart and make the order
	    Given I am on the home page
	    When I add a "Samsung galaxy s6" from the "home" page to the cart
	    And I add a "MacBook Pro" from the "laptops" page to the cart
	    And I add a "ASUS Full HD" from the "monitors" page to the cart
	    And complete the purchase
	    Then I should get a message with a confirmaion 
    


  
