Feature: Check Show Sub Rack functionality of HPCL Inventory

  @showsubrack
  Scenario: Verify added Sub Rack show or not
    Given Open the Webbrowser and hit the url
    When Admin enter valid username "admin" and valid password "1" of website
    And Click on login button and go to main  page
    And Click on add subrack button
    And Click on show Subrack button
    And Select warehouse from dropdown
    And Select rack from dropdown
    Then Sub Rack should be show

  @showsubrack
  Scenario: Verify working of delete button of Sub Rack
    Given Open the Webbrowser and hit the url
    When Admin enter valid username "admin" and valid password "1" of website
    And Click on login button and go to main  page
    And Click on add subrack button
    And Click on show Subrack button
    And Select warehouse from dropdown
    And Select rack from dropdown
    And Click on delete button
    Then Sub Rack should be deleted successfully
