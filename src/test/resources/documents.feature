@run7
Feature: ResourcesPage
    #this is to navigate to the blue sku Citadel resources page

  Scenario: Resources Page Navigation
    Given that I naviagate to www.blueskycitadel.com
    When I click the resource menu
    Then I should be able to  view the resources page with download buttons