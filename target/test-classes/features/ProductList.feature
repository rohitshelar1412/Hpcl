Feature: Check the Product report functionality of HPCL Inventory

  @productlist
  Scenario: Verify Product list show or not
    Given login into the  website enter username "admin" and password "1" click login button
    When Click on reports label
    And Click on the product List label
    And Select machine name dropdown
    And Select product name dropdown
    And Select company name dropdown
    And Click on generate report label
    Then Report list should be Show successfully
