@run5
Feature: Event Page
    #this is to navigate to the blue sku Citadel event page

  Scenario: Event Page Navigation
    Given that I naviagate to www.blueskycitadel.com
    When I click the event menu
    Then I can view the event page