Feature: Handle DemoQA Alerts

  Scenario: Handle all four types of alerts
    Given I open the DemoQA alerts page
    When I handle all types of alerts
    Then All alerts are handled successfully