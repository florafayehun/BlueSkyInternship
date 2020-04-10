@run2
Feature: AboutPage
    #this is to navigate to the blue sku Citadel about page

  Scenario: About Us Page Navigation
    Given that I naviagate to www.blueskycitadel.com
    When I click the about menu
    Then I should be able to  view the about us page