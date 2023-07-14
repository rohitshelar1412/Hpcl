Feature: Check show supplier functionality of HPCL Inventory

  @showsupplier
  Scenario: Verify search functionality working or not
    Given login to the website enter username "admin" and password "1"
    When Click on the supplier label
    And Click on the show supplier label
    And Enter supplier name in to the search field
    Then Expected result should be show

  @showsupplier
  Scenario: Verify delete button functionality working or not
    Given login to the website enter username "admin" and password "1"
    When Click on the supplier label
    And Click on the show supplier label
    And Click on delete supplier buttton
    Then Supplier should be deleted successfully

  @showsupplier
  Scenario: Verify view functionality working or not
    Given login to the website enter username "admin" and password "1"
    When Click on the supplier label
    And Click on the show supplier label
    And Click on any supplier view button
    Then View page should be open successfully

  @showsupplier
  Scenario: Verify edit functionality working or not
    Given login to the website enter username "admin" and password "1"
    When Click on the supplier label
    And Click on the show supplier label
    And Click on edit button
    And Enter data in all fields and click on edit button
    Then Supplier edited successfully
