Feature: Check the Product report functionality of HPCL Inventory

  @adduser
  Scenario: Verify Add user functionality working or not
    Given Login into the  website with valid data enter username "admin" and password "1"
    When Click on settings button
    And Click on Add User button
    And Click on add button and enter data in all fields
    Then User add successfully

  @adduser
  Scenario: Verify delete user functionality working or not
    Given Login into the  website with valid data enter username "admin" and password "1"
    When Click on settings button
    And Click on Add User button
    And Click on delete button  of user
    Then User delete successfully
