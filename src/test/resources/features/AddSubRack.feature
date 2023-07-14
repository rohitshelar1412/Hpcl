Feature: Check Add Sub Rack functionality of HPCL Inventory

  @addsubrack
  Scenario: Add Sub Rack with valid credentials
    Given Open the browser and hit url
    When Admin enter valid username "admin" and valid password "1"
    And Click on login button and go to home page of inventory
    And Click on sub rack  button
    And Click on add sub rack button
    And Select warehouse
    And Select rack
    And Enter Number of sub rack "1"
    And Enter sub rack name "RS"
    And Click on add subrack
    Then Sub rack added successfully

  @addsubrack
  Scenario: Add two Sub Rack with valid credentials
    Given Open the browser and hit url
    When Admin enter valid username "admin" and valid password "1"
    And Click on login button and go to home page of inventory
    And Click on sub rack  button
    And Click on add sub rack button
    And Select warehouse
    And Select rack
    And Enter two sub rack "2"
    And Enter sub rack name "NS" and "SS"
    And Click on add subrack
    Then Sub rack added successfully
