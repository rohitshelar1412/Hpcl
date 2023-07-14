Feature: Check Add Product  functionality of HPCL Inventory
  As a user
  I want to add a new product to the website
  So that it can be managed in the inventory

  @addproduct
  Scenario: Adding a new product
    Given I am logged in to the website enter username "admin" and password "1"
    When I click on the Product button
    And I click on the Add Product field
    And I input Product ID as "55"
    And I enter the product name as "Mouse"
    And I select the warehouse as "Ram"
    And I select the rack as "Sham"
    And I select the sub-rack as "RS"
    And I enter the price as "200"
    And I enter the opening stock as "5"
    And I choose VDE
    And I select the machine name as "V"
    And I enter the supplier name as "pooja"
    And I select the quality as "Perpetually"
    And I upload an image
    And I click on the Add Product button
    Then The product should be successfully added
