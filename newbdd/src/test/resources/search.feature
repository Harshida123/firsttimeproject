Feature: Search Products for Nike in Argos web

  As a User
  I want go to argos website to search a product
  So that i can buy nike products

  Background:
    Given Consumers is on Argos HomePage

  @Smoke
  Scenario: Verify Nike Search Results
    When  Consumers search for "Nike" products in Search box
    And   Consumers click on Search button
    Then  Consumers must able to see nike products in search result and verify it

  @Sanity
  Scenario Outline: Verify Search Results for different Products
    When  Consumers search with different "<Products>"
    And   Consumers click on Search button
    Then  Consumers must see respective results
    Examples:
      |Products|
      |Nike    |
      |Puma    |
      |adidas  |
      |Gucci   |
      |Next    |













