@run
  Feature: HomePage
    #this is to navigate to the blue sku Citadel homepage

  Scenario: Home Page Navigation
    Given that I naviagate to www.blueskycitadel.com
    When I click the homepage menu
    Then I can view the home page