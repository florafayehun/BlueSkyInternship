@run8
Feature: TeenagerApplication
    #this is to navigate to the blue sku Citadel about page

  Scenario: Teen Application Form
    Given that I naviagate to www.blueskycitadel.com
    And I click the Youth Application Form menu
    And I fill all the fields
    When I click the Register button
    Then I should be registered with a success message