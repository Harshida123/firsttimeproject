Feature: Search Products for Nike in Argos web

  As a User
  I want go to argos website to search a product
  So that i can buy nike products

  @smoke
  Scenario: Verify Nike Search Results
    Given Consumers is on Argos HomePage
    When  Consumers search for "Nike" products in Search box
    And   Consumers click on Search button
    Then  Consumers must able to see nike products in search result and verify it




