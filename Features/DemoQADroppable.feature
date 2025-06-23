Feature: DemoQA Droppable Accept Tab

  Scenario: Drop Not Acceptable item
    Given I open the DemoQA droppable page
    When I drop Not Acceptable item into Drop Here box
    Then It should not be accepted