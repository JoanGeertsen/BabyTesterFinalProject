
@purchase
Feature: Add products to the cart

  @purchaseThreeProducts    
    Scenario: I add three products to the cart and make the order
	    Given I am on the home page
	    And I add a "Samsung galaxy s6" from the "home" page to the cart
	    And I add a "MacBook Pro" from the "laptops" page to the cart
	    And I add a "ASUS Full HD" from the "monitors" page to the cart
	    When complete the purchase
	    Then I should get a message with a confirmation
    


  
