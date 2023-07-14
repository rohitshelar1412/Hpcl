Feature: Add Supplier


  @addsupplier
  Scenario: Enter Suppliers Details
    Given Open website and click on url
    When Admin enter validusername "admin" and validpassword "1" and click on login btn
    Then Admin enter all data and click on add button
