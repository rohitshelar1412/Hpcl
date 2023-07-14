Feature: Check login functionality of HPCL Inventory

@login
  Scenario: Login with valid credentials
    Given Open browser and hit the url
    When Admin enter username "admin" and password "1"
    And Click on login button
    Then Admin must login and dashboard should display

@login
  Scenario: Login with invalid Username and valid password
    Given Open browser and hit the url
    When Admin enter invalid username "Admin" and password "1"
    And Click on login button
    Then Admin must get error message

@login
  Scenario: Login with valid Username and invalid password
    Given Open browser and hit the url
    When Admin enter username "admin" and invalid password "123"
    And Click on login button
    Then Admin must get error message

@login
  Scenario: Login with blank credentials
    Given Open browser and hit the url
    When Admin enter Blank username "" and blank password ""
    And Click on login button
    Then Admin must get blank error message
