Feature: DemoQA Browser Windows

  Scenario: Open and verify text in new window
    Given I open the DemoQA browser windows page
    When I click on New Window button
    Then I verify the text in new window and close it