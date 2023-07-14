Feature: Check the Product report functionality of HPCL Inventory

  @addspares
  Scenario: Verify Add spares list functionality working or not
    Given Login into the  website with correct data enter username "admin" and password "1"
    When Click on spares list button
    And Click on boom button
    And Click on add data button and enter data in all fields
    Then Spares list add successfully