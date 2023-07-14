Feature: Check Show Warehouse functionality of HPCL Inventory

  @show
  Scenario: Verify added warehouse show or not
    Given Open the browser and hit the url
    When Admin enter valid username "admin" and password "1"
    And Click on login button and go to home page
    And Click on inventory structure button
    And Click on show warehouse button
    Then Select warehouse name
