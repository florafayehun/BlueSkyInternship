@run9
Feature: AdultApplication
    #this is to navigate to the blue sku Citadel about page

  Scenario: Adult Application Form
    Given that I naviagate to www.blueskycitadel.com
    And I click the Adult Application Form menu
    And I fill all the fields on the form
    When I click the Register Button
    Then I should be registered successfully with a success message