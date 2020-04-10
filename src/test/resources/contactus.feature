@run3
Feature: ContactPage
    #this is to navigate to the blue sku Citadel about page

  Scenario: Contact Us Page Navigation
    Given that I naviagate to www.blueskycitadel.com
    And I click the Contact menu
    And I fill the contact us form
    When I click the submit button
    Then It should be successfully submitted