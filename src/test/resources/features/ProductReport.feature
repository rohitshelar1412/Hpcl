Feature: Check the Product report functionality of HPCL Inventory

  @productreport
  Scenario: Verify Proper report show or not
    Given We login into website enter username "admin" and password "1"
    When Click on the reports label
    And Click on the product report label
    And Select From field date
    And Select To field date
    And Select product dropdown
    And Click on generate report button
    Then Report should be Show successfully
