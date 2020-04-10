@run10
Feature: User Registration
    #this is to navigate to the blue sku Citadel User Registration

  Scenario: User Registration
    Given that I naviagate to www.blueskycitadel.com
    And I click the Register / Login link on the menu
    And I click the Not a member yet? Register now link
    And I fill all the form fields
    And I click register button
    Then I should be registered as a student