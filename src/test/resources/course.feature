@run6
Feature: CourseNavigation
    #this is to navigate to the blue sku Citadel courses page

  Scenario: Course Page Navigation
    Given that I naviagate to www.blueskycitadel.com
    When I click the course menu
    Then I should be able to  view the course page with videos