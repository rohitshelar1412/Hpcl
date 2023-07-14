 Feature: Check Add Warehouse functionality of HPCL Inventory

  @warehouse
  Scenario: Add Warehouse with valid credentials
    Given Open browser and hit the url and user must be login Admin enter username "admin" and password "1"
    When user click on Inventory structure button and add warehouse button
    And Enter number  "1" on no of warehouse field
    And Click on add button
    And Enter warehouse name "Ram"
    And Enter rack number "1"
    And click on next button
    And Enter rack name "Sham"
    And Click on finish button
    Then Warehouse should be added

  @warehouse
  Scenario: Add Warehouse with invalid credentials
    Given Open browser and hit the url and user must be login Admin enter username "admin" and password "1"
    When user click on Inventory structure button and add warehouse button
    And Enter invalid number  "A" on no of warehouse field
    And Click on add button
    And if alert is present accept
    Then Warning message should be display

  @warehouse
  Scenario: Add Warehouse with Blank credentials
    Given Open browser and hit the url and user must be login Admin enter username "admin" and password "1"
    When user click on Inventory structure button and add warehouse button
    And Enter Blank number  "" on no of warehouse field
    And Click on add button
    And if alert is present accept
    Then Warning message should be display
