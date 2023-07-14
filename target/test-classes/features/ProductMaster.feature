Feature: Check product master functionality of HPCL Inventory

  @productmaster
  Scenario: Verify search functionality working or not
    Given I am login in to the website enter username "admin" and password "1"
    When I click on the Product label
    And I click on the product master label
    And I input Product name in to the search field
    Then Show the expected result

  @productmaster
  Scenario: Verify delete button functionality working or not
    Given I am login in to the website enter username "admin" and password "1"
    When I click on the Product label
    And I click on the product master label
    And I click on delete button
    Then Product should be deleted
