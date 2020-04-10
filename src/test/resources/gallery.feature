@run4
Feature: Gallery Page
    #this is to navigate to the blue sku Citadel homepage

  Scenario: Gallery Page Navigation
    Given that I naviagate to www.blueskycitadel.com
    When I click the gallery menu
    Then I can view the gallery page